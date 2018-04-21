// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/enums/page_one_promoted_strategy_goal.proto

package com.google.ads.googleads.v0.enums;

/**
 * <pre>
 * Container for enum describing possible strategy goals: where impressions are
 * desired to be shown on search result pages.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum}
 */
public  final class PageOnePromotedStrategyGoalEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum)
    PageOnePromotedStrategyGoalEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PageOnePromotedStrategyGoalEnum.newBuilder() to construct.
  private PageOnePromotedStrategyGoalEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PageOnePromotedStrategyGoalEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PageOnePromotedStrategyGoalEnum(
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
            if (!parseUnknownFieldProto3(
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
    return com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalProto.internal_static_google_ads_googleads_v0_enums_PageOnePromotedStrategyGoalEnum_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalProto.internal_static_google_ads_googleads_v0_enums_PageOnePromotedStrategyGoalEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum.class, com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible strategy goals.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum.PageOnePromotedStrategyGoal}
   */
  public enum PageOnePromotedStrategyGoal
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
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * First page on google.com.
     * </pre>
     *
     * <code>FIRST_PAGE = 2;</code>
     */
    FIRST_PAGE(2),
    /**
     * <pre>
     * Top slots of the first page on google.com.
     * </pre>
     *
     * <code>FIRST_PAGE_PROMOTED = 3;</code>
     */
    FIRST_PAGE_PROMOTED(3),
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
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * First page on google.com.
     * </pre>
     *
     * <code>FIRST_PAGE = 2;</code>
     */
    public static final int FIRST_PAGE_VALUE = 2;
    /**
     * <pre>
     * Top slots of the first page on google.com.
     * </pre>
     *
     * <code>FIRST_PAGE_PROMOTED = 3;</code>
     */
    public static final int FIRST_PAGE_PROMOTED_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PageOnePromotedStrategyGoal valueOf(int value) {
      return forNumber(value);
    }

    public static PageOnePromotedStrategyGoal forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return FIRST_PAGE;
        case 3: return FIRST_PAGE_PROMOTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PageOnePromotedStrategyGoal>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PageOnePromotedStrategyGoal> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PageOnePromotedStrategyGoal>() {
            public PageOnePromotedStrategyGoal findValueByNumber(int number) {
              return PageOnePromotedStrategyGoal.forNumber(number);
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
      return com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final PageOnePromotedStrategyGoal[] VALUES = values();

    public static PageOnePromotedStrategyGoal valueOf(
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

    private PageOnePromotedStrategyGoal(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum.PageOnePromotedStrategyGoal)
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

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
    if (!(obj instanceof com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum other = (com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
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

  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Container for enum describing possible strategy goals: where impressions are
   * desired to be shown on search result pages.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum)
      com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalProto.internal_static_google_ads_googleads_v0_enums_PageOnePromotedStrategyGoalEnum_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalProto.internal_static_google_ads_googleads_v0_enums_PageOnePromotedStrategyGoalEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum.class, com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum.newBuilder()
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
    public Builder clear() {
      super.clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalProto.internal_static_google_ads_googleads_v0_enums_PageOnePromotedStrategyGoalEnum_descriptor;
    }

    public com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum.getDefaultInstance();
    }

    public com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum build() {
      com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum buildPartial() {
      com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum result = new com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum(this);
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum) {
        return mergeFrom((com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum other) {
      if (other == com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum)
  private static final com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum();
  }

  public static com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PageOnePromotedStrategyGoalEnum>
      PARSER = new com.google.protobuf.AbstractParser<PageOnePromotedStrategyGoalEnum>() {
    public PageOnePromotedStrategyGoalEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PageOnePromotedStrategyGoalEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PageOnePromotedStrategyGoalEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PageOnePromotedStrategyGoalEnum> getParserForType() {
    return PARSER;
  }

  public com.google.ads.googleads.v0.enums.PageOnePromotedStrategyGoalEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

