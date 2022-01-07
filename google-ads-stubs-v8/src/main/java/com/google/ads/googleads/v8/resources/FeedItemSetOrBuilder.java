// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/feed_item_set.proto

package com.google.ads.googleads.v8.resources;

public interface FeedItemSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.FeedItemSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the feed item set.
   * Feed item set resource names have the form:
   * `customers/{customer_id}/feedItemSets/{feed_id}~{feed_item_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the feed item set.
   * Feed item set resource names have the form:
   * `customers/{customer_id}/feedItemSets/{feed_id}~{feed_item_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The resource name of the feed containing the feed items in the set.
   * Immutable. Required.
   * </pre>
   *
   * <code>string feed = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The feed.
   */
  java.lang.String getFeed();
  /**
   * <pre>
   * Immutable. The resource name of the feed containing the feed items in the set.
   * Immutable. Required.
   * </pre>
   *
   * <code>string feed = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for feed.
   */
  com.google.protobuf.ByteString
      getFeedBytes();

  /**
   * <pre>
   * Output only. ID of the set.
   * </pre>
   *
   * <code>int64 feed_item_set_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The feedItemSetId.
   */
  long getFeedItemSetId();

  /**
   * <pre>
   * Name of the set. Must be unique within the account.
   * </pre>
   *
   * <code>string display_name = 4;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Name of the set. Must be unique within the account.
   * </pre>
   *
   * <code>string display_name = 4;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. Status of the feed item set.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.FeedItemSetStatusEnum.FeedItemSetStatus status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the feed item set.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.FeedItemSetStatusEnum.FeedItemSetStatus status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v8.enums.FeedItemSetStatusEnum.FeedItemSetStatus getStatus();

  /**
   * <pre>
   * Filter for dynamic location set.
   * It is only used for sets of locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DynamicLocationSetFilter dynamic_location_set_filter = 5;</code>
   * @return Whether the dynamicLocationSetFilter field is set.
   */
  boolean hasDynamicLocationSetFilter();
  /**
   * <pre>
   * Filter for dynamic location set.
   * It is only used for sets of locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DynamicLocationSetFilter dynamic_location_set_filter = 5;</code>
   * @return The dynamicLocationSetFilter.
   */
  com.google.ads.googleads.v8.common.DynamicLocationSetFilter getDynamicLocationSetFilter();
  /**
   * <pre>
   * Filter for dynamic location set.
   * It is only used for sets of locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DynamicLocationSetFilter dynamic_location_set_filter = 5;</code>
   */
  com.google.ads.googleads.v8.common.DynamicLocationSetFilterOrBuilder getDynamicLocationSetFilterOrBuilder();

  /**
   * <pre>
   * Filter for dynamic affiliate location set.
   * This field doesn't apply generally to feed item sets. It is only used for
   * sets of affiliate locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DynamicAffiliateLocationSetFilter dynamic_affiliate_location_set_filter = 6;</code>
   * @return Whether the dynamicAffiliateLocationSetFilter field is set.
   */
  boolean hasDynamicAffiliateLocationSetFilter();
  /**
   * <pre>
   * Filter for dynamic affiliate location set.
   * This field doesn't apply generally to feed item sets. It is only used for
   * sets of affiliate locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DynamicAffiliateLocationSetFilter dynamic_affiliate_location_set_filter = 6;</code>
   * @return The dynamicAffiliateLocationSetFilter.
   */
  com.google.ads.googleads.v8.common.DynamicAffiliateLocationSetFilter getDynamicAffiliateLocationSetFilter();
  /**
   * <pre>
   * Filter for dynamic affiliate location set.
   * This field doesn't apply generally to feed item sets. It is only used for
   * sets of affiliate locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DynamicAffiliateLocationSetFilter dynamic_affiliate_location_set_filter = 6;</code>
   */
  com.google.ads.googleads.v8.common.DynamicAffiliateLocationSetFilterOrBuilder getDynamicAffiliateLocationSetFilterOrBuilder();

  public com.google.ads.googleads.v8.resources.FeedItemSet.DynamicSetFilterCase getDynamicSetFilterCase();
}