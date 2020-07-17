// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/ad_asset.proto

package com.google.ads.googleads.v4.common;

/**
 * <pre>
 * An image asset used inside an ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.common.AdImageAsset}
 */
public  final class AdImageAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.common.AdImageAsset)
    AdImageAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdImageAsset.newBuilder() to construct.
  private AdImageAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdImageAsset() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdImageAsset();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdImageAsset(
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
            if (asset_ != null) {
              subBuilder = asset_.toBuilder();
            }
            asset_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(asset_);
              asset_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v4.common.AdAssetProto.internal_static_google_ads_googleads_v4_common_AdImageAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.common.AdAssetProto.internal_static_google_ads_googleads_v4_common_AdImageAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.common.AdImageAsset.class, com.google.ads.googleads.v4.common.AdImageAsset.Builder.class);
  }

  public static final int ASSET_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue asset_;
  /**
   * <pre>
   * The Asset resource name of this image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue asset = 1;</code>
   * @return Whether the asset field is set.
   */
  public boolean hasAsset() {
    return asset_ != null;
  }
  /**
   * <pre>
   * The Asset resource name of this image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue asset = 1;</code>
   * @return The asset.
   */
  public com.google.protobuf.StringValue getAsset() {
    return asset_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : asset_;
  }
  /**
   * <pre>
   * The Asset resource name of this image.
   * </pre>
   *
   * <code>.google.protobuf.StringValue asset = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getAssetOrBuilder() {
    return getAsset();
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
    if (asset_ != null) {
      output.writeMessage(1, getAsset());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (asset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAsset());
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
    if (!(obj instanceof com.google.ads.googleads.v4.common.AdImageAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.common.AdImageAsset other = (com.google.ads.googleads.v4.common.AdImageAsset) obj;

    if (hasAsset() != other.hasAsset()) return false;
    if (hasAsset()) {
      if (!getAsset()
          .equals(other.getAsset())) return false;
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
    if (hasAsset()) {
      hash = (37 * hash) + ASSET_FIELD_NUMBER;
      hash = (53 * hash) + getAsset().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.common.AdImageAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.AdImageAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.common.AdImageAsset prototype) {
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
   * An image asset used inside an ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.common.AdImageAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.common.AdImageAsset)
      com.google.ads.googleads.v4.common.AdImageAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.common.AdAssetProto.internal_static_google_ads_googleads_v4_common_AdImageAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.common.AdAssetProto.internal_static_google_ads_googleads_v4_common_AdImageAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.common.AdImageAsset.class, com.google.ads.googleads.v4.common.AdImageAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.common.AdImageAsset.newBuilder()
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
      if (assetBuilder_ == null) {
        asset_ = null;
      } else {
        asset_ = null;
        assetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.common.AdAssetProto.internal_static_google_ads_googleads_v4_common_AdImageAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.AdImageAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.common.AdImageAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.AdImageAsset build() {
      com.google.ads.googleads.v4.common.AdImageAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.AdImageAsset buildPartial() {
      com.google.ads.googleads.v4.common.AdImageAsset result = new com.google.ads.googleads.v4.common.AdImageAsset(this);
      if (assetBuilder_ == null) {
        result.asset_ = asset_;
      } else {
        result.asset_ = assetBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.common.AdImageAsset) {
        return mergeFrom((com.google.ads.googleads.v4.common.AdImageAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.common.AdImageAsset other) {
      if (other == com.google.ads.googleads.v4.common.AdImageAsset.getDefaultInstance()) return this;
      if (other.hasAsset()) {
        mergeAsset(other.getAsset());
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
      com.google.ads.googleads.v4.common.AdImageAsset parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.common.AdImageAsset) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue asset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> assetBuilder_;
    /**
     * <pre>
     * The Asset resource name of this image.
     * </pre>
     *
     * <code>.google.protobuf.StringValue asset = 1;</code>
     * @return Whether the asset field is set.
     */
    public boolean hasAsset() {
      return assetBuilder_ != null || asset_ != null;
    }
    /**
     * <pre>
     * The Asset resource name of this image.
     * </pre>
     *
     * <code>.google.protobuf.StringValue asset = 1;</code>
     * @return The asset.
     */
    public com.google.protobuf.StringValue getAsset() {
      if (assetBuilder_ == null) {
        return asset_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : asset_;
      } else {
        return assetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Asset resource name of this image.
     * </pre>
     *
     * <code>.google.protobuf.StringValue asset = 1;</code>
     */
    public Builder setAsset(com.google.protobuf.StringValue value) {
      if (assetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        asset_ = value;
        onChanged();
      } else {
        assetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Asset resource name of this image.
     * </pre>
     *
     * <code>.google.protobuf.StringValue asset = 1;</code>
     */
    public Builder setAsset(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (assetBuilder_ == null) {
        asset_ = builderForValue.build();
        onChanged();
      } else {
        assetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Asset resource name of this image.
     * </pre>
     *
     * <code>.google.protobuf.StringValue asset = 1;</code>
     */
    public Builder mergeAsset(com.google.protobuf.StringValue value) {
      if (assetBuilder_ == null) {
        if (asset_ != null) {
          asset_ =
            com.google.protobuf.StringValue.newBuilder(asset_).mergeFrom(value).buildPartial();
        } else {
          asset_ = value;
        }
        onChanged();
      } else {
        assetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Asset resource name of this image.
     * </pre>
     *
     * <code>.google.protobuf.StringValue asset = 1;</code>
     */
    public Builder clearAsset() {
      if (assetBuilder_ == null) {
        asset_ = null;
        onChanged();
      } else {
        asset_ = null;
        assetBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Asset resource name of this image.
     * </pre>
     *
     * <code>.google.protobuf.StringValue asset = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getAssetBuilder() {
      
      onChanged();
      return getAssetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Asset resource name of this image.
     * </pre>
     *
     * <code>.google.protobuf.StringValue asset = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getAssetOrBuilder() {
      if (assetBuilder_ != null) {
        return assetBuilder_.getMessageOrBuilder();
      } else {
        return asset_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : asset_;
      }
    }
    /**
     * <pre>
     * The Asset resource name of this image.
     * </pre>
     *
     * <code>.google.protobuf.StringValue asset = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getAssetFieldBuilder() {
      if (assetBuilder_ == null) {
        assetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getAsset(),
                getParentForChildren(),
                isClean());
        asset_ = null;
      }
      return assetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.common.AdImageAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.AdImageAsset)
  private static final com.google.ads.googleads.v4.common.AdImageAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.common.AdImageAsset();
  }

  public static com.google.ads.googleads.v4.common.AdImageAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdImageAsset>
      PARSER = new com.google.protobuf.AbstractParser<AdImageAsset>() {
    @java.lang.Override
    public AdImageAsset parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdImageAsset(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdImageAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdImageAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.common.AdImageAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

