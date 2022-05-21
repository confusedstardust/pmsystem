package com.hj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyExample() {
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

        public Criteria andApplyidIsNull() {
            addCriterion("applyid is null");
            return (Criteria) this;
        }

        public Criteria andApplyidIsNotNull() {
            addCriterion("applyid is not null");
            return (Criteria) this;
        }

        public Criteria andApplyidEqualTo(Integer value) {
            addCriterion("applyid =", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotEqualTo(Integer value) {
            addCriterion("applyid <>", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidGreaterThan(Integer value) {
            addCriterion("applyid >", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("applyid >=", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidLessThan(Integer value) {
            addCriterion("applyid <", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidLessThanOrEqualTo(Integer value) {
            addCriterion("applyid <=", value, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidIn(List<Integer> values) {
            addCriterion("applyid in", values, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotIn(List<Integer> values) {
            addCriterion("applyid not in", values, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidBetween(Integer value1, Integer value2) {
            addCriterion("applyid between", value1, value2, "applyid");
            return (Criteria) this;
        }

        public Criteria andApplyidNotBetween(Integer value1, Integer value2) {
            addCriterion("applyid not between", value1, value2, "applyid");
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

        public Criteria andApplytypeIsNull() {
            addCriterion("applytype is null");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNotNull() {
            addCriterion("applytype is not null");
            return (Criteria) this;
        }

        public Criteria andApplytypeEqualTo(String value) {
            addCriterion("applytype =", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotEqualTo(String value) {
            addCriterion("applytype <>", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThan(String value) {
            addCriterion("applytype >", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThanOrEqualTo(String value) {
            addCriterion("applytype >=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThan(String value) {
            addCriterion("applytype <", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThanOrEqualTo(String value) {
            addCriterion("applytype <=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLike(String value) {
            addCriterion("applytype like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotLike(String value) {
            addCriterion("applytype not like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeIn(List<String> values) {
            addCriterion("applytype in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotIn(List<String> values) {
            addCriterion("applytype not in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeBetween(String value1, String value2) {
            addCriterion("applytype between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotBetween(String value1, String value2) {
            addCriterion("applytype not between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplydetailIsNull() {
            addCriterion("applydetail is null");
            return (Criteria) this;
        }

        public Criteria andApplydetailIsNotNull() {
            addCriterion("applydetail is not null");
            return (Criteria) this;
        }

        public Criteria andApplydetailEqualTo(String value) {
            addCriterion("applydetail =", value, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailNotEqualTo(String value) {
            addCriterion("applydetail <>", value, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailGreaterThan(String value) {
            addCriterion("applydetail >", value, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailGreaterThanOrEqualTo(String value) {
            addCriterion("applydetail >=", value, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailLessThan(String value) {
            addCriterion("applydetail <", value, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailLessThanOrEqualTo(String value) {
            addCriterion("applydetail <=", value, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailLike(String value) {
            addCriterion("applydetail like", value, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailNotLike(String value) {
            addCriterion("applydetail not like", value, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailIn(List<String> values) {
            addCriterion("applydetail in", values, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailNotIn(List<String> values) {
            addCriterion("applydetail not in", values, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailBetween(String value1, String value2) {
            addCriterion("applydetail between", value1, value2, "applydetail");
            return (Criteria) this;
        }

        public Criteria andApplydetailNotBetween(String value1, String value2) {
            addCriterion("applydetail not between", value1, value2, "applydetail");
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

        public Criteria andApplytypeidIsNull() {
            addCriterion("applytypeid is null");
            return (Criteria) this;
        }

        public Criteria andApplytypeidIsNotNull() {
            addCriterion("applytypeid is not null");
            return (Criteria) this;
        }

        public Criteria andApplytypeidEqualTo(Integer value) {
            addCriterion("applytypeid =", value, "applytypeid");
            return (Criteria) this;
        }

        public Criteria andApplytypeidNotEqualTo(Integer value) {
            addCriterion("applytypeid <>", value, "applytypeid");
            return (Criteria) this;
        }

        public Criteria andApplytypeidGreaterThan(Integer value) {
            addCriterion("applytypeid >", value, "applytypeid");
            return (Criteria) this;
        }

        public Criteria andApplytypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("applytypeid >=", value, "applytypeid");
            return (Criteria) this;
        }

        public Criteria andApplytypeidLessThan(Integer value) {
            addCriterion("applytypeid <", value, "applytypeid");
            return (Criteria) this;
        }

        public Criteria andApplytypeidLessThanOrEqualTo(Integer value) {
            addCriterion("applytypeid <=", value, "applytypeid");
            return (Criteria) this;
        }

        public Criteria andApplytypeidIn(List<Integer> values) {
            addCriterion("applytypeid in", values, "applytypeid");
            return (Criteria) this;
        }

        public Criteria andApplytypeidNotIn(List<Integer> values) {
            addCriterion("applytypeid not in", values, "applytypeid");
            return (Criteria) this;
        }

        public Criteria andApplytypeidBetween(Integer value1, Integer value2) {
            addCriterion("applytypeid between", value1, value2, "applytypeid");
            return (Criteria) this;
        }

        public Criteria andApplytypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("applytypeid not between", value1, value2, "applytypeid");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNull() {
            addCriterion("applydate is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("applydate is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(Date value) {
            addCriterion("applydate =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(Date value) {
            addCriterion("applydate <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(Date value) {
            addCriterion("applydate >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("applydate >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(Date value) {
            addCriterion("applydate <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(Date value) {
            addCriterion("applydate <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<Date> values) {
            addCriterion("applydate in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<Date> values) {
            addCriterion("applydate not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(Date value1, Date value2) {
            addCriterion("applydate between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(Date value1, Date value2) {
            addCriterion("applydate not between", value1, value2, "applydate");
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

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
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