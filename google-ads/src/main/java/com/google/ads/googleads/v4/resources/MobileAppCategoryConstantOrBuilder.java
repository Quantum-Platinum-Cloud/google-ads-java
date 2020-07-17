// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/mobile_app_category_constant.proto

package com.google.ads.googleads.v4.resources;

public interface MobileAppCategoryConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.resources.MobileAppCategoryConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the mobile app category constant.
   * Mobile app category constant resource names have the form:
   * `mobileAppCategoryConstants/{mobile_app_category_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the mobile app category constant.
   * Mobile app category constant resource names have the form:
   * `mobileAppCategoryConstants/{mobile_app_category_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the mobile app category constant.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the mobile app category constant.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int32Value getId();
  /**
   * <pre>
   * Output only. The ID of the mobile app category constant.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Output only. Mobile app category name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. Mobile app category name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Output only. Mobile app category name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();
}
