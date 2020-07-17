// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/media_file.proto

package com.google.ads.googleads.v4.resources;

/**
 * <pre>
 * Encapsulates an Audio.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.resources.MediaAudio}
 */
public  final class MediaAudio extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.resources.MediaAudio)
    MediaAudioOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaAudio.newBuilder() to construct.
  private MediaAudio(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaAudio() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MediaAudio();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MediaAudio(
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
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (adDurationMillis_ != null) {
              subBuilder = adDurationMillis_.toBuilder();
            }
            adDurationMillis_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(adDurationMillis_);
              adDurationMillis_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v4.resources.MediaFileProto.internal_static_google_ads_googleads_v4_resources_MediaAudio_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.resources.MediaFileProto.internal_static_google_ads_googleads_v4_resources_MediaAudio_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.resources.MediaAudio.class, com.google.ads.googleads.v4.resources.MediaAudio.Builder.class);
  }

  public static final int AD_DURATION_MILLIS_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value adDurationMillis_;
  /**
   * <pre>
   * Output only. The duration of the Audio in milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the adDurationMillis field is set.
   */
  public boolean hasAdDurationMillis() {
    return adDurationMillis_ != null;
  }
  /**
   * <pre>
   * Output only. The duration of the Audio in milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adDurationMillis.
   */
  public com.google.protobuf.Int64Value getAdDurationMillis() {
    return adDurationMillis_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : adDurationMillis_;
  }
  /**
   * <pre>
   * Output only. The duration of the Audio in milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getAdDurationMillisOrBuilder() {
    return getAdDurationMillis();
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
    if (adDurationMillis_ != null) {
      output.writeMessage(1, getAdDurationMillis());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adDurationMillis_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAdDurationMillis());
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
    if (!(obj instanceof com.google.ads.googleads.v4.resources.MediaAudio)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.resources.MediaAudio other = (com.google.ads.googleads.v4.resources.MediaAudio) obj;

    if (hasAdDurationMillis() != other.hasAdDurationMillis()) return false;
    if (hasAdDurationMillis()) {
      if (!getAdDurationMillis()
          .equals(other.getAdDurationMillis())) return false;
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
    if (hasAdDurationMillis()) {
      hash = (37 * hash) + AD_DURATION_MILLIS_FIELD_NUMBER;
      hash = (53 * hash) + getAdDurationMillis().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.resources.MediaAudio parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.resources.MediaAudio parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.resources.MediaAudio prototype) {
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
   * Encapsulates an Audio.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.resources.MediaAudio}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.resources.MediaAudio)
      com.google.ads.googleads.v4.resources.MediaAudioOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.resources.MediaFileProto.internal_static_google_ads_googleads_v4_resources_MediaAudio_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.resources.MediaFileProto.internal_static_google_ads_googleads_v4_resources_MediaAudio_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.resources.MediaAudio.class, com.google.ads.googleads.v4.resources.MediaAudio.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.resources.MediaAudio.newBuilder()
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
      if (adDurationMillisBuilder_ == null) {
        adDurationMillis_ = null;
      } else {
        adDurationMillis_ = null;
        adDurationMillisBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.resources.MediaFileProto.internal_static_google_ads_googleads_v4_resources_MediaAudio_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.resources.MediaAudio getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.resources.MediaAudio.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.resources.MediaAudio build() {
      com.google.ads.googleads.v4.resources.MediaAudio result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.resources.MediaAudio buildPartial() {
      com.google.ads.googleads.v4.resources.MediaAudio result = new com.google.ads.googleads.v4.resources.MediaAudio(this);
      if (adDurationMillisBuilder_ == null) {
        result.adDurationMillis_ = adDurationMillis_;
      } else {
        result.adDurationMillis_ = adDurationMillisBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.resources.MediaAudio) {
        return mergeFrom((com.google.ads.googleads.v4.resources.MediaAudio)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.resources.MediaAudio other) {
      if (other == com.google.ads.googleads.v4.resources.MediaAudio.getDefaultInstance()) return this;
      if (other.hasAdDurationMillis()) {
        mergeAdDurationMillis(other.getAdDurationMillis());
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
      com.google.ads.googleads.v4.resources.MediaAudio parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.resources.MediaAudio) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value adDurationMillis_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> adDurationMillisBuilder_;
    /**
     * <pre>
     * Output only. The duration of the Audio in milliseconds.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the adDurationMillis field is set.
     */
    public boolean hasAdDurationMillis() {
      return adDurationMillisBuilder_ != null || adDurationMillis_ != null;
    }
    /**
     * <pre>
     * Output only. The duration of the Audio in milliseconds.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The adDurationMillis.
     */
    public com.google.protobuf.Int64Value getAdDurationMillis() {
      if (adDurationMillisBuilder_ == null) {
        return adDurationMillis_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : adDurationMillis_;
      } else {
        return adDurationMillisBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The duration of the Audio in milliseconds.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setAdDurationMillis(com.google.protobuf.Int64Value value) {
      if (adDurationMillisBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adDurationMillis_ = value;
        onChanged();
      } else {
        adDurationMillisBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The duration of the Audio in milliseconds.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setAdDurationMillis(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (adDurationMillisBuilder_ == null) {
        adDurationMillis_ = builderForValue.build();
        onChanged();
      } else {
        adDurationMillisBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The duration of the Audio in milliseconds.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeAdDurationMillis(com.google.protobuf.Int64Value value) {
      if (adDurationMillisBuilder_ == null) {
        if (adDurationMillis_ != null) {
          adDurationMillis_ =
            com.google.protobuf.Int64Value.newBuilder(adDurationMillis_).mergeFrom(value).buildPartial();
        } else {
          adDurationMillis_ = value;
        }
        onChanged();
      } else {
        adDurationMillisBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The duration of the Audio in milliseconds.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearAdDurationMillis() {
      if (adDurationMillisBuilder_ == null) {
        adDurationMillis_ = null;
        onChanged();
      } else {
        adDurationMillis_ = null;
        adDurationMillisBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The duration of the Audio in milliseconds.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Int64Value.Builder getAdDurationMillisBuilder() {
      
      onChanged();
      return getAdDurationMillisFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The duration of the Audio in milliseconds.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getAdDurationMillisOrBuilder() {
      if (adDurationMillisBuilder_ != null) {
        return adDurationMillisBuilder_.getMessageOrBuilder();
      } else {
        return adDurationMillis_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : adDurationMillis_;
      }
    }
    /**
     * <pre>
     * Output only. The duration of the Audio in milliseconds.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value ad_duration_millis = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getAdDurationMillisFieldBuilder() {
      if (adDurationMillisBuilder_ == null) {
        adDurationMillisBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getAdDurationMillis(),
                getParentForChildren(),
                isClean());
        adDurationMillis_ = null;
      }
      return adDurationMillisBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.resources.MediaAudio)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.MediaAudio)
  private static final com.google.ads.googleads.v4.resources.MediaAudio DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.resources.MediaAudio();
  }

  public static com.google.ads.googleads.v4.resources.MediaAudio getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaAudio>
      PARSER = new com.google.protobuf.AbstractParser<MediaAudio>() {
    @java.lang.Override
    public MediaAudio parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MediaAudio(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MediaAudio> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaAudio> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.resources.MediaAudio getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

