package com.hj.pojo;

import java.util.ArrayList;
import java.util.List;

public class RelevantmantableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelevantmantableExample() {
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

        public Criteria andRelevantnameIsNull() {
            addCriterion("relevantname is null");
            return (Criteria) this;
        }

        public Criteria andRelevantnameIsNotNull() {
            addCriterion("relevantname is not null");
            return (Criteria) this;
        }

        public Criteria andRelevantnameEqualTo(String value) {
            addCriterion("relevantname =", value, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameNotEqualTo(String value) {
            addCriterion("relevantname <>", value, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameGreaterThan(String value) {
            addCriterion("relevantname >", value, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameGreaterThanOrEqualTo(String value) {
            addCriterion("relevantname >=", value, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameLessThan(String value) {
            addCriterion("relevantname <", value, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameLessThanOrEqualTo(String value) {
            addCriterion("relevantname <=", value, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameLike(String value) {
            addCriterion("relevantname like", value, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameNotLike(String value) {
            addCriterion("relevantname not like", value, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameIn(List<String> values) {
            addCriterion("relevantname in", values, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameNotIn(List<String> values) {
            addCriterion("relevantname not in", values, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameBetween(String value1, String value2) {
            addCriterion("relevantname between", value1, value2, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantnameNotBetween(String value1, String value2) {
            addCriterion("relevantname not between", value1, value2, "relevantname");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressIsNull() {
            addCriterion("relevantaddress is null");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressIsNotNull() {
            addCriterion("relevantaddress is not null");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressEqualTo(String value) {
            addCriterion("relevantaddress =", value, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressNotEqualTo(String value) {
            addCriterion("relevantaddress <>", value, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressGreaterThan(String value) {
            addCriterion("relevantaddress >", value, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressGreaterThanOrEqualTo(String value) {
            addCriterion("relevantaddress >=", value, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressLessThan(String value) {
            addCriterion("relevantaddress <", value, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressLessThanOrEqualTo(String value) {
            addCriterion("relevantaddress <=", value, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressLike(String value) {
            addCriterion("relevantaddress like", value, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressNotLike(String value) {
            addCriterion("relevantaddress not like", value, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressIn(List<String> values) {
            addCriterion("relevantaddress in", values, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressNotIn(List<String> values) {
            addCriterion("relevantaddress not in", values, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressBetween(String value1, String value2) {
            addCriterion("relevantaddress between", value1, value2, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevantaddressNotBetween(String value1, String value2) {
            addCriterion("relevantaddress not between", value1, value2, "relevantaddress");
            return (Criteria) this;
        }

        public Criteria andRelevanttelIsNull() {
            addCriterion("relevanttel is null");
            return (Criteria) this;
        }

        public Criteria andRelevanttelIsNotNull() {
            addCriterion("relevanttel is not null");
            return (Criteria) this;
        }

        public Criteria andRelevanttelEqualTo(String value) {
            addCriterion("relevanttel =", value, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelNotEqualTo(String value) {
            addCriterion("relevanttel <>", value, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelGreaterThan(String value) {
            addCriterion("relevanttel >", value, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelGreaterThanOrEqualTo(String value) {
            addCriterion("relevanttel >=", value, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelLessThan(String value) {
            addCriterion("relevanttel <", value, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelLessThanOrEqualTo(String value) {
            addCriterion("relevanttel <=", value, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelLike(String value) {
            addCriterion("relevanttel like", value, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelNotLike(String value) {
            addCriterion("relevanttel not like", value, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelIn(List<String> values) {
            addCriterion("relevanttel in", values, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelNotIn(List<String> values) {
            addCriterion("relevanttel not in", values, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelBetween(String value1, String value2) {
            addCriterion("relevanttel between", value1, value2, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevanttelNotBetween(String value1, String value2) {
            addCriterion("relevanttel not between", value1, value2, "relevanttel");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardIsNull() {
            addCriterion("relevantidcard is null");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardIsNotNull() {
            addCriterion("relevantidcard is not null");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardEqualTo(String value) {
            addCriterion("relevantidcard =", value, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardNotEqualTo(String value) {
            addCriterion("relevantidcard <>", value, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardGreaterThan(String value) {
            addCriterion("relevantidcard >", value, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardGreaterThanOrEqualTo(String value) {
            addCriterion("relevantidcard >=", value, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardLessThan(String value) {
            addCriterion("relevantidcard <", value, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardLessThanOrEqualTo(String value) {
            addCriterion("relevantidcard <=", value, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardLike(String value) {
            addCriterion("relevantidcard like", value, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardNotLike(String value) {
            addCriterion("relevantidcard not like", value, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardIn(List<String> values) {
            addCriterion("relevantidcard in", values, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardNotIn(List<String> values) {
            addCriterion("relevantidcard not in", values, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardBetween(String value1, String value2) {
            addCriterion("relevantidcard between", value1, value2, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andRelevantidcardNotBetween(String value1, String value2) {
            addCriterion("relevantidcard not between", value1, value2, "relevantidcard");
            return (Criteria) this;
        }

        public Criteria andIsssueidIsNull() {
            addCriterion("isssueid is null");
            return (Criteria) this;
        }

        public Criteria andIsssueidIsNotNull() {
            addCriterion("isssueid is not null");
            return (Criteria) this;
        }

        public Criteria andIsssueidEqualTo(String value) {
            addCriterion("isssueid =", value, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidNotEqualTo(String value) {
            addCriterion("isssueid <>", value, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidGreaterThan(String value) {
            addCriterion("isssueid >", value, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidGreaterThanOrEqualTo(String value) {
            addCriterion("isssueid >=", value, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidLessThan(String value) {
            addCriterion("isssueid <", value, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidLessThanOrEqualTo(String value) {
            addCriterion("isssueid <=", value, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidLike(String value) {
            addCriterion("isssueid like", value, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidNotLike(String value) {
            addCriterion("isssueid not like", value, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidIn(List<String> values) {
            addCriterion("isssueid in", values, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidNotIn(List<String> values) {
            addCriterion("isssueid not in", values, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidBetween(String value1, String value2) {
            addCriterion("isssueid between", value1, value2, "isssueid");
            return (Criteria) this;
        }

        public Criteria andIsssueidNotBetween(String value1, String value2) {
            addCriterion("isssueid not between", value1, value2, "isssueid");
            return (Criteria) this;
        }

        public Criteria andRelevantidIsNull() {
            addCriterion("relevantid is null");
            return (Criteria) this;
        }

        public Criteria andRelevantidIsNotNull() {
            addCriterion("relevantid is not null");
            return (Criteria) this;
        }

        public Criteria andRelevantidEqualTo(String value) {
            addCriterion("relevantid =", value, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidNotEqualTo(String value) {
            addCriterion("relevantid <>", value, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidGreaterThan(String value) {
            addCriterion("relevantid >", value, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidGreaterThanOrEqualTo(String value) {
            addCriterion("relevantid >=", value, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidLessThan(String value) {
            addCriterion("relevantid <", value, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidLessThanOrEqualTo(String value) {
            addCriterion("relevantid <=", value, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidLike(String value) {
            addCriterion("relevantid like", value, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidNotLike(String value) {
            addCriterion("relevantid not like", value, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidIn(List<String> values) {
            addCriterion("relevantid in", values, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidNotIn(List<String> values) {
            addCriterion("relevantid not in", values, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidBetween(String value1, String value2) {
            addCriterion("relevantid between", value1, value2, "relevantid");
            return (Criteria) this;
        }

        public Criteria andRelevantidNotBetween(String value1, String value2) {
            addCriterion("relevantid not between", value1, value2, "relevantid");
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