// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/ad_type_infos.proto

package com.google.ads.googleads.v4.common;

/**
 * <pre>
 * A Shopping Comparison Listing ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo}
 */
public  final class ShoppingComparisonListingAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo)
    ShoppingComparisonListingAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShoppingComparisonListingAdInfo.newBuilder() to construct.
  private ShoppingComparisonListingAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShoppingComparisonListingAdInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShoppingComparisonListingAdInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShoppingComparisonListingAdInfo(
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
            if (headline_ != null) {
              subBuilder = headline_.toBuilder();
            }
            headline_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(headline_);
              headline_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v4.common.AdTypeInfosProto.internal_static_google_ads_googleads_v4_common_ShoppingComparisonListingAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.common.AdTypeInfosProto.internal_static_google_ads_googleads_v4_common_ShoppingComparisonListingAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo.class, com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo.Builder.class);
  }

  public static final int HEADLINE_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue headline_;
  /**
   * <pre>
   * Headline of the ad. This field is required. Allowed length is between 25
   * and 45 characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   * @return Whether the headline field is set.
   */
  public boolean hasHeadline() {
    return headline_ != null;
  }
  /**
   * <pre>
   * Headline of the ad. This field is required. Allowed length is between 25
   * and 45 characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   * @return The headline.
   */
  public com.google.protobuf.StringValue getHeadline() {
    return headline_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : headline_;
  }
  /**
   * <pre>
   * Headline of the ad. This field is required. Allowed length is between 25
   * and 45 characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getHeadlineOrBuilder() {
    return getHeadline();
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
    if (headline_ != null) {
      output.writeMessage(1, getHeadline());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (headline_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeadline());
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
    if (!(obj instanceof com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo other = (com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo) obj;

    if (hasHeadline() != other.hasHeadline()) return false;
    if (hasHeadline()) {
      if (!getHeadline()
          .equals(other.getHeadline())) return false;
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
    if (hasHeadline()) {
      hash = (37 * hash) + HEADLINE_FIELD_NUMBER;
      hash = (53 * hash) + getHeadline().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo prototype) {
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
   * A Shopping Comparison Listing ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo)
      com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.common.AdTypeInfosProto.internal_static_google_ads_googleads_v4_common_ShoppingComparisonListingAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.common.AdTypeInfosProto.internal_static_google_ads_googleads_v4_common_ShoppingComparisonListingAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo.class, com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo.newBuilder()
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
      if (headlineBuilder_ == null) {
        headline_ = null;
      } else {
        headline_ = null;
        headlineBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.common.AdTypeInfosProto.internal_static_google_ads_googleads_v4_common_ShoppingComparisonListingAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo build() {
      com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo buildPartial() {
      com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo result = new com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo(this);
      if (headlineBuilder_ == null) {
        result.headline_ = headline_;
      } else {
        result.headline_ = headlineBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo) {
        return mergeFrom((com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo other) {
      if (other == com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo.getDefaultInstance()) return this;
      if (other.hasHeadline()) {
        mergeHeadline(other.getHeadline());
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
      com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue headline_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> headlineBuilder_;
    /**
     * <pre>
     * Headline of the ad. This field is required. Allowed length is between 25
     * and 45 characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     * @return Whether the headline field is set.
     */
    public boolean hasHeadline() {
      return headlineBuilder_ != null || headline_ != null;
    }
    /**
     * <pre>
     * Headline of the ad. This field is required. Allowed length is between 25
     * and 45 characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     * @return The headline.
     */
    public com.google.protobuf.StringValue getHeadline() {
      if (headlineBuilder_ == null) {
        return headline_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : headline_;
      } else {
        return headlineBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Headline of the ad. This field is required. Allowed length is between 25
     * and 45 characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder setHeadline(com.google.protobuf.StringValue value) {
      if (headlineBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        headline_ = value;
        onChanged();
      } else {
        headlineBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Headline of the ad. This field is required. Allowed length is between 25
     * and 45 characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder setHeadline(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (headlineBuilder_ == null) {
        headline_ = builderForValue.build();
        onChanged();
      } else {
        headlineBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Headline of the ad. This field is required. Allowed length is between 25
     * and 45 characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder mergeHeadline(com.google.protobuf.StringValue value) {
      if (headlineBuilder_ == null) {
        if (headline_ != null) {
          headline_ =
            com.google.protobuf.StringValue.newBuilder(headline_).mergeFrom(value).buildPartial();
        } else {
          headline_ = value;
        }
        onChanged();
      } else {
        headlineBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Headline of the ad. This field is required. Allowed length is between 25
     * and 45 characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder clearHeadline() {
      if (headlineBuilder_ == null) {
        headline_ = null;
        onChanged();
      } else {
        headline_ = null;
        headlineBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Headline of the ad. This field is required. Allowed length is between 25
     * and 45 characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getHeadlineBuilder() {
      
      onChanged();
      return getHeadlineFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Headline of the ad. This field is required. Allowed length is between 25
     * and 45 characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getHeadlineOrBuilder() {
      if (headlineBuilder_ != null) {
        return headlineBuilder_.getMessageOrBuilder();
      } else {
        return headline_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : headline_;
      }
    }
    /**
     * <pre>
     * Headline of the ad. This field is required. Allowed length is between 25
     * and 45 characters.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getHeadlineFieldBuilder() {
      if (headlineBuilder_ == null) {
        headlineBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getHeadline(),
                getParentForChildren(),
                isClean());
        headline_ = null;
      }
      return headlineBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo)
  private static final com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo();
  }

  public static com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShoppingComparisonListingAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<ShoppingComparisonListingAdInfo>() {
    @java.lang.Override
    public ShoppingComparisonListingAdInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ShoppingComparisonListingAdInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShoppingComparisonListingAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShoppingComparisonListingAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.common.ShoppingComparisonListingAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

