package com.hj.pojo;

import java.util.ArrayList;
import java.util.List;

public class DepartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartExample() {
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

        public Criteria andDepartnameIsNull() {
            addCriterion("departname is null");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNotNull() {
            addCriterion("departname is not null");
            return (Criteria) this;
        }

        public Criteria andDepartnameEqualTo(String value) {
            addCriterion("departname =", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotEqualTo(String value) {
            addCriterion("departname <>", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThan(String value) {
            addCriterion("departname >", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThanOrEqualTo(String value) {
            addCriterion("departname >=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThan(String value) {
            addCriterion("departname <", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThanOrEqualTo(String value) {
            addCriterion("departname <=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLike(String value) {
            addCriterion("departname like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotLike(String value) {
            addCriterion("departname not like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameIn(List<String> values) {
            addCriterion("departname in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotIn(List<String> values) {
            addCriterion("departname not in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameBetween(String value1, String value2) {
            addCriterion("departname between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotBetween(String value1, String value2) {
            addCriterion("departname not between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNull() {
            addCriterion("departid is null");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNotNull() {
            addCriterion("departid is not null");
            return (Criteria) this;
        }

        public Criteria andDepartidEqualTo(Integer value) {
            addCriterion("departid =", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotEqualTo(Integer value) {
            addCriterion("departid <>", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThan(Integer value) {
            addCriterion("departid >", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departid >=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThan(Integer value) {
            addCriterion("departid <", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThanOrEqualTo(Integer value) {
            addCriterion("departid <=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidIn(List<Integer> values) {
            addCriterion("departid in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotIn(List<Integer> values) {
            addCriterion("departid not in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidBetween(Integer value1, Integer value2) {
            addCriterion("departid between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotBetween(Integer value1, Integer value2) {
            addCriterion("departid not between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartrootIsNull() {
            addCriterion("departroot is null");
            return (Criteria) this;
        }

        public Criteria andDepartrootIsNotNull() {
            addCriterion("departroot is not null");
            return (Criteria) this;
        }

        public Criteria andDepartrootEqualTo(String value) {
            addCriterion("departroot =", value, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootNotEqualTo(String value) {
            addCriterion("departroot <>", value, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootGreaterThan(String value) {
            addCriterion("departroot >", value, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootGreaterThanOrEqualTo(String value) {
            addCriterion("departroot >=", value, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootLessThan(String value) {
            addCriterion("departroot <", value, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootLessThanOrEqualTo(String value) {
            addCriterion("departroot <=", value, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootLike(String value) {
            addCriterion("departroot like", value, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootNotLike(String value) {
            addCriterion("departroot not like", value, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootIn(List<String> values) {
            addCriterion("departroot in", values, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootNotIn(List<String> values) {
            addCriterion("departroot not in", values, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootBetween(String value1, String value2) {
            addCriterion("departroot between", value1, value2, "departroot");
            return (Criteria) this;
        }

        public Criteria andDepartrootNotBetween(String value1, String value2) {
            addCriterion("departroot not between", value1, value2, "departroot");
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