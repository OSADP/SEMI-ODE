package com.bah.ode.model;

import com.bah.ode.util.JsonUtils;

public class DdsQryRequest extends DdsRequest {
   private static final long serialVersionUID = 2425686751232706772L;

   private String systemQueryName;
   private String startDate;
   private String startDateOperator = "GTE";
   private String endDate;
   private String endDateOperator = "LTE";
   private String orderByField = "createdAt";
   private int orderByOrder = 1;
   private int skip = 0;
   private int limit = 0;
   
   public String getSystemQueryName() {
      return systemQueryName;
   }
   public DdsQryRequest setSystemQueryName(String systemQueryName) {
      this.systemQueryName = systemQueryName;
      return this;
   }
   public String getStartDate() {
      return startDate;
   }
   public DdsQryRequest setStartDate(String startDate) {
      this.startDate = startDate;
      return this;
   }
   public String getStartDateOperator() {
      return startDateOperator;
   }
   public DdsQryRequest setStartDateOperator(String startDateOperator) {
      this.startDateOperator = startDateOperator;
      return this;
   }
   public String getEndDate() {
      return endDate;
   }
   public DdsQryRequest setEndDate(String endDate) {
      this.endDate = endDate;
      return this;
   }
   public String getEndDateOperator() {
      return endDateOperator;
   }
   public DdsQryRequest setEndDateOperator(String endDateOperator) {
      this.endDateOperator = endDateOperator;
      return this;
   }
   public String getOrderByField() {
      return orderByField;
   }
   public DdsQryRequest setOrderByField(String orderByField) {
      this.orderByField = orderByField;
      return this;
   }
   public int getOrderByOrder() {
      return orderByOrder;
   }
   public DdsQryRequest setOrderByOrder(int orderByOrder) {
      this.orderByOrder = orderByOrder;
      return this;
   }
   public int getSkip() {
      return skip;
   }
   public DdsQryRequest setSkip(int skip) {
      this.skip = skip;
      return this;
   }
   public int getLimit() {
      return limit;
   }
   public DdsQryRequest setLimit(int limit) {
      this.limit = limit;
      return this;
   }
   
   @Override
   public String toString() {
      return "QUERY:" + JsonUtils.toJson(this);
   }
   
}
