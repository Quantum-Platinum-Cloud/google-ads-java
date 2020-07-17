// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/keyword_plan_service.proto

package com.google.ads.googleads.v4.services;

/**
 * <pre>
 * A campaign forecast.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.services.KeywordPlanCampaignForecast}
 */
public  final class KeywordPlanCampaignForecast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.services.KeywordPlanCampaignForecast)
    KeywordPlanCampaignForecastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanCampaignForecast.newBuilder() to construct.
  private KeywordPlanCampaignForecast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanCampaignForecast() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanCampaignForecast();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanCampaignForecast(
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
            if (keywordPlanCampaign_ != null) {
              subBuilder = keywordPlanCampaign_.toBuilder();
            }
            keywordPlanCampaign_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(keywordPlanCampaign_);
              keywordPlanCampaign_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.ads.googleads.v4.services.ForecastMetrics.Builder subBuilder = null;
            if (campaignForecast_ != null) {
              subBuilder = campaignForecast_.toBuilder();
            }
            campaignForecast_ = input.readMessage(com.google.ads.googleads.v4.services.ForecastMetrics.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(campaignForecast_);
              campaignForecast_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v4_services_KeywordPlanCampaignForecast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v4_services_KeywordPlanCampaignForecast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast.class, com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast.Builder.class);
  }

  public static final int KEYWORD_PLAN_CAMPAIGN_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue keywordPlanCampaign_;
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
   * @return Whether the keywordPlanCampaign field is set.
   */
  public boolean hasKeywordPlanCampaign() {
    return keywordPlanCampaign_ != null;
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
   * @return The keywordPlanCampaign.
   */
  public com.google.protobuf.StringValue getKeywordPlanCampaign() {
    return keywordPlanCampaign_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : keywordPlanCampaign_;
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getKeywordPlanCampaignOrBuilder() {
    return getKeywordPlanCampaign();
  }

  public static final int CAMPAIGN_FORECAST_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v4.services.ForecastMetrics campaignForecast_;
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
   * @return Whether the campaignForecast field is set.
   */
  public boolean hasCampaignForecast() {
    return campaignForecast_ != null;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
   * @return The campaignForecast.
   */
  public com.google.ads.googleads.v4.services.ForecastMetrics getCampaignForecast() {
    return campaignForecast_ == null ? com.google.ads.googleads.v4.services.ForecastMetrics.getDefaultInstance() : campaignForecast_;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
   */
  public com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder getCampaignForecastOrBuilder() {
    return getCampaignForecast();
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
    if (keywordPlanCampaign_ != null) {
      output.writeMessage(1, getKeywordPlanCampaign());
    }
    if (campaignForecast_ != null) {
      output.writeMessage(2, getCampaignForecast());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (keywordPlanCampaign_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKeywordPlanCampaign());
    }
    if (campaignForecast_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCampaignForecast());
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
    if (!(obj instanceof com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast other = (com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast) obj;

    if (hasKeywordPlanCampaign() != other.hasKeywordPlanCampaign()) return false;
    if (hasKeywordPlanCampaign()) {
      if (!getKeywordPlanCampaign()
          .equals(other.getKeywordPlanCampaign())) return false;
    }
    if (hasCampaignForecast() != other.hasCampaignForecast()) return false;
    if (hasCampaignForecast()) {
      if (!getCampaignForecast()
          .equals(other.getCampaignForecast())) return false;
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
    if (hasKeywordPlanCampaign()) {
      hash = (37 * hash) + KEYWORD_PLAN_CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordPlanCampaign().hashCode();
    }
    if (hasCampaignForecast()) {
      hash = (37 * hash) + CAMPAIGN_FORECAST_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignForecast().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast prototype) {
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
   * A campaign forecast.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.services.KeywordPlanCampaignForecast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.services.KeywordPlanCampaignForecast)
      com.google.ads.googleads.v4.services.KeywordPlanCampaignForecastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v4_services_KeywordPlanCampaignForecast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v4_services_KeywordPlanCampaignForecast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast.class, com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast.newBuilder()
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
      if (keywordPlanCampaignBuilder_ == null) {
        keywordPlanCampaign_ = null;
      } else {
        keywordPlanCampaign_ = null;
        keywordPlanCampaignBuilder_ = null;
      }
      if (campaignForecastBuilder_ == null) {
        campaignForecast_ = null;
      } else {
        campaignForecast_ = null;
        campaignForecastBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v4_services_KeywordPlanCampaignForecast_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast build() {
      com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast buildPartial() {
      com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast result = new com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast(this);
      if (keywordPlanCampaignBuilder_ == null) {
        result.keywordPlanCampaign_ = keywordPlanCampaign_;
      } else {
        result.keywordPlanCampaign_ = keywordPlanCampaignBuilder_.build();
      }
      if (campaignForecastBuilder_ == null) {
        result.campaignForecast_ = campaignForecast_;
      } else {
        result.campaignForecast_ = campaignForecastBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast) {
        return mergeFrom((com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast other) {
      if (other == com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast.getDefaultInstance()) return this;
      if (other.hasKeywordPlanCampaign()) {
        mergeKeywordPlanCampaign(other.getKeywordPlanCampaign());
      }
      if (other.hasCampaignForecast()) {
        mergeCampaignForecast(other.getCampaignForecast());
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
      com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue keywordPlanCampaign_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> keywordPlanCampaignBuilder_;
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
     * @return Whether the keywordPlanCampaign field is set.
     */
    public boolean hasKeywordPlanCampaign() {
      return keywordPlanCampaignBuilder_ != null || keywordPlanCampaign_ != null;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
     * @return The keywordPlanCampaign.
     */
    public com.google.protobuf.StringValue getKeywordPlanCampaign() {
      if (keywordPlanCampaignBuilder_ == null) {
        return keywordPlanCampaign_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : keywordPlanCampaign_;
      } else {
        return keywordPlanCampaignBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
     */
    public Builder setKeywordPlanCampaign(com.google.protobuf.StringValue value) {
      if (keywordPlanCampaignBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keywordPlanCampaign_ = value;
        onChanged();
      } else {
        keywordPlanCampaignBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
     */
    public Builder setKeywordPlanCampaign(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (keywordPlanCampaignBuilder_ == null) {
        keywordPlanCampaign_ = builderForValue.build();
        onChanged();
      } else {
        keywordPlanCampaignBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
     */
    public Builder mergeKeywordPlanCampaign(com.google.protobuf.StringValue value) {
      if (keywordPlanCampaignBuilder_ == null) {
        if (keywordPlanCampaign_ != null) {
          keywordPlanCampaign_ =
            com.google.protobuf.StringValue.newBuilder(keywordPlanCampaign_).mergeFrom(value).buildPartial();
        } else {
          keywordPlanCampaign_ = value;
        }
        onChanged();
      } else {
        keywordPlanCampaignBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
     */
    public Builder clearKeywordPlanCampaign() {
      if (keywordPlanCampaignBuilder_ == null) {
        keywordPlanCampaign_ = null;
        onChanged();
      } else {
        keywordPlanCampaign_ = null;
        keywordPlanCampaignBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getKeywordPlanCampaignBuilder() {
      
      onChanged();
      return getKeywordPlanCampaignFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getKeywordPlanCampaignOrBuilder() {
      if (keywordPlanCampaignBuilder_ != null) {
        return keywordPlanCampaignBuilder_.getMessageOrBuilder();
      } else {
        return keywordPlanCampaign_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : keywordPlanCampaign_;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_campaign = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getKeywordPlanCampaignFieldBuilder() {
      if (keywordPlanCampaignBuilder_ == null) {
        keywordPlanCampaignBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getKeywordPlanCampaign(),
                getParentForChildren(),
                isClean());
        keywordPlanCampaign_ = null;
      }
      return keywordPlanCampaignBuilder_;
    }

    private com.google.ads.googleads.v4.services.ForecastMetrics campaignForecast_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v4.services.ForecastMetrics, com.google.ads.googleads.v4.services.ForecastMetrics.Builder, com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder> campaignForecastBuilder_;
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
     * @return Whether the campaignForecast field is set.
     */
    public boolean hasCampaignForecast() {
      return campaignForecastBuilder_ != null || campaignForecast_ != null;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
     * @return The campaignForecast.
     */
    public com.google.ads.googleads.v4.services.ForecastMetrics getCampaignForecast() {
      if (campaignForecastBuilder_ == null) {
        return campaignForecast_ == null ? com.google.ads.googleads.v4.services.ForecastMetrics.getDefaultInstance() : campaignForecast_;
      } else {
        return campaignForecastBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public Builder setCampaignForecast(com.google.ads.googleads.v4.services.ForecastMetrics value) {
      if (campaignForecastBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaignForecast_ = value;
        onChanged();
      } else {
        campaignForecastBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public Builder setCampaignForecast(
        com.google.ads.googleads.v4.services.ForecastMetrics.Builder builderForValue) {
      if (campaignForecastBuilder_ == null) {
        campaignForecast_ = builderForValue.build();
        onChanged();
      } else {
        campaignForecastBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public Builder mergeCampaignForecast(com.google.ads.googleads.v4.services.ForecastMetrics value) {
      if (campaignForecastBuilder_ == null) {
        if (campaignForecast_ != null) {
          campaignForecast_ =
            com.google.ads.googleads.v4.services.ForecastMetrics.newBuilder(campaignForecast_).mergeFrom(value).buildPartial();
        } else {
          campaignForecast_ = value;
        }
        onChanged();
      } else {
        campaignForecastBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public Builder clearCampaignForecast() {
      if (campaignForecastBuilder_ == null) {
        campaignForecast_ = null;
        onChanged();
      } else {
        campaignForecast_ = null;
        campaignForecastBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public com.google.ads.googleads.v4.services.ForecastMetrics.Builder getCampaignForecastBuilder() {
      
      onChanged();
      return getCampaignForecastFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder getCampaignForecastOrBuilder() {
      if (campaignForecastBuilder_ != null) {
        return campaignForecastBuilder_.getMessageOrBuilder();
      } else {
        return campaignForecast_ == null ?
            com.google.ads.googleads.v4.services.ForecastMetrics.getDefaultInstance() : campaignForecast_;
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v4.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v4.services.ForecastMetrics, com.google.ads.googleads.v4.services.ForecastMetrics.Builder, com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder> 
        getCampaignForecastFieldBuilder() {
      if (campaignForecastBuilder_ == null) {
        campaignForecastBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v4.services.ForecastMetrics, com.google.ads.googleads.v4.services.ForecastMetrics.Builder, com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder>(
                getCampaignForecast(),
                getParentForChildren(),
                isClean());
        campaignForecast_ = null;
      }
      return campaignForecastBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.services.KeywordPlanCampaignForecast)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.KeywordPlanCampaignForecast)
  private static final com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast();
  }

  public static com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanCampaignForecast>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanCampaignForecast>() {
    @java.lang.Override
    public KeywordPlanCampaignForecast parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanCampaignForecast(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanCampaignForecast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanCampaignForecast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.services.KeywordPlanCampaignForecast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

