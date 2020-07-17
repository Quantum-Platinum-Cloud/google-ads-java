// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/criteria.proto

package com.google.ads.googleads.v4.common;

/**
 * <pre>
 * Country or Region the hotel is located in.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.common.HotelCountryRegionInfo}
 */
public  final class HotelCountryRegionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.common.HotelCountryRegionInfo)
    HotelCountryRegionInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelCountryRegionInfo.newBuilder() to construct.
  private HotelCountryRegionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelCountryRegionInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelCountryRegionInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HotelCountryRegionInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (countryRegionCriterion_ != null) {
              subBuilder = countryRegionCriterion_.toBuilder();
            }
            countryRegionCriterion_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(countryRegionCriterion_);
              countryRegionCriterion_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v4.common.CriteriaProto.internal_static_google_ads_googleads_v4_common_HotelCountryRegionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.common.CriteriaProto.internal_static_google_ads_googleads_v4_common_HotelCountryRegionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.common.HotelCountryRegionInfo.class, com.google.ads.googleads.v4.common.HotelCountryRegionInfo.Builder.class);
  }

  public static final int COUNTRY_REGION_CRITERION_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue countryRegionCriterion_;
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
   * @return Whether the countryRegionCriterion field is set.
   */
  public boolean hasCountryRegionCriterion() {
    return countryRegionCriterion_ != null;
  }
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
   * @return The countryRegionCriterion.
   */
  public com.google.protobuf.StringValue getCountryRegionCriterion() {
    return countryRegionCriterion_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : countryRegionCriterion_;
  }
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getCountryRegionCriterionOrBuilder() {
    return getCountryRegionCriterion();
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
    if (countryRegionCriterion_ != null) {
      output.writeMessage(1, getCountryRegionCriterion());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (countryRegionCriterion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCountryRegionCriterion());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v4.common.HotelCountryRegionInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.common.HotelCountryRegionInfo other = (com.google.ads.googleads.v4.common.HotelCountryRegionInfo) obj;

    if (hasCountryRegionCriterion() != other.hasCountryRegionCriterion()) return false;
    if (hasCountryRegionCriterion()) {
      if (!getCountryRegionCriterion()
          .equals(other.getCountryRegionCriterion())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCountryRegionCriterion()) {
      hash = (37 * hash) + COUNTRY_REGION_CRITERION_FIELD_NUMBER;
      hash = (53 * hash) + getCountryRegionCriterion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.common.HotelCountryRegionInfo prototype) {
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
   * Country or Region the hotel is located in.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.common.HotelCountryRegionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.common.HotelCountryRegionInfo)
      com.google.ads.googleads.v4.common.HotelCountryRegionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.common.CriteriaProto.internal_static_google_ads_googleads_v4_common_HotelCountryRegionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.common.CriteriaProto.internal_static_google_ads_googleads_v4_common_HotelCountryRegionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.common.HotelCountryRegionInfo.class, com.google.ads.googleads.v4.common.HotelCountryRegionInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.common.HotelCountryRegionInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (countryRegionCriterionBuilder_ == null) {
        countryRegionCriterion_ = null;
      } else {
        countryRegionCriterion_ = null;
        countryRegionCriterionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.common.CriteriaProto.internal_static_google_ads_googleads_v4_common_HotelCountryRegionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.HotelCountryRegionInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.common.HotelCountryRegionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.HotelCountryRegionInfo build() {
      com.google.ads.googleads.v4.common.HotelCountryRegionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.HotelCountryRegionInfo buildPartial() {
      com.google.ads.googleads.v4.common.HotelCountryRegionInfo result = new com.google.ads.googleads.v4.common.HotelCountryRegionInfo(this);
      if (countryRegionCriterionBuilder_ == null) {
        result.countryRegionCriterion_ = countryRegionCriterion_;
      } else {
        result.countryRegionCriterion_ = countryRegionCriterionBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.common.HotelCountryRegionInfo) {
        return mergeFrom((com.google.ads.googleads.v4.common.HotelCountryRegionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.common.HotelCountryRegionInfo other) {
      if (other == com.google.ads.googleads.v4.common.HotelCountryRegionInfo.getDefaultInstance()) return this;
      if (other.hasCountryRegionCriterion()) {
        mergeCountryRegionCriterion(other.getCountryRegionCriterion());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.ads.googleads.v4.common.HotelCountryRegionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.common.HotelCountryRegionInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue countryRegionCriterion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> countryRegionCriterionBuilder_;
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
     * @return Whether the countryRegionCriterion field is set.
     */
    public boolean hasCountryRegionCriterion() {
      return countryRegionCriterionBuilder_ != null || countryRegionCriterion_ != null;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
     * @return The countryRegionCriterion.
     */
    public com.google.protobuf.StringValue getCountryRegionCriterion() {
      if (countryRegionCriterionBuilder_ == null) {
        return countryRegionCriterion_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : countryRegionCriterion_;
      } else {
        return countryRegionCriterionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
     */
    public Builder setCountryRegionCriterion(com.google.protobuf.StringValue value) {
      if (countryRegionCriterionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        countryRegionCriterion_ = value;
        onChanged();
      } else {
        countryRegionCriterionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
     */
    public Builder setCountryRegionCriterion(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (countryRegionCriterionBuilder_ == null) {
        countryRegionCriterion_ = builderForValue.build();
        onChanged();
      } else {
        countryRegionCriterionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
     */
    public Builder mergeCountryRegionCriterion(com.google.protobuf.StringValue value) {
      if (countryRegionCriterionBuilder_ == null) {
        if (countryRegionCriterion_ != null) {
          countryRegionCriterion_ =
            com.google.protobuf.StringValue.newBuilder(countryRegionCriterion_).mergeFrom(value).buildPartial();
        } else {
          countryRegionCriterion_ = value;
        }
        onChanged();
      } else {
        countryRegionCriterionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
     */
    public Builder clearCountryRegionCriterion() {
      if (countryRegionCriterionBuilder_ == null) {
        countryRegionCriterion_ = null;
        onChanged();
      } else {
        countryRegionCriterion_ = null;
        countryRegionCriterionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getCountryRegionCriterionBuilder() {
      
      onChanged();
      return getCountryRegionCriterionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getCountryRegionCriterionOrBuilder() {
      if (countryRegionCriterionBuilder_ != null) {
        return countryRegionCriterionBuilder_.getMessageOrBuilder();
      } else {
        return countryRegionCriterion_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : countryRegionCriterion_;
      }
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue country_region_criterion = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getCountryRegionCriterionFieldBuilder() {
      if (countryRegionCriterionBuilder_ == null) {
        countryRegionCriterionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getCountryRegionCriterion(),
                getParentForChildren(),
                isClean());
        countryRegionCriterion_ = null;
      }
      return countryRegionCriterionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.common.HotelCountryRegionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.HotelCountryRegionInfo)
  private static final com.google.ads.googleads.v4.common.HotelCountryRegionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.common.HotelCountryRegionInfo();
  }

  public static com.google.ads.googleads.v4.common.HotelCountryRegionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelCountryRegionInfo>
      PARSER = new com.google.protobuf.AbstractParser<HotelCountryRegionInfo>() {
    @java.lang.Override
    public HotelCountryRegionInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HotelCountryRegionInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HotelCountryRegionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelCountryRegionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.common.HotelCountryRegionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

