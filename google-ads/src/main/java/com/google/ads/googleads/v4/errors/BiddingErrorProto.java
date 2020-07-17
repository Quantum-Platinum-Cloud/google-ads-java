// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/errors/bidding_error.proto

package com.google.ads.googleads.v4.errors;

public final class BiddingErrorProto {
  private BiddingErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_errors_BiddingErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_errors_BiddingErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v4/errors/bidding" +
      "_error.proto\022\036google.ads.googleads.v4.er" +
      "rors\032\034google/api/annotations.proto\"\356\010\n\020B" +
      "iddingErrorEnum\"\331\010\n\014BiddingError\022\017\n\013UNSP" +
      "ECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022+\n\'BIDDING_STRATE" +
      "GY_TRANSITION_NOT_ALLOWED\020\002\022.\n*CANNOT_AT" +
      "TACH_BIDDING_STRATEGY_TO_CAMPAIGN\020\007\022+\n\'I" +
      "NVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE\020\n" +
      "\022!\n\035INVALID_BIDDING_STRATEGY_TYPE\020\016\022\017\n\013I" +
      "NVALID_BID\020\021\0223\n/BIDDING_STRATEGY_NOT_AVA" +
      "ILABLE_FOR_ACCOUNT_TYPE\020\022\022#\n\037CONVERSION_" +
      "TRACKING_NOT_ENABLED\020\023\022\032\n\026NOT_ENOUGH_CON" +
      "VERSIONS\020\024\0220\n,CANNOT_CREATE_CAMPAIGN_WIT" +
      "H_BIDDING_STRATEGY\020\025\022O\nKCANNOT_TARGET_CO" +
      "NTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_P" +
      "OP_BIDDING_STRATEGY\020\027\0223\n/BIDDING_STRATEG" +
      "Y_NOT_SUPPORTED_WITH_AD_SCHEDULE\020\030\0221\n-PA" +
      "Y_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTO" +
      "MER\020\031\0222\n.PAY_PER_CONVERSION_NOT_ALLOWED_" +
      "WITH_TARGET_CPA\020\032\022:\n6BIDDING_STRATEGY_NO" +
      "T_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS\020\033\022;\n" +
      "7BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFT" +
      "S_OR_EXPERIMENTS\020\034\022I\nEBIDDING_STRATEGY_T" +
      "YPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROU" +
      "P_CRITERION\020\035\022\021\n\rBID_TOO_SMALL\020\036\022\017\n\013BID_" +
      "TOO_BIG\020\037\022\"\n\036BID_TOO_MANY_FRACTIONAL_DIG" +
      "ITS\020 \022\027\n\023INVALID_DOMAIN_NAME\020!\022$\n NOT_CO" +
      "MPATIBLE_WITH_PAYMENT_MODE\020\"\022#\n\037NOT_COMP" +
      "ATIBLE_WITH_BUDGET_TYPE\020#\022-\n)NOT_COMPATI" +
      "BLE_WITH_BIDDING_STRATEGY_TYPE\020$\0229\n5BIDD" +
      "ING_STRATEGY_TYPE_INCOMPATIBLE_WITH_SHAR" +
      "ED_BUDGET\020%B\354\001\n\"com.google.ads.googleads" +
      ".v4.errorsB\021BiddingErrorProtoP\001ZDgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v4/errors;errors\242\002\003GAA\252\002\036Google.Ads" +
      ".GoogleAds.V4.Errors\312\002\036Google\\Ads\\Google" +
      "Ads\\V4\\Errors\352\002\"Google::Ads::GoogleAds::" +
      "V4::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_errors_BiddingErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_errors_BiddingErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_errors_BiddingErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
