// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v4.services;

public interface GenerateKeywordIdeaResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.services.GenerateKeywordIdeaResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Results of generating keyword ideas.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.services.GenerateKeywordIdeaResult results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v4.services.GenerateKeywordIdeaResult> 
      getResultsList();
  /**
   * <pre>
   * Results of generating keyword ideas.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.services.GenerateKeywordIdeaResult results = 1;</code>
   */
  com.google.ads.googleads.v4.services.GenerateKeywordIdeaResult getResults(int index);
  /**
   * <pre>
   * Results of generating keyword ideas.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.services.GenerateKeywordIdeaResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * Results of generating keyword ideas.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.services.GenerateKeywordIdeaResult results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v4.services.GenerateKeywordIdeaResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * Results of generating keyword ideas.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.services.GenerateKeywordIdeaResult results = 1;</code>
   */
  com.google.ads.googleads.v4.services.GenerateKeywordIdeaResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request.
   * `next_page_token` is not returned for the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request.
   * `next_page_token` is not returned for the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Total number of results available.
   * </pre>
   *
   * <code>int64 total_size = 3;</code>
   * @return The totalSize.
   */
  long getTotalSize();
}
