// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/campaign_experiment_service.proto

package com.google.ads.googleads.v9.services;

public interface EndCampaignExperimentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.EndCampaignExperimentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the campaign experiment to end.
   * </pre>
   *
   * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The campaignExperiment.
   */
  java.lang.String getCampaignExperiment();
  /**
   * <pre>
   * Required. The resource name of the campaign experiment to end.
   * </pre>
   *
   * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for campaignExperiment.
   */
  com.google.protobuf.ByteString
      getCampaignExperimentBytes();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}