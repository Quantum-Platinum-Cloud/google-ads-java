// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/campaign_shared_set_service.proto

package com.google.ads.googleads.v4.services;

public final class CampaignSharedSetServiceProto {
  private CampaignSharedSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetCampaignSharedSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetCampaignSharedSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_CampaignSharedSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_CampaignSharedSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v4/services/campa" +
      "ign_shared_set_service.proto\022 google.ads" +
      ".googleads.v4.services\032;google/ads/googl" +
      "eads/v4/resources/campaign_shared_set.pr" +
      "oto\032\034google/api/annotations.proto\032\027googl" +
      "e/api/client.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032\027" +
      "google/rpc/status.proto\"h\n\033GetCampaignSh" +
      "aredSetRequest\022I\n\rresource_name\030\001 \001(\tB2\340" +
      "A\002\372A,\n*googleads.googleapis.com/Campaign" +
      "SharedSet\"\302\001\n\037MutateCampaignSharedSetsRe" +
      "quest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022U\n\nopera" +
      "tions\030\002 \003(\0132<.google.ads.googleads.v4.se" +
      "rvices.CampaignSharedSetOperationB\003\340A\002\022\027" +
      "\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_only" +
      "\030\004 \001(\010\"\203\001\n\032CampaignSharedSetOperation\022F\n" +
      "\006create\030\001 \001(\01324.google.ads.googleads.v4." +
      "resources.CampaignSharedSetH\000\022\020\n\006remove\030" +
      "\003 \001(\tH\000B\013\n\toperation\"\247\001\n MutateCampaignS" +
      "haredSetsResponse\0221\n\025partial_failure_err" +
      "or\030\003 \001(\0132\022.google.rpc.Status\022P\n\007results\030" +
      "\002 \003(\0132?.google.ads.googleads.v4.services" +
      ".MutateCampaignSharedSetResult\"6\n\035Mutate" +
      "CampaignSharedSetResult\022\025\n\rresource_name" +
      "\030\001 \001(\t2\224\004\n\030CampaignSharedSetService\022\331\001\n\024" +
      "GetCampaignSharedSet\022=.google.ads.google" +
      "ads.v4.services.GetCampaignSharedSetRequ" +
      "est\0324.google.ads.googleads.v4.resources." +
      "CampaignSharedSet\"L\202\323\344\223\0026\0224/v4/{resource" +
      "_name=customers/*/campaignSharedSets/*}\332" +
      "A\rresource_name\022\376\001\n\030MutateCampaignShared" +
      "Sets\022A.google.ads.googleads.v4.services." +
      "MutateCampaignSharedSetsRequest\032B.google" +
      ".ads.googleads.v4.services.MutateCampaig" +
      "nSharedSetsResponse\"[\202\323\344\223\002<\"7/v4/custome" +
      "rs/{customer_id=*}/campaignSharedSets:mu" +
      "tate:\001*\332A\026customer_id,operations\032\033\312A\030goo" +
      "gleads.googleapis.comB\204\002\n$com.google.ads" +
      ".googleads.v4.servicesB\035CampaignSharedSe" +
      "tServiceProtoP\001ZHgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v4/services" +
      ";services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V" +
      "4.Services\312\002 Google\\Ads\\GoogleAds\\V4\\Ser" +
      "vices\352\002$Google::Ads::GoogleAds::V4::Serv" +
      "icesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.CampaignSharedSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetCampaignSharedSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetCampaignSharedSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetCampaignSharedSetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v4_services_CampaignSharedSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_services_CampaignSharedSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_CampaignSharedSetOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCampaignSharedSetResult_descriptor,
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
    com.google.ads.googleads.v4.resources.CampaignSharedSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
