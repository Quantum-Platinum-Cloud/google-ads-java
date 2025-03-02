// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/product_bidding_category_constant.proto

package com.google.ads.googleads.v12.resources;

public interface ProductBiddingCategoryConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.ProductBiddingCategoryConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the product bidding category.
   * Product bidding category resource names have the form:
   * `productBiddingCategoryConstants/{country_code}~{level}~{id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the product bidding category.
   * Product bidding category resource names have the form:
   * `productBiddingCategoryConstants/{country_code}~{level}~{id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. ID of the product bidding category.
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436.
   * </pre>
   *
   * <code>optional int64 id = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. ID of the product bidding category.
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436.
   * </pre>
   *
   * <code>optional int64 id = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. Two-letter upper-case country code of the product bidding category.
   * </pre>
   *
   * <code>optional string country_code = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Output only. Two-letter upper-case country code of the product bidding category.
   * </pre>
   *
   * <code>optional string country_code = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Output only. Two-letter upper-case country code of the product bidding category.
   * </pre>
   *
   * <code>optional string country_code = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * Output only. Resource name of the parent product bidding category.
   * </pre>
   *
   * <code>optional string product_bidding_category_constant_parent = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the productBiddingCategoryConstantParent field is set.
   */
  boolean hasProductBiddingCategoryConstantParent();
  /**
   * <pre>
   * Output only. Resource name of the parent product bidding category.
   * </pre>
   *
   * <code>optional string product_bidding_category_constant_parent = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The productBiddingCategoryConstantParent.
   */
  java.lang.String getProductBiddingCategoryConstantParent();
  /**
   * <pre>
   * Output only. Resource name of the parent product bidding category.
   * </pre>
   *
   * <code>optional string product_bidding_category_constant_parent = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for productBiddingCategoryConstantParent.
   */
  com.google.protobuf.ByteString
      getProductBiddingCategoryConstantParentBytes();

  /**
   * <pre>
   * Output only. Level of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <pre>
   * Output only. Level of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The level.
   */
  com.google.ads.googleads.v12.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel getLevel();

  /**
   * <pre>
   * Output only. Status of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ProductBiddingCategoryStatusEnum.ProductBiddingCategoryStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ProductBiddingCategoryStatusEnum.ProductBiddingCategoryStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v12.enums.ProductBiddingCategoryStatusEnum.ProductBiddingCategoryStatus getStatus();

  /**
   * <pre>
   * Output only. Language code of the product bidding category.
   * </pre>
   *
   * <code>optional string language_code = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * Output only. Language code of the product bidding category.
   * </pre>
   *
   * <code>optional string language_code = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Output only. Language code of the product bidding category.
   * </pre>
   *
   * <code>optional string language_code = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Output only. Display value of the product bidding category localized according to
   * language_code.
   * </pre>
   *
   * <code>optional string localized_name = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the localizedName field is set.
   */
  boolean hasLocalizedName();
  /**
   * <pre>
   * Output only. Display value of the product bidding category localized according to
   * language_code.
   * </pre>
   *
   * <code>optional string localized_name = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The localizedName.
   */
  java.lang.String getLocalizedName();
  /**
   * <pre>
   * Output only. Display value of the product bidding category localized according to
   * language_code.
   * </pre>
   *
   * <code>optional string localized_name = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for localizedName.
   */
  com.google.protobuf.ByteString
      getLocalizedNameBytes();
}
