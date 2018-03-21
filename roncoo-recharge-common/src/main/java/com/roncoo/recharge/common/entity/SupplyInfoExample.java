/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public SupplyInfoExample() {
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

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Integer value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Integer value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Integer value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Integer value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Integer> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Integer> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryIsNull() {
            addCriterion("supply_category is null");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryIsNotNull() {
            addCriterion("supply_category is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryEqualTo(Integer value) {
            addCriterion("supply_category =", value, "supplyCategory");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryNotEqualTo(Integer value) {
            addCriterion("supply_category <>", value, "supplyCategory");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryGreaterThan(Integer value) {
            addCriterion("supply_category >", value, "supplyCategory");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("supply_category >=", value, "supplyCategory");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryLessThan(Integer value) {
            addCriterion("supply_category <", value, "supplyCategory");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("supply_category <=", value, "supplyCategory");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryIn(List<Integer> values) {
            addCriterion("supply_category in", values, "supplyCategory");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryNotIn(List<Integer> values) {
            addCriterion("supply_category not in", values, "supplyCategory");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryBetween(Integer value1, Integer value2) {
            addCriterion("supply_category between", value1, value2, "supplyCategory");
            return (Criteria) this;
        }

        public Criteria andSupplyCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("supply_category not between", value1, value2, "supplyCategory");
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

        public Criteria andCompayNameIsNull() {
            addCriterion("compay_name is null");
            return (Criteria) this;
        }

        public Criteria andCompayNameIsNotNull() {
            addCriterion("compay_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompayNameEqualTo(String value) {
            addCriterion("compay_name =", value, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameNotEqualTo(String value) {
            addCriterion("compay_name <>", value, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameGreaterThan(String value) {
            addCriterion("compay_name >", value, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameGreaterThanOrEqualTo(String value) {
            addCriterion("compay_name >=", value, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameLessThan(String value) {
            addCriterion("compay_name <", value, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameLessThanOrEqualTo(String value) {
            addCriterion("compay_name <=", value, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameLike(String value) {
            addCriterion("compay_name like", value, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameNotLike(String value) {
            addCriterion("compay_name not like", value, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameIn(List<String> values) {
            addCriterion("compay_name in", values, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameNotIn(List<String> values) {
            addCriterion("compay_name not in", values, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameBetween(String value1, String value2) {
            addCriterion("compay_name between", value1, value2, "compayName");
            return (Criteria) this;
        }

        public Criteria andCompayNameNotBetween(String value1, String value2) {
            addCriterion("compay_name not between", value1, value2, "compayName");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlIsNull() {
            addCriterion("para_request_url is null");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlIsNotNull() {
            addCriterion("para_request_url is not null");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlEqualTo(String value) {
            addCriterion("para_request_url =", value, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlNotEqualTo(String value) {
            addCriterion("para_request_url <>", value, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlGreaterThan(String value) {
            addCriterion("para_request_url >", value, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("para_request_url >=", value, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlLessThan(String value) {
            addCriterion("para_request_url <", value, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("para_request_url <=", value, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlLike(String value) {
            addCriterion("para_request_url like", value, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlNotLike(String value) {
            addCriterion("para_request_url not like", value, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlIn(List<String> values) {
            addCriterion("para_request_url in", values, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlNotIn(List<String> values) {
            addCriterion("para_request_url not in", values, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlBetween(String value1, String value2) {
            addCriterion("para_request_url between", value1, value2, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaRequestUrlNotBetween(String value1, String value2) {
            addCriterion("para_request_url not between", value1, value2, "paraRequestUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlIsNull() {
            addCriterion("para_order_url is null");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlIsNotNull() {
            addCriterion("para_order_url is not null");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlEqualTo(String value) {
            addCriterion("para_order_url =", value, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlNotEqualTo(String value) {
            addCriterion("para_order_url <>", value, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlGreaterThan(String value) {
            addCriterion("para_order_url >", value, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlGreaterThanOrEqualTo(String value) {
            addCriterion("para_order_url >=", value, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlLessThan(String value) {
            addCriterion("para_order_url <", value, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlLessThanOrEqualTo(String value) {
            addCriterion("para_order_url <=", value, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlLike(String value) {
            addCriterion("para_order_url like", value, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlNotLike(String value) {
            addCriterion("para_order_url not like", value, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlIn(List<String> values) {
            addCriterion("para_order_url in", values, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlNotIn(List<String> values) {
            addCriterion("para_order_url not in", values, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlBetween(String value1, String value2) {
            addCriterion("para_order_url between", value1, value2, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaOrderUrlNotBetween(String value1, String value2) {
            addCriterion("para_order_url not between", value1, value2, "paraOrderUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlIsNull() {
            addCriterion("para_balance_url is null");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlIsNotNull() {
            addCriterion("para_balance_url is not null");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlEqualTo(String value) {
            addCriterion("para_balance_url =", value, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlNotEqualTo(String value) {
            addCriterion("para_balance_url <>", value, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlGreaterThan(String value) {
            addCriterion("para_balance_url >", value, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("para_balance_url >=", value, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlLessThan(String value) {
            addCriterion("para_balance_url <", value, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlLessThanOrEqualTo(String value) {
            addCriterion("para_balance_url <=", value, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlLike(String value) {
            addCriterion("para_balance_url like", value, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlNotLike(String value) {
            addCriterion("para_balance_url not like", value, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlIn(List<String> values) {
            addCriterion("para_balance_url in", values, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlNotIn(List<String> values) {
            addCriterion("para_balance_url not in", values, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlBetween(String value1, String value2) {
            addCriterion("para_balance_url between", value1, value2, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaBalanceUrlNotBetween(String value1, String value2) {
            addCriterion("para_balance_url not between", value1, value2, "paraBalanceUrl");
            return (Criteria) this;
        }

        public Criteria andParaUserIdIsNull() {
            addCriterion("para_user_id is null");
            return (Criteria) this;
        }

        public Criteria andParaUserIdIsNotNull() {
            addCriterion("para_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andParaUserIdEqualTo(String value) {
            addCriterion("para_user_id =", value, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdNotEqualTo(String value) {
            addCriterion("para_user_id <>", value, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdGreaterThan(String value) {
            addCriterion("para_user_id >", value, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("para_user_id >=", value, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdLessThan(String value) {
            addCriterion("para_user_id <", value, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdLessThanOrEqualTo(String value) {
            addCriterion("para_user_id <=", value, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdLike(String value) {
            addCriterion("para_user_id like", value, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdNotLike(String value) {
            addCriterion("para_user_id not like", value, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdIn(List<String> values) {
            addCriterion("para_user_id in", values, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdNotIn(List<String> values) {
            addCriterion("para_user_id not in", values, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdBetween(String value1, String value2) {
            addCriterion("para_user_id between", value1, value2, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaUserIdNotBetween(String value1, String value2) {
            addCriterion("para_user_id not between", value1, value2, "paraUserId");
            return (Criteria) this;
        }

        public Criteria andParaKeyIsNull() {
            addCriterion("para_key is null");
            return (Criteria) this;
        }

        public Criteria andParaKeyIsNotNull() {
            addCriterion("para_key is not null");
            return (Criteria) this;
        }

        public Criteria andParaKeyEqualTo(String value) {
            addCriterion("para_key =", value, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyNotEqualTo(String value) {
            addCriterion("para_key <>", value, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyGreaterThan(String value) {
            addCriterion("para_key >", value, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyGreaterThanOrEqualTo(String value) {
            addCriterion("para_key >=", value, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyLessThan(String value) {
            addCriterion("para_key <", value, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyLessThanOrEqualTo(String value) {
            addCriterion("para_key <=", value, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyLike(String value) {
            addCriterion("para_key like", value, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyNotLike(String value) {
            addCriterion("para_key not like", value, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyIn(List<String> values) {
            addCriterion("para_key in", values, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyNotIn(List<String> values) {
            addCriterion("para_key not in", values, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyBetween(String value1, String value2) {
            addCriterion("para_key between", value1, value2, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaKeyNotBetween(String value1, String value2) {
            addCriterion("para_key not between", value1, value2, "paraKey");
            return (Criteria) this;
        }

        public Criteria andParaSeceretIsNull() {
            addCriterion("para_seceret is null");
            return (Criteria) this;
        }

        public Criteria andParaSeceretIsNotNull() {
            addCriterion("para_seceret is not null");
            return (Criteria) this;
        }

        public Criteria andParaSeceretEqualTo(String value) {
            addCriterion("para_seceret =", value, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretNotEqualTo(String value) {
            addCriterion("para_seceret <>", value, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretGreaterThan(String value) {
            addCriterion("para_seceret >", value, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretGreaterThanOrEqualTo(String value) {
            addCriterion("para_seceret >=", value, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretLessThan(String value) {
            addCriterion("para_seceret <", value, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretLessThanOrEqualTo(String value) {
            addCriterion("para_seceret <=", value, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretLike(String value) {
            addCriterion("para_seceret like", value, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretNotLike(String value) {
            addCriterion("para_seceret not like", value, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretIn(List<String> values) {
            addCriterion("para_seceret in", values, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretNotIn(List<String> values) {
            addCriterion("para_seceret not in", values, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretBetween(String value1, String value2) {
            addCriterion("para_seceret between", value1, value2, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaSeceretNotBetween(String value1, String value2) {
            addCriterion("para_seceret not between", value1, value2, "paraSeceret");
            return (Criteria) this;
        }

        public Criteria andParaExt1IsNull() {
            addCriterion("para_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andParaExt1IsNotNull() {
            addCriterion("para_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andParaExt1EqualTo(String value) {
            addCriterion("para_ext1 =", value, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1NotEqualTo(String value) {
            addCriterion("para_ext1 <>", value, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1GreaterThan(String value) {
            addCriterion("para_ext1 >", value, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1GreaterThanOrEqualTo(String value) {
            addCriterion("para_ext1 >=", value, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1LessThan(String value) {
            addCriterion("para_ext1 <", value, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1LessThanOrEqualTo(String value) {
            addCriterion("para_ext1 <=", value, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1Like(String value) {
            addCriterion("para_ext1 like", value, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1NotLike(String value) {
            addCriterion("para_ext1 not like", value, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1In(List<String> values) {
            addCriterion("para_ext1 in", values, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1NotIn(List<String> values) {
            addCriterion("para_ext1 not in", values, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1Between(String value1, String value2) {
            addCriterion("para_ext1 between", value1, value2, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt1NotBetween(String value1, String value2) {
            addCriterion("para_ext1 not between", value1, value2, "paraExt1");
            return (Criteria) this;
        }

        public Criteria andParaExt2IsNull() {
            addCriterion("para_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andParaExt2IsNotNull() {
            addCriterion("para_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andParaExt2EqualTo(String value) {
            addCriterion("para_ext2 =", value, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2NotEqualTo(String value) {
            addCriterion("para_ext2 <>", value, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2GreaterThan(String value) {
            addCriterion("para_ext2 >", value, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2GreaterThanOrEqualTo(String value) {
            addCriterion("para_ext2 >=", value, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2LessThan(String value) {
            addCriterion("para_ext2 <", value, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2LessThanOrEqualTo(String value) {
            addCriterion("para_ext2 <=", value, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2Like(String value) {
            addCriterion("para_ext2 like", value, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2NotLike(String value) {
            addCriterion("para_ext2 not like", value, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2In(List<String> values) {
            addCriterion("para_ext2 in", values, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2NotIn(List<String> values) {
            addCriterion("para_ext2 not in", values, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2Between(String value1, String value2) {
            addCriterion("para_ext2 between", value1, value2, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt2NotBetween(String value1, String value2) {
            addCriterion("para_ext2 not between", value1, value2, "paraExt2");
            return (Criteria) this;
        }

        public Criteria andParaExt3IsNull() {
            addCriterion("para_ext3 is null");
            return (Criteria) this;
        }

        public Criteria andParaExt3IsNotNull() {
            addCriterion("para_ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andParaExt3EqualTo(String value) {
            addCriterion("para_ext3 =", value, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3NotEqualTo(String value) {
            addCriterion("para_ext3 <>", value, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3GreaterThan(String value) {
            addCriterion("para_ext3 >", value, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3GreaterThanOrEqualTo(String value) {
            addCriterion("para_ext3 >=", value, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3LessThan(String value) {
            addCriterion("para_ext3 <", value, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3LessThanOrEqualTo(String value) {
            addCriterion("para_ext3 <=", value, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3Like(String value) {
            addCriterion("para_ext3 like", value, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3NotLike(String value) {
            addCriterion("para_ext3 not like", value, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3In(List<String> values) {
            addCriterion("para_ext3 in", values, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3NotIn(List<String> values) {
            addCriterion("para_ext3 not in", values, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3Between(String value1, String value2) {
            addCriterion("para_ext3 between", value1, value2, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt3NotBetween(String value1, String value2) {
            addCriterion("para_ext3 not between", value1, value2, "paraExt3");
            return (Criteria) this;
        }

        public Criteria andParaExt4IsNull() {
            addCriterion("para_ext4 is null");
            return (Criteria) this;
        }

        public Criteria andParaExt4IsNotNull() {
            addCriterion("para_ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andParaExt4EqualTo(String value) {
            addCriterion("para_ext4 =", value, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4NotEqualTo(String value) {
            addCriterion("para_ext4 <>", value, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4GreaterThan(String value) {
            addCriterion("para_ext4 >", value, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4GreaterThanOrEqualTo(String value) {
            addCriterion("para_ext4 >=", value, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4LessThan(String value) {
            addCriterion("para_ext4 <", value, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4LessThanOrEqualTo(String value) {
            addCriterion("para_ext4 <=", value, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4Like(String value) {
            addCriterion("para_ext4 like", value, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4NotLike(String value) {
            addCriterion("para_ext4 not like", value, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4In(List<String> values) {
            addCriterion("para_ext4 in", values, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4NotIn(List<String> values) {
            addCriterion("para_ext4 not in", values, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4Between(String value1, String value2) {
            addCriterion("para_ext4 between", value1, value2, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt4NotBetween(String value1, String value2) {
            addCriterion("para_ext4 not between", value1, value2, "paraExt4");
            return (Criteria) this;
        }

        public Criteria andParaExt5IsNull() {
            addCriterion("para_ext5 is null");
            return (Criteria) this;
        }

        public Criteria andParaExt5IsNotNull() {
            addCriterion("para_ext5 is not null");
            return (Criteria) this;
        }

        public Criteria andParaExt5EqualTo(String value) {
            addCriterion("para_ext5 =", value, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5NotEqualTo(String value) {
            addCriterion("para_ext5 <>", value, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5GreaterThan(String value) {
            addCriterion("para_ext5 >", value, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5GreaterThanOrEqualTo(String value) {
            addCriterion("para_ext5 >=", value, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5LessThan(String value) {
            addCriterion("para_ext5 <", value, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5LessThanOrEqualTo(String value) {
            addCriterion("para_ext5 <=", value, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5Like(String value) {
            addCriterion("para_ext5 like", value, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5NotLike(String value) {
            addCriterion("para_ext5 not like", value, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5In(List<String> values) {
            addCriterion("para_ext5 in", values, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5NotIn(List<String> values) {
            addCriterion("para_ext5 not in", values, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5Between(String value1, String value2) {
            addCriterion("para_ext5 between", value1, value2, "paraExt5");
            return (Criteria) this;
        }

        public Criteria andParaExt5NotBetween(String value1, String value2) {
            addCriterion("para_ext5 not between", value1, value2, "paraExt5");
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
