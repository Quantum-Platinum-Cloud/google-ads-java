// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/campaign_service.proto

package com.google.ads.googleads.v0.services;

public final class CampaignServiceProto {
  private CampaignServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetCampaignRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetCampaignRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateCampaignsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateCampaignsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_CampaignOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_CampaignOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateCampaignsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateCampaignsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateCampaignResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateCampaignResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v0/services/campa" +
      "ign_service.proto\022 google.ads.googleads." +
      "v0.services\0320google/ads/googleads/v0/res" +
      "ources/campaign.proto\032\034google/api/annota" +
      "tions.proto\032 google/protobuf/field_mask." +
      "proto\"+\n\022GetCampaignRequest\022\025\n\rresource_" +
      "name\030\001 \001(\t\"v\n\026MutateCampaignsRequest\022\023\n\013" +
      "customer_id\030\001 \001(\t\022G\n\noperations\030\002 \003(\01323." +
      "google.ads.googleads.v0.services.Campaig" +
      "nOperation\"\341\001\n\021CampaignOperation\022/\n\013upda" +
      "te_mask\030\004 \001(\0132\032.google.protobuf.FieldMas" +
      "k\022=\n\006create\030\001 \001(\0132+.google.ads.googleads" +
      ".v0.resources.CampaignH\000\022=\n\006update\030\002 \001(\013" +
      "2+.google.ads.googleads.v0.resources.Cam" +
      "paignH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"b" +
      "\n\027MutateCampaignsResponse\022G\n\007results\030\002 \003" +
      "(\01326.google.ads.googleads.v0.services.Mu" +
      "tateCampaignResult\"-\n\024MutateCampaignResu" +
      "lt\022\025\n\rresource_name\030\001 \001(\t2\375\002\n\017CampaignSe" +
      "rvice\022\245\001\n\013GetCampaign\0224.google.ads.googl" +
      "eads.v0.services.GetCampaignRequest\032+.go" +
      "ogle.ads.googleads.v0.resources.Campaign" +
      "\"3\202\323\344\223\002-\022+/v0/{resource_name=customers/*" +
      "/campaigns/*}\022\301\001\n\017MutateCampaigns\0228.goog" +
      "le.ads.googleads.v0.services.MutateCampa" +
      "ignsRequest\0329.google.ads.googleads.v0.se" +
      "rvices.MutateCampaignsResponse\"9\202\323\344\223\0023\"." +
      "/v0/customers/{customer_id=*}/campaigns:" +
      "mutate:\001*B\324\001\n$com.google.ads.googleads.v" +
      "0.servicesB\024CampaignServiceProtoP\001ZHgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v0/services;services\242\002\003GAA\252\002 Goo" +
      "gle.Ads.GoogleAds.V0.Services\312\002 Google\\A" +
      "ds\\GoogleAds\\V0\\Servicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.CampaignProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetCampaignRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetCampaignRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetCampaignRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateCampaignsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateCampaignsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateCampaignsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v0_services_CampaignOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_CampaignOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_CampaignOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateCampaignsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateCampaignsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateCampaignsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v0_services_MutateCampaignResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateCampaignResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateCampaignResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.CampaignProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
