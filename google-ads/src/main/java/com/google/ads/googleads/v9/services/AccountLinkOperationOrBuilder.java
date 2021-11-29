// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/account_link_service.proto

package com.google.ads.googleads.v9.services;

public interface AccountLinkOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.services.AccountLinkOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Update operation: The account link is expected to have
   * a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.AccountLink update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The account link is expected to have
   * a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.AccountLink update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v9.resources.AccountLink getUpdate();
  /**
   * <pre>
   * Update operation: The account link is expected to have
   * a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.resources.AccountLink update = 2;</code>
   */
  com.google.ads.googleads.v9.resources.AccountLinkOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the account link to remove is
   * expected, in this format:
   * `customers/{customer_id}/accountLinks/{account_link_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the account link to remove is
   * expected, in this format:
   * `customers/{customer_id}/accountLinks/{account_link_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the account link to remove is
   * expected, in this format:
   * `customers/{customer_id}/accountLinks/{account_link_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v9.services.AccountLinkOperation.OperationCase getOperationCase();
}