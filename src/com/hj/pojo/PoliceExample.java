package com.hj.pojo;

import java.util.ArrayList;
import java.util.List;

public class PoliceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoliceExample() {
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

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnumIsNull() {
            addCriterion("pnum is null");
            return (Criteria) this;
        }

        public Criteria andPnumIsNotNull() {
            addCriterion("pnum is not null");
            return (Criteria) this;
        }

        public Criteria andPnumEqualTo(Integer value) {
            addCriterion("pnum =", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotEqualTo(Integer value) {
            addCriterion("pnum <>", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThan(Integer value) {
            addCriterion("pnum >", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pnum >=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThan(Integer value) {
            addCriterion("pnum <", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThanOrEqualTo(Integer value) {
            addCriterion("pnum <=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumIn(List<Integer> values) {
            addCriterion("pnum in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotIn(List<Integer> values) {
            addCriterion("pnum not in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumBetween(Integer value1, Integer value2) {
            addCriterion("pnum between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotBetween(Integer value1, Integer value2) {
            addCriterion("pnum not between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andPlevelIsNull() {
            addCriterion("plevel is null");
            return (Criteria) this;
        }

        public Criteria andPlevelIsNotNull() {
            addCriterion("plevel is not null");
            return (Criteria) this;
        }

        public Criteria andPlevelEqualTo(Integer value) {
            addCriterion("plevel =", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelNotEqualTo(Integer value) {
            addCriterion("plevel <>", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelGreaterThan(Integer value) {
            addCriterion("plevel >", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("plevel >=", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelLessThan(Integer value) {
            addCriterion("plevel <", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelLessThanOrEqualTo(Integer value) {
            addCriterion("plevel <=", value, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelIn(List<Integer> values) {
            addCriterion("plevel in", values, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelNotIn(List<Integer> values) {
            addCriterion("plevel not in", values, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelBetween(Integer value1, Integer value2) {
            addCriterion("plevel between", value1, value2, "plevel");
            return (Criteria) this;
        }

        public Criteria andPlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("plevel not between", value1, value2, "plevel");
            return (Criteria) this;
        }

        public Criteria andPpswIsNull() {
            addCriterion("ppsw is null");
            return (Criteria) this;
        }

        public Criteria andPpswIsNotNull() {
            addCriterion("ppsw is not null");
            return (Criteria) this;
        }

        public Criteria andPpswEqualTo(String value) {
            addCriterion("ppsw =", value, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswNotEqualTo(String value) {
            addCriterion("ppsw <>", value, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswGreaterThan(String value) {
            addCriterion("ppsw >", value, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswGreaterThanOrEqualTo(String value) {
            addCriterion("ppsw >=", value, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswLessThan(String value) {
            addCriterion("ppsw <", value, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswLessThanOrEqualTo(String value) {
            addCriterion("ppsw <=", value, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswLike(String value) {
            addCriterion("ppsw like", value, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswNotLike(String value) {
            addCriterion("ppsw not like", value, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswIn(List<String> values) {
            addCriterion("ppsw in", values, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswNotIn(List<String> values) {
            addCriterion("ppsw not in", values, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswBetween(String value1, String value2) {
            addCriterion("ppsw between", value1, value2, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPpswNotBetween(String value1, String value2) {
            addCriterion("ppsw not between", value1, value2, "ppsw");
            return (Criteria) this;
        }

        public Criteria andPtelIsNull() {
            addCriterion("ptel is null");
            return (Criteria) this;
        }

        public Criteria andPtelIsNotNull() {
            addCriterion("ptel is not null");
            return (Criteria) this;
        }

        public Criteria andPtelEqualTo(String value) {
            addCriterion("ptel =", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotEqualTo(String value) {
            addCriterion("ptel <>", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelGreaterThan(String value) {
            addCriterion("ptel >", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelGreaterThanOrEqualTo(String value) {
            addCriterion("ptel >=", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelLessThan(String value) {
            addCriterion("ptel <", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelLessThanOrEqualTo(String value) {
            addCriterion("ptel <=", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelLike(String value) {
            addCriterion("ptel like", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotLike(String value) {
            addCriterion("ptel not like", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelIn(List<String> values) {
            addCriterion("ptel in", values, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotIn(List<String> values) {
            addCriterion("ptel not in", values, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelBetween(String value1, String value2) {
            addCriterion("ptel between", value1, value2, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotBetween(String value1, String value2) {
            addCriterion("ptel not between", value1, value2, "ptel");
            return (Criteria) this;
        }

        public Criteria andPsexIsNull() {
            addCriterion("psex is null");
            return (Criteria) this;
        }

        public Criteria andPsexIsNotNull() {
            addCriterion("psex is not null");
            return (Criteria) this;
        }

        public Criteria andPsexEqualTo(String value) {
            addCriterion("psex =", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotEqualTo(String value) {
            addCriterion("psex <>", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexGreaterThan(String value) {
            addCriterion("psex >", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexGreaterThanOrEqualTo(String value) {
            addCriterion("psex >=", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLessThan(String value) {
            addCriterion("psex <", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLessThanOrEqualTo(String value) {
            addCriterion("psex <=", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLike(String value) {
            addCriterion("psex like", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotLike(String value) {
            addCriterion("psex not like", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexIn(List<String> values) {
            addCriterion("psex in", values, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotIn(List<String> values) {
            addCriterion("psex not in", values, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexBetween(String value1, String value2) {
            addCriterion("psex between", value1, value2, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotBetween(String value1, String value2) {
            addCriterion("psex not between", value1, value2, "psex");
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

        public Criteria andLevelrankIsNull() {
            addCriterion("\" levelrank\" is null");
            return (Criteria) this;
        }

        public Criteria andLevelrankIsNotNull() {
            addCriterion("\" levelrank\" is not null");
            return (Criteria) this;
        }

        public Criteria andLevelrankEqualTo(Integer value) {
            addCriterion("\" levelrank\" =", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankNotEqualTo(Integer value) {
            addCriterion("\" levelrank\" <>", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankGreaterThan(Integer value) {
            addCriterion("\" levelrank\" >", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("\" levelrank\" >=", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankLessThan(Integer value) {
            addCriterion("\" levelrank\" <", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankLessThanOrEqualTo(Integer value) {
            addCriterion("\" levelrank\" <=", value, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankIn(List<Integer> values) {
            addCriterion("\" levelrank\" in", values, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankNotIn(List<Integer> values) {
            addCriterion("\" levelrank\" not in", values, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankBetween(Integer value1, Integer value2) {
            addCriterion("\" levelrank\" between", value1, value2, "levelrank");
            return (Criteria) this;
        }

        public Criteria andLevelrankNotBetween(Integer value1, Integer value2) {
            addCriterion("\" levelrank\" not between", value1, value2, "levelrank");
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