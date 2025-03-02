// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/account_link.proto

package com.google.ads.googleads.v11.resources;

public interface AccountLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.resources.AccountLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Resource name of the account link.
   * AccountLink resource names have the form:
   * `customers/{customer_id}/accountLinks/{account_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. Resource name of the account link.
   * AccountLink resource names have the form:
   * `customers/{customer_id}/accountLinks/{account_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the link.
   * This field is read only.
   * </pre>
   *
   * <code>optional int64 account_link_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the accountLinkId field is set.
   */
  boolean hasAccountLinkId();
  /**
   * <pre>
   * Output only. The ID of the link.
   * This field is read only.
   * </pre>
   *
   * <code>optional int64 account_link_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The accountLinkId.
   */
  long getAccountLinkId();

  /**
   * <pre>
   * The status of the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.AccountLinkStatusEnum.AccountLinkStatus status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.AccountLinkStatusEnum.AccountLinkStatus status = 3;</code>
   * @return The status.
   */
  com.google.ads.googleads.v11.enums.AccountLinkStatusEnum.AccountLinkStatus getStatus();

  /**
   * <pre>
   * Output only. The type of the linked account.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.LinkedAccountTypeEnum.LinkedAccountType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of the linked account.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.LinkedAccountTypeEnum.LinkedAccountType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v11.enums.LinkedAccountTypeEnum.LinkedAccountType getType();

  /**
   * <pre>
   * Immutable. A third party app analytics link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.ThirdPartyAppAnalyticsLinkIdentifier third_party_app_analytics = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the thirdPartyAppAnalytics field is set.
   */
  boolean hasThirdPartyAppAnalytics();
  /**
   * <pre>
   * Immutable. A third party app analytics link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.ThirdPartyAppAnalyticsLinkIdentifier third_party_app_analytics = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The thirdPartyAppAnalytics.
   */
  com.google.ads.googleads.v11.resources.ThirdPartyAppAnalyticsLinkIdentifier getThirdPartyAppAnalytics();
  /**
   * <pre>
   * Immutable. A third party app analytics link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.ThirdPartyAppAnalyticsLinkIdentifier third_party_app_analytics = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v11.resources.ThirdPartyAppAnalyticsLinkIdentifierOrBuilder getThirdPartyAppAnalyticsOrBuilder();

  /**
   * <pre>
   * Output only. Data partner link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.DataPartnerLinkIdentifier data_partner = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the dataPartner field is set.
   */
  boolean hasDataPartner();
  /**
   * <pre>
   * Output only. Data partner link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.DataPartnerLinkIdentifier data_partner = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The dataPartner.
   */
  com.google.ads.googleads.v11.resources.DataPartnerLinkIdentifier getDataPartner();
  /**
   * <pre>
   * Output only. Data partner link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.DataPartnerLinkIdentifier data_partner = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v11.resources.DataPartnerLinkIdentifierOrBuilder getDataPartnerOrBuilder();

  /**
   * <pre>
   * Output only. Google Ads link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier google_ads = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the googleAds field is set.
   */
  boolean hasGoogleAds();
  /**
   * <pre>
   * Output only. Google Ads link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier google_ads = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The googleAds.
   */
  com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier getGoogleAds();
  /**
   * <pre>
   * Output only. Google Ads link.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier google_ads = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifierOrBuilder getGoogleAdsOrBuilder();

  /**
   * <pre>
   * Output only. Hotel link
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.HotelCenterLinkIdentifier hotel_center = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hotelCenter field is set.
   */
  boolean hasHotelCenter();
  /**
   * <pre>
   * Output only. Hotel link
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.HotelCenterLinkIdentifier hotel_center = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hotelCenter.
   */
  com.google.ads.googleads.v11.resources.HotelCenterLinkIdentifier getHotelCenter();
  /**
   * <pre>
   * Output only. Hotel link
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.HotelCenterLinkIdentifier hotel_center = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v11.resources.HotelCenterLinkIdentifierOrBuilder getHotelCenterOrBuilder();

  public com.google.ads.googleads.v11.resources.AccountLink.LinkedAccountCase getLinkedAccountCase();
}
