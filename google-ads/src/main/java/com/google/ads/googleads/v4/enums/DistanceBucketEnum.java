// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/enums/distance_bucket.proto

package com.google.ads.googleads.v4.enums;

/**
 * <pre>
 * Container for distance buckets of a user’s distance from an advertiser’s
 * location extension.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.enums.DistanceBucketEnum}
 */
public  final class DistanceBucketEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.enums.DistanceBucketEnum)
    DistanceBucketEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DistanceBucketEnum.newBuilder() to construct.
  private DistanceBucketEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DistanceBucketEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DistanceBucketEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DistanceBucketEnum(
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
    return com.google.ads.googleads.v4.enums.DistanceBucketProto.internal_static_google_ads_googleads_v4_enums_DistanceBucketEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.enums.DistanceBucketProto.internal_static_google_ads_googleads_v4_enums_DistanceBucketEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.enums.DistanceBucketEnum.class, com.google.ads.googleads.v4.enums.DistanceBucketEnum.Builder.class);
  }

  /**
   * <pre>
   * The distance bucket for a user’s distance from an advertiser’s location
   * extension.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v4.enums.DistanceBucketEnum.DistanceBucket}
   */
  public enum DistanceBucket
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
     * User was within 700m of the location.
     * </pre>
     *
     * <code>WITHIN_700M = 2;</code>
     */
    WITHIN_700M(2),
    /**
     * <pre>
     * User was within 1KM of the location.
     * </pre>
     *
     * <code>WITHIN_1KM = 3;</code>
     */
    WITHIN_1KM(3),
    /**
     * <pre>
     * User was within 5KM of the location.
     * </pre>
     *
     * <code>WITHIN_5KM = 4;</code>
     */
    WITHIN_5KM(4),
    /**
     * <pre>
     * User was within 10KM of the location.
     * </pre>
     *
     * <code>WITHIN_10KM = 5;</code>
     */
    WITHIN_10KM(5),
    /**
     * <pre>
     * User was within 15KM of the location.
     * </pre>
     *
     * <code>WITHIN_15KM = 6;</code>
     */
    WITHIN_15KM(6),
    /**
     * <pre>
     * User was within 20KM of the location.
     * </pre>
     *
     * <code>WITHIN_20KM = 7;</code>
     */
    WITHIN_20KM(7),
    /**
     * <pre>
     * User was within 25KM of the location.
     * </pre>
     *
     * <code>WITHIN_25KM = 8;</code>
     */
    WITHIN_25KM(8),
    /**
     * <pre>
     * User was within 30KM of the location.
     * </pre>
     *
     * <code>WITHIN_30KM = 9;</code>
     */
    WITHIN_30KM(9),
    /**
     * <pre>
     * User was within 35KM of the location.
     * </pre>
     *
     * <code>WITHIN_35KM = 10;</code>
     */
    WITHIN_35KM(10),
    /**
     * <pre>
     * User was within 40KM of the location.
     * </pre>
     *
     * <code>WITHIN_40KM = 11;</code>
     */
    WITHIN_40KM(11),
    /**
     * <pre>
     * User was within 45KM of the location.
     * </pre>
     *
     * <code>WITHIN_45KM = 12;</code>
     */
    WITHIN_45KM(12),
    /**
     * <pre>
     * User was within 50KM of the location.
     * </pre>
     *
     * <code>WITHIN_50KM = 13;</code>
     */
    WITHIN_50KM(13),
    /**
     * <pre>
     * User was within 55KM of the location.
     * </pre>
     *
     * <code>WITHIN_55KM = 14;</code>
     */
    WITHIN_55KM(14),
    /**
     * <pre>
     * User was within 60KM of the location.
     * </pre>
     *
     * <code>WITHIN_60KM = 15;</code>
     */
    WITHIN_60KM(15),
    /**
     * <pre>
     * User was within 65KM of the location.
     * </pre>
     *
     * <code>WITHIN_65KM = 16;</code>
     */
    WITHIN_65KM(16),
    /**
     * <pre>
     * User was beyond 65KM of the location.
     * </pre>
     *
     * <code>BEYOND_65KM = 17;</code>
     */
    BEYOND_65KM(17),
    /**
     * <pre>
     * User was within 0.7 miles of the location.
     * </pre>
     *
     * <code>WITHIN_0_7MILES = 18;</code>
     */
    WITHIN_0_7MILES(18),
    /**
     * <pre>
     * User was within 1 mile of the location.
     * </pre>
     *
     * <code>WITHIN_1MILE = 19;</code>
     */
    WITHIN_1MILE(19),
    /**
     * <pre>
     * User was within 5 miles of the location.
     * </pre>
     *
     * <code>WITHIN_5MILES = 20;</code>
     */
    WITHIN_5MILES(20),
    /**
     * <pre>
     * User was within 10 miles of the location.
     * </pre>
     *
     * <code>WITHIN_10MILES = 21;</code>
     */
    WITHIN_10MILES(21),
    /**
     * <pre>
     * User was within 15 miles of the location.
     * </pre>
     *
     * <code>WITHIN_15MILES = 22;</code>
     */
    WITHIN_15MILES(22),
    /**
     * <pre>
     * User was within 20 miles of the location.
     * </pre>
     *
     * <code>WITHIN_20MILES = 23;</code>
     */
    WITHIN_20MILES(23),
    /**
     * <pre>
     * User was within 25 miles of the location.
     * </pre>
     *
     * <code>WITHIN_25MILES = 24;</code>
     */
    WITHIN_25MILES(24),
    /**
     * <pre>
     * User was within 30 miles of the location.
     * </pre>
     *
     * <code>WITHIN_30MILES = 25;</code>
     */
    WITHIN_30MILES(25),
    /**
     * <pre>
     * User was within 35 miles of the location.
     * </pre>
     *
     * <code>WITHIN_35MILES = 26;</code>
     */
    WITHIN_35MILES(26),
    /**
     * <pre>
     * User was within 40 miles of the location.
     * </pre>
     *
     * <code>WITHIN_40MILES = 27;</code>
     */
    WITHIN_40MILES(27),
    /**
     * <pre>
     * User was beyond 40 miles of the location.
     * </pre>
     *
     * <code>BEYOND_40MILES = 28;</code>
     */
    BEYOND_40MILES(28),
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
     * User was within 700m of the location.
     * </pre>
     *
     * <code>WITHIN_700M = 2;</code>
     */
    public static final int WITHIN_700M_VALUE = 2;
    /**
     * <pre>
     * User was within 1KM of the location.
     * </pre>
     *
     * <code>WITHIN_1KM = 3;</code>
     */
    public static final int WITHIN_1KM_VALUE = 3;
    /**
     * <pre>
     * User was within 5KM of the location.
     * </pre>
     *
     * <code>WITHIN_5KM = 4;</code>
     */
    public static final int WITHIN_5KM_VALUE = 4;
    /**
     * <pre>
     * User was within 10KM of the location.
     * </pre>
     *
     * <code>WITHIN_10KM = 5;</code>
     */
    public static final int WITHIN_10KM_VALUE = 5;
    /**
     * <pre>
     * User was within 15KM of the location.
     * </pre>
     *
     * <code>WITHIN_15KM = 6;</code>
     */
    public static final int WITHIN_15KM_VALUE = 6;
    /**
     * <pre>
     * User was within 20KM of the location.
     * </pre>
     *
     * <code>WITHIN_20KM = 7;</code>
     */
    public static final int WITHIN_20KM_VALUE = 7;
    /**
     * <pre>
     * User was within 25KM of the location.
     * </pre>
     *
     * <code>WITHIN_25KM = 8;</code>
     */
    public static final int WITHIN_25KM_VALUE = 8;
    /**
     * <pre>
     * User was within 30KM of the location.
     * </pre>
     *
     * <code>WITHIN_30KM = 9;</code>
     */
    public static final int WITHIN_30KM_VALUE = 9;
    /**
     * <pre>
     * User was within 35KM of the location.
     * </pre>
     *
     * <code>WITHIN_35KM = 10;</code>
     */
    public static final int WITHIN_35KM_VALUE = 10;
    /**
     * <pre>
     * User was within 40KM of the location.
     * </pre>
     *
     * <code>WITHIN_40KM = 11;</code>
     */
    public static final int WITHIN_40KM_VALUE = 11;
    /**
     * <pre>
     * User was within 45KM of the location.
     * </pre>
     *
     * <code>WITHIN_45KM = 12;</code>
     */
    public static final int WITHIN_45KM_VALUE = 12;
    /**
     * <pre>
     * User was within 50KM of the location.
     * </pre>
     *
     * <code>WITHIN_50KM = 13;</code>
     */
    public static final int WITHIN_50KM_VALUE = 13;
    /**
     * <pre>
     * User was within 55KM of the location.
     * </pre>
     *
     * <code>WITHIN_55KM = 14;</code>
     */
    public static final int WITHIN_55KM_VALUE = 14;
    /**
     * <pre>
     * User was within 60KM of the location.
     * </pre>
     *
     * <code>WITHIN_60KM = 15;</code>
     */
    public static final int WITHIN_60KM_VALUE = 15;
    /**
     * <pre>
     * User was within 65KM of the location.
     * </pre>
     *
     * <code>WITHIN_65KM = 16;</code>
     */
    public static final int WITHIN_65KM_VALUE = 16;
    /**
     * <pre>
     * User was beyond 65KM of the location.
     * </pre>
     *
     * <code>BEYOND_65KM = 17;</code>
     */
    public static final int BEYOND_65KM_VALUE = 17;
    /**
     * <pre>
     * User was within 0.7 miles of the location.
     * </pre>
     *
     * <code>WITHIN_0_7MILES = 18;</code>
     */
    public static final int WITHIN_0_7MILES_VALUE = 18;
    /**
     * <pre>
     * User was within 1 mile of the location.
     * </pre>
     *
     * <code>WITHIN_1MILE = 19;</code>
     */
    public static final int WITHIN_1MILE_VALUE = 19;
    /**
     * <pre>
     * User was within 5 miles of the location.
     * </pre>
     *
     * <code>WITHIN_5MILES = 20;</code>
     */
    public static final int WITHIN_5MILES_VALUE = 20;
    /**
     * <pre>
     * User was within 10 miles of the location.
     * </pre>
     *
     * <code>WITHIN_10MILES = 21;</code>
     */
    public static final int WITHIN_10MILES_VALUE = 21;
    /**
     * <pre>
     * User was within 15 miles of the location.
     * </pre>
     *
     * <code>WITHIN_15MILES = 22;</code>
     */
    public static final int WITHIN_15MILES_VALUE = 22;
    /**
     * <pre>
     * User was within 20 miles of the location.
     * </pre>
     *
     * <code>WITHIN_20MILES = 23;</code>
     */
    public static final int WITHIN_20MILES_VALUE = 23;
    /**
     * <pre>
     * User was within 25 miles of the location.
     * </pre>
     *
     * <code>WITHIN_25MILES = 24;</code>
     */
    public static final int WITHIN_25MILES_VALUE = 24;
    /**
     * <pre>
     * User was within 30 miles of the location.
     * </pre>
     *
     * <code>WITHIN_30MILES = 25;</code>
     */
    public static final int WITHIN_30MILES_VALUE = 25;
    /**
     * <pre>
     * User was within 35 miles of the location.
     * </pre>
     *
     * <code>WITHIN_35MILES = 26;</code>
     */
    public static final int WITHIN_35MILES_VALUE = 26;
    /**
     * <pre>
     * User was within 40 miles of the location.
     * </pre>
     *
     * <code>WITHIN_40MILES = 27;</code>
     */
    public static final int WITHIN_40MILES_VALUE = 27;
    /**
     * <pre>
     * User was beyond 40 miles of the location.
     * </pre>
     *
     * <code>BEYOND_40MILES = 28;</code>
     */
    public static final int BEYOND_40MILES_VALUE = 28;


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
    public static DistanceBucket valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DistanceBucket forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return WITHIN_700M;
        case 3: return WITHIN_1KM;
        case 4: return WITHIN_5KM;
        case 5: return WITHIN_10KM;
        case 6: return WITHIN_15KM;
        case 7: return WITHIN_20KM;
        case 8: return WITHIN_25KM;
        case 9: return WITHIN_30KM;
        case 10: return WITHIN_35KM;
        case 11: return WITHIN_40KM;
        case 12: return WITHIN_45KM;
        case 13: return WITHIN_50KM;
        case 14: return WITHIN_55KM;
        case 15: return WITHIN_60KM;
        case 16: return WITHIN_65KM;
        case 17: return BEYOND_65KM;
        case 18: return WITHIN_0_7MILES;
        case 19: return WITHIN_1MILE;
        case 20: return WITHIN_5MILES;
        case 21: return WITHIN_10MILES;
        case 22: return WITHIN_15MILES;
        case 23: return WITHIN_20MILES;
        case 24: return WITHIN_25MILES;
        case 25: return WITHIN_30MILES;
        case 26: return WITHIN_35MILES;
        case 27: return WITHIN_40MILES;
        case 28: return BEYOND_40MILES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DistanceBucket>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DistanceBucket> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DistanceBucket>() {
            public DistanceBucket findValueByNumber(int number) {
              return DistanceBucket.forNumber(number);
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
      return com.google.ads.googleads.v4.enums.DistanceBucketEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final DistanceBucket[] VALUES = values();

    public static DistanceBucket valueOf(
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

    private DistanceBucket(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v4.enums.DistanceBucketEnum.DistanceBucket)
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
    if (!(obj instanceof com.google.ads.googleads.v4.enums.DistanceBucketEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.enums.DistanceBucketEnum other = (com.google.ads.googleads.v4.enums.DistanceBucketEnum) obj;

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

  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.enums.DistanceBucketEnum prototype) {
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
   * Container for distance buckets of a user’s distance from an advertiser’s
   * location extension.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.enums.DistanceBucketEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.enums.DistanceBucketEnum)
      com.google.ads.googleads.v4.enums.DistanceBucketEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.enums.DistanceBucketProto.internal_static_google_ads_googleads_v4_enums_DistanceBucketEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.enums.DistanceBucketProto.internal_static_google_ads_googleads_v4_enums_DistanceBucketEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.enums.DistanceBucketEnum.class, com.google.ads.googleads.v4.enums.DistanceBucketEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.enums.DistanceBucketEnum.newBuilder()
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
      return com.google.ads.googleads.v4.enums.DistanceBucketProto.internal_static_google_ads_googleads_v4_enums_DistanceBucketEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.enums.DistanceBucketEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.enums.DistanceBucketEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.enums.DistanceBucketEnum build() {
      com.google.ads.googleads.v4.enums.DistanceBucketEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.enums.DistanceBucketEnum buildPartial() {
      com.google.ads.googleads.v4.enums.DistanceBucketEnum result = new com.google.ads.googleads.v4.enums.DistanceBucketEnum(this);
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
      if (other instanceof com.google.ads.googleads.v4.enums.DistanceBucketEnum) {
        return mergeFrom((com.google.ads.googleads.v4.enums.DistanceBucketEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.enums.DistanceBucketEnum other) {
      if (other == com.google.ads.googleads.v4.enums.DistanceBucketEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v4.enums.DistanceBucketEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.enums.DistanceBucketEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.enums.DistanceBucketEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.enums.DistanceBucketEnum)
  private static final com.google.ads.googleads.v4.enums.DistanceBucketEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.enums.DistanceBucketEnum();
  }

  public static com.google.ads.googleads.v4.enums.DistanceBucketEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DistanceBucketEnum>
      PARSER = new com.google.protobuf.AbstractParser<DistanceBucketEnum>() {
    @java.lang.Override
    public DistanceBucketEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DistanceBucketEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DistanceBucketEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DistanceBucketEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.enums.DistanceBucketEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

