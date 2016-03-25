package com.reus.freeteam.cms.model;

import java.util.ArrayList;
import java.util.List;

import com.reus.freeteam.base.BaseExample;

public class SensitiveExample extends BaseExample{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public SensitiveExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSensitivewordIsNull() {
            addCriterion("sensitiveword is null");
            return (Criteria) this;
        }

        public Criteria andSensitivewordIsNotNull() {
            addCriterion("sensitiveword is not null");
            return (Criteria) this;
        }

        public Criteria andSensitivewordEqualTo(String value) {
            addCriterion("sensitiveword =", value, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordNotEqualTo(String value) {
            addCriterion("sensitiveword <>", value, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordGreaterThan(String value) {
            addCriterion("sensitiveword >", value, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordGreaterThanOrEqualTo(String value) {
            addCriterion("sensitiveword >=", value, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordLessThan(String value) {
            addCriterion("sensitiveword <", value, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordLessThanOrEqualTo(String value) {
            addCriterion("sensitiveword <=", value, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordLike(String value) {
            addCriterion("sensitiveword like", value, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordNotLike(String value) {
            addCriterion("sensitiveword not like", value, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordIn(List<String> values) {
            addCriterion("sensitiveword in", values, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordNotIn(List<String> values) {
            addCriterion("sensitiveword not in", values, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordBetween(String value1, String value2) {
            addCriterion("sensitiveword between", value1, value2, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andSensitivewordNotBetween(String value1, String value2) {
            addCriterion("sensitiveword not between", value1, value2, "sensitiveword");
            return (Criteria) this;
        }

        public Criteria andReplacetoIsNull() {
            addCriterion("replaceto is null");
            return (Criteria) this;
        }

        public Criteria andReplacetoIsNotNull() {
            addCriterion("replaceto is not null");
            return (Criteria) this;
        }

        public Criteria andReplacetoEqualTo(String value) {
            addCriterion("replaceto =", value, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoNotEqualTo(String value) {
            addCriterion("replaceto <>", value, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoGreaterThan(String value) {
            addCriterion("replaceto >", value, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoGreaterThanOrEqualTo(String value) {
            addCriterion("replaceto >=", value, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoLessThan(String value) {
            addCriterion("replaceto <", value, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoLessThanOrEqualTo(String value) {
            addCriterion("replaceto <=", value, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoLike(String value) {
            addCriterion("replaceto like", value, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoNotLike(String value) {
            addCriterion("replaceto not like", value, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoIn(List<String> values) {
            addCriterion("replaceto in", values, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoNotIn(List<String> values) {
            addCriterion("replaceto not in", values, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoBetween(String value1, String value2) {
            addCriterion("replaceto between", value1, value2, "replaceto");
            return (Criteria) this;
        }

        public Criteria andReplacetoNotBetween(String value1, String value2) {
            addCriterion("replaceto not between", value1, value2, "replaceto");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_sensitive
     *
     * @mbggenerated do_not_delete_during_merge Sun Apr 28 15:41:01 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_sensitive
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
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