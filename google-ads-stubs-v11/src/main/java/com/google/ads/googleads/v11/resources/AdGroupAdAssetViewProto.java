// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/ad_group_ad_asset_view.proto

package com.google.ads.googleads.v11.resources;

public final class AdGroupAdAssetViewProto {
  private AdGroupAdAssetViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_AdGroupAdAssetView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_AdGroupAdAssetView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_AdGroupAdAssetPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_AdGroupAdAssetPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v11/resources/ad_" +
      "group_ad_asset_view.proto\022\"google.ads.go" +
      "ogleads.v11.resources\032,google/ads/google" +
      "ads/v11/common/policy.proto\0325google/ads/" +
      "googleads/v11/enums/asset_field_type.pro" +
      "to\032<google/ads/googleads/v11/enums/asset" +
      "_performance_label.proto\032;google/ads/goo" +
      "gleads/v11/enums/policy_approval_status." +
      "proto\0329google/ads/googleads/v11/enums/po" +
      "licy_review_status.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"\335\005\n\022AdGroupAdAssetView\022J\n\rresource_" +
      "name\030\001 \001(\tB3\340A\003\372A-\n+googleads.googleapis" +
      ".com/AdGroupAdAssetView\022D\n\013ad_group_ad\030\t" +
      " \001(\tB*\340A\003\372A$\n\"googleads.googleapis.com/A" +
      "dGroupAdH\000\210\001\001\022:\n\005asset\030\n \001(\tB&\340A\003\372A \n\036go" +
      "ogleads.googleapis.com/AssetH\001\210\001\001\022Z\n\nfie" +
      "ld_type\030\002 \001(\0162A.google.ads.googleads.v11" +
      ".enums.AssetFieldTypeEnum.AssetFieldType" +
      "B\003\340A\003\022\031\n\007enabled\030\010 \001(\010B\003\340A\003H\002\210\001\001\022\\\n\016poli" +
      "cy_summary\030\003 \001(\0132?.google.ads.googleads." +
      "v11.resources.AdGroupAdAssetPolicySummar" +
      "yB\003\340A\003\022o\n\021performance_label\030\004 \001(\0162O.goog" +
      "le.ads.googleads.v11.enums.AssetPerforma" +
      "nceLabelEnum.AssetPerformanceLabelB\003\340A\003:" +
      "\214\001\352A\210\001\n+googleads.googleapis.com/AdGroup" +
      "AdAssetView\022Ycustomers/{customer_id}/adG" +
      "roupAdAssetViews/{ad_group_id}~{ad_id}~{" +
      "asset_id}~{field_type}B\016\n\014_ad_group_adB\010" +
      "\n\006_assetB\n\n\010_enabled\"\307\002\n\033AdGroupAdAssetP" +
      "olicySummary\022T\n\024policy_topic_entries\030\001 \003" +
      "(\01321.google.ads.googleads.v11.common.Pol" +
      "icyTopicEntryB\003\340A\003\022e\n\rreview_status\030\002 \001(" +
      "\0162I.google.ads.googleads.v11.enums.Polic" +
      "yReviewStatusEnum.PolicyReviewStatusB\003\340A" +
      "\003\022k\n\017approval_status\030\003 \001(\0162M.google.ads." +
      "googleads.v11.enums.PolicyApprovalStatus" +
      "Enum.PolicyApprovalStatusB\003\340A\003B\211\002\n&com.g" +
      "oogle.ads.googleads.v11.resourcesB\027AdGro" +
      "upAdAssetViewProtoP\001ZKgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v11/re" +
      "sources;resources\242\002\003GAA\252\002\"Google.Ads.Goo" +
      "gleAds.V11.Resources\312\002\"Google\\Ads\\Google" +
      "Ads\\V11\\Resources\352\002&Google::Ads::GoogleA" +
      "ds::V11::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.AssetPerformanceLabelProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_resources_AdGroupAdAssetView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_AdGroupAdAssetView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_AdGroupAdAssetView_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupAd", "Asset", "FieldType", "Enabled", "PolicySummary", "PerformanceLabel", "AdGroupAd", "Asset", "Enabled", });
    internal_static_google_ads_googleads_v11_resources_AdGroupAdAssetPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_resources_AdGroupAdAssetPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_AdGroupAdAssetPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v11.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.AssetPerformanceLabelProto.getDescriptor();
    com.google.ads.googleads.v11.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v11.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
