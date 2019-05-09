package main.server;

import io.grpc.stub.StreamObserver;
import sr.grpc.gen.CurrencyDetails;
import sr.grpc.gen.CurrencyGrpc;
import sr.grpc.gen.Empty;
import sr.rpc.thrift.Currency;

import java.util.HashMap;
import java.util.Random;

public class CurrencyService extends CurrencyGrpc.CurrencyImplBase {

    private static HashMap<String,String> currencies;

    @Override
    public void getCurrentCurrency(Empty request, StreamObserver<CurrencyDetails> responseObserver) {
        changeCurrency();
        CurrencyDetails details = CurrencyDetails.newBuilder().putAllCurrencies(currencies).build();
        responseObserver.onNext(details);
        responseObserver.onCompleted();
    }

    private static void changeCurrency() {
        HashMap<String,String> result = new HashMap<String, String>();
        for(Currency c : Currency.values()){
            if(c == Currency.PLN)
                result.put(c.name(),"1");
            else
                result.put(c.name(),Double.toString(3 + (0 - 2) * new Random().nextDouble()));
        }
        currencies = result;
    }
}
