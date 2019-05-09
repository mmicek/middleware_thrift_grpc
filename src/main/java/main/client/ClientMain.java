package main.client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import sr.rpc.thrift.*;

import java.io.IOException;

public class ClientMain {

    public static void main(String []args) throws TException, IOException {
        Bank.Client bankService = prepareService();
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String imie;
        String nazwisko;
        String pesel;
        int dochod;
        System.out.print("Imie: ");
        imie = in.readLine();
        System.out.print("Nazwisko: ");
        nazwisko = in.readLine();
        System.out.print("Pesel: ");
        pesel = in.readLine();
        System.out.print("Dochod: ");
        dochod = Integer.parseInt(in.readLine());

        UserData data = new UserData();
        data.imie = imie;
        data.nazwisko = nazwisko;
        data.pesel = pesel;
        data.miesiecznyDochod = dochod;
        AccountDetails details = bankService.createUser(data);
        System.out.println("Konto: "+details.getTypKonta());
        while(true){
            String line = in.readLine();
            try {
                if (line.equals("activeCredit")) {
                    System.out.print("Waluta(int): ");
                    Currency waluta = Currency.findByValue(Integer.parseInt(in.readLine()));
                    System.out.print("Kwota: ");
                    Integer kwota = Integer.parseInt(in.readLine());
                    CurrencyDetails currencyDetails = bankService.activeCredit(pesel, details.getKlucz(), waluta, kwota);
                    System.out.println("Obca: " + currencyDetails.kosztWalutaObca + "  Rodzima: " + currencyDetails.kosztWalutaRodzima);
                } else if (line.equals("getAccountBalance")) {
                    CurrencyDetails currencyDetails = bankService.getAccountBalance(pesel, details.getKlucz());
                    System.out.println("Stan: " + currencyDetails.kosztWalutaRodzima);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static Bank.Client prepareService() throws TTransportException {
        String host = "localhost";
        TProtocol protocol = null;
        TSocket socket = null;
        TTransport transport = null;
        Bank.Client bankService = null;
        socket = new TSocket(host, 9090);
        transport = socket;
        protocol = new TBinaryProtocol(transport);
        bankService = new Bank.Client(protocol);
        transport.open();
        return bankService;
    }
}
