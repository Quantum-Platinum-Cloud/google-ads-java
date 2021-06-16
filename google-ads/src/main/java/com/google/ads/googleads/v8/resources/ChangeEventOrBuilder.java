// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/change_event.proto

package com.google.ads.googleads.v8.resources;

public interface ChangeEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.ChangeEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the change event.
   * Change event resource names have the form:
   * `customers/{customer_id}/changeEvents/{timestamp_micros}~{command_index}~{mutate_index}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the change event.
   * Change event resource names have the form:
   * `customers/{customer_id}/changeEvents/{timestamp_micros}~{command_index}~{mutate_index}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Time at which the change was committed on this resource.
   * </pre>
   *
   * <code>string change_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The changeDateTime.
   */
  java.lang.String getChangeDateTime();
  /**
   * <pre>
   * Output only. Time at which the change was committed on this resource.
   * </pre>
   *
   * <code>string change_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for changeDateTime.
   */
  com.google.protobuf.ByteString
      getChangeDateTimeBytes();

  /**
   * <pre>
   * Output only. The type of the changed resource. This dictates what resource
   * will be set in old_resource and new_resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.ChangeEventResourceTypeEnum.ChangeEventResourceType change_resource_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for changeResourceType.
   */
  int getChangeResourceTypeValue();
  /**
   * <pre>
   * Output only. The type of the changed resource. This dictates what resource
   * will be set in old_resource and new_resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.ChangeEventResourceTypeEnum.ChangeEventResourceType change_resource_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The changeResourceType.
   */
  com.google.ads.googleads.v8.enums.ChangeEventResourceTypeEnum.ChangeEventResourceType getChangeResourceType();

  /**
   * <pre>
   * Output only. The Simply resource this change occurred on.
   * </pre>
   *
   * <code>string change_resource_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The changeResourceName.
   */
  java.lang.String getChangeResourceName();
  /**
   * <pre>
   * Output only. The Simply resource this change occurred on.
   * </pre>
   *
   * <code>string change_resource_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for changeResourceName.
   */
  com.google.protobuf.ByteString
      getChangeResourceNameBytes();

  /**
   * <pre>
   * Output only. Where the change was made through.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.ChangeClientTypeEnum.ChangeClientType client_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for clientType.
   */
  int getClientTypeValue();
  /**
   * <pre>
   * Output only. Where the change was made through.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.ChangeClientTypeEnum.ChangeClientType client_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The clientType.
   */
  com.google.ads.googleads.v8.enums.ChangeClientTypeEnum.ChangeClientType getClientType();

  /**
   * <pre>
   * Output only. The email of the user who made this change.
   * </pre>
   *
   * <code>string user_email = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The userEmail.
   */
  java.lang.String getUserEmail();
  /**
   * <pre>
   * Output only. The email of the user who made this change.
   * </pre>
   *
   * <code>string user_email = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for userEmail.
   */
  com.google.protobuf.ByteString
      getUserEmailBytes();

  /**
   * <pre>
   * Output only. The old resource before the change. Only changed fields will be populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.ChangeEvent.ChangedResource old_resource = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the oldResource field is set.
   */
  boolean hasOldResource();
  /**
   * <pre>
   * Output only. The old resource before the change. Only changed fields will be populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.ChangeEvent.ChangedResource old_resource = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The oldResource.
   */
  com.google.ads.googleads.v8.resources.ChangeEvent.ChangedResource getOldResource();
  /**
   * <pre>
   * Output only. The old resource before the change. Only changed fields will be populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.ChangeEvent.ChangedResource old_resource = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v8.resources.ChangeEvent.ChangedResourceOrBuilder getOldResourceOrBuilder();

  /**
   * <pre>
   * Output only. The new resource after the change. Only changed fields will be populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.ChangeEvent.ChangedResource new_resource = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the newResource field is set.
   */
  boolean hasNewResource();
  /**
   * <pre>
   * Output only. The new resource after the change. Only changed fields will be populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.ChangeEvent.ChangedResource new_resource = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The newResource.
   */
  com.google.ads.googleads.v8.resources.ChangeEvent.ChangedResource getNewResource();
  /**
   * <pre>
   * Output only. The new resource after the change. Only changed fields will be populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.ChangeEvent.ChangedResource new_resource = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v8.resources.ChangeEvent.ChangedResourceOrBuilder getNewResourceOrBuilder();

  /**
   * <pre>
   * Output only. The operation on the changed resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.ResourceChangeOperationEnum.ResourceChangeOperation resource_change_operation = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for resourceChangeOperation.
   */
  int getResourceChangeOperationValue();
  /**
   * <pre>
   * Output only. The operation on the changed resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.ResourceChangeOperationEnum.ResourceChangeOperation resource_change_operation = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The resourceChangeOperation.
   */
  com.google.ads.googleads.v8.enums.ResourceChangeOperationEnum.ResourceChangeOperation getResourceChangeOperation();

  /**
   * <pre>
   * Output only. A list of fields that are changed in the returned resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask changed_fields = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the changedFields field is set.
   */
  boolean hasChangedFields();
  /**
   * <pre>
   * Output only. A list of fields that are changed in the returned resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask changed_fields = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The changedFields.
   */
  com.google.protobuf.FieldMask getChangedFields();
  /**
   * <pre>
   * Output only. A list of fields that are changed in the returned resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask changed_fields = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getChangedFieldsOrBuilder();

  /**
   * <pre>
   * Output only. The Campaign affected by this change.
   * </pre>
   *
   * <code>string campaign = 11 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Output only. The Campaign affected by this change.
   * </pre>
   *
   * <code>string campaign = 11 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Output only. The AdGroup affected by this change.
   * </pre>
   *
   * <code>string ad_group = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  java.lang.String getAdGroup();
  /**
   * <pre>
   * Output only. The AdGroup affected by this change.
   * </pre>
   *
   * <code>string ad_group = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroup.
   */
  com.google.protobuf.ByteString
      getAdGroupBytes();

  /**
   * <pre>
   * Output only. The Feed affected by this change.
   * </pre>
   *
   * <code>string feed = 13 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The feed.
   */
  java.lang.String getFeed();
  /**
   * <pre>
   * Output only. The Feed affected by this change.
   * </pre>
   *
   * <code>string feed = 13 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for feed.
   */
  com.google.protobuf.ByteString
      getFeedBytes();

  /**
   * <pre>
   * Output only. The FeedItem affected by this change.
   * </pre>
   *
   * <code>string feed_item = 14 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The feedItem.
   */
  java.lang.String getFeedItem();
  /**
   * <pre>
   * Output only. The FeedItem affected by this change.
   * </pre>
   *
   * <code>string feed_item = 14 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for feedItem.
   */
  com.google.protobuf.ByteString
      getFeedItemBytes();
}