package com.reus.freeteam.model;

import java.util.ArrayList;
import java.util.List;

import com.reus.freeteam.base.BaseExample;

public class DemoExample extends BaseExample{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    public DemoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
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
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
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

        public Criteria andTextdemoIsNull() {
            addCriterion("textdemo is null");
            return (Criteria) this;
        }

        public Criteria andTextdemoIsNotNull() {
            addCriterion("textdemo is not null");
            return (Criteria) this;
        }

        public Criteria andTextdemoEqualTo(String value) {
            addCriterion("textdemo =", value, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoNotEqualTo(String value) {
            addCriterion("textdemo <>", value, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoGreaterThan(String value) {
            addCriterion("textdemo >", value, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoGreaterThanOrEqualTo(String value) {
            addCriterion("textdemo >=", value, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoLessThan(String value) {
            addCriterion("textdemo <", value, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoLessThanOrEqualTo(String value) {
            addCriterion("textdemo <=", value, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoLike(String value) {
            addCriterion("textdemo like", value, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoNotLike(String value) {
            addCriterion("textdemo not like", value, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoIn(List<String> values) {
            addCriterion("textdemo in", values, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoNotIn(List<String> values) {
            addCriterion("textdemo not in", values, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoBetween(String value1, String value2) {
            addCriterion("textdemo between", value1, value2, "textdemo");
            return (Criteria) this;
        }

        public Criteria andTextdemoNotBetween(String value1, String value2) {
            addCriterion("textdemo not between", value1, value2, "textdemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoIsNull() {
            addCriterion("radiodemo is null");
            return (Criteria) this;
        }

        public Criteria andRadiodemoIsNotNull() {
            addCriterion("radiodemo is not null");
            return (Criteria) this;
        }

        public Criteria andRadiodemoEqualTo(String value) {
            addCriterion("radiodemo =", value, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoNotEqualTo(String value) {
            addCriterion("radiodemo <>", value, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoGreaterThan(String value) {
            addCriterion("radiodemo >", value, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoGreaterThanOrEqualTo(String value) {
            addCriterion("radiodemo >=", value, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoLessThan(String value) {
            addCriterion("radiodemo <", value, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoLessThanOrEqualTo(String value) {
            addCriterion("radiodemo <=", value, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoLike(String value) {
            addCriterion("radiodemo like", value, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoNotLike(String value) {
            addCriterion("radiodemo not like", value, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoIn(List<String> values) {
            addCriterion("radiodemo in", values, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoNotIn(List<String> values) {
            addCriterion("radiodemo not in", values, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoBetween(String value1, String value2) {
            addCriterion("radiodemo between", value1, value2, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andRadiodemoNotBetween(String value1, String value2) {
            addCriterion("radiodemo not between", value1, value2, "radiodemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoIsNull() {
            addCriterion("checkboxdemo is null");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoIsNotNull() {
            addCriterion("checkboxdemo is not null");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoEqualTo(String value) {
            addCriterion("checkboxdemo =", value, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoNotEqualTo(String value) {
            addCriterion("checkboxdemo <>", value, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoGreaterThan(String value) {
            addCriterion("checkboxdemo >", value, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoGreaterThanOrEqualTo(String value) {
            addCriterion("checkboxdemo >=", value, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoLessThan(String value) {
            addCriterion("checkboxdemo <", value, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoLessThanOrEqualTo(String value) {
            addCriterion("checkboxdemo <=", value, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoLike(String value) {
            addCriterion("checkboxdemo like", value, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoNotLike(String value) {
            addCriterion("checkboxdemo not like", value, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoIn(List<String> values) {
            addCriterion("checkboxdemo in", values, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoNotIn(List<String> values) {
            addCriterion("checkboxdemo not in", values, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoBetween(String value1, String value2) {
            addCriterion("checkboxdemo between", value1, value2, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andCheckboxdemoNotBetween(String value1, String value2) {
            addCriterion("checkboxdemo not between", value1, value2, "checkboxdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoIsNull() {
            addCriterion("selectdemo is null");
            return (Criteria) this;
        }

        public Criteria andSelectdemoIsNotNull() {
            addCriterion("selectdemo is not null");
            return (Criteria) this;
        }

        public Criteria andSelectdemoEqualTo(String value) {
            addCriterion("selectdemo =", value, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoNotEqualTo(String value) {
            addCriterion("selectdemo <>", value, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoGreaterThan(String value) {
            addCriterion("selectdemo >", value, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoGreaterThanOrEqualTo(String value) {
            addCriterion("selectdemo >=", value, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoLessThan(String value) {
            addCriterion("selectdemo <", value, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoLessThanOrEqualTo(String value) {
            addCriterion("selectdemo <=", value, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoLike(String value) {
            addCriterion("selectdemo like", value, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoNotLike(String value) {
            addCriterion("selectdemo not like", value, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoIn(List<String> values) {
            addCriterion("selectdemo in", values, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoNotIn(List<String> values) {
            addCriterion("selectdemo not in", values, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoBetween(String value1, String value2) {
            addCriterion("selectdemo between", value1, value2, "selectdemo");
            return (Criteria) this;
        }

        public Criteria andSelectdemoNotBetween(String value1, String value2) {
            addCriterion("selectdemo not between", value1, value2, "selectdemo");
            return (Criteria) this;
        }

        
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_demo
     *
     * @mbggenerated do_not_delete_during_merge Sat Jun 08 21:58:15 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_demo
     *
     * @mbggenerated Sat Jun 08 21:58:15 CST 2013
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