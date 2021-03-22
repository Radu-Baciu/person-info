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
    comments = "Source: PersonInfo.proto")
public final class PersonInformationGrpc {

  private PersonInformationGrpc() {}

  public static final String SERVICE_NAME = "PersonInformation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.PersonInfo.PersonRequest,
      proto.PersonInfo.InfoReply> getGiveInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiveInfo",
      requestType = proto.PersonInfo.PersonRequest.class,
      responseType = proto.PersonInfo.InfoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.PersonInfo.PersonRequest,
      proto.PersonInfo.InfoReply> getGiveInfoMethod() {
    io.grpc.MethodDescriptor<proto.PersonInfo.PersonRequest, proto.PersonInfo.InfoReply> getGiveInfoMethod;
    if ((getGiveInfoMethod = PersonInformationGrpc.getGiveInfoMethod) == null) {
      synchronized (PersonInformationGrpc.class) {
        if ((getGiveInfoMethod = PersonInformationGrpc.getGiveInfoMethod) == null) {
          PersonInformationGrpc.getGiveInfoMethod = getGiveInfoMethod = 
              io.grpc.MethodDescriptor.<proto.PersonInfo.PersonRequest, proto.PersonInfo.InfoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonInformation", "GiveInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonInfo.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonInfo.InfoReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonInformationMethodDescriptorSupplier("GiveInfo"))
                  .build();
          }
        }
     }
     return getGiveInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonInformationStub newStub(io.grpc.Channel channel) {
    return new PersonInformationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonInformationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonInformationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonInformationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonInformationFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonInformationImplBase implements io.grpc.BindableService {

    /**
     */
    public void giveInfo(proto.PersonInfo.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.PersonInfo.InfoReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGiveInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGiveInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.PersonInfo.PersonRequest,
                proto.PersonInfo.InfoReply>(
                  this, METHODID_GIVE_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class PersonInformationStub extends io.grpc.stub.AbstractStub<PersonInformationStub> {
    private PersonInformationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonInformationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonInformationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonInformationStub(channel, callOptions);
    }

    /**
     */
    public void giveInfo(proto.PersonInfo.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.PersonInfo.InfoReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGiveInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonInformationBlockingStub extends io.grpc.stub.AbstractStub<PersonInformationBlockingStub> {
    private PersonInformationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonInformationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonInformationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonInformationBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.PersonInfo.InfoReply giveInfo(proto.PersonInfo.PersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getGiveInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonInformationFutureStub extends io.grpc.stub.AbstractStub<PersonInformationFutureStub> {
    private PersonInformationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonInformationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonInformationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonInformationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.PersonInfo.InfoReply> giveInfo(
        proto.PersonInfo.PersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGiveInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GIVE_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonInformationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonInformationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GIVE_INFO:
          serviceImpl.giveInfo((proto.PersonInfo.PersonRequest) request,
              (io.grpc.stub.StreamObserver<proto.PersonInfo.InfoReply>) responseObserver);
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

  private static abstract class PersonInformationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonInformationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.PersonInfo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonInformation");
    }
  }

  private static final class PersonInformationFileDescriptorSupplier
      extends PersonInformationBaseDescriptorSupplier {
    PersonInformationFileDescriptorSupplier() {}
  }

  private static final class PersonInformationMethodDescriptorSupplier
      extends PersonInformationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonInformationMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonInformationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonInformationFileDescriptorSupplier())
              .addMethod(getGiveInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
