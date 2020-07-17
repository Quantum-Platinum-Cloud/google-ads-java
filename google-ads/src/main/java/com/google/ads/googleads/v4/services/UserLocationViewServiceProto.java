// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/user_location_view_service.proto

package com.google.ads.googleads.v4.services;

public final class UserLocationViewServiceProto {
  private UserLocationViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetUserLocationViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetUserLocationViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v4/services/user_" +
      "location_view_service.proto\022 google.ads." +
      "googleads.v4.services\032:google/ads/google" +
      "ads/v4/resources/user_location_view.prot" +
      "o\032\034google/api/annotations.proto\032\027google/" +
      "api/client.proto\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"f\n\032" +
      "GetUserLocationViewRequest\022H\n\rresource_n" +
      "ame\030\001 \001(\tB1\340A\002\372A+\n)googleads.googleapis." +
      "com/UserLocationView2\216\002\n\027UserLocationVie" +
      "wService\022\325\001\n\023GetUserLocationView\022<.googl" +
      "e.ads.googleads.v4.services.GetUserLocat" +
      "ionViewRequest\0323.google.ads.googleads.v4" +
      ".resources.UserLocationView\"K\202\323\344\223\0025\0223/v4" +
      "/{resource_name=customers/*/userLocation" +
      "Views/*}\332A\rresource_name\032\033\312A\030googleads.g" +
      "oogleapis.comB\203\002\n$com.google.ads.googlea" +
      "ds.v4.servicesB\034UserLocationViewServiceP" +
      "rotoP\001ZHgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v4/services;services" +
      "\242\002\003GAA\252\002 Google.Ads.GoogleAds.V4.Service" +
      "s\312\002 Google\\Ads\\GoogleAds\\V4\\Services\352\002$G" +
      "oogle::Ads::GoogleAds::V4::Servicesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.UserLocationViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetUserLocationViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetUserLocationViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetUserLocationViewRequest_descriptor,
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
    com.google.ads.googleads.v4.resources.UserLocationViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
