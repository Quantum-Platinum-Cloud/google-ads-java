// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/customer_client_service.proto

package com.google.ads.googleads.v4.services;

public final class CustomerClientServiceProto {
  private CustomerClientServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetCustomerClientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetCustomerClientRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v4/services/custo" +
      "mer_client_service.proto\022 google.ads.goo" +
      "gleads.v4.services\0327google/ads/googleads" +
      "/v4/resources/customer_client.proto\032\034goo" +
      "gle/api/annotations.proto\032\027google/api/cl" +
      "ient.proto\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\"b\n\030GetCus" +
      "tomerClientRequest\022F\n\rresource_name\030\001 \001(" +
      "\tB/\340A\002\372A)\n\'googleads.googleapis.com/Cust" +
      "omerClient2\204\002\n\025CustomerClientService\022\315\001\n" +
      "\021GetCustomerClient\022:.google.ads.googlead" +
      "s.v4.services.GetCustomerClientRequest\0321" +
      ".google.ads.googleads.v4.resources.Custo" +
      "merClient\"I\202\323\344\223\0023\0221/v4/{resource_name=cu" +
      "stomers/*/customerClients/*}\332A\rresource_" +
      "name\032\033\312A\030googleads.googleapis.comB\201\002\n$co" +
      "m.google.ads.googleads.v4.servicesB\032Cust" +
      "omerClientServiceProtoP\001ZHgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v4" +
      "/services;services\242\002\003GAA\252\002 Google.Ads.Go" +
      "ogleAds.V4.Services\312\002 Google\\Ads\\GoogleA" +
      "ds\\V4\\Services\352\002$Google::Ads::GoogleAds:" +
      ":V4::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.CustomerClientProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetCustomerClientRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetCustomerClientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetCustomerClientRequest_descriptor,
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
    com.google.ads.googleads.v4.resources.CustomerClientProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
