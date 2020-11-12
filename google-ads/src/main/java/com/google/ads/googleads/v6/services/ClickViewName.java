/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.ads.googleads.v6.services;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED DOCUMENTATION AND CLASS
 */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ClickViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/clickViews/{date}~{gclid}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String date;
  private final String gclid;

  public String getCustomerId() {
    return customerId;
  }

  public String getDate() {
    return date;
  }

  public String getGclid() {
    return gclid;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ClickViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    date = Preconditions.checkNotNull(builder.getDate());
    gclid = Preconditions.checkNotNull(builder.getGclid());
  }

  public static ClickViewName of(String customerId, String date, String gclid) {
    return newBuilder()
      .setCustomerId(customerId)
      .setDate(date)
      .setGclid(gclid)
      .build();
  }

  public static String format(String customerId, String date, String gclid) {
    return newBuilder()
      .setCustomerId(customerId)
      .setDate(date)
      .setGclid(gclid)
      .build()
      .toString();
  }

  public static ClickViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ClickViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("date"), matchMap.get("gclid"));
  }

  public static List<ClickViewName> parseList(List<String> formattedStrings) {
    List<ClickViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ClickViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (ClickViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customerId", customerId);
          fieldMapBuilder.put("date", date);
          fieldMapBuilder.put("gclid", gclid);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "date", date, "gclid", gclid);
  }

  /** Builder for ClickViewName. */
  public static class Builder {

    private String customerId;
    private String date;
    private String gclid;

    public String getCustomerId() {
      return customerId;
    }

    public String getDate() {
      return date;
    }

    public String getGclid() {
      return gclid;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setDate(String date) {
      this.date = date;
      return this;
    }

    public Builder setGclid(String gclid) {
      this.gclid = gclid;
      return this;
    }

    private Builder() {
    }

    private Builder(ClickViewName clickViewName) {
      customerId = clickViewName.customerId;
      date = clickViewName.date;
      gclid = clickViewName.gclid;
    }

    public ClickViewName build() {
      return new ClickViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClickViewName) {
      ClickViewName that = (ClickViewName) o;
      return (this.customerId.equals(that.customerId))
          && (this.date.equals(that.date))
          && (this.gclid.equals(that.gclid));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= date.hashCode();
    h *= 1000003;
    h ^= gclid.hashCode();
    return h;
  }
}
