// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/ad_group.proto

package com.google.ads.googleads.v0.resources;

public interface AdGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.resources.AdGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the ad group.
   * Ad group resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the ad group.
   * Ad group resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the ad group.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the ad group.
   * This field is required and should not be empty when creating new ad
   * groups.
   * It must contain fewer than 255 UTF-8 full-width characters.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the ad group.
   * This field is required and should not be empty when creating new ad
   * groups.
   * It must contain fewer than 255 UTF-8 full-width characters.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the ad group.
   * This field is required and should not be empty when creating new ad
   * groups.
   * It must contain fewer than 255 UTF-8 full-width characters.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The status of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.AdGroupStatusEnum.AdGroupStatus status = 5;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.AdGroupStatusEnum.AdGroupStatus status = 5;</code>
   */
  com.google.ads.googleads.v0.enums.AdGroupStatusEnum.AdGroupStatus getStatus();

  /**
   * <pre>
   * The type of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.AdGroupTypeEnum.AdGroupType type = 12;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.AdGroupTypeEnum.AdGroupType type = 12;</code>
   */
  com.google.ads.googleads.v0.enums.AdGroupTypeEnum.AdGroupType getType();

  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 13;</code>
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 13;</code>
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 13;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.CustomParameter url_custom_parameters = 6;</code>
   */
  java.util.List<com.google.ads.googleads.v0.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.CustomParameter url_custom_parameters = 6;</code>
   */
  com.google.ads.googleads.v0.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.CustomParameter url_custom_parameters = 6;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.CustomParameter url_custom_parameters = 6;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v0.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.CustomParameter url_custom_parameters = 6;</code>
   */
  com.google.ads.googleads.v0.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * The campaign to which the ad group belongs.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 10;</code>
   */
  boolean hasCampaign();
  /**
   * <pre>
   * The campaign to which the ad group belongs.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 10;</code>
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * The campaign to which the ad group belongs.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 10;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * The maximum CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 14;</code>
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * The maximum CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 14;</code>
   */
  com.google.protobuf.Int64Value getCpcBidMicros();
  /**
   * <pre>
   * The maximum CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_micros = 14;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidMicrosOrBuilder();

  /**
   * <pre>
   * The maximum CPM (cost-per-thousand viewable impressions) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpm_bid_micros = 15;</code>
   */
  boolean hasCpmBidMicros();
  /**
   * <pre>
   * The maximum CPM (cost-per-thousand viewable impressions) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpm_bid_micros = 15;</code>
   */
  com.google.protobuf.Int64Value getCpmBidMicros();
  /**
   * <pre>
   * The maximum CPM (cost-per-thousand viewable impressions) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpm_bid_micros = 15;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpmBidMicrosOrBuilder();

  /**
   * <pre>
   * The target cost-per-acquisition (conversion) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpa_bid_micros = 16;</code>
   */
  boolean hasCpaBidMicros();
  /**
   * <pre>
   * The target cost-per-acquisition (conversion) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpa_bid_micros = 16;</code>
   */
  com.google.protobuf.Int64Value getCpaBidMicros();
  /**
   * <pre>
   * The target cost-per-acquisition (conversion) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpa_bid_micros = 16;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpaBidMicrosOrBuilder();

  /**
   * <pre>
   * The CPV (cost-per-view) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpv_bid_micros = 17;</code>
   */
  boolean hasCpvBidMicros();
  /**
   * <pre>
   * The CPV (cost-per-view) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpv_bid_micros = 17;</code>
   */
  com.google.protobuf.Int64Value getCpvBidMicros();
  /**
   * <pre>
   * The CPV (cost-per-view) bid.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpv_bid_micros = 17;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpvBidMicrosOrBuilder();

  /**
   * <pre>
   * The target return on ad spend (ROAS) override. If the ad group's campaign
   * bidding strategy is a standard Target ROAS strategy, then this field
   * overrides the target ROAS specified in the campaign's bidding strategy.
   * Otherwise, this value is ignored.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue target_roas_override = 19;</code>
   */
  boolean hasTargetRoasOverride();
  /**
   * <pre>
   * The target return on ad spend (ROAS) override. If the ad group's campaign
   * bidding strategy is a standard Target ROAS strategy, then this field
   * overrides the target ROAS specified in the campaign's bidding strategy.
   * Otherwise, this value is ignored.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue target_roas_override = 19;</code>
   */
  com.google.protobuf.DoubleValue getTargetRoasOverride();
  /**
   * <pre>
   * The target return on ad spend (ROAS) override. If the ad group's campaign
   * bidding strategy is a standard Target ROAS strategy, then this field
   * overrides the target ROAS specified in the campaign's bidding strategy.
   * Otherwise, this value is ignored.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue target_roas_override = 19;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getTargetRoasOverrideOrBuilder();
}
