package main.server;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import sr.rpc.thrift.Bank;

public class BankServerMain {

    public static void main(String []args) throws TTransportException {
        Bank.Processor<BankService> processor1 = new Bank.Processor<BankService>(new BankService());
        TServerTransport serverTransport = new TServerSocket(9090);
        TProtocolFactory protocolFactory = new TBinaryProtocol.Factory();
        TServer server = new TSimpleServer(new TServer.Args(serverTransport).protocolFactory(protocolFactory).processor(processor1));
        System.out.println("Starting server...");
        server.serve();
    }
}
