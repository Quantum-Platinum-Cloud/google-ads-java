// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/ad_group_criterion_customizer.proto

package com.google.ads.googleads.v9.resources;

public final class AdGroupCriterionCustomizerProto {
  private AdGroupCriterionCustomizerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_resources_AdGroupCriterionCustomizer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_resources_AdGroupCriterionCustomizer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v9/resources/ad_g" +
      "roup_criterion_customizer.proto\022!google." +
      "ads.googleads.v9.resources\0325google/ads/g" +
      "oogleads/v9/common/customizer_value.prot" +
      "o\032;google/ads/googleads/v9/enums/customi" +
      "zer_value_status.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\032\034google/api/annotations.proto\"\204\005\n\032AdG" +
      "roupCriterionCustomizer\022R\n\rresource_name" +
      "\030\001 \001(\tB;\340A\005\372A5\n3googleads.googleapis.com" +
      "/AdGroupCriterionCustomizer\022R\n\022ad_group_" +
      "criterion\030\002 \001(\tB1\340A\005\372A+\n)googleads.googl" +
      "eapis.com/AdGroupCriterionH\000\210\001\001\022U\n\024custo" +
      "mizer_attribute\030\003 \001(\tB7\340A\002\340A\005\372A.\n,google" +
      "ads.googleapis.com/CustomizerAttribute\022c" +
      "\n\006status\030\004 \001(\0162N.google.ads.googleads.v9" +
      ".enums.CustomizerValueStatusEnum.Customi" +
      "zerValueStatusB\003\340A\003\022C\n\005value\030\005 \001(\0132/.goo" +
      "gle.ads.googleads.v9.common.CustomizerVa" +
      "lueB\003\340A\002:\245\001\352A\241\001\n3googleads.googleapis.co" +
      "m/AdGroupCriterionCustomizer\022jcustomers/" +
      "{customer_id}/adGroupCriterionCustomizer" +
      "s/{ad_group_id}~{criterion_id}~{customiz" +
      "er_attribute_id}B\025\n\023_ad_group_criterionB" +
      "\214\002\n%com.google.ads.googleads.v9.resource" +
      "sB\037AdGroupCriterionCustomizerProtoP\001ZJgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v9/resources;resources\242\002\003GAA\252\002" +
      "!Google.Ads.GoogleAds.V9.Resources\312\002!Goo" +
      "gle\\Ads\\GoogleAds\\V9\\Resources\352\002%Google:" +
      ":Ads::GoogleAds::V9::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.common.CustomizerValueProto.getDescriptor(),
          com.google.ads.googleads.v9.enums.CustomizerValueStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_resources_AdGroupCriterionCustomizer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_resources_AdGroupCriterionCustomizer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_resources_AdGroupCriterionCustomizer_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", "CustomizerAttribute", "Status", "Value", "AdGroupCriterion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v9.common.CustomizerValueProto.getDescriptor();
    com.google.ads.googleads.v9.enums.CustomizerValueStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}