// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/bidding.proto

package com.google.ads.googleads.v0.common;

public final class BiddingProto {
  private BiddingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_EnhancedCpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_EnhancedCpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ManualCpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ManualCpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ManualCpm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ManualCpm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_MaximizeConversions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_MaximizeConversions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_MaximizeConversionValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_MaximizeConversionValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PageOnePromoted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PageOnePromoted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_TargetCpa_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_TargetCpa_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_TargetOutrankShare_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_TargetOutrankShare_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_TargetRoas_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_TargetRoas_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_TargetSpend_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_TargetSpend_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/googleads/v0/common/bidding" +
      ".proto\022\036google.ads.googleads.v0.common\032C" +
      "google/ads/googleads/v0/enums/page_one_p" +
      "romoted_strategy_goal.proto\032\036google/prot" +
      "obuf/wrappers.proto\"\r\n\013EnhancedCpc\"E\n\tMa" +
      "nualCpc\0228\n\024enhanced_cpc_enabled\030\001 \001(\0132\032." +
      "google.protobuf.BoolValue\"\013\n\tManualCpm\"\025" +
      "\n\023MaximizeConversions\"L\n\027MaximizeConvers" +
      "ionValue\0221\n\013target_roas\030\001 \001(\0132\034.google.p" +
      "rotobuf.DoubleValue\"\306\003\n\017PageOnePromoted\022" +
      "q\n\rstrategy_goal\030\001 \001(\0162Z.google.ads.goog" +
      "leads.v0.enums.PageOnePromotedStrategyGo" +
      "alEnum.PageOnePromotedStrategyGoal\022;\n\026cp" +
      "c_bid_ceiling_micros\030\002 \001(\0132\033.google.prot" +
      "obuf.Int64Value\0222\n\014bid_modifier\030\003 \001(\0132\034." +
      "google.protobuf.DoubleValue\0227\n\023only_rais" +
      "e_cpc_bids\030\004 \001(\0132\032.google.protobuf.BoolV" +
      "alue\022I\n%raise_cpc_bid_when_budget_constr" +
      "ained\030\005 \001(\0132\032.google.protobuf.BoolValue\022" +
      "K\n\'raise_cpc_bid_when_quality_score_is_l" +
      "ow\030\006 \001(\0132\032.google.protobuf.BoolValue\"\273\001\n" +
      "\tTargetCpa\0226\n\021target_cpa_micros\030\001 \001(\0132\033." +
      "google.protobuf.Int64Value\022;\n\026cpc_bid_ce" +
      "iling_micros\030\002 \001(\0132\033.google.protobuf.Int" +
      "64Value\0229\n\024cpc_bid_floor_micros\030\003 \001(\0132\033." +
      "google.protobuf.Int64Value\"\322\002\n\022TargetOut" +
      "rankShare\022@\n\033target_outrank_share_micros" +
      "\030\001 \001(\0132\033.google.protobuf.Int32Value\0227\n\021c" +
      "ompetitor_domain\030\002 \001(\0132\034.google.protobuf" +
      ".StringValue\022;\n\026cpc_bid_ceiling_micros\030\003" +
      " \001(\0132\033.google.protobuf.Int64Value\0227\n\023onl" +
      "y_raise_cpc_bids\030\004 \001(\0132\032.google.protobuf" +
      ".BoolValue\022K\n\'raise_cpc_bid_when_quality" +
      "_score_is_low\030\005 \001(\0132\032.google.protobuf.Bo" +
      "olValue\"\267\001\n\nTargetRoas\0221\n\013target_roas\030\001 " +
      "\001(\0132\034.google.protobuf.DoubleValue\022;\n\026cpc" +
      "_bid_ceiling_micros\030\002 \001(\0132\033.google.proto" +
      "buf.Int64Value\0229\n\024cpc_bid_floor_micros\030\003" +
      " \001(\0132\033.google.protobuf.Int64Value\"\204\001\n\013Ta" +
      "rgetSpend\0228\n\023target_spend_micros\030\001 \001(\0132\033" +
      ".google.protobuf.Int64Value\022;\n\026cpc_bid_c" +
      "eiling_micros\030\002 \001(\0132\033.google.protobuf.In" +
      "t64ValueB\302\001\n\"com.google.ads.googleads.v0" +
      ".commonB\014BiddingProtoP\001ZDgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v0/" +
      "common;common\242\002\003GAA\252\002\036Google.Ads.GoogleA" +
      "ds.V0.Common\312\002\036Google\\Ads\\GoogleAds\\V0\\C" +
      "ommonb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_common_EnhancedCpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_common_EnhancedCpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_EnhancedCpc_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v0_common_ManualCpc_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_common_ManualCpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ManualCpc_descriptor,
        new java.lang.String[] { "EnhancedCpcEnabled", });
    internal_static_google_ads_googleads_v0_common_ManualCpm_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_common_ManualCpm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ManualCpm_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v0_common_MaximizeConversions_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_common_MaximizeConversions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_MaximizeConversions_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v0_common_MaximizeConversionValue_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_common_MaximizeConversionValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_MaximizeConversionValue_descriptor,
        new java.lang.String[] { "TargetRoas", });
    internal_static_google_ads_googleads_v0_common_PageOnePromoted_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v0_common_PageOnePromoted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PageOnePromoted_descriptor,
        new java.lang.String[] { "StrategyGoal", "CpcBidCeilingMicros", "BidModifier", "OnlyRaiseCpcBids", "RaiseCpcBidWhenBudgetConstrained", "RaiseCpcBidWhenQualityScoreIsLow", });
    internal_static_google_ads_googleads_v0_common_TargetCpa_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v0_common_TargetCpa_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_TargetCpa_descriptor,
        new java.lang.String[] { "TargetCpaMicros", "CpcBidCeilingMicros", "CpcBidFloorMicros", });
    internal_static_google_ads_googleads_v0_common_TargetOutrankShare_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v0_common_TargetOutrankShare_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_TargetOutrankShare_descriptor,
        new java.lang.String[] { "TargetOutrankShareMicros", "CompetitorDomain", "CpcBidCeilingMicros", "OnlyRaiseCpcBids", "RaiseCpcBidWhenQualityScoreIsLow", });
    internal_static_google_ads_googleads_v0_common_TargetRoas_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v0_common_TargetRoas_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_TargetRoas_descriptor,
        new java.lang.String[] { "TargetRoas", "CpcBidCeilingMicros", "CpcBidFloorMicros", });
    internal_static_google_ads_googleads_v0_common_TargetSpend_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v0_common_TargetSpend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_TargetSpend_descriptor,
        new java.lang.String[] { "TargetSpendMicros", "CpcBidCeilingMicros", });
    com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
