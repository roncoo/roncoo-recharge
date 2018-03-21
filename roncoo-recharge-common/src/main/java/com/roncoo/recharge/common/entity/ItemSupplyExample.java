/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemSupplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ItemSupplyExample() {
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

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andLossTypeIsNull() {
            addCriterion("loss_type is null");
            return (Criteria) this;
        }

        public Criteria andLossTypeIsNotNull() {
            addCriterion("loss_type is not null");
            return (Criteria) this;
        }

        public Criteria andLossTypeEqualTo(Integer value) {
            addCriterion("loss_type =", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeNotEqualTo(Integer value) {
            addCriterion("loss_type <>", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeGreaterThan(Integer value) {
            addCriterion("loss_type >", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loss_type >=", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeLessThan(Integer value) {
            addCriterion("loss_type <", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeLessThanOrEqualTo(Integer value) {
            addCriterion("loss_type <=", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeIn(List<Integer> values) {
            addCriterion("loss_type in", values, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeNotIn(List<Integer> values) {
            addCriterion("loss_type not in", values, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeBetween(Integer value1, Integer value2) {
            addCriterion("loss_type between", value1, value2, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("loss_type not between", value1, value2, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTimeIsNull() {
            addCriterion("loss_time is null");
            return (Criteria) this;
        }

        public Criteria andLossTimeIsNotNull() {
            addCriterion("loss_time is not null");
            return (Criteria) this;
        }

        public Criteria andLossTimeEqualTo(Integer value) {
            addCriterion("loss_time =", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeNotEqualTo(Integer value) {
            addCriterion("loss_time <>", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeGreaterThan(Integer value) {
            addCriterion("loss_time >", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loss_time >=", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeLessThan(Integer value) {
            addCriterion("loss_time <", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeLessThanOrEqualTo(Integer value) {
            addCriterion("loss_time <=", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeIn(List<Integer> values) {
            addCriterion("loss_time in", values, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeNotIn(List<Integer> values) {
            addCriterion("loss_time not in", values, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeBetween(Integer value1, Integer value2) {
            addCriterion("loss_time between", value1, value2, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("loss_time not between", value1, value2, "lossTime");
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

        public Criteria andSupplyProductCodeIsNull() {
            addCriterion("supply_product_code is null");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeIsNotNull() {
            addCriterion("supply_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeEqualTo(String value) {
            addCriterion("supply_product_code =", value, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeNotEqualTo(String value) {
            addCriterion("supply_product_code <>", value, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeGreaterThan(String value) {
            addCriterion("supply_product_code >", value, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supply_product_code >=", value, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeLessThan(String value) {
            addCriterion("supply_product_code <", value, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeLessThanOrEqualTo(String value) {
            addCriterion("supply_product_code <=", value, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeLike(String value) {
            addCriterion("supply_product_code like", value, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeNotLike(String value) {
            addCriterion("supply_product_code not like", value, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeIn(List<String> values) {
            addCriterion("supply_product_code in", values, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeNotIn(List<String> values) {
            addCriterion("supply_product_code not in", values, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeBetween(String value1, String value2) {
            addCriterion("supply_product_code between", value1, value2, "supplyProductCode");
            return (Criteria) this;
        }

        public Criteria andSupplyProductCodeNotBetween(String value1, String value2) {
            addCriterion("supply_product_code not between", value1, value2, "supplyProductCode");
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
