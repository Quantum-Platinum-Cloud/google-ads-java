// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/extension_feed_item.proto

package com.google.ads.googleads.v8.resources;

public final class ExtensionFeedItemProto {
  private ExtensionFeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_ExtensionFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_ExtensionFeedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v8/resources/exte" +
      "nsion_feed_item.proto\022!google.ads.google" +
      "ads.v8.resources\032-google/ads/googleads/v" +
      "8/common/criteria.proto\032/google/ads/goog" +
      "leads/v8/common/extensions.proto\0322google" +
      "/ads/googleads/v8/enums/extension_type.p" +
      "roto\0324google/ads/googleads/v8/enums/feed" +
      "_item_status.proto\032;google/ads/googleads" +
      "/v8/enums/feed_item_target_device.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032\034google/api/annotati" +
      "ons.proto\"\376\017\n\021ExtensionFeedItem\022I\n\rresou" +
      "rce_name\030\001 \001(\tB2\340A\005\372A,\n*googleads.google" +
      "apis.com/ExtensionFeedItem\022\024\n\002id\030\031 \001(\003B\003" +
      "\340A\003H\002\210\001\001\022[\n\016extension_type\030\r \001(\0162>.googl" +
      "e.ads.googleads.v8.enums.ExtensionTypeEn" +
      "um.ExtensionTypeB\003\340A\003\022\034\n\017start_date_time" +
      "\030\032 \001(\tH\003\210\001\001\022\032\n\rend_date_time\030\033 \001(\tH\004\210\001\001\022" +
      "D\n\014ad_schedules\030\020 \003(\0132..google.ads.googl" +
      "eads.v8.common.AdScheduleInfo\022\\\n\006device\030" +
      "\021 \001(\0162L.google.ads.googleads.v8.enums.Fe" +
      "edItemTargetDeviceEnum.FeedItemTargetDev" +
      "ice\022Z\n\034targeted_geo_target_constant\030\036 \001(" +
      "\tB/\372A,\n*googleads.googleapis.com/GeoTarg" +
      "etConstantH\005\210\001\001\022E\n\020targeted_keyword\030\026 \001(" +
      "\0132+.google.ads.googleads.v8.common.Keywo" +
      "rdInfo\022U\n\006status\030\004 \001(\0162@.google.ads.goog" +
      "leads.v8.enums.FeedItemStatusEnum.FeedIt" +
      "emStatusB\003\340A\003\022N\n\022sitelink_feed_item\030\002 \001(" +
      "\01320.google.ads.googleads.v8.common.Sitel" +
      "inkFeedItemH\000\022a\n\034structured_snippet_feed" +
      "_item\030\003 \001(\01329.google.ads.googleads.v8.co" +
      "mmon.StructuredSnippetFeedItemH\000\022D\n\rapp_" +
      "feed_item\030\007 \001(\0132+.google.ads.googleads.v" +
      "8.common.AppFeedItemH\000\022F\n\016call_feed_item" +
      "\030\010 \001(\0132,.google.ads.googleads.v8.common." +
      "CallFeedItemH\000\022L\n\021callout_feed_item\030\t \001(" +
      "\0132/.google.ads.googleads.v8.common.Callo" +
      "utFeedItemH\000\022U\n\026text_message_feed_item\030\n" +
      " \001(\01323.google.ads.googleads.v8.common.Te" +
      "xtMessageFeedItemH\000\022H\n\017price_feed_item\030\013" +
      " \001(\0132-.google.ads.googleads.v8.common.Pr" +
      "iceFeedItemH\000\022P\n\023promotion_feed_item\030\014 \001" +
      "(\01321.google.ads.googleads.v8.common.Prom" +
      "otionFeedItemH\000\022S\n\022location_feed_item\030\016 " +
      "\001(\01320.google.ads.googleads.v8.common.Loc" +
      "ationFeedItemB\003\340A\003H\000\022f\n\034affiliate_locati" +
      "on_feed_item\030\017 \001(\01329.google.ads.googlead" +
      "s.v8.common.AffiliateLocationFeedItemB\003\340" +
      "A\003H\000\022W\n\027hotel_callout_feed_item\030\027 \001(\01324." +
      "google.ads.googleads.v8.common.HotelCall" +
      "outFeedItemH\000\022M\n\017image_feed_item\030\037 \001(\0132-" +
      ".google.ads.googleads.v8.common.ImageFee" +
      "dItemB\003\340A\005H\000\022C\n\021targeted_campaign\030\034 \001(\tB" +
      "&\372A#\n!googleads.googleapis.com/CampaignH" +
      "\001\022B\n\021targeted_ad_group\030\035 \001(\tB%\372A\"\n googl" +
      "eads.googleapis.com/AdGroupH\001:j\352Ag\n*goog" +
      "leads.googleapis.com/ExtensionFeedItem\0229" +
      "customers/{customer_id}/extensionFeedIte" +
      "ms/{feed_item_id}B\013\n\textensionB\034\n\032servin" +
      "g_resource_targetingB\005\n\003_idB\022\n\020_start_da" +
      "te_timeB\020\n\016_end_date_timeB\037\n\035_targeted_g" +
      "eo_target_constantB\203\002\n%com.google.ads.go" +
      "ogleads.v8.resourcesB\026ExtensionFeedItemP" +
      "rotoP\001ZJgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v8/resources;resourc" +
      "es\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8.Resou" +
      "rces\312\002!Google\\Ads\\GoogleAds\\V8\\Resources" +
      "\352\002%Google::Ads::GoogleAds::V8::Resources" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v8.common.ExtensionsProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.ExtensionTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.FeedItemStatusProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.FeedItemTargetDeviceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_ExtensionFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_ExtensionFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_ExtensionFeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ExtensionType", "StartDateTime", "EndDateTime", "AdSchedules", "Device", "TargetedGeoTargetConstant", "TargetedKeyword", "Status", "SitelinkFeedItem", "StructuredSnippetFeedItem", "AppFeedItem", "CallFeedItem", "CalloutFeedItem", "TextMessageFeedItem", "PriceFeedItem", "PromotionFeedItem", "LocationFeedItem", "AffiliateLocationFeedItem", "HotelCalloutFeedItem", "ImageFeedItem", "TargetedCampaign", "TargetedAdGroup", "Extension", "ServingResourceTargeting", "Id", "StartDateTime", "EndDateTime", "TargetedGeoTargetConstant", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v8.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v8.common.ExtensionsProto.getDescriptor();
    com.google.ads.googleads.v8.enums.ExtensionTypeProto.getDescriptor();
    com.google.ads.googleads.v8.enums.FeedItemStatusProto.getDescriptor();
    com.google.ads.googleads.v8.enums.FeedItemTargetDeviceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}