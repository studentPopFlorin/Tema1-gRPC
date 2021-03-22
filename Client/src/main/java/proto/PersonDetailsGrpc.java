package proto;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: person.proto")
public final class PersonDetailsGrpc {

  private PersonDetailsGrpc() {}

  public static final String SERVICE_NAME = "PersonDetails";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Person.PersonRequest,
      proto.Person.DetailsReply> getGetDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetails",
      requestType = proto.Person.PersonRequest.class,
      responseType = proto.Person.DetailsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Person.PersonRequest,
      proto.Person.DetailsReply> getGetDetailsMethod() {
    io.grpc.MethodDescriptor<proto.Person.PersonRequest, proto.Person.DetailsReply> getGetDetailsMethod;
    if ((getGetDetailsMethod = PersonDetailsGrpc.getGetDetailsMethod) == null) {
      synchronized (PersonDetailsGrpc.class) {
        if ((getGetDetailsMethod = PersonDetailsGrpc.getGetDetailsMethod) == null) {
          PersonDetailsGrpc.getGetDetailsMethod = getGetDetailsMethod = 
              io.grpc.MethodDescriptor.<proto.Person.PersonRequest, proto.Person.DetailsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonDetails", "GetDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Person.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Person.DetailsReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonDetailsMethodDescriptorSupplier("GetDetails"))
                  .build();
          }
        }
     }
     return getGetDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonDetailsStub newStub(io.grpc.Channel channel) {
    return new PersonDetailsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonDetailsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonDetailsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonDetailsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonDetailsFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonDetailsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDetails(proto.Person.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.Person.DetailsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Person.PersonRequest,
                proto.Person.DetailsReply>(
                  this, METHODID_GET_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class PersonDetailsStub extends io.grpc.stub.AbstractStub<PersonDetailsStub> {
    private PersonDetailsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonDetailsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonDetailsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonDetailsStub(channel, callOptions);
    }

    /**
     */
    public void getDetails(proto.Person.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.Person.DetailsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonDetailsBlockingStub extends io.grpc.stub.AbstractStub<PersonDetailsBlockingStub> {
    private PersonDetailsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonDetailsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonDetailsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonDetailsBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Person.DetailsReply getDetails(proto.Person.PersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonDetailsFutureStub extends io.grpc.stub.AbstractStub<PersonDetailsFutureStub> {
    private PersonDetailsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonDetailsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonDetailsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonDetailsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Person.DetailsReply> getDetails(
        proto.Person.PersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DETAILS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonDetailsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonDetailsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DETAILS:
          serviceImpl.getDetails((proto.Person.PersonRequest) request,
              (io.grpc.stub.StreamObserver<proto.Person.DetailsReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PersonDetailsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonDetailsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Person.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonDetails");
    }
  }

  private static final class PersonDetailsFileDescriptorSupplier
      extends PersonDetailsBaseDescriptorSupplier {
    PersonDetailsFileDescriptorSupplier() {}
  }

  private static final class PersonDetailsMethodDescriptorSupplier
      extends PersonDetailsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonDetailsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PersonDetailsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonDetailsFileDescriptorSupplier())
              .addMethod(getGetDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
