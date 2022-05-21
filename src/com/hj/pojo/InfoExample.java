package com.hj.pojo;

import java.util.ArrayList;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoExample() {
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

        public Criteria andInfotitleIsNull() {
            addCriterion("infotitle is null");
            return (Criteria) this;
        }

        public Criteria andInfotitleIsNotNull() {
            addCriterion("infotitle is not null");
            return (Criteria) this;
        }

        public Criteria andInfotitleEqualTo(String value) {
            addCriterion("infotitle =", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleNotEqualTo(String value) {
            addCriterion("infotitle <>", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleGreaterThan(String value) {
            addCriterion("infotitle >", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleGreaterThanOrEqualTo(String value) {
            addCriterion("infotitle >=", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleLessThan(String value) {
            addCriterion("infotitle <", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleLessThanOrEqualTo(String value) {
            addCriterion("infotitle <=", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleLike(String value) {
            addCriterion("infotitle like", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleNotLike(String value) {
            addCriterion("infotitle not like", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleIn(List<String> values) {
            addCriterion("infotitle in", values, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleNotIn(List<String> values) {
            addCriterion("infotitle not in", values, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleBetween(String value1, String value2) {
            addCriterion("infotitle between", value1, value2, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleNotBetween(String value1, String value2) {
            addCriterion("infotitle not between", value1, value2, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfodetailIsNull() {
            addCriterion("infodetail is null");
            return (Criteria) this;
        }

        public Criteria andInfodetailIsNotNull() {
            addCriterion("infodetail is not null");
            return (Criteria) this;
        }

        public Criteria andInfodetailEqualTo(String value) {
            addCriterion("infodetail =", value, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailNotEqualTo(String value) {
            addCriterion("infodetail <>", value, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailGreaterThan(String value) {
            addCriterion("infodetail >", value, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailGreaterThanOrEqualTo(String value) {
            addCriterion("infodetail >=", value, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailLessThan(String value) {
            addCriterion("infodetail <", value, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailLessThanOrEqualTo(String value) {
            addCriterion("infodetail <=", value, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailLike(String value) {
            addCriterion("infodetail like", value, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailNotLike(String value) {
            addCriterion("infodetail not like", value, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailIn(List<String> values) {
            addCriterion("infodetail in", values, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailNotIn(List<String> values) {
            addCriterion("infodetail not in", values, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailBetween(String value1, String value2) {
            addCriterion("infodetail between", value1, value2, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfodetailNotBetween(String value1, String value2) {
            addCriterion("infodetail not between", value1, value2, "infodetail");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNull() {
            addCriterion("infoid is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("infoid is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(Integer value) {
            addCriterion("infoid =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(Integer value) {
            addCriterion("infoid <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(Integer value) {
            addCriterion("infoid >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("infoid >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(Integer value) {
            addCriterion("infoid <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(Integer value) {
            addCriterion("infoid <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<Integer> values) {
            addCriterion("infoid in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<Integer> values) {
            addCriterion("infoid not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(Integer value1, Integer value2) {
            addCriterion("infoid between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("infoid not between", value1, value2, "infoid");
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