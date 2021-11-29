// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/common/offline_user_data.proto

package com.google.ads.googleads.v9.common;

public final class OfflineUserDataProto {
  private OfflineUserDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_OfflineUserAddressInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_OfflineUserAddressInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_UserIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_UserIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_TransactionAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_TransactionAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_StoreAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_StoreAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_ItemAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_ItemAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_UserData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_UserData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_UserAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_UserAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_ShoppingLoyalty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_ShoppingLoyalty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_CustomerMatchUserListMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_CustomerMatchUserListMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_StoreSalesMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_StoreSalesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_common_StoreSalesThirdPartyMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_common_StoreSalesThirdPartyMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v9/common/offline" +
      "_user_data.proto\022\036google.ads.googleads.v" +
      "9.common\032:google/ads/googleads/v9/enums/" +
      "user_identifier_source.proto\032\034google/api" +
      "/annotations.proto\"\320\002\n\026OfflineUserAddres" +
      "sInfo\022\036\n\021hashed_first_name\030\007 \001(\tH\000\210\001\001\022\035\n" +
      "\020hashed_last_name\030\010 \001(\tH\001\210\001\001\022\021\n\004city\030\t \001" +
      "(\tH\002\210\001\001\022\022\n\005state\030\n \001(\tH\003\210\001\001\022\031\n\014country_c" +
      "ode\030\013 \001(\tH\004\210\001\001\022\030\n\013postal_code\030\014 \001(\tH\005\210\001\001" +
      "\022\"\n\025hashed_street_address\030\r \001(\tH\006\210\001\001B\024\n\022" +
      "_hashed_first_nameB\023\n\021_hashed_last_nameB" +
      "\007\n\005_cityB\010\n\006_stateB\017\n\r_country_codeB\016\n\014_" +
      "postal_codeB\030\n\026_hashed_street_address\"\307\002" +
      "\n\016UserIdentifier\022l\n\026user_identifier_sour" +
      "ce\030\006 \001(\0162L.google.ads.googleads.v9.enums" +
      ".UserIdentifierSourceEnum.UserIdentifier" +
      "Source\022\026\n\014hashed_email\030\007 \001(\tH\000\022\035\n\023hashed" +
      "_phone_number\030\010 \001(\tH\000\022\023\n\tmobile_id\030\t \001(\t" +
      "H\000\022\035\n\023third_party_user_id\030\n \001(\tH\000\022N\n\014add" +
      "ress_info\030\005 \001(\01326.google.ads.googleads.v" +
      "9.common.OfflineUserAddressInfoH\000B\014\n\nide" +
      "ntifier\"\336\003\n\024TransactionAttribute\022\"\n\025tran" +
      "saction_date_time\030\010 \001(\tH\000\210\001\001\022&\n\031transact" +
      "ion_amount_micros\030\t \001(\001H\001\210\001\001\022\032\n\rcurrency" +
      "_code\030\n \001(\tH\002\210\001\001\022\036\n\021conversion_action\030\013 " +
      "\001(\tH\003\210\001\001\022\025\n\010order_id\030\014 \001(\tH\004\210\001\001\022G\n\017store" +
      "_attribute\030\006 \001(\0132..google.ads.googleads." +
      "v9.common.StoreAttribute\022\031\n\014custom_value" +
      "\030\r \001(\tH\005\210\001\001\022E\n\016item_attribute\030\016 \001(\0132-.go" +
      "ogle.ads.googleads.v9.common.ItemAttribu" +
      "teB\030\n\026_transaction_date_timeB\034\n\032_transac" +
      "tion_amount_microsB\020\n\016_currency_codeB\024\n\022" +
      "_conversion_actionB\013\n\t_order_idB\017\n\r_cust" +
      "om_value\"8\n\016StoreAttribute\022\027\n\nstore_code" +
      "\030\002 \001(\tH\000\210\001\001B\r\n\013_store_code\"\211\001\n\rItemAttri" +
      "bute\022\017\n\007item_id\030\001 \001(\t\022\030\n\013merchant_id\030\002 \001" +
      "(\003H\000\210\001\001\022\024\n\014country_code\030\003 \001(\t\022\025\n\rlanguag" +
      "e_code\030\004 \001(\t\022\020\n\010quantity\030\005 \001(\003B\016\n\014_merch" +
      "ant_id\"\360\001\n\010UserData\022H\n\020user_identifiers\030" +
      "\001 \003(\0132..google.ads.googleads.v9.common.U" +
      "serIdentifier\022S\n\025transaction_attribute\030\002" +
      " \001(\01324.google.ads.googleads.v9.common.Tr" +
      "ansactionAttribute\022E\n\016user_attribute\030\003 \001" +
      "(\0132-.google.ads.googleads.v9.common.User" +
      "Attribute\"\367\002\n\rUserAttribute\022\"\n\025lifetime_" +
      "value_micros\030\001 \001(\003H\000\210\001\001\022\"\n\025lifetime_valu" +
      "e_bucket\030\002 \001(\005H\001\210\001\001\022\037\n\027last_purchase_dat" +
      "e_time\030\003 \001(\t\022\036\n\026average_purchase_count\030\004" +
      " \001(\005\022%\n\035average_purchase_value_micros\030\005 " +
      "\001(\003\022\035\n\025acquisition_date_time\030\006 \001(\t\022N\n\020sh" +
      "opping_loyalty\030\007 \001(\0132/.google.ads.google" +
      "ads.v9.common.ShoppingLoyaltyH\002\210\001\001B\030\n\026_l" +
      "ifetime_value_microsB\030\n\026_lifetime_value_" +
      "bucketB\023\n\021_shopping_loyalty\"=\n\017ShoppingL" +
      "oyalty\022\031\n\014loyalty_tier\030\001 \001(\tH\000\210\001\001B\017\n\r_lo" +
      "yalty_tier\"E\n\035CustomerMatchUserListMetad" +
      "ata\022\026\n\tuser_list\030\002 \001(\tH\000\210\001\001B\014\n\n_user_lis" +
      "t\"\226\002\n\022StoreSalesMetadata\022\035\n\020loyalty_frac" +
      "tion\030\005 \001(\001H\000\210\001\001\022(\n\033transaction_upload_fr" +
      "action\030\006 \001(\001H\001\210\001\001\022\027\n\ncustom_key\030\007 \001(\tH\002\210" +
      "\001\001\022Z\n\024third_party_metadata\030\003 \001(\0132<.googl" +
      "e.ads.googleads.v9.common.StoreSalesThir" +
      "dPartyMetadataB\023\n\021_loyalty_fractionB\036\n\034_" +
      "transaction_upload_fractionB\r\n\013_custom_k" +
      "ey\"\230\003\n\034StoreSalesThirdPartyMetadata\022(\n\033a" +
      "dvertiser_upload_date_time\030\007 \001(\tH\000\210\001\001\022\'\n" +
      "\032valid_transaction_fraction\030\010 \001(\001H\001\210\001\001\022#" +
      "\n\026partner_match_fraction\030\t \001(\001H\002\210\001\001\022$\n\027p" +
      "artner_upload_fraction\030\n \001(\001H\003\210\001\001\022\"\n\025bri" +
      "dge_map_version_id\030\013 \001(\tH\004\210\001\001\022\027\n\npartner" +
      "_id\030\014 \001(\003H\005\210\001\001B\036\n\034_advertiser_upload_dat" +
      "e_timeB\035\n\033_valid_transaction_fractionB\031\n" +
      "\027_partner_match_fractionB\032\n\030_partner_upl" +
      "oad_fractionB\030\n\026_bridge_map_version_idB\r" +
      "\n\013_partner_idB\357\001\n\"com.google.ads.googlea" +
      "ds.v9.commonB\024OfflineUserDataProtoP\001ZDgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v9/common;common\242\002\003GAA\252\002\036Googl" +
      "e.Ads.GoogleAds.V9.Common\312\002\036Google\\Ads\\G" +
      "oogleAds\\V9\\Common\352\002\"Google::Ads::Google" +
      "Ads::V9::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v9.enums.UserIdentifierSourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_common_OfflineUserAddressInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_common_OfflineUserAddressInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_OfflineUserAddressInfo_descriptor,
        new java.lang.String[] { "HashedFirstName", "HashedLastName", "City", "State", "CountryCode", "PostalCode", "HashedStreetAddress", "HashedFirstName", "HashedLastName", "City", "State", "CountryCode", "PostalCode", "HashedStreetAddress", });
    internal_static_google_ads_googleads_v9_common_UserIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v9_common_UserIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_UserIdentifier_descriptor,
        new java.lang.String[] { "UserIdentifierSource", "HashedEmail", "HashedPhoneNumber", "MobileId", "ThirdPartyUserId", "AddressInfo", "Identifier", });
    internal_static_google_ads_googleads_v9_common_TransactionAttribute_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v9_common_TransactionAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_TransactionAttribute_descriptor,
        new java.lang.String[] { "TransactionDateTime", "TransactionAmountMicros", "CurrencyCode", "ConversionAction", "OrderId", "StoreAttribute", "CustomValue", "ItemAttribute", "TransactionDateTime", "TransactionAmountMicros", "CurrencyCode", "ConversionAction", "OrderId", "CustomValue", });
    internal_static_google_ads_googleads_v9_common_StoreAttribute_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v9_common_StoreAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_StoreAttribute_descriptor,
        new java.lang.String[] { "StoreCode", "StoreCode", });
    internal_static_google_ads_googleads_v9_common_ItemAttribute_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v9_common_ItemAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_ItemAttribute_descriptor,
        new java.lang.String[] { "ItemId", "MerchantId", "CountryCode", "LanguageCode", "Quantity", "MerchantId", });
    internal_static_google_ads_googleads_v9_common_UserData_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v9_common_UserData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_UserData_descriptor,
        new java.lang.String[] { "UserIdentifiers", "TransactionAttribute", "UserAttribute", });
    internal_static_google_ads_googleads_v9_common_UserAttribute_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v9_common_UserAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_UserAttribute_descriptor,
        new java.lang.String[] { "LifetimeValueMicros", "LifetimeValueBucket", "LastPurchaseDateTime", "AveragePurchaseCount", "AveragePurchaseValueMicros", "AcquisitionDateTime", "ShoppingLoyalty", "LifetimeValueMicros", "LifetimeValueBucket", "ShoppingLoyalty", });
    internal_static_google_ads_googleads_v9_common_ShoppingLoyalty_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v9_common_ShoppingLoyalty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_ShoppingLoyalty_descriptor,
        new java.lang.String[] { "LoyaltyTier", "LoyaltyTier", });
    internal_static_google_ads_googleads_v9_common_CustomerMatchUserListMetadata_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v9_common_CustomerMatchUserListMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_CustomerMatchUserListMetadata_descriptor,
        new java.lang.String[] { "UserList", "UserList", });
    internal_static_google_ads_googleads_v9_common_StoreSalesMetadata_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v9_common_StoreSalesMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_StoreSalesMetadata_descriptor,
        new java.lang.String[] { "LoyaltyFraction", "TransactionUploadFraction", "CustomKey", "ThirdPartyMetadata", "LoyaltyFraction", "TransactionUploadFraction", "CustomKey", });
    internal_static_google_ads_googleads_v9_common_StoreSalesThirdPartyMetadata_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v9_common_StoreSalesThirdPartyMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_common_StoreSalesThirdPartyMetadata_descriptor,
        new java.lang.String[] { "AdvertiserUploadDateTime", "ValidTransactionFraction", "PartnerMatchFraction", "PartnerUploadFraction", "BridgeMapVersionId", "PartnerId", "AdvertiserUploadDateTime", "ValidTransactionFraction", "PartnerMatchFraction", "PartnerUploadFraction", "BridgeMapVersionId", "PartnerId", });
    com.google.ads.googleads.v9.enums.UserIdentifierSourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}