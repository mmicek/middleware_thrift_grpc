package main.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CurrencyServerMain {

    private static Server server;

    public static void main(String []args) throws IOException, InterruptedException {
        server = ServerBuilder.forPort(9091)
                .addService(new CurrencyService())
                .build()
                .start();
        System.out.println("Server started");
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                CurrencyServerMain.stop();
                System.err.println("*** server shut down");
            }
        });
        blockUntilShutdown();
    }

    private static void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private static void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}
