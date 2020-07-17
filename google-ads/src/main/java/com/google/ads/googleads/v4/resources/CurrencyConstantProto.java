// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/currency_constant.proto

package com.google.ads.googleads.v4.resources;

public final class CurrencyConstantProto {
  private CurrencyConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_CurrencyConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_CurrencyConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v4/resources/curr" +
      "ency_constant.proto\022!google.ads.googlead" +
      "s.v4.resources\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\036goog" +
      "le/protobuf/wrappers.proto\032\034google/api/a" +
      "nnotations.proto\"\210\003\n\020CurrencyConstant\022H\n" +
      "\rresource_name\030\001 \001(\tB1\340A\003\372A+\n)googleads." +
      "googleapis.com/CurrencyConstant\022/\n\004code\030" +
      "\002 \001(\0132\034.google.protobuf.StringValueB\003\340A\003" +
      "\022/\n\004name\030\003 \001(\0132\034.google.protobuf.StringV" +
      "alueB\003\340A\003\0221\n\006symbol\030\004 \001(\0132\034.google.proto" +
      "buf.StringValueB\003\340A\003\022>\n\024billable_unit_mi" +
      "cros\030\005 \001(\0132\033.google.protobuf.Int64ValueB" +
      "\003\340A\003:U\352AR\n)googleads.googleapis.com/Curr" +
      "encyConstant\022%currencyConstants/{currenc" +
      "y_constant}B\202\002\n%com.google.ads.googleads" +
      ".v4.resourcesB\025CurrencyConstantProtoP\001ZJ" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v4/resources;resources\242\002\003GAA" +
      "\252\002!Google.Ads.GoogleAds.V4.Resources\312\002!G" +
      "oogle\\Ads\\GoogleAds\\V4\\Resources\352\002%Googl" +
      "e::Ads::GoogleAds::V4::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_CurrencyConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_CurrencyConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_CurrencyConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Code", "Name", "Symbol", "BillableUnitMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
