// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/parental_status_view_service.proto

package com.google.ads.googleads.v4.services;

public final class ParentalStatusViewServiceProto {
  private ParentalStatusViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetParentalStatusViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetParentalStatusViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v4/services/paren" +
      "tal_status_view_service.proto\022 google.ad" +
      "s.googleads.v4.services\032<google/ads/goog" +
      "leads/v4/resources/parental_status_view." +
      "proto\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\"j\n\034GetParentalStatusViewRequest\022J\n\rreso" +
      "urce_name\030\001 \001(\tB3\340A\002\372A-\n+googleads.googl" +
      "eapis.com/ParentalStatusView2\230\002\n\031Parenta" +
      "lStatusViewService\022\335\001\n\025GetParentalStatus" +
      "View\022>.google.ads.googleads.v4.services." +
      "GetParentalStatusViewRequest\0325.google.ad" +
      "s.googleads.v4.resources.ParentalStatusV" +
      "iew\"M\202\323\344\223\0027\0225/v4/{resource_name=customer" +
      "s/*/parentalStatusViews/*}\332A\rresource_na" +
      "me\032\033\312A\030googleads.googleapis.comB\205\002\n$com." +
      "google.ads.googleads.v4.servicesB\036Parent" +
      "alStatusViewServiceProtoP\001ZHgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v4/services;services\242\002\003GAA\252\002 Google.Ads." +
      "GoogleAds.V4.Services\312\002 Google\\Ads\\Googl" +
      "eAds\\V4\\Services\352\002$Google::Ads::GoogleAd" +
      "s::V4::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.ParentalStatusViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetParentalStatusViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetParentalStatusViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetParentalStatusViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.resources.ParentalStatusViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
