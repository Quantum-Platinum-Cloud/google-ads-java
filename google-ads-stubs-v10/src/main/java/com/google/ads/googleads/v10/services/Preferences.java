// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/reach_plan_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * Set of preferences about the planned mix.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.Preferences}
 */
public final class Preferences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.Preferences)
    PreferencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Preferences.newBuilder() to construct.
  private Preferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Preferences() {
    adLength_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Preferences();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v10_services_Preferences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v10_services_Preferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.Preferences.class, com.google.ads.googleads.v10.services.Preferences.Builder.class);
  }

  private int bitField0_;
  public static final int IS_SKIPPABLE_FIELD_NUMBER = 6;
  private boolean isSkippable_;
  /**
   * <pre>
   * True if ad skippable.
   * If not set, default is any value.
   * </pre>
   *
   * <code>optional bool is_skippable = 6;</code>
   * @return Whether the isSkippable field is set.
   */
  @java.lang.Override
  public boolean hasIsSkippable() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * True if ad skippable.
   * If not set, default is any value.
   * </pre>
   *
   * <code>optional bool is_skippable = 6;</code>
   * @return The isSkippable.
   */
  @java.lang.Override
  public boolean getIsSkippable() {
    return isSkippable_;
  }

  public static final int STARTS_WITH_SOUND_FIELD_NUMBER = 7;
  private boolean startsWithSound_;
  /**
   * <pre>
   * True if ad start with sound.
   * If not set, default is any value.
   * </pre>
   *
   * <code>optional bool starts_with_sound = 7;</code>
   * @return Whether the startsWithSound field is set.
   */
  @java.lang.Override
  public boolean hasStartsWithSound() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * True if ad start with sound.
   * If not set, default is any value.
   * </pre>
   *
   * <code>optional bool starts_with_sound = 7;</code>
   * @return The startsWithSound.
   */
  @java.lang.Override
  public boolean getStartsWithSound() {
    return startsWithSound_;
  }

  public static final int AD_LENGTH_FIELD_NUMBER = 3;
  private int adLength_;
  /**
   * <pre>
   * The length of the ad.
   * If not set, default is any value.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength ad_length = 3;</code>
   * @return The enum numeric value on the wire for adLength.
   */
  @java.lang.Override public int getAdLengthValue() {
    return adLength_;
  }
  /**
   * <pre>
   * The length of the ad.
   * If not set, default is any value.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength ad_length = 3;</code>
   * @return The adLength.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength getAdLength() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength result = com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength.valueOf(adLength_);
    return result == null ? com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength.UNRECOGNIZED : result;
  }

  public static final int TOP_CONTENT_ONLY_FIELD_NUMBER = 8;
  private boolean topContentOnly_;
  /**
   * <pre>
   * True if ad will only show on the top content.
   * If not set, default is false.
   * </pre>
   *
   * <code>optional bool top_content_only = 8;</code>
   * @return Whether the topContentOnly field is set.
   */
  @java.lang.Override
  public boolean hasTopContentOnly() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * True if ad will only show on the top content.
   * If not set, default is false.
   * </pre>
   *
   * <code>optional bool top_content_only = 8;</code>
   * @return The topContentOnly.
   */
  @java.lang.Override
  public boolean getTopContentOnly() {
    return topContentOnly_;
  }

  public static final int HAS_GUARANTEED_PRICE_FIELD_NUMBER = 9;
  private boolean hasGuaranteedPrice_;
  /**
   * <pre>
   * True if the price is guaranteed. The cost of serving the ad is agreed
   * upfront and not subject to an auction.
   * If not set, default is any value.
   * </pre>
   *
   * <code>optional bool has_guaranteed_price = 9;</code>
   * @return Whether the hasGuaranteedPrice field is set.
   */
  @java.lang.Override
  public boolean hasHasGuaranteedPrice() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * True if the price is guaranteed. The cost of serving the ad is agreed
   * upfront and not subject to an auction.
   * If not set, default is any value.
   * </pre>
   *
   * <code>optional bool has_guaranteed_price = 9;</code>
   * @return The hasGuaranteedPrice.
   */
  @java.lang.Override
  public boolean getHasGuaranteedPrice() {
    return hasGuaranteedPrice_;
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
    if (adLength_ != com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, adLength_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(6, isSkippable_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(7, startsWithSound_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(8, topContentOnly_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeBool(9, hasGuaranteedPrice_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adLength_ != com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, adLength_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isSkippable_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, startsWithSound_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, topContentOnly_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, hasGuaranteedPrice_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.Preferences)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.Preferences other = (com.google.ads.googleads.v10.services.Preferences) obj;

    if (hasIsSkippable() != other.hasIsSkippable()) return false;
    if (hasIsSkippable()) {
      if (getIsSkippable()
          != other.getIsSkippable()) return false;
    }
    if (hasStartsWithSound() != other.hasStartsWithSound()) return false;
    if (hasStartsWithSound()) {
      if (getStartsWithSound()
          != other.getStartsWithSound()) return false;
    }
    if (adLength_ != other.adLength_) return false;
    if (hasTopContentOnly() != other.hasTopContentOnly()) return false;
    if (hasTopContentOnly()) {
      if (getTopContentOnly()
          != other.getTopContentOnly()) return false;
    }
    if (hasHasGuaranteedPrice() != other.hasHasGuaranteedPrice()) return false;
    if (hasHasGuaranteedPrice()) {
      if (getHasGuaranteedPrice()
          != other.getHasGuaranteedPrice()) return false;
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
    if (hasIsSkippable()) {
      hash = (37 * hash) + IS_SKIPPABLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSkippable());
    }
    if (hasStartsWithSound()) {
      hash = (37 * hash) + STARTS_WITH_SOUND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getStartsWithSound());
    }
    hash = (37 * hash) + AD_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + adLength_;
    if (hasTopContentOnly()) {
      hash = (37 * hash) + TOP_CONTENT_ONLY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getTopContentOnly());
    }
    if (hasHasGuaranteedPrice()) {
      hash = (37 * hash) + HAS_GUARANTEED_PRICE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasGuaranteedPrice());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.Preferences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.Preferences parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.Preferences prototype) {
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
   * Set of preferences about the planned mix.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.Preferences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.Preferences)
      com.google.ads.googleads.v10.services.PreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v10_services_Preferences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v10_services_Preferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.Preferences.class, com.google.ads.googleads.v10.services.Preferences.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.Preferences.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      isSkippable_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      startsWithSound_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      adLength_ = 0;

      topContentOnly_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      hasGuaranteedPrice_ = false;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v10_services_Preferences_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.Preferences getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.Preferences.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.Preferences build() {
      com.google.ads.googleads.v10.services.Preferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.Preferences buildPartial() {
      com.google.ads.googleads.v10.services.Preferences result = new com.google.ads.googleads.v10.services.Preferences(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isSkippable_ = isSkippable_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startsWithSound_ = startsWithSound_;
        to_bitField0_ |= 0x00000002;
      }
      result.adLength_ = adLength_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.topContentOnly_ = topContentOnly_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.hasGuaranteedPrice_ = hasGuaranteedPrice_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v10.services.Preferences) {
        return mergeFrom((com.google.ads.googleads.v10.services.Preferences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.Preferences other) {
      if (other == com.google.ads.googleads.v10.services.Preferences.getDefaultInstance()) return this;
      if (other.hasIsSkippable()) {
        setIsSkippable(other.getIsSkippable());
      }
      if (other.hasStartsWithSound()) {
        setStartsWithSound(other.getStartsWithSound());
      }
      if (other.adLength_ != 0) {
        setAdLengthValue(other.getAdLengthValue());
      }
      if (other.hasTopContentOnly()) {
        setTopContentOnly(other.getTopContentOnly());
      }
      if (other.hasHasGuaranteedPrice()) {
        setHasGuaranteedPrice(other.getHasGuaranteedPrice());
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
            case 24: {
              adLength_ = input.readEnum();

              break;
            } // case 24
            case 48: {
              isSkippable_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 48
            case 56: {
              startsWithSound_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 56
            case 64: {
              topContentOnly_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 64
            case 72: {
              hasGuaranteedPrice_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 72
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
    private int bitField0_;

    private boolean isSkippable_ ;
    /**
     * <pre>
     * True if ad skippable.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool is_skippable = 6;</code>
     * @return Whether the isSkippable field is set.
     */
    @java.lang.Override
    public boolean hasIsSkippable() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * True if ad skippable.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool is_skippable = 6;</code>
     * @return The isSkippable.
     */
    @java.lang.Override
    public boolean getIsSkippable() {
      return isSkippable_;
    }
    /**
     * <pre>
     * True if ad skippable.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool is_skippable = 6;</code>
     * @param value The isSkippable to set.
     * @return This builder for chaining.
     */
    public Builder setIsSkippable(boolean value) {
      bitField0_ |= 0x00000001;
      isSkippable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if ad skippable.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool is_skippable = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsSkippable() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isSkippable_ = false;
      onChanged();
      return this;
    }

    private boolean startsWithSound_ ;
    /**
     * <pre>
     * True if ad start with sound.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool starts_with_sound = 7;</code>
     * @return Whether the startsWithSound field is set.
     */
    @java.lang.Override
    public boolean hasStartsWithSound() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * True if ad start with sound.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool starts_with_sound = 7;</code>
     * @return The startsWithSound.
     */
    @java.lang.Override
    public boolean getStartsWithSound() {
      return startsWithSound_;
    }
    /**
     * <pre>
     * True if ad start with sound.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool starts_with_sound = 7;</code>
     * @param value The startsWithSound to set.
     * @return This builder for chaining.
     */
    public Builder setStartsWithSound(boolean value) {
      bitField0_ |= 0x00000002;
      startsWithSound_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if ad start with sound.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool starts_with_sound = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartsWithSound() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startsWithSound_ = false;
      onChanged();
      return this;
    }

    private int adLength_ = 0;
    /**
     * <pre>
     * The length of the ad.
     * If not set, default is any value.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength ad_length = 3;</code>
     * @return The enum numeric value on the wire for adLength.
     */
    @java.lang.Override public int getAdLengthValue() {
      return adLength_;
    }
    /**
     * <pre>
     * The length of the ad.
     * If not set, default is any value.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength ad_length = 3;</code>
     * @param value The enum numeric value on the wire for adLength to set.
     * @return This builder for chaining.
     */
    public Builder setAdLengthValue(int value) {
      
      adLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The length of the ad.
     * If not set, default is any value.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength ad_length = 3;</code>
     * @return The adLength.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength getAdLength() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength result = com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength.valueOf(adLength_);
      return result == null ? com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The length of the ad.
     * If not set, default is any value.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength ad_length = 3;</code>
     * @param value The adLength to set.
     * @return This builder for chaining.
     */
    public Builder setAdLength(com.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      adLength_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The length of the ad.
     * If not set, default is any value.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.ReachPlanAdLengthEnum.ReachPlanAdLength ad_length = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdLength() {
      
      adLength_ = 0;
      onChanged();
      return this;
    }

    private boolean topContentOnly_ ;
    /**
     * <pre>
     * True if ad will only show on the top content.
     * If not set, default is false.
     * </pre>
     *
     * <code>optional bool top_content_only = 8;</code>
     * @return Whether the topContentOnly field is set.
     */
    @java.lang.Override
    public boolean hasTopContentOnly() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * True if ad will only show on the top content.
     * If not set, default is false.
     * </pre>
     *
     * <code>optional bool top_content_only = 8;</code>
     * @return The topContentOnly.
     */
    @java.lang.Override
    public boolean getTopContentOnly() {
      return topContentOnly_;
    }
    /**
     * <pre>
     * True if ad will only show on the top content.
     * If not set, default is false.
     * </pre>
     *
     * <code>optional bool top_content_only = 8;</code>
     * @param value The topContentOnly to set.
     * @return This builder for chaining.
     */
    public Builder setTopContentOnly(boolean value) {
      bitField0_ |= 0x00000004;
      topContentOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if ad will only show on the top content.
     * If not set, default is false.
     * </pre>
     *
     * <code>optional bool top_content_only = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopContentOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      topContentOnly_ = false;
      onChanged();
      return this;
    }

    private boolean hasGuaranteedPrice_ ;
    /**
     * <pre>
     * True if the price is guaranteed. The cost of serving the ad is agreed
     * upfront and not subject to an auction.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool has_guaranteed_price = 9;</code>
     * @return Whether the hasGuaranteedPrice field is set.
     */
    @java.lang.Override
    public boolean hasHasGuaranteedPrice() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * True if the price is guaranteed. The cost of serving the ad is agreed
     * upfront and not subject to an auction.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool has_guaranteed_price = 9;</code>
     * @return The hasGuaranteedPrice.
     */
    @java.lang.Override
    public boolean getHasGuaranteedPrice() {
      return hasGuaranteedPrice_;
    }
    /**
     * <pre>
     * True if the price is guaranteed. The cost of serving the ad is agreed
     * upfront and not subject to an auction.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool has_guaranteed_price = 9;</code>
     * @param value The hasGuaranteedPrice to set.
     * @return This builder for chaining.
     */
    public Builder setHasGuaranteedPrice(boolean value) {
      bitField0_ |= 0x00000008;
      hasGuaranteedPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if the price is guaranteed. The cost of serving the ad is agreed
     * upfront and not subject to an auction.
     * If not set, default is any value.
     * </pre>
     *
     * <code>optional bool has_guaranteed_price = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasGuaranteedPrice() {
      bitField0_ = (bitField0_ & ~0x00000008);
      hasGuaranteedPrice_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.Preferences)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.Preferences)
  private static final com.google.ads.googleads.v10.services.Preferences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.Preferences();
  }

  public static com.google.ads.googleads.v10.services.Preferences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Preferences>
      PARSER = new com.google.protobuf.AbstractParser<Preferences>() {
    @java.lang.Override
    public Preferences parsePartialFrom(
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

  public static com.google.protobuf.Parser<Preferences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Preferences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.Preferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

