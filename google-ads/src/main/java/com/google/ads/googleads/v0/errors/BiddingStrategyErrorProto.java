// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/bidding_strategy_error.proto

package com.google.ads.googleads.v0.errors;

public final class BiddingStrategyErrorProto {
  private BiddingStrategyErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_BiddingStrategyErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_BiddingStrategyErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v0/errors/bidding" +
      "_strategy_error.proto\022\036google.ads.google" +
      "ads.v0.errors\"\331\001\n\030BiddingStrategyErrorEn" +
      "um\"\274\001\n\024BiddingStrategyError\022\017\n\013UNSPECIFI" +
      "ED\020\000\022\013\n\007UNKNOWN\020\001\022\022\n\016DUPLICATE_NAME\020\002\022\'\n" +
      "#CANNOT_CHANGE_BIDDING_STRATEGY_TYPE\020\003\022%" +
      "\n!CANNOT_REMOVE_ASSOCIATED_STRATEGY\020\004\022\"\n" +
      "\036BIDDING_STRATEGY_NOT_SUPPORTED\020\005B\317\001\n\"co" +
      "m.google.ads.googleads.v0.errorsB\031Biddin" +
      "gStrategyErrorProtoP\001ZDgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v0/er" +
      "rors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds" +
      ".V0.Errors\312\002\036Google\\Ads\\GoogleAds\\V0\\Err" +
      "orsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_BiddingStrategyErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_BiddingStrategyErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_BiddingStrategyErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
