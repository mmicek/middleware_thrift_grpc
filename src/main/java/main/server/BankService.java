package main.server;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.thrift.TException;
import sr.grpc.gen.CurrencyGrpc;
import sr.grpc.gen.Empty;
import sr.rpc.thrift.*;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class BankService implements Bank.Iface {

    private HashMap<String,String> map = new HashMap<String, String>();
    private HashMap<String,Integer> balance = new HashMap<String, Integer>();
    private HashMap<String,AccountType> types = new HashMap<String, AccountType>();
    private static HashMap<Currency,Double> currencies;
    private static final CurrencyGrpc.CurrencyFutureStub currencyService;

    public AccountDetails createUser(UserData dane) throws UserException {
        if(map.containsKey(dane.getPesel())) {
            UserException ex = new UserException();
            ex.message = "User with this pesel is already registered";
            throw ex;
        }
        types.put(dane.pesel,dane.miesiecznyDochod > 2000 ? AccountType.PREMIUM : AccountType.STANDARD);
        balance.put(dane.pesel,dane.miesiecznyDochod*12);
        map.put(dane.getPesel(),generateHash());
        AccountDetails details = new AccountDetails();
        details.typKonta = dane.miesiecznyDochod > 2000 ? AccountType.PREMIUM : AccountType.STANDARD;
        details.klucz = map.get(dane.getPesel());
        return details;
    }

    public CurrencyDetails activeCredit(String pesel, String klucz, Currency waluta, int kwota) throws CurrencyNotSupported,UserException {
        if(!map.get(pesel).equals(klucz)){
            UserException ex = new UserException();
            ex.message = "Wrong key: "+pesel;
            throw  ex;
        }
        if(types.get(pesel).equals(AccountType.STANDARD)){
            CurrencyNotSupported ex = new CurrencyNotSupported();
            ex.message = "Type account is STANDARD";
            throw  ex;
        }
        if((waluta != Currency.PLN && waluta != Currency.EUR)) {
            CurrencyNotSupported ex = new CurrencyNotSupported();
            ex.message = "Wrong currency: " + waluta;
            throw ex;
        }
        CurrencyDetails details = new CurrencyDetails();
        details.kosztWalutaRodzima = kwota;
        details.kosztWalutaObca = calculate(kwota,waluta).intValue();
        return details;
    }

    public CurrencyDetails getAccountBalance(String pesel, String klucz) throws UserException {
        if(!map.get(pesel).equals(klucz)){
            UserException ex = new UserException();
            ex.message = "Wrong key: "+pesel;
            throw  ex;
        }
        CurrencyDetails details = new CurrencyDetails();
        details.kosztWalutaRodzima = balance.get(pesel);
        return details;
    }

    private Double calculate(int kwota,Currency waluta) {
        return kwota * currencies.get(waluta);
    }

    private String generateHash(){
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        return new String(array);
    }

    static {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091)
                .usePlaintext(true)
                .build();
        currencyService = CurrencyGrpc.newFutureStub(channel);
        new Thread(new Runnable() {
            public void run() {
                while(true) {
                    ListenableFuture future = currencyService.getCurrentCurrency(Empty.newBuilder().build());
                    try {
                        sr.grpc.gen.CurrencyDetails details = (sr.grpc.gen.CurrencyDetails) future.get();
                        HashMap<Currency,Double> curr = new HashMap<Currency, Double>();
                        for(Map.Entry<String,String> e : details.getCurrenciesMap().entrySet()){
                            curr.put(Currency.valueOf(e.getKey()),Double.parseDouble(e.getValue()));
                        }
                        currencies = curr;
                        System.out.println(currencies);
                        Thread.sleep(10000);
                    } catch (Exception e) { e.printStackTrace(); }
                }
            }
        }).start();
    }
}

