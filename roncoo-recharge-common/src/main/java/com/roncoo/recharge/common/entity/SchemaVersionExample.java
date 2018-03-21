/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchemaVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public SchemaVersionExample() {
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionRankIsNull() {
            addCriterion("version_rank is null");
            return (Criteria) this;
        }

        public Criteria andVersionRankIsNotNull() {
            addCriterion("version_rank is not null");
            return (Criteria) this;
        }

        public Criteria andVersionRankEqualTo(Integer value) {
            addCriterion("version_rank =", value, "versionRank");
            return (Criteria) this;
        }

        public Criteria andVersionRankNotEqualTo(Integer value) {
            addCriterion("version_rank <>", value, "versionRank");
            return (Criteria) this;
        }

        public Criteria andVersionRankGreaterThan(Integer value) {
            addCriterion("version_rank >", value, "versionRank");
            return (Criteria) this;
        }

        public Criteria andVersionRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_rank >=", value, "versionRank");
            return (Criteria) this;
        }

        public Criteria andVersionRankLessThan(Integer value) {
            addCriterion("version_rank <", value, "versionRank");
            return (Criteria) this;
        }

        public Criteria andVersionRankLessThanOrEqualTo(Integer value) {
            addCriterion("version_rank <=", value, "versionRank");
            return (Criteria) this;
        }

        public Criteria andVersionRankIn(List<Integer> values) {
            addCriterion("version_rank in", values, "versionRank");
            return (Criteria) this;
        }

        public Criteria andVersionRankNotIn(List<Integer> values) {
            addCriterion("version_rank not in", values, "versionRank");
            return (Criteria) this;
        }

        public Criteria andVersionRankBetween(Integer value1, Integer value2) {
            addCriterion("version_rank between", value1, value2, "versionRank");
            return (Criteria) this;
        }

        public Criteria andVersionRankNotBetween(Integer value1, Integer value2) {
            addCriterion("version_rank not between", value1, value2, "versionRank");
            return (Criteria) this;
        }

        public Criteria andInstalledRankIsNull() {
            addCriterion("installed_rank is null");
            return (Criteria) this;
        }

        public Criteria andInstalledRankIsNotNull() {
            addCriterion("installed_rank is not null");
            return (Criteria) this;
        }

        public Criteria andInstalledRankEqualTo(Integer value) {
            addCriterion("installed_rank =", value, "installedRank");
            return (Criteria) this;
        }

        public Criteria andInstalledRankNotEqualTo(Integer value) {
            addCriterion("installed_rank <>", value, "installedRank");
            return (Criteria) this;
        }

        public Criteria andInstalledRankGreaterThan(Integer value) {
            addCriterion("installed_rank >", value, "installedRank");
            return (Criteria) this;
        }

        public Criteria andInstalledRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("installed_rank >=", value, "installedRank");
            return (Criteria) this;
        }

        public Criteria andInstalledRankLessThan(Integer value) {
            addCriterion("installed_rank <", value, "installedRank");
            return (Criteria) this;
        }

        public Criteria andInstalledRankLessThanOrEqualTo(Integer value) {
            addCriterion("installed_rank <=", value, "installedRank");
            return (Criteria) this;
        }

        public Criteria andInstalledRankIn(List<Integer> values) {
            addCriterion("installed_rank in", values, "installedRank");
            return (Criteria) this;
        }

        public Criteria andInstalledRankNotIn(List<Integer> values) {
            addCriterion("installed_rank not in", values, "installedRank");
            return (Criteria) this;
        }

        public Criteria andInstalledRankBetween(Integer value1, Integer value2) {
            addCriterion("installed_rank between", value1, value2, "installedRank");
            return (Criteria) this;
        }

        public Criteria andInstalledRankNotBetween(Integer value1, Integer value2) {
            addCriterion("installed_rank not between", value1, value2, "installedRank");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andScriptIsNull() {
            addCriterion("script is null");
            return (Criteria) this;
        }

        public Criteria andScriptIsNotNull() {
            addCriterion("script is not null");
            return (Criteria) this;
        }

        public Criteria andScriptEqualTo(String value) {
            addCriterion("script =", value, "script");
            return (Criteria) this;
        }

        public Criteria andScriptNotEqualTo(String value) {
            addCriterion("script <>", value, "script");
            return (Criteria) this;
        }

        public Criteria andScriptGreaterThan(String value) {
            addCriterion("script >", value, "script");
            return (Criteria) this;
        }

        public Criteria andScriptGreaterThanOrEqualTo(String value) {
            addCriterion("script >=", value, "script");
            return (Criteria) this;
        }

        public Criteria andScriptLessThan(String value) {
            addCriterion("script <", value, "script");
            return (Criteria) this;
        }

        public Criteria andScriptLessThanOrEqualTo(String value) {
            addCriterion("script <=", value, "script");
            return (Criteria) this;
        }

        public Criteria andScriptLike(String value) {
            addCriterion("script like", value, "script");
            return (Criteria) this;
        }

        public Criteria andScriptNotLike(String value) {
            addCriterion("script not like", value, "script");
            return (Criteria) this;
        }

        public Criteria andScriptIn(List<String> values) {
            addCriterion("script in", values, "script");
            return (Criteria) this;
        }

        public Criteria andScriptNotIn(List<String> values) {
            addCriterion("script not in", values, "script");
            return (Criteria) this;
        }

        public Criteria andScriptBetween(String value1, String value2) {
            addCriterion("script between", value1, value2, "script");
            return (Criteria) this;
        }

        public Criteria andScriptNotBetween(String value1, String value2) {
            addCriterion("script not between", value1, value2, "script");
            return (Criteria) this;
        }

        public Criteria andChecksumIsNull() {
            addCriterion("checksum is null");
            return (Criteria) this;
        }

        public Criteria andChecksumIsNotNull() {
            addCriterion("checksum is not null");
            return (Criteria) this;
        }

        public Criteria andChecksumEqualTo(Integer value) {
            addCriterion("checksum =", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumNotEqualTo(Integer value) {
            addCriterion("checksum <>", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumGreaterThan(Integer value) {
            addCriterion("checksum >", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumGreaterThanOrEqualTo(Integer value) {
            addCriterion("checksum >=", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumLessThan(Integer value) {
            addCriterion("checksum <", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumLessThanOrEqualTo(Integer value) {
            addCriterion("checksum <=", value, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumIn(List<Integer> values) {
            addCriterion("checksum in", values, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumNotIn(List<Integer> values) {
            addCriterion("checksum not in", values, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumBetween(Integer value1, Integer value2) {
            addCriterion("checksum between", value1, value2, "checksum");
            return (Criteria) this;
        }

        public Criteria andChecksumNotBetween(Integer value1, Integer value2) {
            addCriterion("checksum not between", value1, value2, "checksum");
            return (Criteria) this;
        }

        public Criteria andInstalledByIsNull() {
            addCriterion("installed_by is null");
            return (Criteria) this;
        }

        public Criteria andInstalledByIsNotNull() {
            addCriterion("installed_by is not null");
            return (Criteria) this;
        }

        public Criteria andInstalledByEqualTo(String value) {
            addCriterion("installed_by =", value, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByNotEqualTo(String value) {
            addCriterion("installed_by <>", value, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByGreaterThan(String value) {
            addCriterion("installed_by >", value, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByGreaterThanOrEqualTo(String value) {
            addCriterion("installed_by >=", value, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByLessThan(String value) {
            addCriterion("installed_by <", value, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByLessThanOrEqualTo(String value) {
            addCriterion("installed_by <=", value, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByLike(String value) {
            addCriterion("installed_by like", value, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByNotLike(String value) {
            addCriterion("installed_by not like", value, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByIn(List<String> values) {
            addCriterion("installed_by in", values, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByNotIn(List<String> values) {
            addCriterion("installed_by not in", values, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByBetween(String value1, String value2) {
            addCriterion("installed_by between", value1, value2, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledByNotBetween(String value1, String value2) {
            addCriterion("installed_by not between", value1, value2, "installedBy");
            return (Criteria) this;
        }

        public Criteria andInstalledOnIsNull() {
            addCriterion("installed_on is null");
            return (Criteria) this;
        }

        public Criteria andInstalledOnIsNotNull() {
            addCriterion("installed_on is not null");
            return (Criteria) this;
        }

        public Criteria andInstalledOnEqualTo(Date value) {
            addCriterion("installed_on =", value, "installedOn");
            return (Criteria) this;
        }

        public Criteria andInstalledOnNotEqualTo(Date value) {
            addCriterion("installed_on <>", value, "installedOn");
            return (Criteria) this;
        }

        public Criteria andInstalledOnGreaterThan(Date value) {
            addCriterion("installed_on >", value, "installedOn");
            return (Criteria) this;
        }

        public Criteria andInstalledOnGreaterThanOrEqualTo(Date value) {
            addCriterion("installed_on >=", value, "installedOn");
            return (Criteria) this;
        }

        public Criteria andInstalledOnLessThan(Date value) {
            addCriterion("installed_on <", value, "installedOn");
            return (Criteria) this;
        }

        public Criteria andInstalledOnLessThanOrEqualTo(Date value) {
            addCriterion("installed_on <=", value, "installedOn");
            return (Criteria) this;
        }

        public Criteria andInstalledOnIn(List<Date> values) {
            addCriterion("installed_on in", values, "installedOn");
            return (Criteria) this;
        }

        public Criteria andInstalledOnNotIn(List<Date> values) {
            addCriterion("installed_on not in", values, "installedOn");
            return (Criteria) this;
        }

        public Criteria andInstalledOnBetween(Date value1, Date value2) {
            addCriterion("installed_on between", value1, value2, "installedOn");
            return (Criteria) this;
        }

        public Criteria andInstalledOnNotBetween(Date value1, Date value2) {
            addCriterion("installed_on not between", value1, value2, "installedOn");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeIsNull() {
            addCriterion("execution_time is null");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeIsNotNull() {
            addCriterion("execution_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeEqualTo(Integer value) {
            addCriterion("execution_time =", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeNotEqualTo(Integer value) {
            addCriterion("execution_time <>", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeGreaterThan(Integer value) {
            addCriterion("execution_time >", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("execution_time >=", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeLessThan(Integer value) {
            addCriterion("execution_time <", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeLessThanOrEqualTo(Integer value) {
            addCriterion("execution_time <=", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeIn(List<Integer> values) {
            addCriterion("execution_time in", values, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeNotIn(List<Integer> values) {
            addCriterion("execution_time not in", values, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeBetween(Integer value1, Integer value2) {
            addCriterion("execution_time between", value1, value2, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("execution_time not between", value1, value2, "executionTime");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNull() {
            addCriterion("success is null");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNotNull() {
            addCriterion("success is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessEqualTo(Boolean value) {
            addCriterion("success =", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotEqualTo(Boolean value) {
            addCriterion("success <>", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThan(Boolean value) {
            addCriterion("success >", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("success >=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThan(Boolean value) {
            addCriterion("success <", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThanOrEqualTo(Boolean value) {
            addCriterion("success <=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessIn(List<Boolean> values) {
            addCriterion("success in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotIn(List<Boolean> values) {
            addCriterion("success not in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessBetween(Boolean value1, Boolean value2) {
            addCriterion("success between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("success not between", value1, value2, "success");
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
