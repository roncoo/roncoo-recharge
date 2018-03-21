/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public MerchantInfoExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andPriceLevelIsNull() {
            addCriterion("price_level is null");
            return (Criteria) this;
        }

        public Criteria andPriceLevelIsNotNull() {
            addCriterion("price_level is not null");
            return (Criteria) this;
        }

        public Criteria andPriceLevelEqualTo(Integer value) {
            addCriterion("price_level =", value, "priceLevel");
            return (Criteria) this;
        }

        public Criteria andPriceLevelNotEqualTo(Integer value) {
            addCriterion("price_level <>", value, "priceLevel");
            return (Criteria) this;
        }

        public Criteria andPriceLevelGreaterThan(Integer value) {
            addCriterion("price_level >", value, "priceLevel");
            return (Criteria) this;
        }

        public Criteria andPriceLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_level >=", value, "priceLevel");
            return (Criteria) this;
        }

        public Criteria andPriceLevelLessThan(Integer value) {
            addCriterion("price_level <", value, "priceLevel");
            return (Criteria) this;
        }

        public Criteria andPriceLevelLessThanOrEqualTo(Integer value) {
            addCriterion("price_level <=", value, "priceLevel");
            return (Criteria) this;
        }

        public Criteria andPriceLevelIn(List<Integer> values) {
            addCriterion("price_level in", values, "priceLevel");
            return (Criteria) this;
        }

        public Criteria andPriceLevelNotIn(List<Integer> values) {
            addCriterion("price_level not in", values, "priceLevel");
            return (Criteria) this;
        }

        public Criteria andPriceLevelBetween(Integer value1, Integer value2) {
            addCriterion("price_level between", value1, value2, "priceLevel");
            return (Criteria) this;
        }

        public Criteria andPriceLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("price_level not between", value1, value2, "priceLevel");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
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

        public Criteria andChargingLimitIsNull() {
            addCriterion("charging_limit is null");
            return (Criteria) this;
        }

        public Criteria andChargingLimitIsNotNull() {
            addCriterion("charging_limit is not null");
            return (Criteria) this;
        }

        public Criteria andChargingLimitEqualTo(Integer value) {
            addCriterion("charging_limit =", value, "chargingLimit");
            return (Criteria) this;
        }

        public Criteria andChargingLimitNotEqualTo(Integer value) {
            addCriterion("charging_limit <>", value, "chargingLimit");
            return (Criteria) this;
        }

        public Criteria andChargingLimitGreaterThan(Integer value) {
            addCriterion("charging_limit >", value, "chargingLimit");
            return (Criteria) this;
        }

        public Criteria andChargingLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("charging_limit >=", value, "chargingLimit");
            return (Criteria) this;
        }

        public Criteria andChargingLimitLessThan(Integer value) {
            addCriterion("charging_limit <", value, "chargingLimit");
            return (Criteria) this;
        }

        public Criteria andChargingLimitLessThanOrEqualTo(Integer value) {
            addCriterion("charging_limit <=", value, "chargingLimit");
            return (Criteria) this;
        }

        public Criteria andChargingLimitIn(List<Integer> values) {
            addCriterion("charging_limit in", values, "chargingLimit");
            return (Criteria) this;
        }

        public Criteria andChargingLimitNotIn(List<Integer> values) {
            addCriterion("charging_limit not in", values, "chargingLimit");
            return (Criteria) this;
        }

        public Criteria andChargingLimitBetween(Integer value1, Integer value2) {
            addCriterion("charging_limit between", value1, value2, "chargingLimit");
            return (Criteria) this;
        }

        public Criteria andChargingLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("charging_limit not between", value1, value2, "chargingLimit");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceIsNull() {
            addCriterion("warning_balance is null");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceIsNotNull() {
            addCriterion("warning_balance is not null");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceEqualTo(Integer value) {
            addCriterion("warning_balance =", value, "warningBalance");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceNotEqualTo(Integer value) {
            addCriterion("warning_balance <>", value, "warningBalance");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceGreaterThan(Integer value) {
            addCriterion("warning_balance >", value, "warningBalance");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("warning_balance >=", value, "warningBalance");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceLessThan(Integer value) {
            addCriterion("warning_balance <", value, "warningBalance");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("warning_balance <=", value, "warningBalance");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceIn(List<Integer> values) {
            addCriterion("warning_balance in", values, "warningBalance");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceNotIn(List<Integer> values) {
            addCriterion("warning_balance not in", values, "warningBalance");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceBetween(Integer value1, Integer value2) {
            addCriterion("warning_balance between", value1, value2, "warningBalance");
            return (Criteria) this;
        }

        public Criteria andWarningBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("warning_balance not between", value1, value2, "warningBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceIsNull() {
            addCriterion("deposit_balance is null");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceIsNotNull() {
            addCriterion("deposit_balance is not null");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceEqualTo(Integer value) {
            addCriterion("deposit_balance =", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceNotEqualTo(Integer value) {
            addCriterion("deposit_balance <>", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceGreaterThan(Integer value) {
            addCriterion("deposit_balance >", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_balance >=", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceLessThan(Integer value) {
            addCriterion("deposit_balance <", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_balance <=", value, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceIn(List<Integer> values) {
            addCriterion("deposit_balance in", values, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceNotIn(List<Integer> values) {
            addCriterion("deposit_balance not in", values, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceBetween(Integer value1, Integer value2) {
            addCriterion("deposit_balance between", value1, value2, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andDepositBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_balance not between", value1, value2, "depositBalance");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeIsNull() {
            addCriterion("api_verify_type is null");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeIsNotNull() {
            addCriterion("api_verify_type is not null");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeEqualTo(Integer value) {
            addCriterion("api_verify_type =", value, "apiVerifyType");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeNotEqualTo(Integer value) {
            addCriterion("api_verify_type <>", value, "apiVerifyType");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeGreaterThan(Integer value) {
            addCriterion("api_verify_type >", value, "apiVerifyType");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("api_verify_type >=", value, "apiVerifyType");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeLessThan(Integer value) {
            addCriterion("api_verify_type <", value, "apiVerifyType");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("api_verify_type <=", value, "apiVerifyType");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeIn(List<Integer> values) {
            addCriterion("api_verify_type in", values, "apiVerifyType");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeNotIn(List<Integer> values) {
            addCriterion("api_verify_type not in", values, "apiVerifyType");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeBetween(Integer value1, Integer value2) {
            addCriterion("api_verify_type between", value1, value2, "apiVerifyType");
            return (Criteria) this;
        }

        public Criteria andApiVerifyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("api_verify_type not between", value1, value2, "apiVerifyType");
            return (Criteria) this;
        }

        public Criteria andAppSeceretIsNull() {
            addCriterion("app_seceret is null");
            return (Criteria) this;
        }

        public Criteria andAppSeceretIsNotNull() {
            addCriterion("app_seceret is not null");
            return (Criteria) this;
        }

        public Criteria andAppSeceretEqualTo(String value) {
            addCriterion("app_seceret =", value, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretNotEqualTo(String value) {
            addCriterion("app_seceret <>", value, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretGreaterThan(String value) {
            addCriterion("app_seceret >", value, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretGreaterThanOrEqualTo(String value) {
            addCriterion("app_seceret >=", value, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretLessThan(String value) {
            addCriterion("app_seceret <", value, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretLessThanOrEqualTo(String value) {
            addCriterion("app_seceret <=", value, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretLike(String value) {
            addCriterion("app_seceret like", value, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretNotLike(String value) {
            addCriterion("app_seceret not like", value, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretIn(List<String> values) {
            addCriterion("app_seceret in", values, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretNotIn(List<String> values) {
            addCriterion("app_seceret not in", values, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretBetween(String value1, String value2) {
            addCriterion("app_seceret between", value1, value2, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andAppSeceretNotBetween(String value1, String value2) {
            addCriterion("app_seceret not between", value1, value2, "appSeceret");
            return (Criteria) this;
        }

        public Criteria andWhiteListIsNull() {
            addCriterion("white_list is null");
            return (Criteria) this;
        }

        public Criteria andWhiteListIsNotNull() {
            addCriterion("white_list is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteListEqualTo(String value) {
            addCriterion("white_list =", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotEqualTo(String value) {
            addCriterion("white_list <>", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListGreaterThan(String value) {
            addCriterion("white_list >", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListGreaterThanOrEqualTo(String value) {
            addCriterion("white_list >=", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLessThan(String value) {
            addCriterion("white_list <", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLessThanOrEqualTo(String value) {
            addCriterion("white_list <=", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLike(String value) {
            addCriterion("white_list like", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotLike(String value) {
            addCriterion("white_list not like", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListIn(List<String> values) {
            addCriterion("white_list in", values, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotIn(List<String> values) {
            addCriterion("white_list not in", values, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListBetween(String value1, String value2) {
            addCriterion("white_list between", value1, value2, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotBetween(String value1, String value2) {
            addCriterion("white_list not between", value1, value2, "whiteList");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeIsNull() {
            addCriterion("tx_verify_type is null");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeIsNotNull() {
            addCriterion("tx_verify_type is not null");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeEqualTo(Integer value) {
            addCriterion("tx_verify_type =", value, "txVerifyType");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeNotEqualTo(Integer value) {
            addCriterion("tx_verify_type <>", value, "txVerifyType");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeGreaterThan(Integer value) {
            addCriterion("tx_verify_type >", value, "txVerifyType");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tx_verify_type >=", value, "txVerifyType");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeLessThan(Integer value) {
            addCriterion("tx_verify_type <", value, "txVerifyType");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tx_verify_type <=", value, "txVerifyType");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeIn(List<Integer> values) {
            addCriterion("tx_verify_type in", values, "txVerifyType");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeNotIn(List<Integer> values) {
            addCriterion("tx_verify_type not in", values, "txVerifyType");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeBetween(Integer value1, Integer value2) {
            addCriterion("tx_verify_type between", value1, value2, "txVerifyType");
            return (Criteria) this;
        }

        public Criteria andTxVerifyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tx_verify_type not between", value1, value2, "txVerifyType");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNull() {
            addCriterion("pay_pwd is null");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNotNull() {
            addCriterion("pay_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPayPwdEqualTo(String value) {
            addCriterion("pay_pwd =", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotEqualTo(String value) {
            addCriterion("pay_pwd <>", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThan(String value) {
            addCriterion("pay_pwd >", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_pwd >=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThan(String value) {
            addCriterion("pay_pwd <", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThanOrEqualTo(String value) {
            addCriterion("pay_pwd <=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLike(String value) {
            addCriterion("pay_pwd like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotLike(String value) {
            addCriterion("pay_pwd not like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdIn(List<String> values) {
            addCriterion("pay_pwd in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotIn(List<String> values) {
            addCriterion("pay_pwd not in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdBetween(String value1, String value2) {
            addCriterion("pay_pwd between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotBetween(String value1, String value2) {
            addCriterion("pay_pwd not between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyIsNull() {
            addCriterion("verify_code_key is null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyIsNotNull() {
            addCriterion("verify_code_key is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyEqualTo(String value) {
            addCriterion("verify_code_key =", value, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyNotEqualTo(String value) {
            addCriterion("verify_code_key <>", value, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyGreaterThan(String value) {
            addCriterion("verify_code_key >", value, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("verify_code_key >=", value, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyLessThan(String value) {
            addCriterion("verify_code_key <", value, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyLessThanOrEqualTo(String value) {
            addCriterion("verify_code_key <=", value, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyLike(String value) {
            addCriterion("verify_code_key like", value, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyNotLike(String value) {
            addCriterion("verify_code_key not like", value, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyIn(List<String> values) {
            addCriterion("verify_code_key in", values, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyNotIn(List<String> values) {
            addCriterion("verify_code_key not in", values, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyBetween(String value1, String value2) {
            addCriterion("verify_code_key between", value1, value2, "verifyCodeKey");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeKeyNotBetween(String value1, String value2) {
            addCriterion("verify_code_key not between", value1, value2, "verifyCodeKey");
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
