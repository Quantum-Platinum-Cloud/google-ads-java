// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/enums/reach_plan_ad_length.proto

package com.google.ads.googleads.v4.enums;

/**
 * <pre>
 * Message describing length of a plannable video ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.enums.ReachPlanAdLengthEnum}
 */
public  final class ReachPlanAdLengthEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.enums.ReachPlanAdLengthEnum)
    ReachPlanAdLengthEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReachPlanAdLengthEnum.newBuilder() to construct.
  private ReachPlanAdLengthEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReachPlanAdLengthEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReachPlanAdLengthEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReachPlanAdLengthEnum(
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
    return com.google.ads.googleads.v4.enums.ReachPlanAdLengthProto.internal_static_google_ads_googleads_v4_enums_ReachPlanAdLengthEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.enums.ReachPlanAdLengthProto.internal_static_google_ads_googleads_v4_enums_ReachPlanAdLengthEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.class, com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible ad length values.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.ReachPlanAdLength}
   */
  public enum ReachPlanAdLength
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * 6 seconds long ad.
     * </pre>
     *
     * <code>SIX_SECONDS = 2;</code>
     */
    SIX_SECONDS(2),
    /**
     * <pre>
     * 15 or 20 seconds long ad.
     * </pre>
     *
     * <code>FIFTEEN_OR_TWENTY_SECONDS = 3;</code>
     */
    FIFTEEN_OR_TWENTY_SECONDS(3),
    /**
     * <pre>
     * More than 20 seconds long ad.
     * </pre>
     *
     * <code>TWENTY_SECONDS_OR_MORE = 4;</code>
     */
    TWENTY_SECONDS_OR_MORE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * 6 seconds long ad.
     * </pre>
     *
     * <code>SIX_SECONDS = 2;</code>
     */
    public static final int SIX_SECONDS_VALUE = 2;
    /**
     * <pre>
     * 15 or 20 seconds long ad.
     * </pre>
     *
     * <code>FIFTEEN_OR_TWENTY_SECONDS = 3;</code>
     */
    public static final int FIFTEEN_OR_TWENTY_SECONDS_VALUE = 3;
    /**
     * <pre>
     * More than 20 seconds long ad.
     * </pre>
     *
     * <code>TWENTY_SECONDS_OR_MORE = 4;</code>
     */
    public static final int TWENTY_SECONDS_OR_MORE_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReachPlanAdLength valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ReachPlanAdLength forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return SIX_SECONDS;
        case 3: return FIFTEEN_OR_TWENTY_SECONDS;
        case 4: return TWENTY_SECONDS_OR_MORE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReachPlanAdLength>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReachPlanAdLength> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReachPlanAdLength>() {
            public ReachPlanAdLength findValueByNumber(int number) {
              return ReachPlanAdLength.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReachPlanAdLength[] VALUES = values();

    public static ReachPlanAdLength valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReachPlanAdLength(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.ReachPlanAdLength)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum other = (com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum prototype) {
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
   * Message describing length of a plannable video ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.enums.ReachPlanAdLengthEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.enums.ReachPlanAdLengthEnum)
      com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.enums.ReachPlanAdLengthProto.internal_static_google_ads_googleads_v4_enums_ReachPlanAdLengthEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.enums.ReachPlanAdLengthProto.internal_static_google_ads_googleads_v4_enums_ReachPlanAdLengthEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.class, com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.enums.ReachPlanAdLengthProto.internal_static_google_ads_googleads_v4_enums_ReachPlanAdLengthEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum build() {
      com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum buildPartial() {
      com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum result = new com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum(this);
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
      if (other instanceof com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum) {
        return mergeFrom((com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum other) {
      if (other == com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.enums.ReachPlanAdLengthEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.enums.ReachPlanAdLengthEnum)
  private static final com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum();
  }

  public static com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReachPlanAdLengthEnum>
      PARSER = new com.google.protobuf.AbstractParser<ReachPlanAdLengthEnum>() {
    @java.lang.Override
    public ReachPlanAdLengthEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReachPlanAdLengthEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReachPlanAdLengthEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReachPlanAdLengthEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

