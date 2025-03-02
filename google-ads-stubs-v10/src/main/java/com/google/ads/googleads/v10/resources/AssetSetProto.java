// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/asset_set.proto

package com.google.ads.googleads.v10.resources;

public final class AssetSetProto {
  private AssetSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_AssetSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AssetSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_AssetSet_MerchantCenterFeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AssetSet_MerchantCenterFeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v10/resources/ass" +
      "et_set.proto\022\"google.ads.googleads.v10.r" +
      "esources\0325google/ads/googleads/v10/enums" +
      "/asset_set_status.proto\0323google/ads/goog" +
      "leads/v10/enums/asset_set_type.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\"\263\004\n\010AssetSet\022\017\n\002id\030\006 \001(" +
      "\003B\003\340A\003\022@\n\rresource_name\030\001 \001(\tB)\340A\005\372A#\n!g" +
      "oogleads.googleapis.com/AssetSet\022\021\n\004name" +
      "\030\002 \001(\tB\003\340A\002\022S\n\004type\030\003 \001(\0162=.google.ads.g" +
      "oogleads.v10.enums.AssetSetTypeEnum.Asse" +
      "tSetTypeB\006\340A\002\340A\005\022V\n\006status\030\004 \001(\0162A.googl" +
      "e.ads.googleads.v10.enums.AssetSetStatus" +
      "Enum.AssetSetStatusB\003\340A\003\022]\n\024merchant_cen" +
      "ter_feed\030\005 \001(\0132?.google.ads.googleads.v1" +
      "0.resources.AssetSet.MerchantCenterFeed\032" +
      "[\n\022MerchantCenterFeed\022\030\n\013merchant_id\030\001 \001" +
      "(\003B\003\340A\002\022\034\n\nfeed_label\030\002 \001(\tB\003\340A\001H\000\210\001\001B\r\n" +
      "\013_feed_label:X\352AU\n!googleads.googleapis." +
      "com/AssetSet\0220customers/{customer_id}/as" +
      "setSets/{asset_set_id}B\377\001\n&com.google.ad" +
      "s.googleads.v10.resourcesB\rAssetSetProto" +
      "P\001ZKgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v10/resources;resources\242" +
      "\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resourc" +
      "es\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352" +
      "\002&Google::Ads::GoogleAds::V10::Resources" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.AssetSetStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AssetSetTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_AssetSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_AssetSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AssetSet_descriptor,
        new java.lang.String[] { "Id", "ResourceName", "Name", "Type", "Status", "MerchantCenterFeed", });
    internal_static_google_ads_googleads_v10_resources_AssetSet_MerchantCenterFeed_descriptor =
      internal_static_google_ads_googleads_v10_resources_AssetSet_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_AssetSet_MerchantCenterFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AssetSet_MerchantCenterFeed_descriptor,
        new java.lang.String[] { "MerchantId", "FeedLabel", "FeedLabel", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.AssetSetStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AssetSetTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
