// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/segments.proto

package com.google.ads.googleads.v10.common;

public final class SegmentsProto {
  private SegmentsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_Segments_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_Segments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_Keyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_Keyword_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_BudgetCampaignAssociationStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_BudgetCampaignAssociationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_AssetInteractionTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_AssetInteractionTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_SkAdNetworkSourceApp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_SkAdNetworkSourceApp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/googleads/v10/common/segmen" +
      "ts.proto\022\037google.ads.googleads.v10.commo" +
      "n\032.google/ads/googleads/v10/common/crite" +
      "ria.proto\0328google/ads/googleads/v10/enum" +
      "s/ad_destination_type.proto\0324google/ads/" +
      "googleads/v10/enums/ad_network_type.prot" +
      "o\032Ggoogle/ads/googleads/v10/enums/budget" +
      "_campaign_association_status.proto\032/goog" +
      "le/ads/googleads/v10/enums/click_type.pr" +
      "oto\032?google/ads/googleads/v10/enums/conv" +
      "ersion_action_category.proto\032Fgoogle/ads" +
      "/googleads/v10/enums/conversion_attribut" +
      "ion_event_type.proto\032:google/ads/googlea" +
      "ds/v10/enums/conversion_lag_bucket.proto" +
      "\032Hgoogle/ads/googleads/v10/enums/convers" +
      "ion_or_adjustment_lag_bucket.proto\032Lgoog" +
      "le/ads/googleads/v10/enums/conversion_va" +
      "lue_rule_primary_dimension.proto\0320google" +
      "/ads/googleads/v10/enums/day_of_week.pro" +
      "to\032+google/ads/googleads/v10/enums/devic" +
      "e.proto\032?google/ads/googleads/v10/enums/" +
      "external_conversion_source.proto\032>google" +
      "/ads/googleads/v10/enums/hotel_date_sele" +
      "ction_type.proto\0327google/ads/googleads/v" +
      "10/enums/hotel_price_bucket.proto\0324googl" +
      "e/ads/googleads/v10/enums/hotel_rate_typ" +
      "e.proto\0322google/ads/googleads/v10/enums/" +
      "month_of_year.proto\0325google/ads/googlead" +
      "s/v10/enums/placeholder_type.proto\0324goog" +
      "le/ads/googleads/v10/enums/product_chann" +
      "el.proto\032@google/ads/googleads/v10/enums" +
      "/product_channel_exclusivity.proto\0326goog" +
      "le/ads/googleads/v10/enums/product_condi" +
      "tion.proto\0328google/ads/googleads/v10/enu" +
      "ms/recommendation_type.proto\032Dgoogle/ads" +
      "/googleads/v10/enums/search_engine_resul" +
      "ts_page_type.proto\032;google/ads/googleads" +
      "/v10/enums/search_term_match_type.proto\032" +
      "@google/ads/googleads/v10/enums/sk_ad_ne" +
      "twork_ad_event_type.proto\032Egoogle/ads/go" +
      "ogleads/v10/enums/sk_ad_network_attribut" +
      "ion_credit.proto\032<google/ads/googleads/v" +
      "10/enums/sk_ad_network_user_type.proto\032)" +
      "google/ads/googleads/v10/enums/slot.prot" +
      "o\032\031google/api/resource.proto\"\2453\n\010Segment" +
      "s\022e\n\023ad_destination_type\030\210\001 \001(\0162G.google" +
      ".ads.googleads.v10.enums.AdDestinationTy" +
      "peEnum.AdDestinationType\022X\n\017ad_network_t" +
      "ype\030\003 \001(\0162?.google.ads.googleads.v10.enu" +
      "ms.AdNetworkTypeEnum.AdNetworkType\022m\n\"bu" +
      "dget_campaign_association_status\030\206\001 \001(\0132" +
      "@.google.ads.googleads.v10.common.Budget" +
      "CampaignAssociationStatus\022K\n\nclick_type\030" +
      "\032 \001(\01627.google.ads.googleads.v10.enums.C" +
      "lickTypeEnum.ClickType\022N\n\021conversion_act" +
      "ion\030q \001(\tB.\372A+\n)googleads.googleapis.com" +
      "/ConversionActionH\000\210\001\001\022y\n\032conversion_act" +
      "ion_category\0305 \001(\0162U.google.ads.googlead" +
      "s.v10.enums.ConversionActionCategoryEnum" +
      ".ConversionActionCategory\022#\n\026conversion_" +
      "action_name\030r \001(\tH\001\210\001\001\022\"\n\025conversion_adj" +
      "ustment\030s \001(\010H\002\210\001\001\022\214\001\n!conversion_attrib" +
      "ution_event_type\030\002 \001(\0162a.google.ads.goog" +
      "leads.v10.enums.ConversionAttributionEve" +
      "ntTypeEnum.ConversionAttributionEventTyp" +
      "e\022j\n\025conversion_lag_bucket\0302 \001(\0162K.googl" +
      "e.ads.googleads.v10.enums.ConversionLagB" +
      "ucketEnum.ConversionLagBucket\022\220\001\n#conver" +
      "sion_or_adjustment_lag_bucket\0303 \001(\0162c.go" +
      "ogle.ads.googleads.v10.enums.ConversionO" +
      "rAdjustmentLagBucketEnum.ConversionOrAdj" +
      "ustmentLagBucket\022\021\n\004date\030O \001(\tH\003\210\001\001\022L\n\013d" +
      "ay_of_week\030\005 \001(\01627.google.ads.googleads." +
      "v10.enums.DayOfWeekEnum.DayOfWeek\022A\n\006dev" +
      "ice\030\001 \001(\01621.google.ads.googleads.v10.enu" +
      "ms.DeviceEnum.Device\022y\n\032external_convers" +
      "ion_source\0307 \001(\0162U.google.ads.googleads." +
      "v10.enums.ExternalConversionSourceEnum.E" +
      "xternalConversionSource\022\037\n\022geo_target_ai" +
      "rport\030t \001(\tH\004\210\001\001\022\036\n\021geo_target_canton\030u " +
      "\001(\tH\005\210\001\001\022\034\n\017geo_target_city\030v \001(\tH\006\210\001\001\022\037" +
      "\n\022geo_target_country\030w \001(\tH\007\210\001\001\022\036\n\021geo_t" +
      "arget_county\030x \001(\tH\010\210\001\001\022 \n\023geo_target_di" +
      "strict\030y \001(\tH\t\210\001\001\022\035\n\020geo_target_metro\030z " +
      "\001(\tH\n\210\001\001\022.\n!geo_target_most_specific_loc" +
      "ation\030{ \001(\tH\013\210\001\001\022#\n\026geo_target_postal_co" +
      "de\030| \001(\tH\014\210\001\001\022 \n\023geo_target_province\030} \001" +
      "(\tH\r\210\001\001\022\036\n\021geo_target_region\030~ \001(\tH\016\210\001\001\022" +
      "\035\n\020geo_target_state\030\177 \001(\tH\017\210\001\001\022\'\n\031hotel_" +
      "booking_window_days\030\207\001 \001(\003H\020\210\001\001\022\034\n\017hotel" +
      "_center_id\030P \001(\003H\021\210\001\001\022 \n\023hotel_check_in_" +
      "date\030Q \001(\tH\022\210\001\001\022[\n\032hotel_check_in_day_of" +
      "_week\030\t \001(\01627.google.ads.googleads.v10.e" +
      "nums.DayOfWeekEnum.DayOfWeek\022\027\n\nhotel_ci" +
      "ty\030R \001(\tH\023\210\001\001\022\030\n\013hotel_class\030S \001(\005H\024\210\001\001\022" +
      "\032\n\rhotel_country\030T \001(\tH\025\210\001\001\022t\n\031hotel_dat" +
      "e_selection_type\030\r \001(\0162Q.google.ads.goog" +
      "leads.v10.enums.HotelDateSelectionTypeEn" +
      "um.HotelDateSelectionType\022!\n\024hotel_lengt" +
      "h_of_stay\030U \001(\005H\026\210\001\001\022\037\n\022hotel_rate_rule_" +
      "id\030V \001(\tH\027\210\001\001\022X\n\017hotel_rate_type\030J \001(\0162?" +
      ".google.ads.googleads.v10.enums.HotelRat" +
      "eTypeEnum.HotelRateType\022a\n\022hotel_price_b" +
      "ucket\030N \001(\0162E.google.ads.googleads.v10.e" +
      "nums.HotelPriceBucketEnum.HotelPriceBuck" +
      "et\022\030\n\013hotel_state\030W \001(\tH\030\210\001\001\022\021\n\004hour\030X \001" +
      "(\005H\031\210\001\001\022*\n\035interaction_on_this_extension" +
      "\030Y \001(\010H\032\210\001\001\0229\n\007keyword\030= \001(\0132(.google.ad" +
      "s.googleads.v10.common.Keyword\022\022\n\005month\030" +
      "Z \001(\tH\033\210\001\001\022R\n\rmonth_of_year\030\022 \001(\0162;.goog" +
      "le.ads.googleads.v10.enums.MonthOfYearEn" +
      "um.MonthOfYear\022\035\n\020partner_hotel_id\030[ \001(\t" +
      "H\034\210\001\001\022]\n\020placeholder_type\030\024 \001(\0162C.google" +
      ".ads.googleads.v10.enums.PlaceholderType" +
      "Enum.PlaceholderType\022#\n\025product_aggregat" +
      "or_id\030\204\001 \001(\003H\035\210\001\001\022,\n\037product_bidding_cat" +
      "egory_level1\030\\ \001(\tH\036\210\001\001\022,\n\037product_biddi" +
      "ng_category_level2\030] \001(\tH\037\210\001\001\022,\n\037product" +
      "_bidding_category_level3\030^ \001(\tH \210\001\001\022,\n\037p" +
      "roduct_bidding_category_level4\030_ \001(\tH!\210\001" +
      "\001\022,\n\037product_bidding_category_level5\030` \001" +
      "(\tH\"\210\001\001\022\032\n\rproduct_brand\030a \001(\tH#\210\001\001\022Z\n\017p" +
      "roduct_channel\030\036 \001(\0162A.google.ads.google" +
      "ads.v10.enums.ProductChannelEnum.Product" +
      "Channel\022|\n\033product_channel_exclusivity\030\037" +
      " \001(\0162W.google.ads.googleads.v10.enums.Pr" +
      "oductChannelExclusivityEnum.ProductChann" +
      "elExclusivity\022`\n\021product_condition\030  \001(\016" +
      "2E.google.ads.googleads.v10.enums.Produc" +
      "tConditionEnum.ProductCondition\022\034\n\017produ" +
      "ct_country\030b \001(\tH$\210\001\001\022&\n\031product_custom_" +
      "attribute0\030c \001(\tH%\210\001\001\022&\n\031product_custom_" +
      "attribute1\030d \001(\tH&\210\001\001\022&\n\031product_custom_" +
      "attribute2\030e \001(\tH\'\210\001\001\022&\n\031product_custom_" +
      "attribute3\030f \001(\tH(\210\001\001\022&\n\031product_custom_" +
      "attribute4\030g \001(\tH)\210\001\001\022\034\n\017product_item_id" +
      "\030h \001(\tH*\210\001\001\022\035\n\020product_language\030i \001(\tH+\210" +
      "\001\001\022!\n\023product_merchant_id\030\205\001 \001(\003H,\210\001\001\022\035\n" +
      "\020product_store_id\030j \001(\tH-\210\001\001\022\032\n\rproduct_" +
      "title\030k \001(\tH.\210\001\001\022\034\n\017product_type_l1\030l \001(" +
      "\tH/\210\001\001\022\034\n\017product_type_l2\030m \001(\tH0\210\001\001\022\034\n\017" +
      "product_type_l3\030n \001(\tH1\210\001\001\022\034\n\017product_ty" +
      "pe_l4\030o \001(\tH2\210\001\001\022\034\n\017product_type_l5\030p \001(" +
      "\tH3\210\001\001\022\025\n\007quarter\030\200\001 \001(\tH4\210\001\001\022g\n\023recomme" +
      "ndation_type\030\214\001 \001(\0162I.google.ads.googlea" +
      "ds.v10.enums.RecommendationTypeEnum.Reco" +
      "mmendationType\022\204\001\n\037search_engine_results" +
      "_page_type\030F \001(\0162[.google.ads.googleads." +
      "v10.enums.SearchEngineResultsPageTypeEnu" +
      "m.SearchEngineResultsPageType\022k\n\026search_" +
      "term_match_type\030\026 \001(\0162K.google.ads.googl" +
      "eads.v10.enums.SearchTermMatchTypeEnum.S" +
      "earchTermMatchType\022;\n\004slot\030\027 \001(\0162-.googl" +
      "e.ads.googleads.v10.enums.SlotEnum.Slot\022" +
      "\235\001\n\'conversion_value_rule_primary_dimens" +
      "ion\030\212\001 \001(\0162k.google.ads.googleads.v10.en" +
      "ums.ConversionValueRulePrimaryDimensionE" +
      "num.ConversionValueRulePrimaryDimension\022" +
      "\025\n\007webpage\030\201\001 \001(\tH5\210\001\001\022\022\n\004week\030\202\001 \001(\tH6\210" +
      "\001\001\022\022\n\004year\030\203\001 \001(\005H7\210\001\001\022,\n\036sk_ad_network_" +
      "conversion_value\030\211\001 \001(\003H8\210\001\001\022m\n\027sk_ad_ne" +
      "twork_user_type\030\215\001 \001(\0162K.google.ads.goog" +
      "leads.v10.enums.SkAdNetworkUserTypeEnum." +
      "SkAdNetworkUserType\022w\n\033sk_ad_network_ad_" +
      "event_type\030\216\001 \001(\0162Q.google.ads.googleads" +
      ".v10.enums.SkAdNetworkAdEventTypeEnum.Sk" +
      "AdNetworkAdEventType\022]\n\030sk_ad_network_so" +
      "urce_app\030\217\001 \001(\01325.google.ads.googleads.v" +
      "10.common.SkAdNetworkSourceAppH9\210\001\001\022\210\001\n " +
      "sk_ad_network_attribution_credit\030\220\001 \001(\0162" +
      "].google.ads.googleads.v10.enums.SkAdNet" +
      "workAttributionCreditEnum.SkAdNetworkAtt" +
      "ributionCredit\022_\n\030asset_interaction_targ" +
      "et\030\213\001 \001(\01327.google.ads.googleads.v10.com" +
      "mon.AssetInteractionTargetH:\210\001\001B\024\n\022_conv" +
      "ersion_actionB\031\n\027_conversion_action_name" +
      "B\030\n\026_conversion_adjustmentB\007\n\005_dateB\025\n\023_" +
      "geo_target_airportB\024\n\022_geo_target_canton" +
      "B\022\n\020_geo_target_cityB\025\n\023_geo_target_coun" +
      "tryB\024\n\022_geo_target_countyB\026\n\024_geo_target" +
      "_districtB\023\n\021_geo_target_metroB$\n\"_geo_t" +
      "arget_most_specific_locationB\031\n\027_geo_tar" +
      "get_postal_codeB\026\n\024_geo_target_provinceB" +
      "\024\n\022_geo_target_regionB\023\n\021_geo_target_sta" +
      "teB\034\n\032_hotel_booking_window_daysB\022\n\020_hot" +
      "el_center_idB\026\n\024_hotel_check_in_dateB\r\n\013" +
      "_hotel_cityB\016\n\014_hotel_classB\020\n\016_hotel_co" +
      "untryB\027\n\025_hotel_length_of_stayB\025\n\023_hotel" +
      "_rate_rule_idB\016\n\014_hotel_stateB\007\n\005_hourB " +
      "\n\036_interaction_on_this_extensionB\010\n\006_mon" +
      "thB\023\n\021_partner_hotel_idB\030\n\026_product_aggr" +
      "egator_idB\"\n _product_bidding_category_l" +
      "evel1B\"\n _product_bidding_category_level" +
      "2B\"\n _product_bidding_category_level3B\"\n" +
      " _product_bidding_category_level4B\"\n _pr" +
      "oduct_bidding_category_level5B\020\n\016_produc" +
      "t_brandB\022\n\020_product_countryB\034\n\032_product_" +
      "custom_attribute0B\034\n\032_product_custom_att" +
      "ribute1B\034\n\032_product_custom_attribute2B\034\n" +
      "\032_product_custom_attribute3B\034\n\032_product_" +
      "custom_attribute4B\022\n\020_product_item_idB\023\n" +
      "\021_product_languageB\026\n\024_product_merchant_" +
      "idB\023\n\021_product_store_idB\020\n\016_product_titl" +
      "eB\022\n\020_product_type_l1B\022\n\020_product_type_l" +
      "2B\022\n\020_product_type_l3B\022\n\020_product_type_l" +
      "4B\022\n\020_product_type_l5B\n\n\010_quarterB\n\n\010_we" +
      "bpageB\007\n\005_weekB\007\n\005_yearB!\n\037_sk_ad_networ" +
      "k_conversion_valueB\033\n\031_sk_ad_network_sou" +
      "rce_appB\033\n\031_asset_interaction_target\"}\n\007" +
      "Keyword\022\037\n\022ad_group_criterion\030\003 \001(\tH\000\210\001\001" +
      "\022:\n\004info\030\002 \001(\0132,.google.ads.googleads.v1" +
      "0.common.KeywordInfoB\025\n\023_ad_group_criter" +
      "ion\"\272\001\n\037BudgetCampaignAssociationStatus\022" +
      "\025\n\010campaign\030\001 \001(\tH\000\210\001\001\022s\n\006status\030\002 \001(\0162c" +
      ".google.ads.googleads.v10.enums.BudgetCa" +
      "mpaignAssociationStatusEnum.BudgetCampai" +
      "gnAssociationStatusB\013\n\t_campaign\"J\n\026Asse" +
      "tInteractionTarget\022\r\n\005asset\030\001 \001(\t\022!\n\031int" +
      "eraction_on_this_asset\030\002 \001(\010\"`\n\024SkAdNetw" +
      "orkSourceApp\022(\n\033sk_ad_network_source_app" +
      "_id\030\001 \001(\tH\000\210\001\001B\036\n\034_sk_ad_network_source_" +
      "app_idB\355\001\n#com.google.ads.googleads.v10." +
      "commonB\rSegmentsProtoP\001ZEgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v10" +
      "/common;common\242\002\003GAA\252\002\037Google.Ads.Google" +
      "Ads.V10.Common\312\002\037Google\\Ads\\GoogleAds\\V1" +
      "0\\Common\352\002#Google::Ads::GoogleAds::V10::" +
      "Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AdDestinationTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AdNetworkTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.BudgetCampaignAssociationStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ClickTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ConversionAttributionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ConversionLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ConversionValueRulePrimaryDimensionProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.DayOfWeekProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ExternalConversionSourceProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.HotelDateSelectionTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.HotelPriceBucketProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.HotelRateTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.MonthOfYearProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ProductChannelProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ProductChannelExclusivityProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ProductConditionProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.RecommendationTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.SearchEngineResultsPageTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.SearchTermMatchTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.SkAdNetworkAdEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.SkAdNetworkAttributionCreditProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.SkAdNetworkUserTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.SlotProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_common_Segments_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_common_Segments_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_Segments_descriptor,
        new java.lang.String[] { "AdDestinationType", "AdNetworkType", "BudgetCampaignAssociationStatus", "ClickType", "ConversionAction", "ConversionActionCategory", "ConversionActionName", "ConversionAdjustment", "ConversionAttributionEventType", "ConversionLagBucket", "ConversionOrAdjustmentLagBucket", "Date", "DayOfWeek", "Device", "ExternalConversionSource", "GeoTargetAirport", "GeoTargetCanton", "GeoTargetCity", "GeoTargetCountry", "GeoTargetCounty", "GeoTargetDistrict", "GeoTargetMetro", "GeoTargetMostSpecificLocation", "GeoTargetPostalCode", "GeoTargetProvince", "GeoTargetRegion", "GeoTargetState", "HotelBookingWindowDays", "HotelCenterId", "HotelCheckInDate", "HotelCheckInDayOfWeek", "HotelCity", "HotelClass", "HotelCountry", "HotelDateSelectionType", "HotelLengthOfStay", "HotelRateRuleId", "HotelRateType", "HotelPriceBucket", "HotelState", "Hour", "InteractionOnThisExtension", "Keyword", "Month", "MonthOfYear", "PartnerHotelId", "PlaceholderType", "ProductAggregatorId", "ProductBiddingCategoryLevel1", "ProductBiddingCategoryLevel2", "ProductBiddingCategoryLevel3", "ProductBiddingCategoryLevel4", "ProductBiddingCategoryLevel5", "ProductBrand", "ProductChannel", "ProductChannelExclusivity", "ProductCondition", "ProductCountry", "ProductCustomAttribute0", "ProductCustomAttribute1", "ProductCustomAttribute2", "ProductCustomAttribute3", "ProductCustomAttribute4", "ProductItemId", "ProductLanguage", "ProductMerchantId", "ProductStoreId", "ProductTitle", "ProductTypeL1", "ProductTypeL2", "ProductTypeL3", "ProductTypeL4", "ProductTypeL5", "Quarter", "RecommendationType", "SearchEngineResultsPageType", "SearchTermMatchType", "Slot", "ConversionValueRulePrimaryDimension", "Webpage", "Week", "Year", "SkAdNetworkConversionValue", "SkAdNetworkUserType", "SkAdNetworkAdEventType", "SkAdNetworkSourceApp", "SkAdNetworkAttributionCredit", "AssetInteractionTarget", "ConversionAction", "ConversionActionName", "ConversionAdjustment", "Date", "GeoTargetAirport", "GeoTargetCanton", "GeoTargetCity", "GeoTargetCountry", "GeoTargetCounty", "GeoTargetDistrict", "GeoTargetMetro", "GeoTargetMostSpecificLocation", "GeoTargetPostalCode", "GeoTargetProvince", "GeoTargetRegion", "GeoTargetState", "HotelBookingWindowDays", "HotelCenterId", "HotelCheckInDate", "HotelCity", "HotelClass", "HotelCountry", "HotelLengthOfStay", "HotelRateRuleId", "HotelState", "Hour", "InteractionOnThisExtension", "Month", "PartnerHotelId", "ProductAggregatorId", "ProductBiddingCategoryLevel1", "ProductBiddingCategoryLevel2", "ProductBiddingCategoryLevel3", "ProductBiddingCategoryLevel4", "ProductBiddingCategoryLevel5", "ProductBrand", "ProductCountry", "ProductCustomAttribute0", "ProductCustomAttribute1", "ProductCustomAttribute2", "ProductCustomAttribute3", "ProductCustomAttribute4", "ProductItemId", "ProductLanguage", "ProductMerchantId", "ProductStoreId", "ProductTitle", "ProductTypeL1", "ProductTypeL2", "ProductTypeL3", "ProductTypeL4", "ProductTypeL5", "Quarter", "Webpage", "Week", "Year", "SkAdNetworkConversionValue", "SkAdNetworkSourceApp", "AssetInteractionTarget", });
    internal_static_google_ads_googleads_v10_common_Keyword_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_common_Keyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_Keyword_descriptor,
        new java.lang.String[] { "AdGroupCriterion", "Info", "AdGroupCriterion", });
    internal_static_google_ads_googleads_v10_common_BudgetCampaignAssociationStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_common_BudgetCampaignAssociationStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_BudgetCampaignAssociationStatus_descriptor,
        new java.lang.String[] { "Campaign", "Status", "Campaign", });
    internal_static_google_ads_googleads_v10_common_AssetInteractionTarget_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_common_AssetInteractionTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_AssetInteractionTarget_descriptor,
        new java.lang.String[] { "Asset", "InteractionOnThisAsset", });
    internal_static_google_ads_googleads_v10_common_SkAdNetworkSourceApp_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v10_common_SkAdNetworkSourceApp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_SkAdNetworkSourceApp_descriptor,
        new java.lang.String[] { "SkAdNetworkSourceAppId", "SkAdNetworkSourceAppId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AdDestinationTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AdNetworkTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.BudgetCampaignAssociationStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ClickTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ConversionAttributionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ConversionLagBucketProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ConversionValueRulePrimaryDimensionProto.getDescriptor();
    com.google.ads.googleads.v10.enums.DayOfWeekProto.getDescriptor();
    com.google.ads.googleads.v10.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ExternalConversionSourceProto.getDescriptor();
    com.google.ads.googleads.v10.enums.HotelDateSelectionTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.HotelPriceBucketProto.getDescriptor();
    com.google.ads.googleads.v10.enums.HotelRateTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.MonthOfYearProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ProductChannelProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ProductChannelExclusivityProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ProductConditionProto.getDescriptor();
    com.google.ads.googleads.v10.enums.RecommendationTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.SearchEngineResultsPageTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.SearchTermMatchTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.SkAdNetworkAdEventTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.SkAdNetworkAttributionCreditProto.getDescriptor();
    com.google.ads.googleads.v10.enums.SkAdNetworkUserTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.SlotProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
