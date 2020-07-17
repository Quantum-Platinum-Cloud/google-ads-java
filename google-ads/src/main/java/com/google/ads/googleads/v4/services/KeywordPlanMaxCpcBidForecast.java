// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/keyword_plan_service.proto

package com.google.ads.googleads.v4.services;

/**
 * <pre>
 * The forecast of the campaign at a specific bid.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast}
 */
public  final class KeywordPlanMaxCpcBidForecast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast)
    KeywordPlanMaxCpcBidForecastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanMaxCpcBidForecast.newBuilder() to construct.
  private KeywordPlanMaxCpcBidForecast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanMaxCpcBidForecast() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanMaxCpcBidForecast();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanMaxCpcBidForecast(
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
            if (maxCpcBidMicros_ != null) {
              subBuilder = maxCpcBidMicros_.toBuilder();
            }
            maxCpcBidMicros_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(maxCpcBidMicros_);
              maxCpcBidMicros_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.ads.googleads.v4.services.ForecastMetrics.Builder subBuilder = null;
            if (maxCpcBidForecast_ != null) {
              subBuilder = maxCpcBidForecast_.toBuilder();
            }
            maxCpcBidForecast_ = input.readMessage(com.google.ads.googleads.v4.services.ForecastMetrics.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(maxCpcBidForecast_);
              maxCpcBidForecast_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v4_services_KeywordPlanMaxCpcBidForecast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v4_services_KeywordPlanMaxCpcBidForecast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast.class, com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast.Builder.class);
  }

  public static final int MAX_CPC_BID_MICROS_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value maxCpcBidMicros_;
  /**
   * <pre>
   * The max cpc bid in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
   * @return Whether the maxCpcBidMicros field is set.
   */
  public boolean hasMaxCpcBidMicros() {
    return maxCpcBidMicros_ != null;
  }
  /**
   * <pre>
   * The max cpc bid in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
   * @return The maxCpcBidMicros.
   */
  public com.google.protobuf.Int64Value getMaxCpcBidMicros() {
    return maxCpcBidMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : maxCpcBidMicros_;
  }
  /**
   * <pre>
   * The max cpc bid in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getMaxCpcBidMicrosOrBuilder() {
    return getMaxCpcBidMicros();
  }

  public static final int MAX_CPC_BID_FORECAST_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v4.services.ForecastMetrics maxCpcBidForecast_;
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign at the specific bid.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
   * @return Whether the maxCpcBidForecast field is set.
   */
  public boolean hasMaxCpcBidForecast() {
    return maxCpcBidForecast_ != null;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign at the specific bid.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
   * @return The maxCpcBidForecast.
   */
  public com.google.ads.googleads.v4.services.ForecastMetrics getMaxCpcBidForecast() {
    return maxCpcBidForecast_ == null ? com.google.ads.googleads.v4.services.ForecastMetrics.getDefaultInstance() : maxCpcBidForecast_;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign at the specific bid.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
   */
  public com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder getMaxCpcBidForecastOrBuilder() {
    return getMaxCpcBidForecast();
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
    if (maxCpcBidMicros_ != null) {
      output.writeMessage(1, getMaxCpcBidMicros());
    }
    if (maxCpcBidForecast_ != null) {
      output.writeMessage(2, getMaxCpcBidForecast());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxCpcBidMicros_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMaxCpcBidMicros());
    }
    if (maxCpcBidForecast_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMaxCpcBidForecast());
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
    if (!(obj instanceof com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast other = (com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast) obj;

    if (hasMaxCpcBidMicros() != other.hasMaxCpcBidMicros()) return false;
    if (hasMaxCpcBidMicros()) {
      if (!getMaxCpcBidMicros()
          .equals(other.getMaxCpcBidMicros())) return false;
    }
    if (hasMaxCpcBidForecast() != other.hasMaxCpcBidForecast()) return false;
    if (hasMaxCpcBidForecast()) {
      if (!getMaxCpcBidForecast()
          .equals(other.getMaxCpcBidForecast())) return false;
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
    if (hasMaxCpcBidMicros()) {
      hash = (37 * hash) + MAX_CPC_BID_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxCpcBidMicros().hashCode();
    }
    if (hasMaxCpcBidForecast()) {
      hash = (37 * hash) + MAX_CPC_BID_FORECAST_FIELD_NUMBER;
      hash = (53 * hash) + getMaxCpcBidForecast().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast prototype) {
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
   * The forecast of the campaign at a specific bid.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast)
      com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v4_services_KeywordPlanMaxCpcBidForecast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v4_services_KeywordPlanMaxCpcBidForecast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast.class, com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast.newBuilder()
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
      if (maxCpcBidMicrosBuilder_ == null) {
        maxCpcBidMicros_ = null;
      } else {
        maxCpcBidMicros_ = null;
        maxCpcBidMicrosBuilder_ = null;
      }
      if (maxCpcBidForecastBuilder_ == null) {
        maxCpcBidForecast_ = null;
      } else {
        maxCpcBidForecast_ = null;
        maxCpcBidForecastBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v4_services_KeywordPlanMaxCpcBidForecast_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast build() {
      com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast buildPartial() {
      com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast result = new com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast(this);
      if (maxCpcBidMicrosBuilder_ == null) {
        result.maxCpcBidMicros_ = maxCpcBidMicros_;
      } else {
        result.maxCpcBidMicros_ = maxCpcBidMicrosBuilder_.build();
      }
      if (maxCpcBidForecastBuilder_ == null) {
        result.maxCpcBidForecast_ = maxCpcBidForecast_;
      } else {
        result.maxCpcBidForecast_ = maxCpcBidForecastBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast) {
        return mergeFrom((com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast other) {
      if (other == com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast.getDefaultInstance()) return this;
      if (other.hasMaxCpcBidMicros()) {
        mergeMaxCpcBidMicros(other.getMaxCpcBidMicros());
      }
      if (other.hasMaxCpcBidForecast()) {
        mergeMaxCpcBidForecast(other.getMaxCpcBidForecast());
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
      com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value maxCpcBidMicros_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> maxCpcBidMicrosBuilder_;
    /**
     * <pre>
     * The max cpc bid in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
     * @return Whether the maxCpcBidMicros field is set.
     */
    public boolean hasMaxCpcBidMicros() {
      return maxCpcBidMicrosBuilder_ != null || maxCpcBidMicros_ != null;
    }
    /**
     * <pre>
     * The max cpc bid in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
     * @return The maxCpcBidMicros.
     */
    public com.google.protobuf.Int64Value getMaxCpcBidMicros() {
      if (maxCpcBidMicrosBuilder_ == null) {
        return maxCpcBidMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : maxCpcBidMicros_;
      } else {
        return maxCpcBidMicrosBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The max cpc bid in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
     */
    public Builder setMaxCpcBidMicros(com.google.protobuf.Int64Value value) {
      if (maxCpcBidMicrosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxCpcBidMicros_ = value;
        onChanged();
      } else {
        maxCpcBidMicrosBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The max cpc bid in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
     */
    public Builder setMaxCpcBidMicros(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (maxCpcBidMicrosBuilder_ == null) {
        maxCpcBidMicros_ = builderForValue.build();
        onChanged();
      } else {
        maxCpcBidMicrosBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The max cpc bid in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
     */
    public Builder mergeMaxCpcBidMicros(com.google.protobuf.Int64Value value) {
      if (maxCpcBidMicrosBuilder_ == null) {
        if (maxCpcBidMicros_ != null) {
          maxCpcBidMicros_ =
            com.google.protobuf.Int64Value.newBuilder(maxCpcBidMicros_).mergeFrom(value).buildPartial();
        } else {
          maxCpcBidMicros_ = value;
        }
        onChanged();
      } else {
        maxCpcBidMicrosBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The max cpc bid in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
     */
    public Builder clearMaxCpcBidMicros() {
      if (maxCpcBidMicrosBuilder_ == null) {
        maxCpcBidMicros_ = null;
        onChanged();
      } else {
        maxCpcBidMicros_ = null;
        maxCpcBidMicrosBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The max cpc bid in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getMaxCpcBidMicrosBuilder() {
      
      onChanged();
      return getMaxCpcBidMicrosFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The max cpc bid in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getMaxCpcBidMicrosOrBuilder() {
      if (maxCpcBidMicrosBuilder_ != null) {
        return maxCpcBidMicrosBuilder_.getMessageOrBuilder();
      } else {
        return maxCpcBidMicros_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : maxCpcBidMicros_;
      }
    }
    /**
     * <pre>
     * The max cpc bid in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getMaxCpcBidMicrosFieldBuilder() {
      if (maxCpcBidMicrosBuilder_ == null) {
        maxCpcBidMicrosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getMaxCpcBidMicros(),
                getParentForChildren(),
                isClean());
        maxCpcBidMicros_ = null;
      }
      return maxCpcBidMicrosBuilder_;
    }

    private com.google.ads.googleads.v4.services.ForecastMetrics maxCpcBidForecast_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v4.services.ForecastMetrics, com.google.ads.googleads.v4.services.ForecastMetrics.Builder, com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder> maxCpcBidForecastBuilder_;
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign at the specific bid.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
     * @return Whether the maxCpcBidForecast field is set.
     */
    public boolean hasMaxCpcBidForecast() {
      return maxCpcBidForecastBuilder_ != null || maxCpcBidForecast_ != null;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign at the specific bid.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
     * @return The maxCpcBidForecast.
     */
    public com.google.ads.googleads.v4.services.ForecastMetrics getMaxCpcBidForecast() {
      if (maxCpcBidForecastBuilder_ == null) {
        return maxCpcBidForecast_ == null ? com.google.ads.googleads.v4.services.ForecastMetrics.getDefaultInstance() : maxCpcBidForecast_;
      } else {
        return maxCpcBidForecastBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign at the specific bid.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
     */
    public Builder setMaxCpcBidForecast(com.google.ads.googleads.v4.services.ForecastMetrics value) {
      if (maxCpcBidForecastBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxCpcBidForecast_ = value;
        onChanged();
      } else {
        maxCpcBidForecastBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign at the specific bid.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
     */
    public Builder setMaxCpcBidForecast(
        com.google.ads.googleads.v4.services.ForecastMetrics.Builder builderForValue) {
      if (maxCpcBidForecastBuilder_ == null) {
        maxCpcBidForecast_ = builderForValue.build();
        onChanged();
      } else {
        maxCpcBidForecastBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign at the specific bid.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
     */
    public Builder mergeMaxCpcBidForecast(com.google.ads.googleads.v4.services.ForecastMetrics value) {
      if (maxCpcBidForecastBuilder_ == null) {
        if (maxCpcBidForecast_ != null) {
          maxCpcBidForecast_ =
            com.google.ads.googleads.v4.services.ForecastMetrics.newBuilder(maxCpcBidForecast_).mergeFrom(value).buildPartial();
        } else {
          maxCpcBidForecast_ = value;
        }
        onChanged();
      } else {
        maxCpcBidForecastBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign at the specific bid.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
     */
    public Builder clearMaxCpcBidForecast() {
      if (maxCpcBidForecastBuilder_ == null) {
        maxCpcBidForecast_ = null;
        onChanged();
      } else {
        maxCpcBidForecast_ = null;
        maxCpcBidForecastBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign at the specific bid.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
     */
    public com.google.ads.googleads.v4.services.ForecastMetrics.Builder getMaxCpcBidForecastBuilder() {
      
      onChanged();
      return getMaxCpcBidForecastFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign at the specific bid.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
     */
    public com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder getMaxCpcBidForecastOrBuilder() {
      if (maxCpcBidForecastBuilder_ != null) {
        return maxCpcBidForecastBuilder_.getMessageOrBuilder();
      } else {
        return maxCpcBidForecast_ == null ?
            com.google.ads.googleads.v4.services.ForecastMetrics.getDefaultInstance() : maxCpcBidForecast_;
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign at the specific bid.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v4.services.ForecastMetrics, com.google.ads.googleads.v4.services.ForecastMetrics.Builder, com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder> 
        getMaxCpcBidForecastFieldBuilder() {
      if (maxCpcBidForecastBuilder_ == null) {
        maxCpcBidForecastBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v4.services.ForecastMetrics, com.google.ads.googleads.v4.services.ForecastMetrics.Builder, com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder>(
                getMaxCpcBidForecast(),
                getParentForChildren(),
                isClean());
        maxCpcBidForecast_ = null;
      }
      return maxCpcBidForecastBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast)
  private static final com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast();
  }

  public static com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanMaxCpcBidForecast>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanMaxCpcBidForecast>() {
    @java.lang.Override
    public KeywordPlanMaxCpcBidForecast parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanMaxCpcBidForecast(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanMaxCpcBidForecast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanMaxCpcBidForecast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

