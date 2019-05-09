package sr.grpc.gen;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: currency.proto")
public final class CurrencyGrpc {

  private CurrencyGrpc() {}

  public static final String SERVICE_NAME = "currency.Currency";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sr.grpc.gen.Empty,
      sr.grpc.gen.CurrencyDetails> getGetCurrentCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrentCurrency",
      requestType = sr.grpc.gen.Empty.class,
      responseType = sr.grpc.gen.CurrencyDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sr.grpc.gen.Empty,
      sr.grpc.gen.CurrencyDetails> getGetCurrentCurrencyMethod() {
    io.grpc.MethodDescriptor<sr.grpc.gen.Empty, sr.grpc.gen.CurrencyDetails> getGetCurrentCurrencyMethod;
    if ((getGetCurrentCurrencyMethod = CurrencyGrpc.getGetCurrentCurrencyMethod) == null) {
      synchronized (CurrencyGrpc.class) {
        if ((getGetCurrentCurrencyMethod = CurrencyGrpc.getGetCurrentCurrencyMethod) == null) {
          CurrencyGrpc.getGetCurrentCurrencyMethod = getGetCurrentCurrencyMethod = 
              io.grpc.MethodDescriptor.<sr.grpc.gen.Empty, sr.grpc.gen.CurrencyDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "currency.Currency", "getCurrentCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sr.grpc.gen.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sr.grpc.gen.CurrencyDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new CurrencyMethodDescriptorSupplier("getCurrentCurrency"))
                  .build();
          }
        }
     }
     return getGetCurrentCurrencyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CurrencyStub newStub(io.grpc.Channel channel) {
    return new CurrencyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CurrencyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CurrencyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CurrencyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CurrencyFutureStub(channel);
  }

  /**
   */
  public static abstract class CurrencyImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCurrentCurrency(sr.grpc.gen.Empty request,
        io.grpc.stub.StreamObserver<sr.grpc.gen.CurrencyDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentCurrencyMethod(), responseObserver);
    }

     public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentCurrencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sr.grpc.gen.Empty,
                sr.grpc.gen.CurrencyDetails>(
                  this, METHODID_GET_CURRENT_CURRENCY)))
          .build();
    }
  }

  /**
   */
  public static final class CurrencyStub extends io.grpc.stub.AbstractStub<CurrencyStub> {
    private CurrencyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyStub(channel, callOptions);
    }

    /**
     */
    public void getCurrentCurrency(sr.grpc.gen.Empty request,
        io.grpc.stub.StreamObserver<sr.grpc.gen.CurrencyDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentCurrencyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CurrencyBlockingStub extends io.grpc.stub.AbstractStub<CurrencyBlockingStub> {
    private CurrencyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyBlockingStub(channel, callOptions);
    }

    /**
     */
    public sr.grpc.gen.CurrencyDetails getCurrentCurrency(sr.grpc.gen.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentCurrencyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CurrencyFutureStub extends io.grpc.stub.AbstractStub<CurrencyFutureStub> {
    private CurrencyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sr.grpc.gen.CurrencyDetails> getCurrentCurrency(
        sr.grpc.gen.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentCurrencyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_CURRENCY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CurrencyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CurrencyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }


    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_CURRENCY:
          serviceImpl.getCurrentCurrency((sr.grpc.gen.Empty) request,
              (io.grpc.stub.StreamObserver<sr.grpc.gen.CurrencyDetails>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }


    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CurrencyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CurrencyBaseDescriptorSupplier() {}


    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sr.grpc.gen.CalculatorProto.getDescriptor();
    }


    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Currency");
    }
  }

  private static final class CurrencyFileDescriptorSupplier
      extends CurrencyBaseDescriptorSupplier {
    CurrencyFileDescriptorSupplier() {}
  }

  private static final class CurrencyMethodDescriptorSupplier
      extends CurrencyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CurrencyMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }


    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CurrencyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CurrencyFileDescriptorSupplier())
              .addMethod(getGetCurrentCurrencyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
