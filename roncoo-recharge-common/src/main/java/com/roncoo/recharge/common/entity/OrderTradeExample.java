/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderTradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public OrderTradeExample() {
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

        public Criteria andAcctInfoIdIsNull() {
            addCriterion("acct_info_id is null");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdIsNotNull() {
            addCriterion("acct_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdEqualTo(Long value) {
            addCriterion("acct_info_id =", value, "acctInfoId");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdNotEqualTo(Long value) {
            addCriterion("acct_info_id <>", value, "acctInfoId");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdGreaterThan(Long value) {
            addCriterion("acct_info_id >", value, "acctInfoId");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("acct_info_id >=", value, "acctInfoId");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdLessThan(Long value) {
            addCriterion("acct_info_id <", value, "acctInfoId");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("acct_info_id <=", value, "acctInfoId");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdIn(List<Long> values) {
            addCriterion("acct_info_id in", values, "acctInfoId");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdNotIn(List<Long> values) {
            addCriterion("acct_info_id not in", values, "acctInfoId");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdBetween(Long value1, Long value2) {
            addCriterion("acct_info_id between", value1, value2, "acctInfoId");
            return (Criteria) this;
        }

        public Criteria andAcctInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("acct_info_id not between", value1, value2, "acctInfoId");
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

        public Criteria andSalesPriceIsNull() {
            addCriterion("sales_price is null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNotNull() {
            addCriterion("sales_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceEqualTo(Integer value) {
            addCriterion("sales_price =", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotEqualTo(Integer value) {
            addCriterion("sales_price <>", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThan(Integer value) {
            addCriterion("sales_price >", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_price >=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThan(Integer value) {
            addCriterion("sales_price <", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThanOrEqualTo(Integer value) {
            addCriterion("sales_price <=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIn(List<Integer> values) {
            addCriterion("sales_price in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotIn(List<Integer> values) {
            addCriterion("sales_price not in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceBetween(Integer value1, Integer value2) {
            addCriterion("sales_price between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_price not between", value1, value2, "salesPrice");
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

        public Criteria andActualCostIsNull() {
            addCriterion("actual_cost is null");
            return (Criteria) this;
        }

        public Criteria andActualCostIsNotNull() {
            addCriterion("actual_cost is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostEqualTo(Integer value) {
            addCriterion("actual_cost =", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostNotEqualTo(Integer value) {
            addCriterion("actual_cost <>", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostGreaterThan(Integer value) {
            addCriterion("actual_cost >", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_cost >=", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostLessThan(Integer value) {
            addCriterion("actual_cost <", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostLessThanOrEqualTo(Integer value) {
            addCriterion("actual_cost <=", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostIn(List<Integer> values) {
            addCriterion("actual_cost in", values, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostNotIn(List<Integer> values) {
            addCriterion("actual_cost not in", values, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostBetween(Integer value1, Integer value2) {
            addCriterion("actual_cost between", value1, value2, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_cost not between", value1, value2, "actualCost");
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

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Integer value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Integer value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Integer value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Integer value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Integer value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Integer> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Integer> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Integer value1, Integer value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(Long value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(Long value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(Long value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(Long value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(Long value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<Long> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<Long> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(Long value1, Long value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(Long value1, Long value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoIsNull() {
            addCriterion("pay_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoIsNotNull() {
            addCriterion("pay_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoEqualTo(Long value) {
            addCriterion("pay_serial_no =", value, "paySerialNo");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoNotEqualTo(Long value) {
            addCriterion("pay_serial_no <>", value, "paySerialNo");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoGreaterThan(Long value) {
            addCriterion("pay_serial_no >", value, "paySerialNo");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_serial_no >=", value, "paySerialNo");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoLessThan(Long value) {
            addCriterion("pay_serial_no <", value, "paySerialNo");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoLessThanOrEqualTo(Long value) {
            addCriterion("pay_serial_no <=", value, "paySerialNo");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoIn(List<Long> values) {
            addCriterion("pay_serial_no in", values, "paySerialNo");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoNotIn(List<Long> values) {
            addCriterion("pay_serial_no not in", values, "paySerialNo");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoBetween(Long value1, Long value2) {
            addCriterion("pay_serial_no between", value1, value2, "paySerialNo");
            return (Criteria) this;
        }

        public Criteria andPaySerialNoNotBetween(Long value1, Long value2) {
            addCriterion("pay_serial_no not between", value1, value2, "paySerialNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
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

        public Criteria andSupplyCountIsNull() {
            addCriterion("supply_count is null");
            return (Criteria) this;
        }

        public Criteria andSupplyCountIsNotNull() {
            addCriterion("supply_count is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyCountEqualTo(Integer value) {
            addCriterion("supply_count =", value, "supplyCount");
            return (Criteria) this;
        }

        public Criteria andSupplyCountNotEqualTo(Integer value) {
            addCriterion("supply_count <>", value, "supplyCount");
            return (Criteria) this;
        }

        public Criteria andSupplyCountGreaterThan(Integer value) {
            addCriterion("supply_count >", value, "supplyCount");
            return (Criteria) this;
        }

        public Criteria andSupplyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("supply_count >=", value, "supplyCount");
            return (Criteria) this;
        }

        public Criteria andSupplyCountLessThan(Integer value) {
            addCriterion("supply_count <", value, "supplyCount");
            return (Criteria) this;
        }

        public Criteria andSupplyCountLessThanOrEqualTo(Integer value) {
            addCriterion("supply_count <=", value, "supplyCount");
            return (Criteria) this;
        }

        public Criteria andSupplyCountIn(List<Integer> values) {
            addCriterion("supply_count in", values, "supplyCount");
            return (Criteria) this;
        }

        public Criteria andSupplyCountNotIn(List<Integer> values) {
            addCriterion("supply_count not in", values, "supplyCount");
            return (Criteria) this;
        }

        public Criteria andSupplyCountBetween(Integer value1, Integer value2) {
            addCriterion("supply_count between", value1, value2, "supplyCount");
            return (Criteria) this;
        }

        public Criteria andSupplyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("supply_count not between", value1, value2, "supplyCount");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexIsNull() {
            addCriterion("supply_index is null");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexIsNotNull() {
            addCriterion("supply_index is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexEqualTo(Integer value) {
            addCriterion("supply_index =", value, "supplyIndex");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexNotEqualTo(Integer value) {
            addCriterion("supply_index <>", value, "supplyIndex");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexGreaterThan(Integer value) {
            addCriterion("supply_index >", value, "supplyIndex");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("supply_index >=", value, "supplyIndex");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexLessThan(Integer value) {
            addCriterion("supply_index <", value, "supplyIndex");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexLessThanOrEqualTo(Integer value) {
            addCriterion("supply_index <=", value, "supplyIndex");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexIn(List<Integer> values) {
            addCriterion("supply_index in", values, "supplyIndex");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexNotIn(List<Integer> values) {
            addCriterion("supply_index not in", values, "supplyIndex");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexBetween(Integer value1, Integer value2) {
            addCriterion("supply_index between", value1, value2, "supplyIndex");
            return (Criteria) this;
        }

        public Criteria andSupplyIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("supply_index not between", value1, value2, "supplyIndex");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("notify_url =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("notify_url <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("notify_url like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("notify_url not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("notify_url in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andFlowModeIsNull() {
            addCriterion("flow_mode is null");
            return (Criteria) this;
        }

        public Criteria andFlowModeIsNotNull() {
            addCriterion("flow_mode is not null");
            return (Criteria) this;
        }

        public Criteria andFlowModeEqualTo(Integer value) {
            addCriterion("flow_mode =", value, "flowMode");
            return (Criteria) this;
        }

        public Criteria andFlowModeNotEqualTo(Integer value) {
            addCriterion("flow_mode <>", value, "flowMode");
            return (Criteria) this;
        }

        public Criteria andFlowModeGreaterThan(Integer value) {
            addCriterion("flow_mode >", value, "flowMode");
            return (Criteria) this;
        }

        public Criteria andFlowModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_mode >=", value, "flowMode");
            return (Criteria) this;
        }

        public Criteria andFlowModeLessThan(Integer value) {
            addCriterion("flow_mode <", value, "flowMode");
            return (Criteria) this;
        }

        public Criteria andFlowModeLessThanOrEqualTo(Integer value) {
            addCriterion("flow_mode <=", value, "flowMode");
            return (Criteria) this;
        }

        public Criteria andFlowModeIn(List<Integer> values) {
            addCriterion("flow_mode in", values, "flowMode");
            return (Criteria) this;
        }

        public Criteria andFlowModeNotIn(List<Integer> values) {
            addCriterion("flow_mode not in", values, "flowMode");
            return (Criteria) this;
        }

        public Criteria andFlowModeBetween(Integer value1, Integer value2) {
            addCriterion("flow_mode between", value1, value2, "flowMode");
            return (Criteria) this;
        }

        public Criteria andFlowModeNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_mode not between", value1, value2, "flowMode");
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

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardPwdIsNull() {
            addCriterion("card_pwd is null");
            return (Criteria) this;
        }

        public Criteria andCardPwdIsNotNull() {
            addCriterion("card_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andCardPwdEqualTo(String value) {
            addCriterion("card_pwd =", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdNotEqualTo(String value) {
            addCriterion("card_pwd <>", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdGreaterThan(String value) {
            addCriterion("card_pwd >", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdGreaterThanOrEqualTo(String value) {
            addCriterion("card_pwd >=", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdLessThan(String value) {
            addCriterion("card_pwd <", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdLessThanOrEqualTo(String value) {
            addCriterion("card_pwd <=", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdLike(String value) {
            addCriterion("card_pwd like", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdNotLike(String value) {
            addCriterion("card_pwd not like", value, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdIn(List<String> values) {
            addCriterion("card_pwd in", values, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdNotIn(List<String> values) {
            addCriterion("card_pwd not in", values, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdBetween(String value1, String value2) {
            addCriterion("card_pwd between", value1, value2, "cardPwd");
            return (Criteria) this;
        }

        public Criteria andCardPwdNotBetween(String value1, String value2) {
            addCriterion("card_pwd not between", value1, value2, "cardPwd");
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
