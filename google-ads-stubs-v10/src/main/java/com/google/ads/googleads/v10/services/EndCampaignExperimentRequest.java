// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/campaign_experiment_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * Request message for [CampaignExperimentService.EndCampaignExperiment][google.ads.googleads.v10.services.CampaignExperimentService.EndCampaignExperiment].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.EndCampaignExperimentRequest}
 */
public final class EndCampaignExperimentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.EndCampaignExperimentRequest)
    EndCampaignExperimentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EndCampaignExperimentRequest.newBuilder() to construct.
  private EndCampaignExperimentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EndCampaignExperimentRequest() {
    campaignExperiment_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EndCampaignExperimentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v10_services_EndCampaignExperimentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v10_services_EndCampaignExperimentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.EndCampaignExperimentRequest.class, com.google.ads.googleads.v10.services.EndCampaignExperimentRequest.Builder.class);
  }

  public static final int CAMPAIGN_EXPERIMENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object campaignExperiment_;
  /**
   * <pre>
   * Required. The resource name of the campaign experiment to end.
   * </pre>
   *
   * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The campaignExperiment.
   */
  @java.lang.Override
  public java.lang.String getCampaignExperiment() {
    java.lang.Object ref = campaignExperiment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      campaignExperiment_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the campaign experiment to end.
   * </pre>
   *
   * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaignExperiment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCampaignExperimentBytes() {
    java.lang.Object ref = campaignExperiment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      campaignExperiment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 2;
  private boolean validateOnly_;
  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaignExperiment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, campaignExperiment_);
    }
    if (validateOnly_ != false) {
      output.writeBool(2, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaignExperiment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, campaignExperiment_);
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, validateOnly_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.EndCampaignExperimentRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.EndCampaignExperimentRequest other = (com.google.ads.googleads.v10.services.EndCampaignExperimentRequest) obj;

    if (!getCampaignExperiment()
        .equals(other.getCampaignExperiment())) return false;
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
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
    hash = (37 * hash) + CAMPAIGN_EXPERIMENT_FIELD_NUMBER;
    hash = (53 * hash) + getCampaignExperiment().hashCode();
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.EndCampaignExperimentRequest prototype) {
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
   * Request message for [CampaignExperimentService.EndCampaignExperiment][google.ads.googleads.v10.services.CampaignExperimentService.EndCampaignExperiment].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.EndCampaignExperimentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.EndCampaignExperimentRequest)
      com.google.ads.googleads.v10.services.EndCampaignExperimentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v10_services_EndCampaignExperimentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v10_services_EndCampaignExperimentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.EndCampaignExperimentRequest.class, com.google.ads.googleads.v10.services.EndCampaignExperimentRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.EndCampaignExperimentRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      campaignExperiment_ = "";

      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v10_services_EndCampaignExperimentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.EndCampaignExperimentRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.EndCampaignExperimentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.EndCampaignExperimentRequest build() {
      com.google.ads.googleads.v10.services.EndCampaignExperimentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.EndCampaignExperimentRequest buildPartial() {
      com.google.ads.googleads.v10.services.EndCampaignExperimentRequest result = new com.google.ads.googleads.v10.services.EndCampaignExperimentRequest(this);
      result.campaignExperiment_ = campaignExperiment_;
      result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.ads.googleads.v10.services.EndCampaignExperimentRequest) {
        return mergeFrom((com.google.ads.googleads.v10.services.EndCampaignExperimentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.EndCampaignExperimentRequest other) {
      if (other == com.google.ads.googleads.v10.services.EndCampaignExperimentRequest.getDefaultInstance()) return this;
      if (!other.getCampaignExperiment().isEmpty()) {
        campaignExperiment_ = other.campaignExperiment_;
        onChanged();
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
              campaignExperiment_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 16: {
              validateOnly_ = input.readBool();

              break;
            } // case 16
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

    private java.lang.Object campaignExperiment_ = "";
    /**
     * <pre>
     * Required. The resource name of the campaign experiment to end.
     * </pre>
     *
     * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The campaignExperiment.
     */
    public java.lang.String getCampaignExperiment() {
      java.lang.Object ref = campaignExperiment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        campaignExperiment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the campaign experiment to end.
     * </pre>
     *
     * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for campaignExperiment.
     */
    public com.google.protobuf.ByteString
        getCampaignExperimentBytes() {
      java.lang.Object ref = campaignExperiment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        campaignExperiment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the campaign experiment to end.
     * </pre>
     *
     * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The campaignExperiment to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignExperiment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      campaignExperiment_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the campaign experiment to end.
     * </pre>
     *
     * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignExperiment() {
      
      campaignExperiment_ = getDefaultInstance().getCampaignExperiment();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the campaign experiment to end.
     * </pre>
     *
     * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for campaignExperiment to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignExperimentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      campaignExperiment_ = value;
      onChanged();
      return this;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {
      
      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      
      validateOnly_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.EndCampaignExperimentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.EndCampaignExperimentRequest)
  private static final com.google.ads.googleads.v10.services.EndCampaignExperimentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.EndCampaignExperimentRequest();
  }

  public static com.google.ads.googleads.v10.services.EndCampaignExperimentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EndCampaignExperimentRequest>
      PARSER = new com.google.protobuf.AbstractParser<EndCampaignExperimentRequest>() {
    @java.lang.Override
    public EndCampaignExperimentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<EndCampaignExperimentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EndCampaignExperimentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.EndCampaignExperimentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

