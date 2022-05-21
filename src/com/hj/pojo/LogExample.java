package com.hj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logid is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logid is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(Integer value) {
            addCriterion("logid =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(Integer value) {
            addCriterion("logid <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(Integer value) {
            addCriterion("logid >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logid >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(Integer value) {
            addCriterion("logid <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(Integer value) {
            addCriterion("logid <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<Integer> values) {
            addCriterion("logid in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<Integer> values) {
            addCriterion("logid not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(Integer value1, Integer value2) {
            addCriterion("logid between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("logid not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNull() {
            addCriterion("logdate is null");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNotNull() {
            addCriterion("logdate is not null");
            return (Criteria) this;
        }

        public Criteria andLogdateEqualTo(Date value) {
            addCriterion("logdate =", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotEqualTo(Date value) {
            addCriterion("logdate <>", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThan(Date value) {
            addCriterion("logdate >", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThanOrEqualTo(Date value) {
            addCriterion("logdate >=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThan(Date value) {
            addCriterion("logdate <", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThanOrEqualTo(Date value) {
            addCriterion("logdate <=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateIn(List<Date> values) {
            addCriterion("logdate in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotIn(List<Date> values) {
            addCriterion("logdate not in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateBetween(Date value1, Date value2) {
            addCriterion("logdate between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotBetween(Date value1, Date value2) {
            addCriterion("logdate not between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdetailIsNull() {
            addCriterion("logdetail is null");
            return (Criteria) this;
        }

        public Criteria andLogdetailIsNotNull() {
            addCriterion("logdetail is not null");
            return (Criteria) this;
        }

        public Criteria andLogdetailEqualTo(String value) {
            addCriterion("logdetail =", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailNotEqualTo(String value) {
            addCriterion("logdetail <>", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailGreaterThan(String value) {
            addCriterion("logdetail >", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailGreaterThanOrEqualTo(String value) {
            addCriterion("logdetail >=", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailLessThan(String value) {
            addCriterion("logdetail <", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailLessThanOrEqualTo(String value) {
            addCriterion("logdetail <=", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailLike(String value) {
            addCriterion("logdetail like", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailNotLike(String value) {
            addCriterion("logdetail not like", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailIn(List<String> values) {
            addCriterion("logdetail in", values, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailNotIn(List<String> values) {
            addCriterion("logdetail not in", values, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailBetween(String value1, String value2) {
            addCriterion("logdetail between", value1, value2, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailNotBetween(String value1, String value2) {
            addCriterion("logdetail not between", value1, value2, "logdetail");
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

        public Criteria andPnumEqualTo(String value) {
            addCriterion("pnum =", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotEqualTo(String value) {
            addCriterion("pnum <>", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThan(String value) {
            addCriterion("pnum >", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThanOrEqualTo(String value) {
            addCriterion("pnum >=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThan(String value) {
            addCriterion("pnum <", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThanOrEqualTo(String value) {
            addCriterion("pnum <=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLike(String value) {
            addCriterion("pnum like", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotLike(String value) {
            addCriterion("pnum not like", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumIn(List<String> values) {
            addCriterion("pnum in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotIn(List<String> values) {
            addCriterion("pnum not in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumBetween(String value1, String value2) {
            addCriterion("pnum between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotBetween(String value1, String value2) {
            addCriterion("pnum not between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andIssueidIsNull() {
            addCriterion("issueid is null");
            return (Criteria) this;
        }

        public Criteria andIssueidIsNotNull() {
            addCriterion("issueid is not null");
            return (Criteria) this;
        }

        public Criteria andIssueidEqualTo(String value) {
            addCriterion("issueid =", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotEqualTo(String value) {
            addCriterion("issueid <>", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidGreaterThan(String value) {
            addCriterion("issueid >", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidGreaterThanOrEqualTo(String value) {
            addCriterion("issueid >=", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidLessThan(String value) {
            addCriterion("issueid <", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidLessThanOrEqualTo(String value) {
            addCriterion("issueid <=", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidLike(String value) {
            addCriterion("issueid like", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotLike(String value) {
            addCriterion("issueid not like", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidIn(List<String> values) {
            addCriterion("issueid in", values, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotIn(List<String> values) {
            addCriterion("issueid not in", values, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidBetween(String value1, String value2) {
            addCriterion("issueid between", value1, value2, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotBetween(String value1, String value2) {
            addCriterion("issueid not between", value1, value2, "issueid");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNull() {
            addCriterion("logtype is null");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNotNull() {
            addCriterion("logtype is not null");
            return (Criteria) this;
        }

        public Criteria andLogtypeEqualTo(Integer value) {
            addCriterion("logtype =", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotEqualTo(Integer value) {
            addCriterion("logtype <>", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThan(Integer value) {
            addCriterion("logtype >", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("logtype >=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThan(Integer value) {
            addCriterion("logtype <", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThanOrEqualTo(Integer value) {
            addCriterion("logtype <=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeIn(List<Integer> values) {
            addCriterion("logtype in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotIn(List<Integer> values) {
            addCriterion("logtype not in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeBetween(Integer value1, Integer value2) {
            addCriterion("logtype between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("logtype not between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtitleIsNull() {
            addCriterion("logtitle is null");
            return (Criteria) this;
        }

        public Criteria andLogtitleIsNotNull() {
            addCriterion("logtitle is not null");
            return (Criteria) this;
        }

        public Criteria andLogtitleEqualTo(String value) {
            addCriterion("logtitle =", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleNotEqualTo(String value) {
            addCriterion("logtitle <>", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleGreaterThan(String value) {
            addCriterion("logtitle >", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleGreaterThanOrEqualTo(String value) {
            addCriterion("logtitle >=", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleLessThan(String value) {
            addCriterion("logtitle <", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleLessThanOrEqualTo(String value) {
            addCriterion("logtitle <=", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleLike(String value) {
            addCriterion("logtitle like", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleNotLike(String value) {
            addCriterion("logtitle not like", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleIn(List<String> values) {
            addCriterion("logtitle in", values, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleNotIn(List<String> values) {
            addCriterion("logtitle not in", values, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleBetween(String value1, String value2) {
            addCriterion("logtitle between", value1, value2, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleNotBetween(String value1, String value2) {
            addCriterion("logtitle not between", value1, value2, "logtitle");
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