// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/custom_parameter.proto

package com.google.ads.googleads.v0.common;

public final class CustomParameterProto {
  private CustomParameterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_CustomParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_CustomParameter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v0/common/custom_" +
      "parameter.proto\022\036google.ads.googleads.v0" +
      ".common\032\036google/protobuf/wrappers.proto\"" +
      "i\n\017CustomParameter\022)\n\003key\030\001 \001(\0132\034.google" +
      ".protobuf.StringValue\022+\n\005value\030\002 \001(\0132\034.g" +
      "oogle.protobuf.StringValueB\312\001\n\"com.googl" +
      "e.ads.googleads.v0.commonB\024CustomParamet" +
      "erProtoP\001ZDgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v0/common;common\242" +
      "\002\003GAA\252\002\036Google.Ads.GoogleAds.V0.Common\312\002" +
      "\036Google\\Ads\\GoogleAds\\V0\\Commonb\006proto3"
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
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_common_CustomParameter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_common_CustomParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_CustomParameter_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
