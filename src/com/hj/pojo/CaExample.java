package com.hj.pojo;

import java.util.ArrayList;
import java.util.List;

public class CaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andCase1IsNull() {
            addCriterion("case1 is null");
            return (Criteria) this;
        }

        public Criteria andCase1IsNotNull() {
            addCriterion("case1 is not null");
            return (Criteria) this;
        }

        public Criteria andCase1EqualTo(Integer value) {
            addCriterion("case1 =", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1NotEqualTo(Integer value) {
            addCriterion("case1 <>", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1GreaterThan(Integer value) {
            addCriterion("case1 >", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1GreaterThanOrEqualTo(Integer value) {
            addCriterion("case1 >=", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1LessThan(Integer value) {
            addCriterion("case1 <", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1LessThanOrEqualTo(Integer value) {
            addCriterion("case1 <=", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1In(List<Integer> values) {
            addCriterion("case1 in", values, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1NotIn(List<Integer> values) {
            addCriterion("case1 not in", values, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1Between(Integer value1, Integer value2) {
            addCriterion("case1 between", value1, value2, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1NotBetween(Integer value1, Integer value2) {
            addCriterion("case1 not between", value1, value2, "case1");
            return (Criteria) this;
        }

        public Criteria andTime1IsNull() {
            addCriterion("time1 is null");
            return (Criteria) this;
        }

        public Criteria andTime1IsNotNull() {
            addCriterion("time1 is not null");
            return (Criteria) this;
        }

        public Criteria andTime1EqualTo(Integer value) {
            addCriterion("time1 =", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotEqualTo(Integer value) {
            addCriterion("time1 <>", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThan(Integer value) {
            addCriterion("time1 >", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThanOrEqualTo(Integer value) {
            addCriterion("time1 >=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThan(Integer value) {
            addCriterion("time1 <", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThanOrEqualTo(Integer value) {
            addCriterion("time1 <=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1In(List<Integer> values) {
            addCriterion("time1 in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotIn(List<Integer> values) {
            addCriterion("time1 not in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1Between(Integer value1, Integer value2) {
            addCriterion("time1 between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotBetween(Integer value1, Integer value2) {
            addCriterion("time1 not between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andCase2IsNull() {
            addCriterion("case2 is null");
            return (Criteria) this;
        }

        public Criteria andCase2IsNotNull() {
            addCriterion("case2 is not null");
            return (Criteria) this;
        }

        public Criteria andCase2EqualTo(Integer value) {
            addCriterion("case2 =", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2NotEqualTo(Integer value) {
            addCriterion("case2 <>", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2GreaterThan(Integer value) {
            addCriterion("case2 >", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2GreaterThanOrEqualTo(Integer value) {
            addCriterion("case2 >=", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2LessThan(Integer value) {
            addCriterion("case2 <", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2LessThanOrEqualTo(Integer value) {
            addCriterion("case2 <=", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2In(List<Integer> values) {
            addCriterion("case2 in", values, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2NotIn(List<Integer> values) {
            addCriterion("case2 not in", values, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2Between(Integer value1, Integer value2) {
            addCriterion("case2 between", value1, value2, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2NotBetween(Integer value1, Integer value2) {
            addCriterion("case2 not between", value1, value2, "case2");
            return (Criteria) this;
        }

        public Criteria andTime2IsNull() {
            addCriterion("time2 is null");
            return (Criteria) this;
        }

        public Criteria andTime2IsNotNull() {
            addCriterion("time2 is not null");
            return (Criteria) this;
        }

        public Criteria andTime2EqualTo(Integer value) {
            addCriterion("time2 =", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotEqualTo(Integer value) {
            addCriterion("time2 <>", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2GreaterThan(Integer value) {
            addCriterion("time2 >", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2GreaterThanOrEqualTo(Integer value) {
            addCriterion("time2 >=", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2LessThan(Integer value) {
            addCriterion("time2 <", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2LessThanOrEqualTo(Integer value) {
            addCriterion("time2 <=", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2In(List<Integer> values) {
            addCriterion("time2 in", values, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotIn(List<Integer> values) {
            addCriterion("time2 not in", values, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2Between(Integer value1, Integer value2) {
            addCriterion("time2 between", value1, value2, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotBetween(Integer value1, Integer value2) {
            addCriterion("time2 not between", value1, value2, "time2");
            return (Criteria) this;
        }

        public Criteria andCase3IsNull() {
            addCriterion("case3 is null");
            return (Criteria) this;
        }

        public Criteria andCase3IsNotNull() {
            addCriterion("case3 is not null");
            return (Criteria) this;
        }

        public Criteria andCase3EqualTo(Integer value) {
            addCriterion("case3 =", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3NotEqualTo(Integer value) {
            addCriterion("case3 <>", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3GreaterThan(Integer value) {
            addCriterion("case3 >", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3GreaterThanOrEqualTo(Integer value) {
            addCriterion("case3 >=", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3LessThan(Integer value) {
            addCriterion("case3 <", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3LessThanOrEqualTo(Integer value) {
            addCriterion("case3 <=", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3In(List<Integer> values) {
            addCriterion("case3 in", values, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3NotIn(List<Integer> values) {
            addCriterion("case3 not in", values, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3Between(Integer value1, Integer value2) {
            addCriterion("case3 between", value1, value2, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3NotBetween(Integer value1, Integer value2) {
            addCriterion("case3 not between", value1, value2, "case3");
            return (Criteria) this;
        }

        public Criteria andTime3IsNull() {
            addCriterion("time3 is null");
            return (Criteria) this;
        }

        public Criteria andTime3IsNotNull() {
            addCriterion("time3 is not null");
            return (Criteria) this;
        }

        public Criteria andTime3EqualTo(Integer value) {
            addCriterion("time3 =", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotEqualTo(Integer value) {
            addCriterion("time3 <>", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3GreaterThan(Integer value) {
            addCriterion("time3 >", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3GreaterThanOrEqualTo(Integer value) {
            addCriterion("time3 >=", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3LessThan(Integer value) {
            addCriterion("time3 <", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3LessThanOrEqualTo(Integer value) {
            addCriterion("time3 <=", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3In(List<Integer> values) {
            addCriterion("time3 in", values, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotIn(List<Integer> values) {
            addCriterion("time3 not in", values, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3Between(Integer value1, Integer value2) {
            addCriterion("time3 between", value1, value2, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotBetween(Integer value1, Integer value2) {
            addCriterion("time3 not between", value1, value2, "time3");
            return (Criteria) this;
        }

        public Criteria andCase4IsNull() {
            addCriterion("case4 is null");
            return (Criteria) this;
        }

        public Criteria andCase4IsNotNull() {
            addCriterion("case4 is not null");
            return (Criteria) this;
        }

        public Criteria andCase4EqualTo(Integer value) {
            addCriterion("case4 =", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4NotEqualTo(Integer value) {
            addCriterion("case4 <>", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4GreaterThan(Integer value) {
            addCriterion("case4 >", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4GreaterThanOrEqualTo(Integer value) {
            addCriterion("case4 >=", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4LessThan(Integer value) {
            addCriterion("case4 <", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4LessThanOrEqualTo(Integer value) {
            addCriterion("case4 <=", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4In(List<Integer> values) {
            addCriterion("case4 in", values, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4NotIn(List<Integer> values) {
            addCriterion("case4 not in", values, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4Between(Integer value1, Integer value2) {
            addCriterion("case4 between", value1, value2, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4NotBetween(Integer value1, Integer value2) {
            addCriterion("case4 not between", value1, value2, "case4");
            return (Criteria) this;
        }

        public Criteria andTime4IsNull() {
            addCriterion("time4 is null");
            return (Criteria) this;
        }

        public Criteria andTime4IsNotNull() {
            addCriterion("time4 is not null");
            return (Criteria) this;
        }

        public Criteria andTime4EqualTo(Integer value) {
            addCriterion("time4 =", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotEqualTo(Integer value) {
            addCriterion("time4 <>", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4GreaterThan(Integer value) {
            addCriterion("time4 >", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4GreaterThanOrEqualTo(Integer value) {
            addCriterion("time4 >=", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4LessThan(Integer value) {
            addCriterion("time4 <", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4LessThanOrEqualTo(Integer value) {
            addCriterion("time4 <=", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4In(List<Integer> values) {
            addCriterion("time4 in", values, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotIn(List<Integer> values) {
            addCriterion("time4 not in", values, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4Between(Integer value1, Integer value2) {
            addCriterion("time4 between", value1, value2, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotBetween(Integer value1, Integer value2) {
            addCriterion("time4 not between", value1, value2, "time4");
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