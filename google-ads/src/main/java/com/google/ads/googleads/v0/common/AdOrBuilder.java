// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/ad.proto

package com.google.ads.googleads.v0.common;

public interface AdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.common.Ad)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the ad.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the ad.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the ad.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalUrlsList();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  com.google.protobuf.StringValue getFinalUrls(int index);
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalUrlsOrBuilderList();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalMobileUrlsList();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  com.google.protobuf.StringValue getFinalMobileUrls(int index);
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalMobileUrlsOrBuilderList();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalMobileUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 12;</code>
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 12;</code>
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 12;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.CustomParameter url_custom_parameters = 10;</code>
   */
  java.util.List<com.google.ads.googleads.v0.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.CustomParameter url_custom_parameters = 10;</code>
   */
  com.google.ads.googleads.v0.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.CustomParameter url_custom_parameters = 10;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.CustomParameter url_custom_parameters = 10;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v0.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.CustomParameter url_custom_parameters = 10;</code>
   */
  com.google.ads.googleads.v0.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>.google.protobuf.StringValue display_url = 4;</code>
   */
  boolean hasDisplayUrl();
  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>.google.protobuf.StringValue display_url = 4;</code>
   */
  com.google.protobuf.StringValue getDisplayUrl();
  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>.google.protobuf.StringValue display_url = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDisplayUrlOrBuilder();

  /**
   * <pre>
   * The type of ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.AdTypeEnum.AdType type = 5;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.AdTypeEnum.AdType type = 5;</code>
   */
  com.google.ads.googleads.v0.enums.AdTypeEnum.AdType getType();

  /**
   * <pre>
   * Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.TextAdInfo text_ad = 6;</code>
   */
  boolean hasTextAd();
  /**
   * <pre>
   * Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.TextAdInfo text_ad = 6;</code>
   */
  com.google.ads.googleads.v0.common.TextAdInfo getTextAd();
  /**
   * <pre>
   * Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.TextAdInfo text_ad = 6;</code>
   */
  com.google.ads.googleads.v0.common.TextAdInfoOrBuilder getTextAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   */
  boolean hasExpandedTextAd();
  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   */
  com.google.ads.googleads.v0.common.ExpandedTextAdInfo getExpandedTextAd();
  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   */
  com.google.ads.googleads.v0.common.ExpandedTextAdInfoOrBuilder getExpandedTextAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Dynamic Search Ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.DynamicSearchAdInfo dynamic_search_ad = 8;</code>
   */
  boolean hasDynamicSearchAd();
  /**
   * <pre>
   * Details pertaining to a Dynamic Search Ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.DynamicSearchAdInfo dynamic_search_ad = 8;</code>
   */
  com.google.ads.googleads.v0.common.DynamicSearchAdInfo getDynamicSearchAd();
  /**
   * <pre>
   * Details pertaining to a Dynamic Search Ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.DynamicSearchAdInfo dynamic_search_ad = 8;</code>
   */
  com.google.ads.googleads.v0.common.DynamicSearchAdInfoOrBuilder getDynamicSearchAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.ResponsiveDisplayAdInfo responsive_display_ad = 9;</code>
   */
  boolean hasResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.ResponsiveDisplayAdInfo responsive_display_ad = 9;</code>
   */
  com.google.ads.googleads.v0.common.ResponsiveDisplayAdInfo getResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.ResponsiveDisplayAdInfo responsive_display_ad = 9;</code>
   */
  com.google.ads.googleads.v0.common.ResponsiveDisplayAdInfoOrBuilder getResponsiveDisplayAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a call-only ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.CallOnlyAdInfo call_only_ad = 13;</code>
   */
  boolean hasCallOnlyAd();
  /**
   * <pre>
   * Details pertaining to a call-only ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.CallOnlyAdInfo call_only_ad = 13;</code>
   */
  com.google.ads.googleads.v0.common.CallOnlyAdInfo getCallOnlyAd();
  /**
   * <pre>
   * Details pertaining to a call-only ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.CallOnlyAdInfo call_only_ad = 13;</code>
   */
  com.google.ads.googleads.v0.common.CallOnlyAdInfoOrBuilder getCallOnlyAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14;</code>
   */
  boolean hasExpandedDynamicSearchAd();
  /**
   * <pre>
   * Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14;</code>
   */
  com.google.ads.googleads.v0.common.ExpandedDynamicSearchAdInfo getExpandedDynamicSearchAd();
  /**
   * <pre>
   * Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14;</code>
   */
  com.google.ads.googleads.v0.common.ExpandedDynamicSearchAdInfoOrBuilder getExpandedDynamicSearchAdOrBuilder();

  public com.google.ads.googleads.v0.common.Ad.AdDataCase getAdDataCase();
}
