// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/mobile_app_category_constant_service.proto

package com.google.ads.googleads.v4.services;

public final class MobileAppCategoryConstantServiceProto {
  private MobileAppCategoryConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetMobileAppCategoryConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetMobileAppCategoryConstantRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKgoogle/ads/googleads/v4/services/mobil" +
      "e_app_category_constant_service.proto\022 g" +
      "oogle.ads.googleads.v4.services\032Dgoogle/" +
      "ads/googleads/v4/resources/mobile_app_ca" +
      "tegory_constant.proto\032\034google/api/annota" +
      "tions.proto\032\027google/api/client.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\"x\n#GetMobileAppCategory" +
      "ConstantRequest\022Q\n\rresource_name\030\001 \001(\tB:" +
      "\340A\002\372A4\n2googleads.googleapis.com/MobileA" +
      "ppCategoryConstant2\257\002\n MobileAppCategory" +
      "ConstantService\022\355\001\n\034GetMobileAppCategory" +
      "Constant\022E.google.ads.googleads.v4.servi" +
      "ces.GetMobileAppCategoryConstantRequest\032" +
      "<.google.ads.googleads.v4.resources.Mobi" +
      "leAppCategoryConstant\"H\202\323\344\223\0022\0220/v4/{reso" +
      "urce_name=mobileAppCategoryConstants/*}\332" +
      "A\rresource_name\032\033\312A\030googleads.googleapis" +
      ".comB\214\002\n$com.google.ads.googleads.v4.ser" +
      "vicesB%MobileAppCategoryConstantServiceP" +
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
          com.google.ads.googleads.v4.resources.MobileAppCategoryConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetMobileAppCategoryConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetMobileAppCategoryConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetMobileAppCategoryConstantRequest_descriptor,
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
    com.google.ads.googleads.v4.resources.MobileAppCategoryConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
