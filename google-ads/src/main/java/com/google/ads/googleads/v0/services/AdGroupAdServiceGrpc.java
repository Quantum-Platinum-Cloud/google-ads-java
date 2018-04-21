package com.google.ads.googleads.v0.services;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Service to manage ads in an ad group.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/ads/googleads/v0/services/ad_group_ad_service.proto")
public final class AdGroupAdServiceGrpc {

  private AdGroupAdServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.AdGroupAdService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetAdGroupAdRequest,
      com.google.ads.googleads.v0.resources.AdGroupAd> METHOD_GET_AD_GROUP_AD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.ads.googleads.v0.services.AdGroupAdService", "GetAdGroupAd"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.GetAdGroupAdRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.resources.AdGroupAd.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateAdGroupAdsRequest,
      com.google.ads.googleads.v0.services.MutateAdGroupAdsResponse> METHOD_MUTATE_AD_GROUP_ADS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.ads.googleads.v0.services.AdGroupAdService", "MutateAdGroupAds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.MutateAdGroupAdsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.MutateAdGroupAdsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupAdServiceStub newStub(io.grpc.Channel channel) {
    return new AdGroupAdServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupAdServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupAdServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupAdServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupAdServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static abstract class AdGroupAdServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public void getAdGroupAd(com.google.ads.googleads.v0.services.GetAdGroupAdRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.AdGroupAd> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AD_GROUP_AD, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ads. Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupAds(com.google.ads.googleads.v0.services.MutateAdGroupAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateAdGroupAdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MUTATE_AD_GROUP_ADS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_AD_GROUP_AD,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetAdGroupAdRequest,
                com.google.ads.googleads.v0.resources.AdGroupAd>(
                  this, METHODID_GET_AD_GROUP_AD)))
          .addMethod(
            METHOD_MUTATE_AD_GROUP_ADS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.MutateAdGroupAdsRequest,
                com.google.ads.googleads.v0.services.MutateAdGroupAdsResponse>(
                  this, METHODID_MUTATE_AD_GROUP_ADS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static final class AdGroupAdServiceStub extends io.grpc.stub.AbstractStub<AdGroupAdServiceStub> {
    private AdGroupAdServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAdServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAdServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public void getAdGroupAd(com.google.ads.googleads.v0.services.GetAdGroupAdRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.AdGroupAd> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_AD_GROUP_AD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ads. Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupAds(com.google.ads.googleads.v0.services.MutateAdGroupAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateAdGroupAdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MUTATE_AD_GROUP_ADS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static final class AdGroupAdServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupAdServiceBlockingStub> {
    private AdGroupAdServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAdServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAdServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.AdGroupAd getAdGroupAd(com.google.ads.googleads.v0.services.GetAdGroupAdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_AD_GROUP_AD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ads. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.MutateAdGroupAdsResponse mutateAdGroupAds(com.google.ads.googleads.v0.services.MutateAdGroupAdsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MUTATE_AD_GROUP_ADS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ads in an ad group.
   * </pre>
   */
  public static final class AdGroupAdServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupAdServiceFutureStub> {
    private AdGroupAdServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAdServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAdServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.AdGroupAd> getAdGroupAd(
        com.google.ads.googleads.v0.services.GetAdGroupAdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_AD_GROUP_AD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ads. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.MutateAdGroupAdsResponse> mutateAdGroupAds(
        com.google.ads.googleads.v0.services.MutateAdGroupAdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MUTATE_AD_GROUP_ADS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_AD = 0;
  private static final int METHODID_MUTATE_AD_GROUP_ADS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupAdServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupAdServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_AD:
          serviceImpl.getAdGroupAd((com.google.ads.googleads.v0.services.GetAdGroupAdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.AdGroupAd>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_ADS:
          serviceImpl.mutateAdGroupAds((com.google.ads.googleads.v0.services.MutateAdGroupAdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateAdGroupAdsResponse>) responseObserver);
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

  private static final class AdGroupAdServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.AdGroupAdServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdGroupAdServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupAdServiceDescriptorSupplier())
              .addMethod(METHOD_GET_AD_GROUP_AD)
              .addMethod(METHOD_MUTATE_AD_GROUP_ADS)
              .build();
        }
      }
    }
    return result;
  }
}
