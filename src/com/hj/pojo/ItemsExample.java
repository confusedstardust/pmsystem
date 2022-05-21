package com.hj.pojo;

import java.util.ArrayList;
import java.util.List;

public class ItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemsExample() {
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

        public Criteria andItemsnameIsNull() {
            addCriterion("itemsname is null");
            return (Criteria) this;
        }

        public Criteria andItemsnameIsNotNull() {
            addCriterion("itemsname is not null");
            return (Criteria) this;
        }

        public Criteria andItemsnameEqualTo(String value) {
            addCriterion("itemsname =", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotEqualTo(String value) {
            addCriterion("itemsname <>", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameGreaterThan(String value) {
            addCriterion("itemsname >", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameGreaterThanOrEqualTo(String value) {
            addCriterion("itemsname >=", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameLessThan(String value) {
            addCriterion("itemsname <", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameLessThanOrEqualTo(String value) {
            addCriterion("itemsname <=", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameLike(String value) {
            addCriterion("itemsname like", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotLike(String value) {
            addCriterion("itemsname not like", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameIn(List<String> values) {
            addCriterion("itemsname in", values, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotIn(List<String> values) {
            addCriterion("itemsname not in", values, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameBetween(String value1, String value2) {
            addCriterion("itemsname between", value1, value2, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotBetween(String value1, String value2) {
            addCriterion("itemsname not between", value1, value2, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsidIsNull() {
            addCriterion("itemsid is null");
            return (Criteria) this;
        }

        public Criteria andItemsidIsNotNull() {
            addCriterion("itemsid is not null");
            return (Criteria) this;
        }

        public Criteria andItemsidEqualTo(Integer value) {
            addCriterion("itemsid =", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotEqualTo(Integer value) {
            addCriterion("itemsid <>", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidGreaterThan(Integer value) {
            addCriterion("itemsid >", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemsid >=", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidLessThan(Integer value) {
            addCriterion("itemsid <", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidLessThanOrEqualTo(Integer value) {
            addCriterion("itemsid <=", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidIn(List<Integer> values) {
            addCriterion("itemsid in", values, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotIn(List<Integer> values) {
            addCriterion("itemsid not in", values, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidBetween(Integer value1, Integer value2) {
            addCriterion("itemsid between", value1, value2, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotBetween(Integer value1, Integer value2) {
            addCriterion("itemsid not between", value1, value2, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemscountIsNull() {
            addCriterion("itemscount is null");
            return (Criteria) this;
        }

        public Criteria andItemscountIsNotNull() {
            addCriterion("itemscount is not null");
            return (Criteria) this;
        }

        public Criteria andItemscountEqualTo(Integer value) {
            addCriterion("itemscount =", value, "itemscount");
            return (Criteria) this;
        }

        public Criteria andItemscountNotEqualTo(Integer value) {
            addCriterion("itemscount <>", value, "itemscount");
            return (Criteria) this;
        }

        public Criteria andItemscountGreaterThan(Integer value) {
            addCriterion("itemscount >", value, "itemscount");
            return (Criteria) this;
        }

        public Criteria andItemscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemscount >=", value, "itemscount");
            return (Criteria) this;
        }

        public Criteria andItemscountLessThan(Integer value) {
            addCriterion("itemscount <", value, "itemscount");
            return (Criteria) this;
        }

        public Criteria andItemscountLessThanOrEqualTo(Integer value) {
            addCriterion("itemscount <=", value, "itemscount");
            return (Criteria) this;
        }

        public Criteria andItemscountIn(List<Integer> values) {
            addCriterion("itemscount in", values, "itemscount");
            return (Criteria) this;
        }

        public Criteria andItemscountNotIn(List<Integer> values) {
            addCriterion("itemscount not in", values, "itemscount");
            return (Criteria) this;
        }

        public Criteria andItemscountBetween(Integer value1, Integer value2) {
            addCriterion("itemscount between", value1, value2, "itemscount");
            return (Criteria) this;
        }

        public Criteria andItemscountNotBetween(Integer value1, Integer value2) {
            addCriterion("itemscount not between", value1, value2, "itemscount");
            return (Criteria) this;
        }

        public Criteria andItempictureIsNull() {
            addCriterion("itempicture is null");
            return (Criteria) this;
        }

        public Criteria andItempictureIsNotNull() {
            addCriterion("itempicture is not null");
            return (Criteria) this;
        }

        public Criteria andItempictureEqualTo(String value) {
            addCriterion("itempicture =", value, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureNotEqualTo(String value) {
            addCriterion("itempicture <>", value, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureGreaterThan(String value) {
            addCriterion("itempicture >", value, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureGreaterThanOrEqualTo(String value) {
            addCriterion("itempicture >=", value, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureLessThan(String value) {
            addCriterion("itempicture <", value, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureLessThanOrEqualTo(String value) {
            addCriterion("itempicture <=", value, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureLike(String value) {
            addCriterion("itempicture like", value, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureNotLike(String value) {
            addCriterion("itempicture not like", value, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureIn(List<String> values) {
            addCriterion("itempicture in", values, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureNotIn(List<String> values) {
            addCriterion("itempicture not in", values, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureBetween(String value1, String value2) {
            addCriterion("itempicture between", value1, value2, "itempicture");
            return (Criteria) this;
        }

        public Criteria andItempictureNotBetween(String value1, String value2) {
            addCriterion("itempicture not between", value1, value2, "itempicture");
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