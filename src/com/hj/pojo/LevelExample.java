package com.hj.pojo;

import java.util.ArrayList;
import java.util.List;

public class LevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LevelExample() {
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

        public Criteria andLevelidIsNull() {
            addCriterion("levelid is null");
            return (Criteria) this;
        }

        public Criteria andLevelidIsNotNull() {
            addCriterion("levelid is not null");
            return (Criteria) this;
        }

        public Criteria andLevelidEqualTo(Integer value) {
            addCriterion("levelid =", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotEqualTo(Integer value) {
            addCriterion("levelid <>", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThan(Integer value) {
            addCriterion("levelid >", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelid >=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThan(Integer value) {
            addCriterion("levelid <", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThanOrEqualTo(Integer value) {
            addCriterion("levelid <=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidIn(List<Integer> values) {
            addCriterion("levelid in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotIn(List<Integer> values) {
            addCriterion("levelid not in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidBetween(Integer value1, Integer value2) {
            addCriterion("levelid between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("levelid not between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelnameIsNull() {
            addCriterion("levelname is null");
            return (Criteria) this;
        }

        public Criteria andLevelnameIsNotNull() {
            addCriterion("levelname is not null");
            return (Criteria) this;
        }

        public Criteria andLevelnameEqualTo(String value) {
            addCriterion("levelname =", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotEqualTo(String value) {
            addCriterion("levelname <>", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameGreaterThan(String value) {
            addCriterion("levelname >", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameGreaterThanOrEqualTo(String value) {
            addCriterion("levelname >=", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameLessThan(String value) {
            addCriterion("levelname <", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameLessThanOrEqualTo(String value) {
            addCriterion("levelname <=", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameLike(String value) {
            addCriterion("levelname like", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotLike(String value) {
            addCriterion("levelname not like", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameIn(List<String> values) {
            addCriterion("levelname in", values, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotIn(List<String> values) {
            addCriterion("levelname not in", values, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameBetween(String value1, String value2) {
            addCriterion("levelname between", value1, value2, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotBetween(String value1, String value2) {
            addCriterion("levelname not between", value1, value2, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelrankIsNull() {
            addCriterion("levelrank is null");
            return (Criteria) this;
        }

        public Criteria andLevelrankIsNotNull() {
            addCriterion("levelrank is not null");
            return (Criteria) this;
        }

        public Criteria andLevelrankEqualTo(Integer value) {
            addCriterion("levelrank =", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankNotEqualTo(Integer value) {
            addCriterion("levelrank <>", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankGreaterThan(Integer value) {
            addCriterion("levelrank >", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelrank >=", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankLessThan(Integer value) {
            addCriterion("levelrank <", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankLessThanOrEqualTo(Integer value) {
            addCriterion("levelrank <=", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankIn(List<Integer> values) {
            addCriterion("levelrank in", values, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankNotIn(List<Integer> values) {
            addCriterion("levelrank not in", values, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankBetween(Integer value1, Integer value2) {
            addCriterion("levelrank between", value1, value2, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankNotBetween(Integer value1, Integer value2) {
            addCriterion("levelrank not between", value1, value2, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLeveldetalIsNull() {
            addCriterion("leveldetal is null");
            return (Criteria) this;
        }

        public Criteria andLeveldetalIsNotNull() {
            addCriterion("leveldetal is not null");
            return (Criteria) this;
        }

        public Criteria andLeveldetalEqualTo(String value) {
            addCriterion("leveldetal =", value, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalNotEqualTo(String value) {
            addCriterion("leveldetal <>", value, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalGreaterThan(String value) {
            addCriterion("leveldetal >", value, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalGreaterThanOrEqualTo(String value) {
            addCriterion("leveldetal >=", value, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalLessThan(String value) {
            addCriterion("leveldetal <", value, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalLessThanOrEqualTo(String value) {
            addCriterion("leveldetal <=", value, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalLike(String value) {
            addCriterion("leveldetal like", value, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalNotLike(String value) {
            addCriterion("leveldetal not like", value, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalIn(List<String> values) {
            addCriterion("leveldetal in", values, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalNotIn(List<String> values) {
            addCriterion("leveldetal not in", values, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalBetween(String value1, String value2) {
            addCriterion("leveldetal between", value1, value2, "leveldetal");
            return (Criteria) this;
        }

        public Criteria andLeveldetalNotBetween(String value1, String value2) {
            addCriterion("leveldetal not between", value1, value2, "leveldetal");
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