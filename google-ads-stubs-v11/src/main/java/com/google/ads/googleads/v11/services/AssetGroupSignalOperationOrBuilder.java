// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/asset_group_signal_service.proto

package com.google.ads.googleads.v11.services;

public interface AssetGroupSignalOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.AssetGroupSignalOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset group
   * signal.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AssetGroupSignal create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset group
   * signal.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AssetGroupSignal create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v11.resources.AssetGroupSignal getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset group
   * signal.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AssetGroupSignal create = 1;</code>
   */
  com.google.ads.googleads.v11.resources.AssetGroupSignalOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed asset group signal is
   * expected, in this format:
   * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed asset group signal is
   * expected, in this format:
   * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed asset group signal is
   * expected, in this format:
   * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v11.services.AssetGroupSignalOperation.OperationCase getOperationCase();
}
