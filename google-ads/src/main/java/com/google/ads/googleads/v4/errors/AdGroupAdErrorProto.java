// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/errors/ad_group_ad_error.proto

package com.google.ads.googleads.v4.errors;

public final class AdGroupAdErrorProto {
  private AdGroupAdErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_errors_AdGroupAdErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_errors_AdGroupAdErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v4/errors/ad_grou" +
      "p_ad_error.proto\022\036google.ads.googleads.v" +
      "4.errors\032\034google/api/annotations.proto\"\211" +
      "\003\n\022AdGroupAdErrorEnum\"\362\002\n\016AdGroupAdError" +
      "\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022$\n AD_GRO" +
      "UP_AD_LABEL_DOES_NOT_EXIST\020\002\022$\n AD_GROUP" +
      "_AD_LABEL_ALREADY_EXISTS\020\003\022\030\n\024AD_NOT_UND" +
      "ER_ADGROUP\020\004\022\'\n#CANNOT_OPERATE_ON_REMOVE" +
      "D_ADGROUPAD\020\005\022 \n\034CANNOT_CREATE_DEPRECATE" +
      "D_ADS\020\006\022\032\n\026CANNOT_CREATE_TEXT_ADS\020\007\022\017\n\013E" +
      "MPTY_FIELD\020\010\022\'\n#RESOURCE_REFERENCED_IN_M" +
      "ULTIPLE_OPS\020\t\022\034\n\030AD_TYPE_CANNOT_BE_PAUSE" +
      "D\020\n\022\035\n\031AD_TYPE_CANNOT_BE_REMOVED\020\013B\356\001\n\"c" +
      "om.google.ads.googleads.v4.errorsB\023AdGro" +
      "upAdErrorProtoP\001ZDgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v4/errors;" +
      "errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.E" +
      "rrors\312\002\036Google\\Ads\\GoogleAds\\V4\\Errors\352\002" +
      "\"Google::Ads::GoogleAds::V4::Errorsb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_errors_AdGroupAdErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_errors_AdGroupAdErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_errors_AdGroupAdErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
