// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/asset_set_types.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * Information about a Business Profile dynamic location group.
 * Only applicable if the sync level AssetSet's type is LOCATION_SYNC and
 * sync source is Business Profile.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.BusinessProfileLocationGroup}
 */
public final class BusinessProfileLocationGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.BusinessProfileLocationGroup)
    BusinessProfileLocationGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BusinessProfileLocationGroup.newBuilder() to construct.
  private BusinessProfileLocationGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BusinessProfileLocationGroup() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BusinessProfileLocationGroup();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_BusinessProfileLocationGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_BusinessProfileLocationGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.BusinessProfileLocationGroup.class, com.google.ads.googleads.v12.common.BusinessProfileLocationGroup.Builder.class);
  }

  public static final int DYNAMIC_BUSINESS_PROFILE_LOCATION_GROUP_FILTER_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamicBusinessProfileLocationGroupFilter_;
  /**
   * <pre>
   * Filter for dynamic Business Profile location sets.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
   * @return Whether the dynamicBusinessProfileLocationGroupFilter field is set.
   */
  @java.lang.Override
  public boolean hasDynamicBusinessProfileLocationGroupFilter() {
    return dynamicBusinessProfileLocationGroupFilter_ != null;
  }
  /**
   * <pre>
   * Filter for dynamic Business Profile location sets.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
   * @return The dynamicBusinessProfileLocationGroupFilter.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter getDynamicBusinessProfileLocationGroupFilter() {
    return dynamicBusinessProfileLocationGroupFilter_ == null ? com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter.getDefaultInstance() : dynamicBusinessProfileLocationGroupFilter_;
  }
  /**
   * <pre>
   * Filter for dynamic Business Profile location sets.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilterOrBuilder getDynamicBusinessProfileLocationGroupFilterOrBuilder() {
    return getDynamicBusinessProfileLocationGroupFilter();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (dynamicBusinessProfileLocationGroupFilter_ != null) {
      output.writeMessage(1, getDynamicBusinessProfileLocationGroupFilter());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dynamicBusinessProfileLocationGroupFilter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDynamicBusinessProfileLocationGroupFilter());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v12.common.BusinessProfileLocationGroup)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.BusinessProfileLocationGroup other = (com.google.ads.googleads.v12.common.BusinessProfileLocationGroup) obj;

    if (hasDynamicBusinessProfileLocationGroupFilter() != other.hasDynamicBusinessProfileLocationGroupFilter()) return false;
    if (hasDynamicBusinessProfileLocationGroupFilter()) {
      if (!getDynamicBusinessProfileLocationGroupFilter()
          .equals(other.getDynamicBusinessProfileLocationGroupFilter())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDynamicBusinessProfileLocationGroupFilter()) {
      hash = (37 * hash) + DYNAMIC_BUSINESS_PROFILE_LOCATION_GROUP_FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getDynamicBusinessProfileLocationGroupFilter().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v12.common.BusinessProfileLocationGroup prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Information about a Business Profile dynamic location group.
   * Only applicable if the sync level AssetSet's type is LOCATION_SYNC and
   * sync source is Business Profile.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.BusinessProfileLocationGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.BusinessProfileLocationGroup)
      com.google.ads.googleads.v12.common.BusinessProfileLocationGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_BusinessProfileLocationGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_BusinessProfileLocationGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.BusinessProfileLocationGroup.class, com.google.ads.googleads.v12.common.BusinessProfileLocationGroup.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.BusinessProfileLocationGroup.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dynamicBusinessProfileLocationGroupFilterBuilder_ == null) {
        dynamicBusinessProfileLocationGroupFilter_ = null;
      } else {
        dynamicBusinessProfileLocationGroupFilter_ = null;
        dynamicBusinessProfileLocationGroupFilterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_BusinessProfileLocationGroup_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.BusinessProfileLocationGroup getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.BusinessProfileLocationGroup.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.BusinessProfileLocationGroup build() {
      com.google.ads.googleads.v12.common.BusinessProfileLocationGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.BusinessProfileLocationGroup buildPartial() {
      com.google.ads.googleads.v12.common.BusinessProfileLocationGroup result = new com.google.ads.googleads.v12.common.BusinessProfileLocationGroup(this);
      if (dynamicBusinessProfileLocationGroupFilterBuilder_ == null) {
        result.dynamicBusinessProfileLocationGroupFilter_ = dynamicBusinessProfileLocationGroupFilter_;
      } else {
        result.dynamicBusinessProfileLocationGroupFilter_ = dynamicBusinessProfileLocationGroupFilterBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v12.common.BusinessProfileLocationGroup) {
        return mergeFrom((com.google.ads.googleads.v12.common.BusinessProfileLocationGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.BusinessProfileLocationGroup other) {
      if (other == com.google.ads.googleads.v12.common.BusinessProfileLocationGroup.getDefaultInstance()) return this;
      if (other.hasDynamicBusinessProfileLocationGroupFilter()) {
        mergeDynamicBusinessProfileLocationGroupFilter(other.getDynamicBusinessProfileLocationGroupFilter());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getDynamicBusinessProfileLocationGroupFilterFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamicBusinessProfileLocationGroupFilter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter, com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter.Builder, com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilterOrBuilder> dynamicBusinessProfileLocationGroupFilterBuilder_;
    /**
     * <pre>
     * Filter for dynamic Business Profile location sets.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
     * @return Whether the dynamicBusinessProfileLocationGroupFilter field is set.
     */
    public boolean hasDynamicBusinessProfileLocationGroupFilter() {
      return dynamicBusinessProfileLocationGroupFilterBuilder_ != null || dynamicBusinessProfileLocationGroupFilter_ != null;
    }
    /**
     * <pre>
     * Filter for dynamic Business Profile location sets.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
     * @return The dynamicBusinessProfileLocationGroupFilter.
     */
    public com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter getDynamicBusinessProfileLocationGroupFilter() {
      if (dynamicBusinessProfileLocationGroupFilterBuilder_ == null) {
        return dynamicBusinessProfileLocationGroupFilter_ == null ? com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter.getDefaultInstance() : dynamicBusinessProfileLocationGroupFilter_;
      } else {
        return dynamicBusinessProfileLocationGroupFilterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Filter for dynamic Business Profile location sets.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
     */
    public Builder setDynamicBusinessProfileLocationGroupFilter(com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter value) {
      if (dynamicBusinessProfileLocationGroupFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dynamicBusinessProfileLocationGroupFilter_ = value;
        onChanged();
      } else {
        dynamicBusinessProfileLocationGroupFilterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Filter for dynamic Business Profile location sets.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
     */
    public Builder setDynamicBusinessProfileLocationGroupFilter(
        com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter.Builder builderForValue) {
      if (dynamicBusinessProfileLocationGroupFilterBuilder_ == null) {
        dynamicBusinessProfileLocationGroupFilter_ = builderForValue.build();
        onChanged();
      } else {
        dynamicBusinessProfileLocationGroupFilterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Filter for dynamic Business Profile location sets.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
     */
    public Builder mergeDynamicBusinessProfileLocationGroupFilter(com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter value) {
      if (dynamicBusinessProfileLocationGroupFilterBuilder_ == null) {
        if (dynamicBusinessProfileLocationGroupFilter_ != null) {
          dynamicBusinessProfileLocationGroupFilter_ =
            com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter.newBuilder(dynamicBusinessProfileLocationGroupFilter_).mergeFrom(value).buildPartial();
        } else {
          dynamicBusinessProfileLocationGroupFilter_ = value;
        }
        onChanged();
      } else {
        dynamicBusinessProfileLocationGroupFilterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Filter for dynamic Business Profile location sets.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
     */
    public Builder clearDynamicBusinessProfileLocationGroupFilter() {
      if (dynamicBusinessProfileLocationGroupFilterBuilder_ == null) {
        dynamicBusinessProfileLocationGroupFilter_ = null;
        onChanged();
      } else {
        dynamicBusinessProfileLocationGroupFilter_ = null;
        dynamicBusinessProfileLocationGroupFilterBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Filter for dynamic Business Profile location sets.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
     */
    public com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter.Builder getDynamicBusinessProfileLocationGroupFilterBuilder() {
      
      onChanged();
      return getDynamicBusinessProfileLocationGroupFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Filter for dynamic Business Profile location sets.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
     */
    public com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilterOrBuilder getDynamicBusinessProfileLocationGroupFilterOrBuilder() {
      if (dynamicBusinessProfileLocationGroupFilterBuilder_ != null) {
        return dynamicBusinessProfileLocationGroupFilterBuilder_.getMessageOrBuilder();
      } else {
        return dynamicBusinessProfileLocationGroupFilter_ == null ?
            com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter.getDefaultInstance() : dynamicBusinessProfileLocationGroupFilter_;
      }
    }
    /**
     * <pre>
     * Filter for dynamic Business Profile location sets.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter dynamic_business_profile_location_group_filter = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter, com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter.Builder, com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilterOrBuilder> 
        getDynamicBusinessProfileLocationGroupFilterFieldBuilder() {
      if (dynamicBusinessProfileLocationGroupFilterBuilder_ == null) {
        dynamicBusinessProfileLocationGroupFilterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter, com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilter.Builder, com.google.ads.googleads.v12.common.DynamicBusinessProfileLocationGroupFilterOrBuilder>(
                getDynamicBusinessProfileLocationGroupFilter(),
                getParentForChildren(),
                isClean());
        dynamicBusinessProfileLocationGroupFilter_ = null;
      }
      return dynamicBusinessProfileLocationGroupFilterBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.BusinessProfileLocationGroup)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.BusinessProfileLocationGroup)
  private static final com.google.ads.googleads.v12.common.BusinessProfileLocationGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.BusinessProfileLocationGroup();
  }

  public static com.google.ads.googleads.v12.common.BusinessProfileLocationGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BusinessProfileLocationGroup>
      PARSER = new com.google.protobuf.AbstractParser<BusinessProfileLocationGroup>() {
    @java.lang.Override
    public BusinessProfileLocationGroup parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BusinessProfileLocationGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BusinessProfileLocationGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.BusinessProfileLocationGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

