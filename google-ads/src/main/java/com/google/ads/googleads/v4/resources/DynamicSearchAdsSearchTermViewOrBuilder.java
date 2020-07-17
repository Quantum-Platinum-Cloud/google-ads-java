// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/dynamic_search_ads_search_term_view.proto

package com.google.ads.googleads.v4.resources;

public interface DynamicSearchAdsSearchTermViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.resources.DynamicSearchAdsSearchTermView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the dynamic search ads search term view.
   * Dynamic search ads search term view resource names have the form:
   * `customers/{customer_id}/dynamicSearchAdsSearchTermViews/{ad_group_id}~{search_term_fp}~{headline_fp}~{landing_page_fp}~{page_url_fp}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the dynamic search ads search term view.
   * Dynamic search ads search term view resource names have the form:
   * `customers/{customer_id}/dynamicSearchAdsSearchTermViews/{ad_group_id}~{search_term_fp}~{headline_fp}~{landing_page_fp}~{page_url_fp}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Search term
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the searchTerm field is set.
   */
  boolean hasSearchTerm();
  /**
   * <pre>
   * Output only. Search term
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The searchTerm.
   */
  com.google.protobuf.StringValue getSearchTerm();
  /**
   * <pre>
   * Output only. Search term
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getSearchTermOrBuilder();

  /**
   * <pre>
   * Output only. The dynamically generated headline of the Dynamic Search Ad.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the headline field is set.
   */
  boolean hasHeadline();
  /**
   * <pre>
   * Output only. The dynamically generated headline of the Dynamic Search Ad.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The headline.
   */
  com.google.protobuf.StringValue getHeadline();
  /**
   * <pre>
   * Output only. The dynamically generated headline of the Dynamic Search Ad.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getHeadlineOrBuilder();

  /**
   * <pre>
   * Output only. The dynamically selected landing page URL of the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue landing_page = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the landingPage field is set.
   */
  boolean hasLandingPage();
  /**
   * <pre>
   * Output only. The dynamically selected landing page URL of the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue landing_page = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The landingPage.
   */
  com.google.protobuf.StringValue getLandingPage();
  /**
   * <pre>
   * Output only. The dynamically selected landing page URL of the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue landing_page = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getLandingPageOrBuilder();

  /**
   * <pre>
   * Output only. The URL of page feed item served for the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue page_url = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the pageUrl field is set.
   */
  boolean hasPageUrl();
  /**
   * <pre>
   * Output only. The URL of page feed item served for the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue page_url = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pageUrl.
   */
  com.google.protobuf.StringValue getPageUrl();
  /**
   * <pre>
   * Output only. The URL of page feed item served for the impression.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue page_url = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getPageUrlOrBuilder();

  /**
   * <pre>
   * Output only. True if query matches a negative keyword.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_keyword = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hasNegativeKeyword field is set.
   */
  boolean hasHasNegativeKeyword();
  /**
   * <pre>
   * Output only. True if query matches a negative keyword.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_keyword = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasNegativeKeyword.
   */
  com.google.protobuf.BoolValue getHasNegativeKeyword();
  /**
   * <pre>
   * Output only. True if query matches a negative keyword.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_keyword = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasNegativeKeywordOrBuilder();

  /**
   * <pre>
   * Output only. True if query is added to targeted keywords.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_matching_keyword = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hasMatchingKeyword field is set.
   */
  boolean hasHasMatchingKeyword();
  /**
   * <pre>
   * Output only. True if query is added to targeted keywords.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_matching_keyword = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasMatchingKeyword.
   */
  com.google.protobuf.BoolValue getHasMatchingKeyword();
  /**
   * <pre>
   * Output only. True if query is added to targeted keywords.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_matching_keyword = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasMatchingKeywordOrBuilder();

  /**
   * <pre>
   * Output only. True if query matches a negative url.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_url = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hasNegativeUrl field is set.
   */
  boolean hasHasNegativeUrl();
  /**
   * <pre>
   * Output only. True if query matches a negative url.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_url = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasNegativeUrl.
   */
  com.google.protobuf.BoolValue getHasNegativeUrl();
  /**
   * <pre>
   * Output only. True if query matches a negative url.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_negative_url = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasNegativeUrlOrBuilder();
}
