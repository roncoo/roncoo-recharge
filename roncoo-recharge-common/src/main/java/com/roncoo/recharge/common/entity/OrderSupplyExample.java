/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSupplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public OrderSupplyExample() {
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoIsNull() {
            addCriterion("order_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoIsNotNull() {
            addCriterion("order_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoEqualTo(Long value) {
            addCriterion("order_trade_no =", value, "orderTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoNotEqualTo(Long value) {
            addCriterion("order_trade_no <>", value, "orderTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoGreaterThan(Long value) {
            addCriterion("order_trade_no >", value, "orderTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoGreaterThanOrEqualTo(Long value) {
            addCriterion("order_trade_no >=", value, "orderTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoLessThan(Long value) {
            addCriterion("order_trade_no <", value, "orderTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoLessThanOrEqualTo(Long value) {
            addCriterion("order_trade_no <=", value, "orderTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoIn(List<Long> values) {
            addCriterion("order_trade_no in", values, "orderTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoNotIn(List<Long> values) {
            addCriterion("order_trade_no not in", values, "orderTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoBetween(Long value1, Long value2) {
            addCriterion("order_trade_no between", value1, value2, "orderTradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTradeNoNotBetween(Long value1, Long value2) {
            addCriterion("order_trade_no not between", value1, value2, "orderTradeNo");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdIsNull() {
            addCriterion("item_supply_id is null");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdIsNotNull() {
            addCriterion("item_supply_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdEqualTo(Long value) {
            addCriterion("item_supply_id =", value, "itemSupplyId");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdNotEqualTo(Long value) {
            addCriterion("item_supply_id <>", value, "itemSupplyId");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdGreaterThan(Long value) {
            addCriterion("item_supply_id >", value, "itemSupplyId");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_supply_id >=", value, "itemSupplyId");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdLessThan(Long value) {
            addCriterion("item_supply_id <", value, "itemSupplyId");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdLessThanOrEqualTo(Long value) {
            addCriterion("item_supply_id <=", value, "itemSupplyId");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdIn(List<Long> values) {
            addCriterion("item_supply_id in", values, "itemSupplyId");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdNotIn(List<Long> values) {
            addCriterion("item_supply_id not in", values, "itemSupplyId");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdBetween(Long value1, Long value2) {
            addCriterion("item_supply_id between", value1, value2, "itemSupplyId");
            return (Criteria) this;
        }

        public Criteria andItemSupplyIdNotBetween(Long value1, Long value2) {
            addCriterion("item_supply_id not between", value1, value2, "itemSupplyId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIsNull() {
            addCriterion("user_info_id is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIsNotNull() {
            addCriterion("user_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdEqualTo(Long value) {
            addCriterion("user_info_id =", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotEqualTo(Long value) {
            addCriterion("user_info_id <>", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThan(Long value) {
            addCriterion("user_info_id >", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_info_id >=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThan(Long value) {
            addCriterion("user_info_id <", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("user_info_id <=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIn(List<Long> values) {
            addCriterion("user_info_id in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotIn(List<Long> values) {
            addCriterion("user_info_id not in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdBetween(Long value1, Long value2) {
            addCriterion("user_info_id between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("user_info_id not between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdIsNull() {
            addCriterion("supply_info_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdIsNotNull() {
            addCriterion("supply_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdEqualTo(Long value) {
            addCriterion("supply_info_id =", value, "supplyInfoId");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdNotEqualTo(Long value) {
            addCriterion("supply_info_id <>", value, "supplyInfoId");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdGreaterThan(Long value) {
            addCriterion("supply_info_id >", value, "supplyInfoId");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supply_info_id >=", value, "supplyInfoId");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdLessThan(Long value) {
            addCriterion("supply_info_id <", value, "supplyInfoId");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("supply_info_id <=", value, "supplyInfoId");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdIn(List<Long> values) {
            addCriterion("supply_info_id in", values, "supplyInfoId");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdNotIn(List<Long> values) {
            addCriterion("supply_info_id not in", values, "supplyInfoId");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdBetween(Long value1, Long value2) {
            addCriterion("supply_info_id between", value1, value2, "supplyInfoId");
            return (Criteria) this;
        }

        public Criteria andSupplyInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("supply_info_id not between", value1, value2, "supplyInfoId");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeIsNull() {
            addCriterion("supply_code is null");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeIsNotNull() {
            addCriterion("supply_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeEqualTo(String value) {
            addCriterion("supply_code =", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeNotEqualTo(String value) {
            addCriterion("supply_code <>", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeGreaterThan(String value) {
            addCriterion("supply_code >", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supply_code >=", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeLessThan(String value) {
            addCriterion("supply_code <", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeLessThanOrEqualTo(String value) {
            addCriterion("supply_code <=", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeLike(String value) {
            addCriterion("supply_code like", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeNotLike(String value) {
            addCriterion("supply_code not like", value, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeIn(List<String> values) {
            addCriterion("supply_code in", values, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeNotIn(List<String> values) {
            addCriterion("supply_code not in", values, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeBetween(String value1, String value2) {
            addCriterion("supply_code between", value1, value2, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyCodeNotBetween(String value1, String value2) {
            addCriterion("supply_code not between", value1, value2, "supplyCode");
            return (Criteria) this;
        }

        public Criteria andSupplyNameIsNull() {
            addCriterion("supply_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplyNameIsNotNull() {
            addCriterion("supply_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyNameEqualTo(String value) {
            addCriterion("supply_name =", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotEqualTo(String value) {
            addCriterion("supply_name <>", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameGreaterThan(String value) {
            addCriterion("supply_name >", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("supply_name >=", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameLessThan(String value) {
            addCriterion("supply_name <", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameLessThanOrEqualTo(String value) {
            addCriterion("supply_name <=", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameLike(String value) {
            addCriterion("supply_name like", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotLike(String value) {
            addCriterion("supply_name not like", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameIn(List<String> values) {
            addCriterion("supply_name in", values, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotIn(List<String> values) {
            addCriterion("supply_name not in", values, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameBetween(String value1, String value2) {
            addCriterion("supply_name between", value1, value2, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotBetween(String value1, String value2) {
            addCriterion("supply_name not between", value1, value2, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoIsNull() {
            addCriterion("supply_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoIsNotNull() {
            addCriterion("supply_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoEqualTo(Long value) {
            addCriterion("supply_serial_no =", value, "supplySerialNo");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoNotEqualTo(Long value) {
            addCriterion("supply_serial_no <>", value, "supplySerialNo");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoGreaterThan(Long value) {
            addCriterion("supply_serial_no >", value, "supplySerialNo");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoGreaterThanOrEqualTo(Long value) {
            addCriterion("supply_serial_no >=", value, "supplySerialNo");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoLessThan(Long value) {
            addCriterion("supply_serial_no <", value, "supplySerialNo");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoLessThanOrEqualTo(Long value) {
            addCriterion("supply_serial_no <=", value, "supplySerialNo");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoIn(List<Long> values) {
            addCriterion("supply_serial_no in", values, "supplySerialNo");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoNotIn(List<Long> values) {
            addCriterion("supply_serial_no not in", values, "supplySerialNo");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoBetween(Long value1, Long value2) {
            addCriterion("supply_serial_no between", value1, value2, "supplySerialNo");
            return (Criteria) this;
        }

        public Criteria andSupplySerialNoNotBetween(Long value1, Long value2) {
            addCriterion("supply_serial_no not between", value1, value2, "supplySerialNo");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceIsNull() {
            addCriterion("supply_face_price is null");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceIsNotNull() {
            addCriterion("supply_face_price is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceEqualTo(String value) {
            addCriterion("supply_face_price =", value, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceNotEqualTo(String value) {
            addCriterion("supply_face_price <>", value, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceGreaterThan(String value) {
            addCriterion("supply_face_price >", value, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceGreaterThanOrEqualTo(String value) {
            addCriterion("supply_face_price >=", value, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceLessThan(String value) {
            addCriterion("supply_face_price <", value, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceLessThanOrEqualTo(String value) {
            addCriterion("supply_face_price <=", value, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceLike(String value) {
            addCriterion("supply_face_price like", value, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceNotLike(String value) {
            addCriterion("supply_face_price not like", value, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceIn(List<String> values) {
            addCriterion("supply_face_price in", values, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceNotIn(List<String> values) {
            addCriterion("supply_face_price not in", values, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceBetween(String value1, String value2) {
            addCriterion("supply_face_price between", value1, value2, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyFacePriceNotBetween(String value1, String value2) {
            addCriterion("supply_face_price not between", value1, value2, "supplyFacePrice");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceIsNull() {
            addCriterion("supply_cost_price is null");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceIsNotNull() {
            addCriterion("supply_cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceEqualTo(Integer value) {
            addCriterion("supply_cost_price =", value, "supplyCostPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceNotEqualTo(Integer value) {
            addCriterion("supply_cost_price <>", value, "supplyCostPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceGreaterThan(Integer value) {
            addCriterion("supply_cost_price >", value, "supplyCostPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("supply_cost_price >=", value, "supplyCostPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceLessThan(Integer value) {
            addCriterion("supply_cost_price <", value, "supplyCostPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceLessThanOrEqualTo(Integer value) {
            addCriterion("supply_cost_price <=", value, "supplyCostPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceIn(List<Integer> values) {
            addCriterion("supply_cost_price in", values, "supplyCostPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceNotIn(List<Integer> values) {
            addCriterion("supply_cost_price not in", values, "supplyCostPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceBetween(Integer value1, Integer value2) {
            addCriterion("supply_cost_price between", value1, value2, "supplyCostPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyCostPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("supply_cost_price not between", value1, value2, "supplyCostPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostIsNull() {
            addCriterion("supply_actual_cost is null");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostIsNotNull() {
            addCriterion("supply_actual_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostEqualTo(Integer value) {
            addCriterion("supply_actual_cost =", value, "supplyActualCost");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostNotEqualTo(Integer value) {
            addCriterion("supply_actual_cost <>", value, "supplyActualCost");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostGreaterThan(Integer value) {
            addCriterion("supply_actual_cost >", value, "supplyActualCost");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("supply_actual_cost >=", value, "supplyActualCost");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostLessThan(Integer value) {
            addCriterion("supply_actual_cost <", value, "supplyActualCost");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostLessThanOrEqualTo(Integer value) {
            addCriterion("supply_actual_cost <=", value, "supplyActualCost");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostIn(List<Integer> values) {
            addCriterion("supply_actual_cost in", values, "supplyActualCost");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostNotIn(List<Integer> values) {
            addCriterion("supply_actual_cost not in", values, "supplyActualCost");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostBetween(Integer value1, Integer value2) {
            addCriterion("supply_actual_cost between", value1, value2, "supplyActualCost");
            return (Criteria) this;
        }

        public Criteria andSupplyActualCostNotBetween(Integer value1, Integer value2) {
            addCriterion("supply_actual_cost not between", value1, value2, "supplyActualCost");
            return (Criteria) this;
        }

        public Criteria andSupplyDescIsNull() {
            addCriterion("supply_desc is null");
            return (Criteria) this;
        }

        public Criteria andSupplyDescIsNotNull() {
            addCriterion("supply_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyDescEqualTo(String value) {
            addCriterion("supply_desc =", value, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescNotEqualTo(String value) {
            addCriterion("supply_desc <>", value, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescGreaterThan(String value) {
            addCriterion("supply_desc >", value, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescGreaterThanOrEqualTo(String value) {
            addCriterion("supply_desc >=", value, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescLessThan(String value) {
            addCriterion("supply_desc <", value, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescLessThanOrEqualTo(String value) {
            addCriterion("supply_desc <=", value, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescLike(String value) {
            addCriterion("supply_desc like", value, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescNotLike(String value) {
            addCriterion("supply_desc not like", value, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescIn(List<String> values) {
            addCriterion("supply_desc in", values, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescNotIn(List<String> values) {
            addCriterion("supply_desc not in", values, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescBetween(String value1, String value2) {
            addCriterion("supply_desc between", value1, value2, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andSupplyDescNotBetween(String value1, String value2) {
            addCriterion("supply_desc not between", value1, value2, "supplyDesc");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeIsNull() {
            addCriterion("repeat_type is null");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeIsNotNull() {
            addCriterion("repeat_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeEqualTo(Integer value) {
            addCriterion("repeat_type =", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeNotEqualTo(Integer value) {
            addCriterion("repeat_type <>", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeGreaterThan(Integer value) {
            addCriterion("repeat_type >", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat_type >=", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeLessThan(Integer value) {
            addCriterion("repeat_type <", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeLessThanOrEqualTo(Integer value) {
            addCriterion("repeat_type <=", value, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeIn(List<Integer> values) {
            addCriterion("repeat_type in", values, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeNotIn(List<Integer> values) {
            addCriterion("repeat_type not in", values, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeBetween(Integer value1, Integer value2) {
            addCriterion("repeat_type between", value1, value2, "repeatType");
            return (Criteria) this;
        }

        public Criteria andRepeatTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat_type not between", value1, value2, "repeatType");
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
