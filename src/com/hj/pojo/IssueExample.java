package com.hj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IssueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IssueExample() {
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

        public Criteria andIssuedetailIsNull() {
            addCriterion("issuedetail is null");
            return (Criteria) this;
        }

        public Criteria andIssuedetailIsNotNull() {
            addCriterion("issuedetail is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedetailEqualTo(String value) {
            addCriterion("issuedetail =", value, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailNotEqualTo(String value) {
            addCriterion("issuedetail <>", value, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailGreaterThan(String value) {
            addCriterion("issuedetail >", value, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailGreaterThanOrEqualTo(String value) {
            addCriterion("issuedetail >=", value, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailLessThan(String value) {
            addCriterion("issuedetail <", value, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailLessThanOrEqualTo(String value) {
            addCriterion("issuedetail <=", value, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailLike(String value) {
            addCriterion("issuedetail like", value, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailNotLike(String value) {
            addCriterion("issuedetail not like", value, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailIn(List<String> values) {
            addCriterion("issuedetail in", values, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailNotIn(List<String> values) {
            addCriterion("issuedetail not in", values, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailBetween(String value1, String value2) {
            addCriterion("issuedetail between", value1, value2, "issuedetail");
            return (Criteria) this;
        }

        public Criteria andIssuedetailNotBetween(String value1, String value2) {
            addCriterion("issuedetail not between", value1, value2, "issuedetail");
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

        public Criteria andIssuetitleIsNull() {
            addCriterion("issuetitle is null");
            return (Criteria) this;
        }

        public Criteria andIssuetitleIsNotNull() {
            addCriterion("issuetitle is not null");
            return (Criteria) this;
        }

        public Criteria andIssuetitleEqualTo(String value) {
            addCriterion("issuetitle =", value, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleNotEqualTo(String value) {
            addCriterion("issuetitle <>", value, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleGreaterThan(String value) {
            addCriterion("issuetitle >", value, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleGreaterThanOrEqualTo(String value) {
            addCriterion("issuetitle >=", value, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleLessThan(String value) {
            addCriterion("issuetitle <", value, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleLessThanOrEqualTo(String value) {
            addCriterion("issuetitle <=", value, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleLike(String value) {
            addCriterion("issuetitle like", value, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleNotLike(String value) {
            addCriterion("issuetitle not like", value, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleIn(List<String> values) {
            addCriterion("issuetitle in", values, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleNotIn(List<String> values) {
            addCriterion("issuetitle not in", values, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleBetween(String value1, String value2) {
            addCriterion("issuetitle between", value1, value2, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssuetitleNotBetween(String value1, String value2) {
            addCriterion("issuetitle not between", value1, value2, "issuetitle");
            return (Criteria) this;
        }

        public Criteria andIssueproccessIsNull() {
            addCriterion("issueproccess is null");
            return (Criteria) this;
        }

        public Criteria andIssueproccessIsNotNull() {
            addCriterion("issueproccess is not null");
            return (Criteria) this;
        }

        public Criteria andIssueproccessEqualTo(Integer value) {
            addCriterion("issueproccess =", value, "issueproccess");
            return (Criteria) this;
        }

        public Criteria andIssueproccessNotEqualTo(Integer value) {
            addCriterion("issueproccess <>", value, "issueproccess");
            return (Criteria) this;
        }

        public Criteria andIssueproccessGreaterThan(Integer value) {
            addCriterion("issueproccess >", value, "issueproccess");
            return (Criteria) this;
        }

        public Criteria andIssueproccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("issueproccess >=", value, "issueproccess");
            return (Criteria) this;
        }

        public Criteria andIssueproccessLessThan(Integer value) {
            addCriterion("issueproccess <", value, "issueproccess");
            return (Criteria) this;
        }

        public Criteria andIssueproccessLessThanOrEqualTo(Integer value) {
            addCriterion("issueproccess <=", value, "issueproccess");
            return (Criteria) this;
        }

        public Criteria andIssueproccessIn(List<Integer> values) {
            addCriterion("issueproccess in", values, "issueproccess");
            return (Criteria) this;
        }

        public Criteria andIssueproccessNotIn(List<Integer> values) {
            addCriterion("issueproccess not in", values, "issueproccess");
            return (Criteria) this;
        }

        public Criteria andIssueproccessBetween(Integer value1, Integer value2) {
            addCriterion("issueproccess between", value1, value2, "issueproccess");
            return (Criteria) this;
        }

        public Criteria andIssueproccessNotBetween(Integer value1, Integer value2) {
            addCriterion("issueproccess not between", value1, value2, "issueproccess");
            return (Criteria) this;
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

        public Criteria andIssuestartdateIsNull() {
            addCriterion("issuestartdate is null");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateIsNotNull() {
            addCriterion("issuestartdate is not null");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateEqualTo(Date value) {
            addCriterion("issuestartdate =", value, "issuestartdate");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateNotEqualTo(Date value) {
            addCriterion("issuestartdate <>", value, "issuestartdate");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateGreaterThan(Date value) {
            addCriterion("issuestartdate >", value, "issuestartdate");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("issuestartdate >=", value, "issuestartdate");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateLessThan(Date value) {
            addCriterion("issuestartdate <", value, "issuestartdate");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateLessThanOrEqualTo(Date value) {
            addCriterion("issuestartdate <=", value, "issuestartdate");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateIn(List<Date> values) {
            addCriterion("issuestartdate in", values, "issuestartdate");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateNotIn(List<Date> values) {
            addCriterion("issuestartdate not in", values, "issuestartdate");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateBetween(Date value1, Date value2) {
            addCriterion("issuestartdate between", value1, value2, "issuestartdate");
            return (Criteria) this;
        }

        public Criteria andIssuestartdateNotBetween(Date value1, Date value2) {
            addCriterion("issuestartdate not between", value1, value2, "issuestartdate");
            return (Criteria) this;
        }

        public Criteria andActdateIsNull() {
            addCriterion("actdate is null");
            return (Criteria) this;
        }

        public Criteria andActdateIsNotNull() {
            addCriterion("actdate is not null");
            return (Criteria) this;
        }

        public Criteria andActdateEqualTo(Date value) {
            addCriterion("actdate =", value, "actdate");
            return (Criteria) this;
        }

        public Criteria andActdateNotEqualTo(Date value) {
            addCriterion("actdate <>", value, "actdate");
            return (Criteria) this;
        }

        public Criteria andActdateGreaterThan(Date value) {
            addCriterion("actdate >", value, "actdate");
            return (Criteria) this;
        }

        public Criteria andActdateGreaterThanOrEqualTo(Date value) {
            addCriterion("actdate >=", value, "actdate");
            return (Criteria) this;
        }

        public Criteria andActdateLessThan(Date value) {
            addCriterion("actdate <", value, "actdate");
            return (Criteria) this;
        }

        public Criteria andActdateLessThanOrEqualTo(Date value) {
            addCriterion("actdate <=", value, "actdate");
            return (Criteria) this;
        }

        public Criteria andActdateIn(List<Date> values) {
            addCriterion("actdate in", values, "actdate");
            return (Criteria) this;
        }

        public Criteria andActdateNotIn(List<Date> values) {
            addCriterion("actdate not in", values, "actdate");
            return (Criteria) this;
        }

        public Criteria andActdateBetween(Date value1, Date value2) {
            addCriterion("actdate between", value1, value2, "actdate");
            return (Criteria) this;
        }

        public Criteria andActdateNotBetween(Date value1, Date value2) {
            addCriterion("actdate not between", value1, value2, "actdate");
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

        public Criteria andPubliclevelIsNull() {
            addCriterion("publiclevel is null");
            return (Criteria) this;
        }

        public Criteria andPubliclevelIsNotNull() {
            addCriterion("publiclevel is not null");
            return (Criteria) this;
        }

        public Criteria andPubliclevelEqualTo(Integer value) {
            addCriterion("publiclevel =", value, "publiclevel");
            return (Criteria) this;
        }

        public Criteria andPubliclevelNotEqualTo(Integer value) {
            addCriterion("publiclevel <>", value, "publiclevel");
            return (Criteria) this;
        }

        public Criteria andPubliclevelGreaterThan(Integer value) {
            addCriterion("publiclevel >", value, "publiclevel");
            return (Criteria) this;
        }

        public Criteria andPubliclevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("publiclevel >=", value, "publiclevel");
            return (Criteria) this;
        }

        public Criteria andPubliclevelLessThan(Integer value) {
            addCriterion("publiclevel <", value, "publiclevel");
            return (Criteria) this;
        }

        public Criteria andPubliclevelLessThanOrEqualTo(Integer value) {
            addCriterion("publiclevel <=", value, "publiclevel");
            return (Criteria) this;
        }

        public Criteria andPubliclevelIn(List<Integer> values) {
            addCriterion("publiclevel in", values, "publiclevel");
            return (Criteria) this;
        }

        public Criteria andPubliclevelNotIn(List<Integer> values) {
            addCriterion("publiclevel not in", values, "publiclevel");
            return (Criteria) this;
        }

        public Criteria andPubliclevelBetween(Integer value1, Integer value2) {
            addCriterion("publiclevel between", value1, value2, "publiclevel");
            return (Criteria) this;
        }

        public Criteria andPubliclevelNotBetween(Integer value1, Integer value2) {
            addCriterion("publiclevel not between", value1, value2, "publiclevel");
            return (Criteria) this;
        }

        public Criteria andIssuetypeIsNull() {
            addCriterion("issuetype is null");
            return (Criteria) this;
        }

        public Criteria andIssuetypeIsNotNull() {
            addCriterion("issuetype is not null");
            return (Criteria) this;
        }

        public Criteria andIssuetypeEqualTo(String value) {
            addCriterion("issuetype =", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeNotEqualTo(String value) {
            addCriterion("issuetype <>", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeGreaterThan(String value) {
            addCriterion("issuetype >", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeGreaterThanOrEqualTo(String value) {
            addCriterion("issuetype >=", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeLessThan(String value) {
            addCriterion("issuetype <", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeLessThanOrEqualTo(String value) {
            addCriterion("issuetype <=", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeLike(String value) {
            addCriterion("issuetype like", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeNotLike(String value) {
            addCriterion("issuetype not like", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeIn(List<String> values) {
            addCriterion("issuetype in", values, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeNotIn(List<String> values) {
            addCriterion("issuetype not in", values, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeBetween(String value1, String value2) {
            addCriterion("issuetype between", value1, value2, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeNotBetween(String value1, String value2) {
            addCriterion("issuetype not between", value1, value2, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssueaddressIsNull() {
            addCriterion("issueaddress is null");
            return (Criteria) this;
        }

        public Criteria andIssueaddressIsNotNull() {
            addCriterion("issueaddress is not null");
            return (Criteria) this;
        }

        public Criteria andIssueaddressEqualTo(String value) {
            addCriterion("issueaddress =", value, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressNotEqualTo(String value) {
            addCriterion("issueaddress <>", value, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressGreaterThan(String value) {
            addCriterion("issueaddress >", value, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressGreaterThanOrEqualTo(String value) {
            addCriterion("issueaddress >=", value, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressLessThan(String value) {
            addCriterion("issueaddress <", value, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressLessThanOrEqualTo(String value) {
            addCriterion("issueaddress <=", value, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressLike(String value) {
            addCriterion("issueaddress like", value, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressNotLike(String value) {
            addCriterion("issueaddress not like", value, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressIn(List<String> values) {
            addCriterion("issueaddress in", values, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressNotIn(List<String> values) {
            addCriterion("issueaddress not in", values, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressBetween(String value1, String value2) {
            addCriterion("issueaddress between", value1, value2, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andIssueaddressNotBetween(String value1, String value2) {
            addCriterion("issueaddress not between", value1, value2, "issueaddress");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameIsNull() {
            addCriterion("puteventmanname is null");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameIsNotNull() {
            addCriterion("puteventmanname is not null");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameEqualTo(String value) {
            addCriterion("puteventmanname =", value, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameNotEqualTo(String value) {
            addCriterion("puteventmanname <>", value, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameGreaterThan(String value) {
            addCriterion("puteventmanname >", value, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameGreaterThanOrEqualTo(String value) {
            addCriterion("puteventmanname >=", value, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameLessThan(String value) {
            addCriterion("puteventmanname <", value, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameLessThanOrEqualTo(String value) {
            addCriterion("puteventmanname <=", value, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameLike(String value) {
            addCriterion("puteventmanname like", value, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameNotLike(String value) {
            addCriterion("puteventmanname not like", value, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameIn(List<String> values) {
            addCriterion("puteventmanname in", values, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameNotIn(List<String> values) {
            addCriterion("puteventmanname not in", values, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameBetween(String value1, String value2) {
            addCriterion("puteventmanname between", value1, value2, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andPuteventmannameNotBetween(String value1, String value2) {
            addCriterion("puteventmanname not between", value1, value2, "puteventmanname");
            return (Criteria) this;
        }

        public Criteria andChulijieguoIsNull() {
            addCriterion("chulijieguo is null");
            return (Criteria) this;
        }

        public Criteria andChulijieguoIsNotNull() {
            addCriterion("chulijieguo is not null");
            return (Criteria) this;
        }

        public Criteria andChulijieguoEqualTo(String value) {
            addCriterion("chulijieguo =", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoNotEqualTo(String value) {
            addCriterion("chulijieguo <>", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoGreaterThan(String value) {
            addCriterion("chulijieguo >", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoGreaterThanOrEqualTo(String value) {
            addCriterion("chulijieguo >=", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoLessThan(String value) {
            addCriterion("chulijieguo <", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoLessThanOrEqualTo(String value) {
            addCriterion("chulijieguo <=", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoLike(String value) {
            addCriterion("chulijieguo like", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoNotLike(String value) {
            addCriterion("chulijieguo not like", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoIn(List<String> values) {
            addCriterion("chulijieguo in", values, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoNotIn(List<String> values) {
            addCriterion("chulijieguo not in", values, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoBetween(String value1, String value2) {
            addCriterion("chulijieguo between", value1, value2, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoNotBetween(String value1, String value2) {
            addCriterion("chulijieguo not between", value1, value2, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiIsNull() {
            addCriterion("baojingfangshi is null");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiIsNotNull() {
            addCriterion("baojingfangshi is not null");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiEqualTo(String value) {
            addCriterion("baojingfangshi =", value, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiNotEqualTo(String value) {
            addCriterion("baojingfangshi <>", value, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiGreaterThan(String value) {
            addCriterion("baojingfangshi >", value, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiGreaterThanOrEqualTo(String value) {
            addCriterion("baojingfangshi >=", value, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiLessThan(String value) {
            addCriterion("baojingfangshi <", value, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiLessThanOrEqualTo(String value) {
            addCriterion("baojingfangshi <=", value, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiLike(String value) {
            addCriterion("baojingfangshi like", value, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiNotLike(String value) {
            addCriterion("baojingfangshi not like", value, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiIn(List<String> values) {
            addCriterion("baojingfangshi in", values, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiNotIn(List<String> values) {
            addCriterion("baojingfangshi not in", values, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiBetween(String value1, String value2) {
            addCriterion("baojingfangshi between", value1, value2, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingfangshiNotBetween(String value1, String value2) {
            addCriterion("baojingfangshi not between", value1, value2, "baojingfangshi");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongIsNull() {
            addCriterion("baojingneirong is null");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongIsNotNull() {
            addCriterion("baojingneirong is not null");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongEqualTo(String value) {
            addCriterion("baojingneirong =", value, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongNotEqualTo(String value) {
            addCriterion("baojingneirong <>", value, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongGreaterThan(String value) {
            addCriterion("baojingneirong >", value, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongGreaterThanOrEqualTo(String value) {
            addCriterion("baojingneirong >=", value, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongLessThan(String value) {
            addCriterion("baojingneirong <", value, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongLessThanOrEqualTo(String value) {
            addCriterion("baojingneirong <=", value, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongLike(String value) {
            addCriterion("baojingneirong like", value, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongNotLike(String value) {
            addCriterion("baojingneirong not like", value, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongIn(List<String> values) {
            addCriterion("baojingneirong in", values, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongNotIn(List<String> values) {
            addCriterion("baojingneirong not in", values, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongBetween(String value1, String value2) {
            addCriterion("baojingneirong between", value1, value2, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andBaojingneirongNotBetween(String value1, String value2) {
            addCriterion("baojingneirong not between", value1, value2, "baojingneirong");
            return (Criteria) this;
        }

        public Criteria andPickmanIsNull() {
            addCriterion("pickman is null");
            return (Criteria) this;
        }

        public Criteria andPickmanIsNotNull() {
            addCriterion("pickman is not null");
            return (Criteria) this;
        }

        public Criteria andPickmanEqualTo(String value) {
            addCriterion("pickman =", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanNotEqualTo(String value) {
            addCriterion("pickman <>", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanGreaterThan(String value) {
            addCriterion("pickman >", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanGreaterThanOrEqualTo(String value) {
            addCriterion("pickman >=", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanLessThan(String value) {
            addCriterion("pickman <", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanLessThanOrEqualTo(String value) {
            addCriterion("pickman <=", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanLike(String value) {
            addCriterion("pickman like", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanNotLike(String value) {
            addCriterion("pickman not like", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanIn(List<String> values) {
            addCriterion("pickman in", values, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanNotIn(List<String> values) {
            addCriterion("pickman not in", values, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanBetween(String value1, String value2) {
            addCriterion("pickman between", value1, value2, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanNotBetween(String value1, String value2) {
            addCriterion("pickman not between", value1, value2, "pickman");
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