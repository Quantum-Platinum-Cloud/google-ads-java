// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/ad_group_error.proto

package com.google.ads.googleads.v10.errors;

public final class AdGroupErrorProto {
  private AdGroupErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_AdGroupErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_AdGroupErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v10/errors/ad_gro" +
      "up_error.proto\022\037google.ads.googleads.v10" +
      ".errors\032\034google/api/annotations.proto\"\207\005" +
      "\n\020AdGroupErrorEnum\"\362\004\n\014AdGroupError\022\017\n\013U" +
      "NSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\032\n\026DUPLICATE_A" +
      "DGROUP_NAME\020\002\022\030\n\024INVALID_ADGROUP_NAME\020\003\022" +
      "%\n!ADVERTISER_NOT_ON_CONTENT_NETWORK\020\005\022\017" +
      "\n\013BID_TOO_BIG\020\006\022*\n&BID_TYPE_AND_BIDDING_" +
      "STRATEGY_MISMATCH\020\007\022\030\n\024MISSING_ADGROUP_N" +
      "AME\020\010\022 \n\034ADGROUP_LABEL_DOES_NOT_EXIST\020\t\022" +
      " \n\034ADGROUP_LABEL_ALREADY_EXISTS\020\n\022,\n(INV" +
      "ALID_CONTENT_BID_CRITERION_TYPE_GROUP\020\013\022" +
      "8\n4AD_GROUP_TYPE_NOT_VALID_FOR_ADVERTISI" +
      "NG_CHANNEL_TYPE\020\014\0229\n5ADGROUP_TYPE_NOT_SU" +
      "PPORTED_FOR_CAMPAIGN_SALES_COUNTRY\020\r\022B\n>" +
      "CANNOT_ADD_ADGROUP_OF_TYPE_DSA_TO_CAMPAI" +
      "GN_WITHOUT_DSA_SETTING\020\016\0227\n3PROMOTED_HOT" +
      "EL_AD_GROUPS_NOT_AVAILABLE_FOR_CUSTOMER\020" +
      "\017\022,\n(INVALID_EXCLUDED_PARENT_ASSET_FIELD" +
      "_TYPE\020\020B\361\001\n#com.google.ads.googleads.v10" +
      ".errorsB\021AdGroupErrorProtoP\001ZEgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v10/errors;errors\242\002\003GAA\252\002\037Google.Ads.G" +
      "oogleAds.V10.Errors\312\002\037Google\\Ads\\GoogleA" +
      "ds\\V10\\Errors\352\002#Google::Ads::GoogleAds::" +
      "V10::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_AdGroupErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_AdGroupErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_AdGroupErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}