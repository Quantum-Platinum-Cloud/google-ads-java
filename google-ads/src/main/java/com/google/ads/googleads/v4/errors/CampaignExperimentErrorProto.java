// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/errors/campaign_experiment_error.proto

package com.google.ads.googleads.v4.errors;

public final class CampaignExperimentErrorProto {
  private CampaignExperimentErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_errors_CampaignExperimentErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_errors_CampaignExperimentErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v4/errors/campaig" +
      "n_experiment_error.proto\022\036google.ads.goo" +
      "gleads.v4.errors\032\034google/api/annotations" +
      ".proto\"\200\004\n\033CampaignExperimentErrorEnum\"\340" +
      "\003\n\027CampaignExperimentError\022\017\n\013UNSPECIFIE" +
      "D\020\000\022\013\n\007UNKNOWN\020\001\022\022\n\016DUPLICATE_NAME\020\002\022\026\n\022" +
      "INVALID_TRANSITION\020\003\022/\n+CANNOT_CREATE_EX" +
      "PERIMENT_WITH_SHARED_BUDGET\020\004\0226\n2CANNOT_" +
      "CREATE_EXPERIMENT_FOR_REMOVED_BASE_CAMPA" +
      "IGN\020\005\0223\n/CANNOT_CREATE_EXPERIMENT_FOR_NO" +
      "N_PROPOSED_DRAFT\020\006\022%\n!CUSTOMER_CANNOT_CR" +
      "EATE_EXPERIMENT\020\007\022%\n!CAMPAIGN_CANNOT_CRE" +
      "ATE_EXPERIMENT\020\010\022)\n%EXPERIMENT_DURATIONS" +
      "_MUST_NOT_OVERLAP\020\t\0228\n4EXPERIMENT_DURATI" +
      "ON_MUST_BE_WITHIN_CAMPAIGN_DURATION\020\n\022*\n" +
      "&CANNOT_MUTATE_EXPERIMENT_DUE_TO_STATUS\020" +
      "\013B\367\001\n\"com.google.ads.googleads.v4.errors" +
      "B\034CampaignExperimentErrorProtoP\001ZDgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v4/errors;errors\242\002\003GAA\252\002\036Google.Ad" +
      "s.GoogleAds.V4.Errors\312\002\036Google\\Ads\\Googl" +
      "eAds\\V4\\Errors\352\002\"Google::Ads::GoogleAds:" +
      ":V4::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_errors_CampaignExperimentErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_errors_CampaignExperimentErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_errors_CampaignExperimentErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
