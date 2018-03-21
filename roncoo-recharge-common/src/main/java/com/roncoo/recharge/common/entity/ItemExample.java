/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIsNull() {
            addCriterion("sales_area is null");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIsNotNull() {
            addCriterion("sales_area is not null");
            return (Criteria) this;
        }

        public Criteria andSalesAreaEqualTo(String value) {
            addCriterion("sales_area =", value, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaNotEqualTo(String value) {
            addCriterion("sales_area <>", value, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaGreaterThan(String value) {
            addCriterion("sales_area >", value, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaGreaterThanOrEqualTo(String value) {
            addCriterion("sales_area >=", value, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaLessThan(String value) {
            addCriterion("sales_area <", value, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaLessThanOrEqualTo(String value) {
            addCriterion("sales_area <=", value, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaLike(String value) {
            addCriterion("sales_area like", value, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaNotLike(String value) {
            addCriterion("sales_area not like", value, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaIn(List<String> values) {
            addCriterion("sales_area in", values, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaNotIn(List<String> values) {
            addCriterion("sales_area not in", values, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaBetween(String value1, String value2) {
            addCriterion("sales_area between", value1, value2, "salesArea");
            return (Criteria) this;
        }

        public Criteria andSalesAreaNotBetween(String value1, String value2) {
            addCriterion("sales_area not between", value1, value2, "salesArea");
            return (Criteria) this;
        }

        public Criteria andFacePriceIsNull() {
            addCriterion("face_price is null");
            return (Criteria) this;
        }

        public Criteria andFacePriceIsNotNull() {
            addCriterion("face_price is not null");
            return (Criteria) this;
        }

        public Criteria andFacePriceEqualTo(String value) {
            addCriterion("face_price =", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceNotEqualTo(String value) {
            addCriterion("face_price <>", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceGreaterThan(String value) {
            addCriterion("face_price >", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceGreaterThanOrEqualTo(String value) {
            addCriterion("face_price >=", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceLessThan(String value) {
            addCriterion("face_price <", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceLessThanOrEqualTo(String value) {
            addCriterion("face_price <=", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceLike(String value) {
            addCriterion("face_price like", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceNotLike(String value) {
            addCriterion("face_price not like", value, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceIn(List<String> values) {
            addCriterion("face_price in", values, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceNotIn(List<String> values) {
            addCriterion("face_price not in", values, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceBetween(String value1, String value2) {
            addCriterion("face_price between", value1, value2, "facePrice");
            return (Criteria) this;
        }

        public Criteria andFacePriceNotBetween(String value1, String value2) {
            addCriterion("face_price not between", value1, value2, "facePrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Integer value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Integer value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Integer value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Integer value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Integer value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Integer> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Integer> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Integer value1, Integer value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1IsNull() {
            addCriterion("sales_price1 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1IsNotNull() {
            addCriterion("sales_price1 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1EqualTo(Integer value) {
            addCriterion("sales_price1 =", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1NotEqualTo(Integer value) {
            addCriterion("sales_price1 <>", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1GreaterThan(Integer value) {
            addCriterion("sales_price1 >", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1GreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_price1 >=", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1LessThan(Integer value) {
            addCriterion("sales_price1 <", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1LessThanOrEqualTo(Integer value) {
            addCriterion("sales_price1 <=", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1In(List<Integer> values) {
            addCriterion("sales_price1 in", values, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1NotIn(List<Integer> values) {
            addCriterion("sales_price1 not in", values, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1Between(Integer value1, Integer value2) {
            addCriterion("sales_price1 between", value1, value2, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1NotBetween(Integer value1, Integer value2) {
            addCriterion("sales_price1 not between", value1, value2, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2IsNull() {
            addCriterion("sales_price2 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2IsNotNull() {
            addCriterion("sales_price2 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2EqualTo(Integer value) {
            addCriterion("sales_price2 =", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2NotEqualTo(Integer value) {
            addCriterion("sales_price2 <>", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2GreaterThan(Integer value) {
            addCriterion("sales_price2 >", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2GreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_price2 >=", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2LessThan(Integer value) {
            addCriterion("sales_price2 <", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2LessThanOrEqualTo(Integer value) {
            addCriterion("sales_price2 <=", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2In(List<Integer> values) {
            addCriterion("sales_price2 in", values, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2NotIn(List<Integer> values) {
            addCriterion("sales_price2 not in", values, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2Between(Integer value1, Integer value2) {
            addCriterion("sales_price2 between", value1, value2, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2NotBetween(Integer value1, Integer value2) {
            addCriterion("sales_price2 not between", value1, value2, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3IsNull() {
            addCriterion("sales_price3 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3IsNotNull() {
            addCriterion("sales_price3 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3EqualTo(Integer value) {
            addCriterion("sales_price3 =", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3NotEqualTo(Integer value) {
            addCriterion("sales_price3 <>", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3GreaterThan(Integer value) {
            addCriterion("sales_price3 >", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3GreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_price3 >=", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3LessThan(Integer value) {
            addCriterion("sales_price3 <", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3LessThanOrEqualTo(Integer value) {
            addCriterion("sales_price3 <=", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3In(List<Integer> values) {
            addCriterion("sales_price3 in", values, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3NotIn(List<Integer> values) {
            addCriterion("sales_price3 not in", values, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3Between(Integer value1, Integer value2) {
            addCriterion("sales_price3 between", value1, value2, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3NotBetween(Integer value1, Integer value2) {
            addCriterion("sales_price3 not between", value1, value2, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIsNull() {
            addCriterion("carrier_type is null");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIsNotNull() {
            addCriterion("carrier_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeEqualTo(Integer value) {
            addCriterion("carrier_type =", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotEqualTo(Integer value) {
            addCriterion("carrier_type <>", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeGreaterThan(Integer value) {
            addCriterion("carrier_type >", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("carrier_type >=", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeLessThan(Integer value) {
            addCriterion("carrier_type <", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeLessThanOrEqualTo(Integer value) {
            addCriterion("carrier_type <=", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIn(List<Integer> values) {
            addCriterion("carrier_type in", values, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotIn(List<Integer> values) {
            addCriterion("carrier_type not in", values, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeBetween(Integer value1, Integer value2) {
            addCriterion("carrier_type between", value1, value2, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("carrier_type not between", value1, value2, "carrierType");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIsNull() {
            addCriterion("item_category is null");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIsNotNull() {
            addCriterion("item_category is not null");
            return (Criteria) this;
        }

        public Criteria andItemCategoryEqualTo(Integer value) {
            addCriterion("item_category =", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryNotEqualTo(Integer value) {
            addCriterion("item_category <>", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryGreaterThan(Integer value) {
            addCriterion("item_category >", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_category >=", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryLessThan(Integer value) {
            addCriterion("item_category <", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("item_category <=", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIn(List<Integer> values) {
            addCriterion("item_category in", values, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryNotIn(List<Integer> values) {
            addCriterion("item_category not in", values, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryBetween(Integer value1, Integer value2) {
            addCriterion("item_category between", value1, value2, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("item_category not between", value1, value2, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Integer value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Integer value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Integer value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Integer value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Integer> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Integer> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Integer> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNull() {
            addCriterion("item_no is null");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNotNull() {
            addCriterion("item_no is not null");
            return (Criteria) this;
        }

        public Criteria andItemNoEqualTo(String value) {
            addCriterion("item_no =", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotEqualTo(String value) {
            addCriterion("item_no <>", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThan(String value) {
            addCriterion("item_no >", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("item_no >=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThan(String value) {
            addCriterion("item_no <", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThanOrEqualTo(String value) {
            addCriterion("item_no <=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLike(String value) {
            addCriterion("item_no like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotLike(String value) {
            addCriterion("item_no not like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIn(List<String> values) {
            addCriterion("item_no in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotIn(List<String> values) {
            addCriterion("item_no not in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoBetween(String value1, String value2) {
            addCriterion("item_no between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotBetween(String value1, String value2) {
            addCriterion("item_no not between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("item_desc is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("item_desc is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("item_desc =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("item_desc <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("item_desc >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("item_desc >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("item_desc <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("item_desc <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("item_desc like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("item_desc not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("item_desc in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("item_desc not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("item_desc between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("item_desc not between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andFlowScopeIsNull() {
            addCriterion("flow_scope is null");
            return (Criteria) this;
        }

        public Criteria andFlowScopeIsNotNull() {
            addCriterion("flow_scope is not null");
            return (Criteria) this;
        }

        public Criteria andFlowScopeEqualTo(Integer value) {
            addCriterion("flow_scope =", value, "flowScope");
            return (Criteria) this;
        }

        public Criteria andFlowScopeNotEqualTo(Integer value) {
            addCriterion("flow_scope <>", value, "flowScope");
            return (Criteria) this;
        }

        public Criteria andFlowScopeGreaterThan(Integer value) {
            addCriterion("flow_scope >", value, "flowScope");
            return (Criteria) this;
        }

        public Criteria andFlowScopeGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_scope >=", value, "flowScope");
            return (Criteria) this;
        }

        public Criteria andFlowScopeLessThan(Integer value) {
            addCriterion("flow_scope <", value, "flowScope");
            return (Criteria) this;
        }

        public Criteria andFlowScopeLessThanOrEqualTo(Integer value) {
            addCriterion("flow_scope <=", value, "flowScope");
            return (Criteria) this;
        }

        public Criteria andFlowScopeIn(List<Integer> values) {
            addCriterion("flow_scope in", values, "flowScope");
            return (Criteria) this;
        }

        public Criteria andFlowScopeNotIn(List<Integer> values) {
            addCriterion("flow_scope not in", values, "flowScope");
            return (Criteria) this;
        }

        public Criteria andFlowScopeBetween(Integer value1, Integer value2) {
            addCriterion("flow_scope between", value1, value2, "flowScope");
            return (Criteria) this;
        }

        public Criteria andFlowScopeNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_scope not between", value1, value2, "flowScope");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeIsNull() {
            addCriterion("flow_package_type is null");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeIsNotNull() {
            addCriterion("flow_package_type is not null");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeEqualTo(Integer value) {
            addCriterion("flow_package_type =", value, "flowPackageType");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeNotEqualTo(Integer value) {
            addCriterion("flow_package_type <>", value, "flowPackageType");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeGreaterThan(Integer value) {
            addCriterion("flow_package_type >", value, "flowPackageType");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_package_type >=", value, "flowPackageType");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeLessThan(Integer value) {
            addCriterion("flow_package_type <", value, "flowPackageType");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("flow_package_type <=", value, "flowPackageType");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeIn(List<Integer> values) {
            addCriterion("flow_package_type in", values, "flowPackageType");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeNotIn(List<Integer> values) {
            addCriterion("flow_package_type not in", values, "flowPackageType");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeBetween(Integer value1, Integer value2) {
            addCriterion("flow_package_type between", value1, value2, "flowPackageType");
            return (Criteria) this;
        }

        public Criteria andFlowPackageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_package_type not between", value1, value2, "flowPackageType");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeIsNull() {
            addCriterion("flow_stream_type is null");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeIsNotNull() {
            addCriterion("flow_stream_type is not null");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeEqualTo(Integer value) {
            addCriterion("flow_stream_type =", value, "flowStreamType");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeNotEqualTo(Integer value) {
            addCriterion("flow_stream_type <>", value, "flowStreamType");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeGreaterThan(Integer value) {
            addCriterion("flow_stream_type >", value, "flowStreamType");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_stream_type >=", value, "flowStreamType");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeLessThan(Integer value) {
            addCriterion("flow_stream_type <", value, "flowStreamType");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeLessThanOrEqualTo(Integer value) {
            addCriterion("flow_stream_type <=", value, "flowStreamType");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeIn(List<Integer> values) {
            addCriterion("flow_stream_type in", values, "flowStreamType");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeNotIn(List<Integer> values) {
            addCriterion("flow_stream_type not in", values, "flowStreamType");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeBetween(Integer value1, Integer value2) {
            addCriterion("flow_stream_type between", value1, value2, "flowStreamType");
            return (Criteria) this;
        }

        public Criteria andFlowStreamTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_stream_type not between", value1, value2, "flowStreamType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
