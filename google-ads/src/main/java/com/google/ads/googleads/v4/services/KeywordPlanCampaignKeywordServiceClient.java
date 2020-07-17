/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v4.services;

import com.google.ads.googleads.v4.resources.KeywordPlanCampaignKeyword;
import com.google.ads.googleads.v4.services.stub.KeywordPlanCampaignKeywordServiceStub;
import com.google.ads.googleads.v4.services.stub.KeywordPlanCampaignKeywordServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage Keyword Plan campaign keywords. KeywordPlanCampaign is
 * required to add the campaign keywords. Only negative keywords are supported. A maximum of 1000
 * negative keywords are allowed per plan. This includes both campaign negative keywords and ad
 * group negative keywords.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient = KeywordPlanCampaignKeywordServiceClient.create()) {
 *   String formattedResourceName = KeywordPlanCampaignKeywordServiceClient.formatKeywordPlanCampaignKeywordName("[CUSTOMER]", "[KEYWORD_PLAN_CAMPAIGN_KEYWORD]");
 *   KeywordPlanCampaignKeyword response = keywordPlanCampaignKeywordServiceClient.getKeywordPlanCampaignKeyword(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the keywordPlanCampaignKeywordServiceClient object to
 * clean up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * KeywordPlanCampaignKeywordServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * KeywordPlanCampaignKeywordServiceSettings keywordPlanCampaignKeywordServiceSettings =
 *     KeywordPlanCampaignKeywordServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient =
 *     KeywordPlanCampaignKeywordServiceClient.create(keywordPlanCampaignKeywordServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * KeywordPlanCampaignKeywordServiceSettings keywordPlanCampaignKeywordServiceSettings =
 *     KeywordPlanCampaignKeywordServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient =
 *     KeywordPlanCampaignKeywordServiceClient.create(keywordPlanCampaignKeywordServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class KeywordPlanCampaignKeywordServiceClient implements BackgroundResource {
  private final KeywordPlanCampaignKeywordServiceSettings settings;
  private final KeywordPlanCampaignKeywordServiceStub stub;

  private static final PathTemplate KEYWORD_PLAN_CAMPAIGN_KEYWORD_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/keywordPlanCampaignKeywords/{keyword_plan_campaign_keyword}");

  /**
   * Formats a string containing the fully-qualified path to represent a
   * keyword_plan_campaign_keyword resource.
   *
   * @deprecated Use the {@link KeywordPlanCampaignKeywordName} class instead.
   */
  @Deprecated
  public static final String formatKeywordPlanCampaignKeywordName(
      String customer, String keywordPlanCampaignKeyword) {
    return KEYWORD_PLAN_CAMPAIGN_KEYWORD_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "keyword_plan_campaign_keyword", keywordPlanCampaignKeyword);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a
   * keyword_plan_campaign_keyword resource.
   *
   * @deprecated Use the {@link KeywordPlanCampaignKeywordName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromKeywordPlanCampaignKeywordName(
      String keywordPlanCampaignKeywordName) {
    return KEYWORD_PLAN_CAMPAIGN_KEYWORD_PATH_TEMPLATE
        .parse(keywordPlanCampaignKeywordName)
        .get("customer");
  }

  /**
   * Parses the keyword_plan_campaign_keyword from the given fully-qualified path which represents a
   * keyword_plan_campaign_keyword resource.
   *
   * @deprecated Use the {@link KeywordPlanCampaignKeywordName} class instead.
   */
  @Deprecated
  public static final String parseKeywordPlanCampaignKeywordFromKeywordPlanCampaignKeywordName(
      String keywordPlanCampaignKeywordName) {
    return KEYWORD_PLAN_CAMPAIGN_KEYWORD_PATH_TEMPLATE
        .parse(keywordPlanCampaignKeywordName)
        .get("keyword_plan_campaign_keyword");
  }

  /** Constructs an instance of KeywordPlanCampaignKeywordServiceClient with default settings. */
  public static final KeywordPlanCampaignKeywordServiceClient create() throws IOException {
    return create(KeywordPlanCampaignKeywordServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanCampaignKeywordServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final KeywordPlanCampaignKeywordServiceClient create(
      KeywordPlanCampaignKeywordServiceSettings settings) throws IOException {
    return new KeywordPlanCampaignKeywordServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanCampaignKeywordServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer to use
   * KeywordPlanCampaignKeywordServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final KeywordPlanCampaignKeywordServiceClient create(
      KeywordPlanCampaignKeywordServiceStub stub) {
    return new KeywordPlanCampaignKeywordServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanCampaignKeywordServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected KeywordPlanCampaignKeywordServiceClient(
      KeywordPlanCampaignKeywordServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((KeywordPlanCampaignKeywordServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordPlanCampaignKeywordServiceClient(KeywordPlanCampaignKeywordServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanCampaignKeywordServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanCampaignKeywordServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested plan in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient = KeywordPlanCampaignKeywordServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanCampaignKeywordServiceClient.formatKeywordPlanCampaignKeywordName("[CUSTOMER]", "[KEYWORD_PLAN_CAMPAIGN_KEYWORD]");
   *   KeywordPlanCampaignKeyword response = keywordPlanCampaignKeywordServiceClient.getKeywordPlanCampaignKeyword(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the plan to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanCampaignKeyword getKeywordPlanCampaignKeyword(String resourceName) {
    KEYWORD_PLAN_CAMPAIGN_KEYWORD_PATH_TEMPLATE.validate(
        resourceName, "getKeywordPlanCampaignKeyword");
    GetKeywordPlanCampaignKeywordRequest request =
        GetKeywordPlanCampaignKeywordRequest.newBuilder().setResourceName(resourceName).build();
    return getKeywordPlanCampaignKeyword(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested plan in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient = KeywordPlanCampaignKeywordServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanCampaignKeywordServiceClient.formatKeywordPlanCampaignKeywordName("[CUSTOMER]", "[KEYWORD_PLAN_CAMPAIGN_KEYWORD]");
   *   GetKeywordPlanCampaignKeywordRequest request = GetKeywordPlanCampaignKeywordRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   KeywordPlanCampaignKeyword response = keywordPlanCampaignKeywordServiceClient.getKeywordPlanCampaignKeyword(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanCampaignKeyword getKeywordPlanCampaignKeyword(
      GetKeywordPlanCampaignKeywordRequest request) {
    return getKeywordPlanCampaignKeywordCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested plan in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient = KeywordPlanCampaignKeywordServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanCampaignKeywordServiceClient.formatKeywordPlanCampaignKeywordName("[CUSTOMER]", "[KEYWORD_PLAN_CAMPAIGN_KEYWORD]");
   *   GetKeywordPlanCampaignKeywordRequest request = GetKeywordPlanCampaignKeywordRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;KeywordPlanCampaignKeyword&gt; future = keywordPlanCampaignKeywordServiceClient.getKeywordPlanCampaignKeywordCallable().futureCall(request);
   *   // Do something
   *   KeywordPlanCampaignKeyword response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetKeywordPlanCampaignKeywordRequest, KeywordPlanCampaignKeyword>
      getKeywordPlanCampaignKeywordCallable() {
    return stub.getKeywordPlanCampaignKeywordCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan campaign keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient = KeywordPlanCampaignKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanCampaignKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateKeywordPlanCampaignKeywordsResponse response = keywordPlanCampaignKeywordServiceClient.mutateKeywordPlanCampaignKeywords(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose campaign keywords are being modified.
   * @param operations Required. The list of operations to perform on individual Keyword Plan
   *     campaign keywords.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanCampaignKeywordsResponse mutateKeywordPlanCampaignKeywords(
      String customerId,
      List<KeywordPlanCampaignKeywordOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {
    MutateKeywordPlanCampaignKeywordsRequest request =
        MutateKeywordPlanCampaignKeywordsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateKeywordPlanCampaignKeywords(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan campaign keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient = KeywordPlanCampaignKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanCampaignKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanCampaignKeywordsResponse response = keywordPlanCampaignKeywordServiceClient.mutateKeywordPlanCampaignKeywords(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose campaign keywords are being modified.
   * @param operations Required. The list of operations to perform on individual Keyword Plan
   *     campaign keywords.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanCampaignKeywordsResponse mutateKeywordPlanCampaignKeywords(
      String customerId, List<KeywordPlanCampaignKeywordOperation> operations) {
    MutateKeywordPlanCampaignKeywordsRequest request =
        MutateKeywordPlanCampaignKeywordsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateKeywordPlanCampaignKeywords(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan campaign keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient = KeywordPlanCampaignKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanCampaignKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanCampaignKeywordsRequest request = MutateKeywordPlanCampaignKeywordsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateKeywordPlanCampaignKeywordsResponse response = keywordPlanCampaignKeywordServiceClient.mutateKeywordPlanCampaignKeywords(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanCampaignKeywordsResponse mutateKeywordPlanCampaignKeywords(
      MutateKeywordPlanCampaignKeywordsRequest request) {
    return mutateKeywordPlanCampaignKeywordsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan campaign keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient = KeywordPlanCampaignKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanCampaignKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanCampaignKeywordsRequest request = MutateKeywordPlanCampaignKeywordsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateKeywordPlanCampaignKeywordsResponse&gt; future = keywordPlanCampaignKeywordServiceClient.mutateKeywordPlanCampaignKeywordsCallable().futureCall(request);
   *   // Do something
   *   MutateKeywordPlanCampaignKeywordsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          MutateKeywordPlanCampaignKeywordsRequest, MutateKeywordPlanCampaignKeywordsResponse>
      mutateKeywordPlanCampaignKeywordsCallable() {
    return stub.mutateKeywordPlanCampaignKeywordsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
