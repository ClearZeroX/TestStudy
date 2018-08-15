package com.zlc.generator.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZnkfZdwhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZnkfZdwhExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYwidIsNull() {
            addCriterion("ywid is null");
            return (Criteria) this;
        }

        public Criteria andYwidIsNotNull() {
            addCriterion("ywid is not null");
            return (Criteria) this;
        }

        public Criteria andYwidEqualTo(String value) {
            addCriterion("ywid =", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidNotEqualTo(String value) {
            addCriterion("ywid <>", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidGreaterThan(String value) {
            addCriterion("ywid >", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidGreaterThanOrEqualTo(String value) {
            addCriterion("ywid >=", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidLessThan(String value) {
            addCriterion("ywid <", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidLessThanOrEqualTo(String value) {
            addCriterion("ywid <=", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidLike(String value) {
            addCriterion("ywid like", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidNotLike(String value) {
            addCriterion("ywid not like", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidIn(List<String> values) {
            addCriterion("ywid in", values, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidNotIn(List<String> values) {
            addCriterion("ywid not in", values, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidBetween(String value1, String value2) {
            addCriterion("ywid between", value1, value2, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidNotBetween(String value1, String value2) {
            addCriterion("ywid not between", value1, value2, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwcjlxIsNull() {
            addCriterion("ywcjlx is null");
            return (Criteria) this;
        }

        public Criteria andYwcjlxIsNotNull() {
            addCriterion("ywcjlx is not null");
            return (Criteria) this;
        }

        public Criteria andYwcjlxEqualTo(String value) {
            addCriterion("ywcjlx =", value, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxNotEqualTo(String value) {
            addCriterion("ywcjlx <>", value, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxGreaterThan(String value) {
            addCriterion("ywcjlx >", value, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxGreaterThanOrEqualTo(String value) {
            addCriterion("ywcjlx >=", value, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxLessThan(String value) {
            addCriterion("ywcjlx <", value, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxLessThanOrEqualTo(String value) {
            addCriterion("ywcjlx <=", value, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxLike(String value) {
            addCriterion("ywcjlx like", value, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxNotLike(String value) {
            addCriterion("ywcjlx not like", value, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxIn(List<String> values) {
            addCriterion("ywcjlx in", values, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxNotIn(List<String> values) {
            addCriterion("ywcjlx not in", values, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxBetween(String value1, String value2) {
            addCriterion("ywcjlx between", value1, value2, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwcjlxNotBetween(String value1, String value2) {
            addCriterion("ywcjlx not between", value1, value2, "ywcjlx");
            return (Criteria) this;
        }

        public Criteria andYwlxdmIsNull() {
            addCriterion("ywlxdm is null");
            return (Criteria) this;
        }

        public Criteria andYwlxdmIsNotNull() {
            addCriterion("ywlxdm is not null");
            return (Criteria) this;
        }

        public Criteria andYwlxdmEqualTo(String value) {
            addCriterion("ywlxdm =", value, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmNotEqualTo(String value) {
            addCriterion("ywlxdm <>", value, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmGreaterThan(String value) {
            addCriterion("ywlxdm >", value, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("ywlxdm >=", value, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmLessThan(String value) {
            addCriterion("ywlxdm <", value, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmLessThanOrEqualTo(String value) {
            addCriterion("ywlxdm <=", value, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmLike(String value) {
            addCriterion("ywlxdm like", value, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmNotLike(String value) {
            addCriterion("ywlxdm not like", value, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmIn(List<String> values) {
            addCriterion("ywlxdm in", values, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmNotIn(List<String> values) {
            addCriterion("ywlxdm not in", values, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmBetween(String value1, String value2) {
            addCriterion("ywlxdm between", value1, value2, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andYwlxdmNotBetween(String value1, String value2) {
            addCriterion("ywlxdm not between", value1, value2, "ywlxdm");
            return (Criteria) this;
        }

        public Criteria andRwbhIsNull() {
            addCriterion("rwbh is null");
            return (Criteria) this;
        }

        public Criteria andRwbhIsNotNull() {
            addCriterion("rwbh is not null");
            return (Criteria) this;
        }

        public Criteria andRwbhEqualTo(String value) {
            addCriterion("rwbh =", value, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhNotEqualTo(String value) {
            addCriterion("rwbh <>", value, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhGreaterThan(String value) {
            addCriterion("rwbh >", value, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhGreaterThanOrEqualTo(String value) {
            addCriterion("rwbh >=", value, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhLessThan(String value) {
            addCriterion("rwbh <", value, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhLessThanOrEqualTo(String value) {
            addCriterion("rwbh <=", value, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhLike(String value) {
            addCriterion("rwbh like", value, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhNotLike(String value) {
            addCriterion("rwbh not like", value, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhIn(List<String> values) {
            addCriterion("rwbh in", values, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhNotIn(List<String> values) {
            addCriterion("rwbh not in", values, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhBetween(String value1, String value2) {
            addCriterion("rwbh between", value1, value2, "rwbh");
            return (Criteria) this;
        }

        public Criteria andRwbhNotBetween(String value1, String value2) {
            addCriterion("rwbh not between", value1, value2, "rwbh");
            return (Criteria) this;
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andTelno1IsNull() {
            addCriterion("telno1 is null");
            return (Criteria) this;
        }

        public Criteria andTelno1IsNotNull() {
            addCriterion("telno1 is not null");
            return (Criteria) this;
        }

        public Criteria andTelno1EqualTo(String value) {
            addCriterion("telno1 =", value, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1NotEqualTo(String value) {
            addCriterion("telno1 <>", value, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1GreaterThan(String value) {
            addCriterion("telno1 >", value, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1GreaterThanOrEqualTo(String value) {
            addCriterion("telno1 >=", value, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1LessThan(String value) {
            addCriterion("telno1 <", value, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1LessThanOrEqualTo(String value) {
            addCriterion("telno1 <=", value, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1Like(String value) {
            addCriterion("telno1 like", value, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1NotLike(String value) {
            addCriterion("telno1 not like", value, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1In(List<String> values) {
            addCriterion("telno1 in", values, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1NotIn(List<String> values) {
            addCriterion("telno1 not in", values, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1Between(String value1, String value2) {
            addCriterion("telno1 between", value1, value2, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno1NotBetween(String value1, String value2) {
            addCriterion("telno1 not between", value1, value2, "telno1");
            return (Criteria) this;
        }

        public Criteria andTelno2IsNull() {
            addCriterion("telno2 is null");
            return (Criteria) this;
        }

        public Criteria andTelno2IsNotNull() {
            addCriterion("telno2 is not null");
            return (Criteria) this;
        }

        public Criteria andTelno2EqualTo(String value) {
            addCriterion("telno2 =", value, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2NotEqualTo(String value) {
            addCriterion("telno2 <>", value, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2GreaterThan(String value) {
            addCriterion("telno2 >", value, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2GreaterThanOrEqualTo(String value) {
            addCriterion("telno2 >=", value, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2LessThan(String value) {
            addCriterion("telno2 <", value, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2LessThanOrEqualTo(String value) {
            addCriterion("telno2 <=", value, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2Like(String value) {
            addCriterion("telno2 like", value, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2NotLike(String value) {
            addCriterion("telno2 not like", value, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2In(List<String> values) {
            addCriterion("telno2 in", values, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2NotIn(List<String> values) {
            addCriterion("telno2 not in", values, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2Between(String value1, String value2) {
            addCriterion("telno2 between", value1, value2, "telno2");
            return (Criteria) this;
        }

        public Criteria andTelno2NotBetween(String value1, String value2) {
            addCriterion("telno2 not between", value1, value2, "telno2");
            return (Criteria) this;
        }

        public Criteria andCallEndDateIsNull() {
            addCriterion("call_end_date is null");
            return (Criteria) this;
        }

        public Criteria andCallEndDateIsNotNull() {
            addCriterion("call_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andCallEndDateEqualTo(String value) {
            addCriterion("call_end_date =", value, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateNotEqualTo(String value) {
            addCriterion("call_end_date <>", value, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateGreaterThan(String value) {
            addCriterion("call_end_date >", value, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("call_end_date >=", value, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateLessThan(String value) {
            addCriterion("call_end_date <", value, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateLessThanOrEqualTo(String value) {
            addCriterion("call_end_date <=", value, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateLike(String value) {
            addCriterion("call_end_date like", value, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateNotLike(String value) {
            addCriterion("call_end_date not like", value, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateIn(List<String> values) {
            addCriterion("call_end_date in", values, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateNotIn(List<String> values) {
            addCriterion("call_end_date not in", values, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateBetween(String value1, String value2) {
            addCriterion("call_end_date between", value1, value2, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andCallEndDateNotBetween(String value1, String value2) {
            addCriterion("call_end_date not between", value1, value2, "callEndDate");
            return (Criteria) this;
        }

        public Criteria andExpand1IsNull() {
            addCriterion("expand1 is null");
            return (Criteria) this;
        }

        public Criteria andExpand1IsNotNull() {
            addCriterion("expand1 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand1EqualTo(String value) {
            addCriterion("expand1 =", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotEqualTo(String value) {
            addCriterion("expand1 <>", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1GreaterThan(String value) {
            addCriterion("expand1 >", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1GreaterThanOrEqualTo(String value) {
            addCriterion("expand1 >=", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1LessThan(String value) {
            addCriterion("expand1 <", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1LessThanOrEqualTo(String value) {
            addCriterion("expand1 <=", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1Like(String value) {
            addCriterion("expand1 like", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotLike(String value) {
            addCriterion("expand1 not like", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1In(List<String> values) {
            addCriterion("expand1 in", values, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotIn(List<String> values) {
            addCriterion("expand1 not in", values, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1Between(String value1, String value2) {
            addCriterion("expand1 between", value1, value2, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotBetween(String value1, String value2) {
            addCriterion("expand1 not between", value1, value2, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand2IsNull() {
            addCriterion("expand2 is null");
            return (Criteria) this;
        }

        public Criteria andExpand2IsNotNull() {
            addCriterion("expand2 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand2EqualTo(String value) {
            addCriterion("expand2 =", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotEqualTo(String value) {
            addCriterion("expand2 <>", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2GreaterThan(String value) {
            addCriterion("expand2 >", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2GreaterThanOrEqualTo(String value) {
            addCriterion("expand2 >=", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2LessThan(String value) {
            addCriterion("expand2 <", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2LessThanOrEqualTo(String value) {
            addCriterion("expand2 <=", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2Like(String value) {
            addCriterion("expand2 like", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotLike(String value) {
            addCriterion("expand2 not like", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2In(List<String> values) {
            addCriterion("expand2 in", values, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotIn(List<String> values) {
            addCriterion("expand2 not in", values, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2Between(String value1, String value2) {
            addCriterion("expand2 between", value1, value2, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotBetween(String value1, String value2) {
            addCriterion("expand2 not between", value1, value2, "expand2");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressIsNull() {
            addCriterion("modified_post_address is null");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressIsNotNull() {
            addCriterion("modified_post_address is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressEqualTo(String value) {
            addCriterion("modified_post_address =", value, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressNotEqualTo(String value) {
            addCriterion("modified_post_address <>", value, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressGreaterThan(String value) {
            addCriterion("modified_post_address >", value, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressGreaterThanOrEqualTo(String value) {
            addCriterion("modified_post_address >=", value, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressLessThan(String value) {
            addCriterion("modified_post_address <", value, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressLessThanOrEqualTo(String value) {
            addCriterion("modified_post_address <=", value, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressLike(String value) {
            addCriterion("modified_post_address like", value, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressNotLike(String value) {
            addCriterion("modified_post_address not like", value, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressIn(List<String> values) {
            addCriterion("modified_post_address in", values, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressNotIn(List<String> values) {
            addCriterion("modified_post_address not in", values, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressBetween(String value1, String value2) {
            addCriterion("modified_post_address between", value1, value2, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andModifiedPostAddressNotBetween(String value1, String value2) {
            addCriterion("modified_post_address not between", value1, value2, "modifiedPostAddress");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(String value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(String value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(String value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(String value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(String value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLike(String value) {
            addCriterion("activity_type like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotLike(String value) {
            addCriterion("activity_type not like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<String> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<String> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(String value1, String value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(String value1, String value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andDataDtIsNull() {
            addCriterion("data_dt is null");
            return (Criteria) this;
        }

        public Criteria andDataDtIsNotNull() {
            addCriterion("data_dt is not null");
            return (Criteria) this;
        }

        public Criteria andDataDtEqualTo(String value) {
            addCriterion("data_dt =", value, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtNotEqualTo(String value) {
            addCriterion("data_dt <>", value, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtGreaterThan(String value) {
            addCriterion("data_dt >", value, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtGreaterThanOrEqualTo(String value) {
            addCriterion("data_dt >=", value, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtLessThan(String value) {
            addCriterion("data_dt <", value, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtLessThanOrEqualTo(String value) {
            addCriterion("data_dt <=", value, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtLike(String value) {
            addCriterion("data_dt like", value, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtNotLike(String value) {
            addCriterion("data_dt not like", value, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtIn(List<String> values) {
            addCriterion("data_dt in", values, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtNotIn(List<String> values) {
            addCriterion("data_dt not in", values, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtBetween(String value1, String value2) {
            addCriterion("data_dt between", value1, value2, "dataDt");
            return (Criteria) this;
        }

        public Criteria andDataDtNotBetween(String value1, String value2) {
            addCriterion("data_dt not between", value1, value2, "dataDt");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysIsNull() {
            addCriterion("followup_days is null");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysIsNotNull() {
            addCriterion("followup_days is not null");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysEqualTo(Integer value) {
            addCriterion("followup_days =", value, "followupDays");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysNotEqualTo(Integer value) {
            addCriterion("followup_days <>", value, "followupDays");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysGreaterThan(Integer value) {
            addCriterion("followup_days >", value, "followupDays");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("followup_days >=", value, "followupDays");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysLessThan(Integer value) {
            addCriterion("followup_days <", value, "followupDays");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysLessThanOrEqualTo(Integer value) {
            addCriterion("followup_days <=", value, "followupDays");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysIn(List<Integer> values) {
            addCriterion("followup_days in", values, "followupDays");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysNotIn(List<Integer> values) {
            addCriterion("followup_days not in", values, "followupDays");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysBetween(Integer value1, Integer value2) {
            addCriterion("followup_days between", value1, value2, "followupDays");
            return (Criteria) this;
        }

        public Criteria andFollowupDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("followup_days not between", value1, value2, "followupDays");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNull() {
            addCriterion("cust_no is null");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNotNull() {
            addCriterion("cust_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustNoEqualTo(String value) {
            addCriterion("cust_no =", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotEqualTo(String value) {
            addCriterion("cust_no <>", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThan(String value) {
            addCriterion("cust_no >", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_no >=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThan(String value) {
            addCriterion("cust_no <", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThanOrEqualTo(String value) {
            addCriterion("cust_no <=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLike(String value) {
            addCriterion("cust_no like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotLike(String value) {
            addCriterion("cust_no not like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoIn(List<String> values) {
            addCriterion("cust_no in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotIn(List<String> values) {
            addCriterion("cust_no not in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoBetween(String value1, String value2) {
            addCriterion("cust_no between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotBetween(String value1, String value2) {
            addCriterion("cust_no not between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andIsManagedIsNull() {
            addCriterion("is_managed is null");
            return (Criteria) this;
        }

        public Criteria andIsManagedIsNotNull() {
            addCriterion("is_managed is not null");
            return (Criteria) this;
        }

        public Criteria andIsManagedEqualTo(String value) {
            addCriterion("is_managed =", value, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedNotEqualTo(String value) {
            addCriterion("is_managed <>", value, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedGreaterThan(String value) {
            addCriterion("is_managed >", value, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedGreaterThanOrEqualTo(String value) {
            addCriterion("is_managed >=", value, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedLessThan(String value) {
            addCriterion("is_managed <", value, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedLessThanOrEqualTo(String value) {
            addCriterion("is_managed <=", value, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedLike(String value) {
            addCriterion("is_managed like", value, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedNotLike(String value) {
            addCriterion("is_managed not like", value, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedIn(List<String> values) {
            addCriterion("is_managed in", values, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedNotIn(List<String> values) {
            addCriterion("is_managed not in", values, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedBetween(String value1, String value2) {
            addCriterion("is_managed between", value1, value2, "isManaged");
            return (Criteria) this;
        }

        public Criteria andIsManagedNotBetween(String value1, String value2) {
            addCriterion("is_managed not between", value1, value2, "isManaged");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNull() {
            addCriterion("work_place is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNotNull() {
            addCriterion("work_place is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceEqualTo(String value) {
            addCriterion("work_place =", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotEqualTo(String value) {
            addCriterion("work_place <>", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThan(String value) {
            addCriterion("work_place >", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("work_place >=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThan(String value) {
            addCriterion("work_place <", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThanOrEqualTo(String value) {
            addCriterion("work_place <=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLike(String value) {
            addCriterion("work_place like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotLike(String value) {
            addCriterion("work_place not like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIn(List<String> values) {
            addCriterion("work_place in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotIn(List<String> values) {
            addCriterion("work_place not in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceBetween(String value1, String value2) {
            addCriterion("work_place between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotBetween(String value1, String value2) {
            addCriterion("work_place not between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("occupation like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("occupation not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("occupation not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeIsNull() {
            addCriterion("exp_product_code is null");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeIsNotNull() {
            addCriterion("exp_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeEqualTo(String value) {
            addCriterion("exp_product_code =", value, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeNotEqualTo(String value) {
            addCriterion("exp_product_code <>", value, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeGreaterThan(String value) {
            addCriterion("exp_product_code >", value, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exp_product_code >=", value, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeLessThan(String value) {
            addCriterion("exp_product_code <", value, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeLessThanOrEqualTo(String value) {
            addCriterion("exp_product_code <=", value, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeLike(String value) {
            addCriterion("exp_product_code like", value, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeNotLike(String value) {
            addCriterion("exp_product_code not like", value, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeIn(List<String> values) {
            addCriterion("exp_product_code in", values, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeNotIn(List<String> values) {
            addCriterion("exp_product_code not in", values, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeBetween(String value1, String value2) {
            addCriterion("exp_product_code between", value1, value2, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductCodeNotBetween(String value1, String value2) {
            addCriterion("exp_product_code not between", value1, value2, "expProductCode");
            return (Criteria) this;
        }

        public Criteria andExpProductNameIsNull() {
            addCriterion("exp_product_name is null");
            return (Criteria) this;
        }

        public Criteria andExpProductNameIsNotNull() {
            addCriterion("exp_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andExpProductNameEqualTo(String value) {
            addCriterion("exp_product_name =", value, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameNotEqualTo(String value) {
            addCriterion("exp_product_name <>", value, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameGreaterThan(String value) {
            addCriterion("exp_product_name >", value, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("exp_product_name >=", value, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameLessThan(String value) {
            addCriterion("exp_product_name <", value, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameLessThanOrEqualTo(String value) {
            addCriterion("exp_product_name <=", value, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameLike(String value) {
            addCriterion("exp_product_name like", value, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameNotLike(String value) {
            addCriterion("exp_product_name not like", value, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameIn(List<String> values) {
            addCriterion("exp_product_name in", values, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameNotIn(List<String> values) {
            addCriterion("exp_product_name not in", values, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameBetween(String value1, String value2) {
            addCriterion("exp_product_name between", value1, value2, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductNameNotBetween(String value1, String value2) {
            addCriterion("exp_product_name not between", value1, value2, "expProductName");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtIsNull() {
            addCriterion("exp_product_amt is null");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtIsNotNull() {
            addCriterion("exp_product_amt is not null");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtEqualTo(BigDecimal value) {
            addCriterion("exp_product_amt =", value, "expProductAmt");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtNotEqualTo(BigDecimal value) {
            addCriterion("exp_product_amt <>", value, "expProductAmt");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtGreaterThan(BigDecimal value) {
            addCriterion("exp_product_amt >", value, "expProductAmt");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exp_product_amt >=", value, "expProductAmt");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtLessThan(BigDecimal value) {
            addCriterion("exp_product_amt <", value, "expProductAmt");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exp_product_amt <=", value, "expProductAmt");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtIn(List<BigDecimal> values) {
            addCriterion("exp_product_amt in", values, "expProductAmt");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtNotIn(List<BigDecimal> values) {
            addCriterion("exp_product_amt not in", values, "expProductAmt");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exp_product_amt between", value1, value2, "expProductAmt");
            return (Criteria) this;
        }

        public Criteria andExpProductAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exp_product_amt not between", value1, value2, "expProductAmt");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("expire_date is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(String value) {
            addCriterion("expire_date =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(String value) {
            addCriterion("expire_date <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(String value) {
            addCriterion("expire_date >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(String value) {
            addCriterion("expire_date >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(String value) {
            addCriterion("expire_date <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(String value) {
            addCriterion("expire_date <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLike(String value) {
            addCriterion("expire_date like", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotLike(String value) {
            addCriterion("expire_date not like", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<String> values) {
            addCriterion("expire_date in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<String> values) {
            addCriterion("expire_date not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(String value1, String value2) {
            addCriterion("expire_date between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(String value1, String value2) {
            addCriterion("expire_date not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpProdTermIsNull() {
            addCriterion("exp_prod_term is null");
            return (Criteria) this;
        }

        public Criteria andExpProdTermIsNotNull() {
            addCriterion("exp_prod_term is not null");
            return (Criteria) this;
        }

        public Criteria andExpProdTermEqualTo(String value) {
            addCriterion("exp_prod_term =", value, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermNotEqualTo(String value) {
            addCriterion("exp_prod_term <>", value, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermGreaterThan(String value) {
            addCriterion("exp_prod_term >", value, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermGreaterThanOrEqualTo(String value) {
            addCriterion("exp_prod_term >=", value, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermLessThan(String value) {
            addCriterion("exp_prod_term <", value, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermLessThanOrEqualTo(String value) {
            addCriterion("exp_prod_term <=", value, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermLike(String value) {
            addCriterion("exp_prod_term like", value, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermNotLike(String value) {
            addCriterion("exp_prod_term not like", value, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermIn(List<String> values) {
            addCriterion("exp_prod_term in", values, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermNotIn(List<String> values) {
            addCriterion("exp_prod_term not in", values, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermBetween(String value1, String value2) {
            addCriterion("exp_prod_term between", value1, value2, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdTermNotBetween(String value1, String value2) {
            addCriterion("exp_prod_term not between", value1, value2, "expProdTerm");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsIsNull() {
            addCriterion("exp_prod_yields is null");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsIsNotNull() {
            addCriterion("exp_prod_yields is not null");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsEqualTo(BigDecimal value) {
            addCriterion("exp_prod_yields =", value, "expProdYields");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsNotEqualTo(BigDecimal value) {
            addCriterion("exp_prod_yields <>", value, "expProdYields");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsGreaterThan(BigDecimal value) {
            addCriterion("exp_prod_yields >", value, "expProdYields");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exp_prod_yields >=", value, "expProdYields");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsLessThan(BigDecimal value) {
            addCriterion("exp_prod_yields <", value, "expProdYields");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exp_prod_yields <=", value, "expProdYields");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsIn(List<BigDecimal> values) {
            addCriterion("exp_prod_yields in", values, "expProdYields");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsNotIn(List<BigDecimal> values) {
            addCriterion("exp_prod_yields not in", values, "expProdYields");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exp_prod_yields between", value1, value2, "expProdYields");
            return (Criteria) this;
        }

        public Criteria andExpProdYieldsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exp_prod_yields not between", value1, value2, "expProdYields");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeIsNull() {
            addCriterion("exp_prod_attribute is null");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeIsNotNull() {
            addCriterion("exp_prod_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeEqualTo(String value) {
            addCriterion("exp_prod_attribute =", value, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeNotEqualTo(String value) {
            addCriterion("exp_prod_attribute <>", value, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeGreaterThan(String value) {
            addCriterion("exp_prod_attribute >", value, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("exp_prod_attribute >=", value, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeLessThan(String value) {
            addCriterion("exp_prod_attribute <", value, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeLessThanOrEqualTo(String value) {
            addCriterion("exp_prod_attribute <=", value, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeLike(String value) {
            addCriterion("exp_prod_attribute like", value, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeNotLike(String value) {
            addCriterion("exp_prod_attribute not like", value, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeIn(List<String> values) {
            addCriterion("exp_prod_attribute in", values, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeNotIn(List<String> values) {
            addCriterion("exp_prod_attribute not in", values, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeBetween(String value1, String value2) {
            addCriterion("exp_prod_attribute between", value1, value2, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdAttributeNotBetween(String value1, String value2) {
            addCriterion("exp_prod_attribute not between", value1, value2, "expProdAttribute");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelIsNull() {
            addCriterion("exp_prod_risklevel is null");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelIsNotNull() {
            addCriterion("exp_prod_risklevel is not null");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelEqualTo(String value) {
            addCriterion("exp_prod_risklevel =", value, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelNotEqualTo(String value) {
            addCriterion("exp_prod_risklevel <>", value, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelGreaterThan(String value) {
            addCriterion("exp_prod_risklevel >", value, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelGreaterThanOrEqualTo(String value) {
            addCriterion("exp_prod_risklevel >=", value, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelLessThan(String value) {
            addCriterion("exp_prod_risklevel <", value, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelLessThanOrEqualTo(String value) {
            addCriterion("exp_prod_risklevel <=", value, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelLike(String value) {
            addCriterion("exp_prod_risklevel like", value, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelNotLike(String value) {
            addCriterion("exp_prod_risklevel not like", value, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelIn(List<String> values) {
            addCriterion("exp_prod_risklevel in", values, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelNotIn(List<String> values) {
            addCriterion("exp_prod_risklevel not in", values, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelBetween(String value1, String value2) {
            addCriterion("exp_prod_risklevel between", value1, value2, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andExpProdRisklevelNotBetween(String value1, String value2) {
            addCriterion("exp_prod_risklevel not between", value1, value2, "expProdRisklevel");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andAumBalIsNull() {
            addCriterion("aum_bal is null");
            return (Criteria) this;
        }

        public Criteria andAumBalIsNotNull() {
            addCriterion("aum_bal is not null");
            return (Criteria) this;
        }

        public Criteria andAumBalEqualTo(BigDecimal value) {
            addCriterion("aum_bal =", value, "aumBal");
            return (Criteria) this;
        }

        public Criteria andAumBalNotEqualTo(BigDecimal value) {
            addCriterion("aum_bal <>", value, "aumBal");
            return (Criteria) this;
        }

        public Criteria andAumBalGreaterThan(BigDecimal value) {
            addCriterion("aum_bal >", value, "aumBal");
            return (Criteria) this;
        }

        public Criteria andAumBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aum_bal >=", value, "aumBal");
            return (Criteria) this;
        }

        public Criteria andAumBalLessThan(BigDecimal value) {
            addCriterion("aum_bal <", value, "aumBal");
            return (Criteria) this;
        }

        public Criteria andAumBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("aum_bal <=", value, "aumBal");
            return (Criteria) this;
        }

        public Criteria andAumBalIn(List<BigDecimal> values) {
            addCriterion("aum_bal in", values, "aumBal");
            return (Criteria) this;
        }

        public Criteria andAumBalNotIn(List<BigDecimal> values) {
            addCriterion("aum_bal not in", values, "aumBal");
            return (Criteria) this;
        }

        public Criteria andAumBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aum_bal between", value1, value2, "aumBal");
            return (Criteria) this;
        }

        public Criteria andAumBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aum_bal not between", value1, value2, "aumBal");
            return (Criteria) this;
        }

        public Criteria andAum90IsNull() {
            addCriterion("aum_90 is null");
            return (Criteria) this;
        }

        public Criteria andAum90IsNotNull() {
            addCriterion("aum_90 is not null");
            return (Criteria) this;
        }

        public Criteria andAum90EqualTo(BigDecimal value) {
            addCriterion("aum_90 =", value, "aum90");
            return (Criteria) this;
        }

        public Criteria andAum90NotEqualTo(BigDecimal value) {
            addCriterion("aum_90 <>", value, "aum90");
            return (Criteria) this;
        }

        public Criteria andAum90GreaterThan(BigDecimal value) {
            addCriterion("aum_90 >", value, "aum90");
            return (Criteria) this;
        }

        public Criteria andAum90GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aum_90 >=", value, "aum90");
            return (Criteria) this;
        }

        public Criteria andAum90LessThan(BigDecimal value) {
            addCriterion("aum_90 <", value, "aum90");
            return (Criteria) this;
        }

        public Criteria andAum90LessThanOrEqualTo(BigDecimal value) {
            addCriterion("aum_90 <=", value, "aum90");
            return (Criteria) this;
        }

        public Criteria andAum90In(List<BigDecimal> values) {
            addCriterion("aum_90 in", values, "aum90");
            return (Criteria) this;
        }

        public Criteria andAum90NotIn(List<BigDecimal> values) {
            addCriterion("aum_90 not in", values, "aum90");
            return (Criteria) this;
        }

        public Criteria andAum90Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("aum_90 between", value1, value2, "aum90");
            return (Criteria) this;
        }

        public Criteria andAum90NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aum_90 not between", value1, value2, "aum90");
            return (Criteria) this;
        }

        public Criteria andReserveStatIsNull() {
            addCriterion("reserve_stat is null");
            return (Criteria) this;
        }

        public Criteria andReserveStatIsNotNull() {
            addCriterion("reserve_stat is not null");
            return (Criteria) this;
        }

        public Criteria andReserveStatEqualTo(String value) {
            addCriterion("reserve_stat =", value, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatNotEqualTo(String value) {
            addCriterion("reserve_stat <>", value, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatGreaterThan(String value) {
            addCriterion("reserve_stat >", value, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_stat >=", value, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatLessThan(String value) {
            addCriterion("reserve_stat <", value, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatLessThanOrEqualTo(String value) {
            addCriterion("reserve_stat <=", value, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatLike(String value) {
            addCriterion("reserve_stat like", value, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatNotLike(String value) {
            addCriterion("reserve_stat not like", value, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatIn(List<String> values) {
            addCriterion("reserve_stat in", values, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatNotIn(List<String> values) {
            addCriterion("reserve_stat not in", values, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatBetween(String value1, String value2) {
            addCriterion("reserve_stat between", value1, value2, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveStatNotBetween(String value1, String value2) {
            addCriterion("reserve_stat not between", value1, value2, "reserveStat");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonIsNull() {
            addCriterion("reserve_fail_reason is null");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonIsNotNull() {
            addCriterion("reserve_fail_reason is not null");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonEqualTo(String value) {
            addCriterion("reserve_fail_reason =", value, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonNotEqualTo(String value) {
            addCriterion("reserve_fail_reason <>", value, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonGreaterThan(String value) {
            addCriterion("reserve_fail_reason >", value, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_fail_reason >=", value, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonLessThan(String value) {
            addCriterion("reserve_fail_reason <", value, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonLessThanOrEqualTo(String value) {
            addCriterion("reserve_fail_reason <=", value, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonLike(String value) {
            addCriterion("reserve_fail_reason like", value, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonNotLike(String value) {
            addCriterion("reserve_fail_reason not like", value, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonIn(List<String> values) {
            addCriterion("reserve_fail_reason in", values, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonNotIn(List<String> values) {
            addCriterion("reserve_fail_reason not in", values, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonBetween(String value1, String value2) {
            addCriterion("reserve_fail_reason between", value1, value2, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andReserveFailReasonNotBetween(String value1, String value2) {
            addCriterion("reserve_fail_reason not between", value1, value2, "reserveFailReason");
            return (Criteria) this;
        }

        public Criteria andExpProdSumIsNull() {
            addCriterion("exp_prod_sum is null");
            return (Criteria) this;
        }

        public Criteria andExpProdSumIsNotNull() {
            addCriterion("exp_prod_sum is not null");
            return (Criteria) this;
        }

        public Criteria andExpProdSumEqualTo(BigDecimal value) {
            addCriterion("exp_prod_sum =", value, "expProdSum");
            return (Criteria) this;
        }

        public Criteria andExpProdSumNotEqualTo(BigDecimal value) {
            addCriterion("exp_prod_sum <>", value, "expProdSum");
            return (Criteria) this;
        }

        public Criteria andExpProdSumGreaterThan(BigDecimal value) {
            addCriterion("exp_prod_sum >", value, "expProdSum");
            return (Criteria) this;
        }

        public Criteria andExpProdSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exp_prod_sum >=", value, "expProdSum");
            return (Criteria) this;
        }

        public Criteria andExpProdSumLessThan(BigDecimal value) {
            addCriterion("exp_prod_sum <", value, "expProdSum");
            return (Criteria) this;
        }

        public Criteria andExpProdSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exp_prod_sum <=", value, "expProdSum");
            return (Criteria) this;
        }

        public Criteria andExpProdSumIn(List<BigDecimal> values) {
            addCriterion("exp_prod_sum in", values, "expProdSum");
            return (Criteria) this;
        }

        public Criteria andExpProdSumNotIn(List<BigDecimal> values) {
            addCriterion("exp_prod_sum not in", values, "expProdSum");
            return (Criteria) this;
        }

        public Criteria andExpProdSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exp_prod_sum between", value1, value2, "expProdSum");
            return (Criteria) this;
        }

        public Criteria andExpProdSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exp_prod_sum not between", value1, value2, "expProdSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumIsNull() {
            addCriterion("total_sum is null");
            return (Criteria) this;
        }

        public Criteria andTotalSumIsNotNull() {
            addCriterion("total_sum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSumEqualTo(BigDecimal value) {
            addCriterion("total_sum =", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotEqualTo(BigDecimal value) {
            addCriterion("total_sum <>", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumGreaterThan(BigDecimal value) {
            addCriterion("total_sum >", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_sum >=", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumLessThan(BigDecimal value) {
            addCriterion("total_sum <", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_sum <=", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumIn(List<BigDecimal> values) {
            addCriterion("total_sum in", values, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotIn(List<BigDecimal> values) {
            addCriterion("total_sum not in", values, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_sum between", value1, value2, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_sum not between", value1, value2, "totalSum");
            return (Criteria) this;
        }

        public Criteria andIvrResultIsNull() {
            addCriterion("ivr_result is null");
            return (Criteria) this;
        }

        public Criteria andIvrResultIsNotNull() {
            addCriterion("ivr_result is not null");
            return (Criteria) this;
        }

        public Criteria andIvrResultEqualTo(String value) {
            addCriterion("ivr_result =", value, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultNotEqualTo(String value) {
            addCriterion("ivr_result <>", value, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultGreaterThan(String value) {
            addCriterion("ivr_result >", value, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultGreaterThanOrEqualTo(String value) {
            addCriterion("ivr_result >=", value, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultLessThan(String value) {
            addCriterion("ivr_result <", value, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultLessThanOrEqualTo(String value) {
            addCriterion("ivr_result <=", value, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultLike(String value) {
            addCriterion("ivr_result like", value, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultNotLike(String value) {
            addCriterion("ivr_result not like", value, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultIn(List<String> values) {
            addCriterion("ivr_result in", values, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultNotIn(List<String> values) {
            addCriterion("ivr_result not in", values, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultBetween(String value1, String value2) {
            addCriterion("ivr_result between", value1, value2, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andIvrResultNotBetween(String value1, String value2) {
            addCriterion("ivr_result not between", value1, value2, "ivrResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultIsNull() {
            addCriterion("guip_result is null");
            return (Criteria) this;
        }

        public Criteria andGuipResultIsNotNull() {
            addCriterion("guip_result is not null");
            return (Criteria) this;
        }

        public Criteria andGuipResultEqualTo(String value) {
            addCriterion("guip_result =", value, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultNotEqualTo(String value) {
            addCriterion("guip_result <>", value, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultGreaterThan(String value) {
            addCriterion("guip_result >", value, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultGreaterThanOrEqualTo(String value) {
            addCriterion("guip_result >=", value, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultLessThan(String value) {
            addCriterion("guip_result <", value, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultLessThanOrEqualTo(String value) {
            addCriterion("guip_result <=", value, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultLike(String value) {
            addCriterion("guip_result like", value, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultNotLike(String value) {
            addCriterion("guip_result not like", value, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultIn(List<String> values) {
            addCriterion("guip_result in", values, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultNotIn(List<String> values) {
            addCriterion("guip_result not in", values, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultBetween(String value1, String value2) {
            addCriterion("guip_result between", value1, value2, "guipResult");
            return (Criteria) this;
        }

        public Criteria andGuipResultNotBetween(String value1, String value2) {
            addCriterion("guip_result not between", value1, value2, "guipResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultIsNull() {
            addCriterion("total_result is null");
            return (Criteria) this;
        }

        public Criteria andTotalResultIsNotNull() {
            addCriterion("total_result is not null");
            return (Criteria) this;
        }

        public Criteria andTotalResultEqualTo(String value) {
            addCriterion("total_result =", value, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultNotEqualTo(String value) {
            addCriterion("total_result <>", value, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultGreaterThan(String value) {
            addCriterion("total_result >", value, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultGreaterThanOrEqualTo(String value) {
            addCriterion("total_result >=", value, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultLessThan(String value) {
            addCriterion("total_result <", value, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultLessThanOrEqualTo(String value) {
            addCriterion("total_result <=", value, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultLike(String value) {
            addCriterion("total_result like", value, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultNotLike(String value) {
            addCriterion("total_result not like", value, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultIn(List<String> values) {
            addCriterion("total_result in", values, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultNotIn(List<String> values) {
            addCriterion("total_result not in", values, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultBetween(String value1, String value2) {
            addCriterion("total_result between", value1, value2, "totalResult");
            return (Criteria) this;
        }

        public Criteria andTotalResultNotBetween(String value1, String value2) {
            addCriterion("total_result not between", value1, value2, "totalResult");
            return (Criteria) this;
        }

        public Criteria andFailCountIsNull() {
            addCriterion("fail_count is null");
            return (Criteria) this;
        }

        public Criteria andFailCountIsNotNull() {
            addCriterion("fail_count is not null");
            return (Criteria) this;
        }

        public Criteria andFailCountEqualTo(Integer value) {
            addCriterion("fail_count =", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotEqualTo(Integer value) {
            addCriterion("fail_count <>", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountGreaterThan(Integer value) {
            addCriterion("fail_count >", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fail_count >=", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountLessThan(Integer value) {
            addCriterion("fail_count <", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountLessThanOrEqualTo(Integer value) {
            addCriterion("fail_count <=", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountIn(List<Integer> values) {
            addCriterion("fail_count in", values, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotIn(List<Integer> values) {
            addCriterion("fail_count not in", values, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountBetween(Integer value1, Integer value2) {
            addCriterion("fail_count between", value1, value2, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fail_count not between", value1, value2, "failCount");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNull() {
            addCriterion("insert_date is null");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNotNull() {
            addCriterion("insert_date is not null");
            return (Criteria) this;
        }

        public Criteria andInsertDateEqualTo(Date value) {
            addCriterion("insert_date =", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotEqualTo(Date value) {
            addCriterion("insert_date <>", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThan(Date value) {
            addCriterion("insert_date >", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_date >=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThan(Date value) {
            addCriterion("insert_date <", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThanOrEqualTo(Date value) {
            addCriterion("insert_date <=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateIn(List<Date> values) {
            addCriterion("insert_date in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotIn(List<Date> values) {
            addCriterion("insert_date not in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateBetween(Date value1, Date value2) {
            addCriterion("insert_date between", value1, value2, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotBetween(Date value1, Date value2) {
            addCriterion("insert_date not between", value1, value2, "insertDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeIsNull() {
            addCriterion("call_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeIsNotNull() {
            addCriterion("call_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeEqualTo(Date value) {
            addCriterion("call_start_time =", value, "callStartTime");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeNotEqualTo(Date value) {
            addCriterion("call_start_time <>", value, "callStartTime");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeGreaterThan(Date value) {
            addCriterion("call_start_time >", value, "callStartTime");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("call_start_time >=", value, "callStartTime");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeLessThan(Date value) {
            addCriterion("call_start_time <", value, "callStartTime");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("call_start_time <=", value, "callStartTime");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeIn(List<Date> values) {
            addCriterion("call_start_time in", values, "callStartTime");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeNotIn(List<Date> values) {
            addCriterion("call_start_time not in", values, "callStartTime");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeBetween(Date value1, Date value2) {
            addCriterion("call_start_time between", value1, value2, "callStartTime");
            return (Criteria) this;
        }

        public Criteria andCallStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("call_start_time not between", value1, value2, "callStartTime");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeIsNull() {
            addCriterion("call_spend_time is null");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeIsNotNull() {
            addCriterion("call_spend_time is not null");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeEqualTo(BigDecimal value) {
            addCriterion("call_spend_time =", value, "callSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeNotEqualTo(BigDecimal value) {
            addCriterion("call_spend_time <>", value, "callSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeGreaterThan(BigDecimal value) {
            addCriterion("call_spend_time >", value, "callSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("call_spend_time >=", value, "callSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeLessThan(BigDecimal value) {
            addCriterion("call_spend_time <", value, "callSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("call_spend_time <=", value, "callSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeIn(List<BigDecimal> values) {
            addCriterion("call_spend_time in", values, "callSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeNotIn(List<BigDecimal> values) {
            addCriterion("call_spend_time not in", values, "callSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("call_spend_time between", value1, value2, "callSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallSpendTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("call_spend_time not between", value1, value2, "callSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeIsNull() {
            addCriterion("call_ivr_spend_time is null");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeIsNotNull() {
            addCriterion("call_ivr_spend_time is not null");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeEqualTo(BigDecimal value) {
            addCriterion("call_ivr_spend_time =", value, "callIvrSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeNotEqualTo(BigDecimal value) {
            addCriterion("call_ivr_spend_time <>", value, "callIvrSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeGreaterThan(BigDecimal value) {
            addCriterion("call_ivr_spend_time >", value, "callIvrSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("call_ivr_spend_time >=", value, "callIvrSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeLessThan(BigDecimal value) {
            addCriterion("call_ivr_spend_time <", value, "callIvrSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("call_ivr_spend_time <=", value, "callIvrSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeIn(List<BigDecimal> values) {
            addCriterion("call_ivr_spend_time in", values, "callIvrSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeNotIn(List<BigDecimal> values) {
            addCriterion("call_ivr_spend_time not in", values, "callIvrSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("call_ivr_spend_time between", value1, value2, "callIvrSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallIvrSpendTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("call_ivr_spend_time not between", value1, value2, "callIvrSpendTime");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeIsNull() {
            addCriterion("call_stop_time is null");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeIsNotNull() {
            addCriterion("call_stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeEqualTo(Date value) {
            addCriterion("call_stop_time =", value, "callStopTime");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeNotEqualTo(Date value) {
            addCriterion("call_stop_time <>", value, "callStopTime");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeGreaterThan(Date value) {
            addCriterion("call_stop_time >", value, "callStopTime");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("call_stop_time >=", value, "callStopTime");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeLessThan(Date value) {
            addCriterion("call_stop_time <", value, "callStopTime");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeLessThanOrEqualTo(Date value) {
            addCriterion("call_stop_time <=", value, "callStopTime");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeIn(List<Date> values) {
            addCriterion("call_stop_time in", values, "callStopTime");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeNotIn(List<Date> values) {
            addCriterion("call_stop_time not in", values, "callStopTime");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeBetween(Date value1, Date value2) {
            addCriterion("call_stop_time between", value1, value2, "callStopTime");
            return (Criteria) this;
        }

        public Criteria andCallStopTimeNotBetween(Date value1, Date value2) {
            addCriterion("call_stop_time not between", value1, value2, "callStopTime");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdIsNull() {
            addCriterion("call_record_id is null");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdIsNotNull() {
            addCriterion("call_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdEqualTo(String value) {
            addCriterion("call_record_id =", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdNotEqualTo(String value) {
            addCriterion("call_record_id <>", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdGreaterThan(String value) {
            addCriterion("call_record_id >", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("call_record_id >=", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdLessThan(String value) {
            addCriterion("call_record_id <", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdLessThanOrEqualTo(String value) {
            addCriterion("call_record_id <=", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdLike(String value) {
            addCriterion("call_record_id like", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdNotLike(String value) {
            addCriterion("call_record_id not like", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdIn(List<String> values) {
            addCriterion("call_record_id in", values, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdNotIn(List<String> values) {
            addCriterion("call_record_id not in", values, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdBetween(String value1, String value2) {
            addCriterion("call_record_id between", value1, value2, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdNotBetween(String value1, String value2) {
            addCriterion("call_record_id not between", value1, value2, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andHomeAddIsNull() {
            addCriterion("home_add is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddIsNotNull() {
            addCriterion("home_add is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddEqualTo(String value) {
            addCriterion("home_add =", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotEqualTo(String value) {
            addCriterion("home_add <>", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddGreaterThan(String value) {
            addCriterion("home_add >", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddGreaterThanOrEqualTo(String value) {
            addCriterion("home_add >=", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLessThan(String value) {
            addCriterion("home_add <", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLessThanOrEqualTo(String value) {
            addCriterion("home_add <=", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLike(String value) {
            addCriterion("home_add like", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotLike(String value) {
            addCriterion("home_add not like", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddIn(List<String> values) {
            addCriterion("home_add in", values, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotIn(List<String> values) {
            addCriterion("home_add not in", values, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddBetween(String value1, String value2) {
            addCriterion("home_add between", value1, value2, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotBetween(String value1, String value2) {
            addCriterion("home_add not between", value1, value2, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmIsNull() {
            addCriterion("sjyh_jqhm is null");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmIsNotNull() {
            addCriterion("sjyh_jqhm is not null");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmEqualTo(String value) {
            addCriterion("sjyh_jqhm =", value, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmNotEqualTo(String value) {
            addCriterion("sjyh_jqhm <>", value, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmGreaterThan(String value) {
            addCriterion("sjyh_jqhm >", value, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmGreaterThanOrEqualTo(String value) {
            addCriterion("sjyh_jqhm >=", value, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmLessThan(String value) {
            addCriterion("sjyh_jqhm <", value, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmLessThanOrEqualTo(String value) {
            addCriterion("sjyh_jqhm <=", value, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmLike(String value) {
            addCriterion("sjyh_jqhm like", value, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmNotLike(String value) {
            addCriterion("sjyh_jqhm not like", value, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmIn(List<String> values) {
            addCriterion("sjyh_jqhm in", values, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmNotIn(List<String> values) {
            addCriterion("sjyh_jqhm not in", values, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmBetween(String value1, String value2) {
            addCriterion("sjyh_jqhm between", value1, value2, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andSjyhJqhmNotBetween(String value1, String value2) {
            addCriterion("sjyh_jqhm not between", value1, value2, "sjyhJqhm");
            return (Criteria) this;
        }

        public Criteria andYxtNumIsNull() {
            addCriterion("yxt_num is null");
            return (Criteria) this;
        }

        public Criteria andYxtNumIsNotNull() {
            addCriterion("yxt_num is not null");
            return (Criteria) this;
        }

        public Criteria andYxtNumEqualTo(String value) {
            addCriterion("yxt_num =", value, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumNotEqualTo(String value) {
            addCriterion("yxt_num <>", value, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumGreaterThan(String value) {
            addCriterion("yxt_num >", value, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumGreaterThanOrEqualTo(String value) {
            addCriterion("yxt_num >=", value, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumLessThan(String value) {
            addCriterion("yxt_num <", value, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumLessThanOrEqualTo(String value) {
            addCriterion("yxt_num <=", value, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumLike(String value) {
            addCriterion("yxt_num like", value, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumNotLike(String value) {
            addCriterion("yxt_num not like", value, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumIn(List<String> values) {
            addCriterion("yxt_num in", values, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumNotIn(List<String> values) {
            addCriterion("yxt_num not in", values, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumBetween(String value1, String value2) {
            addCriterion("yxt_num between", value1, value2, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andYxtNumNotBetween(String value1, String value2) {
            addCriterion("yxt_num not between", value1, value2, "yxtNum");
            return (Criteria) this;
        }

        public Criteria andPchIsNull() {
            addCriterion("pch is null");
            return (Criteria) this;
        }

        public Criteria andPchIsNotNull() {
            addCriterion("pch is not null");
            return (Criteria) this;
        }

        public Criteria andPchEqualTo(String value) {
            addCriterion("pch =", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotEqualTo(String value) {
            addCriterion("pch <>", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchGreaterThan(String value) {
            addCriterion("pch >", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchGreaterThanOrEqualTo(String value) {
            addCriterion("pch >=", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLessThan(String value) {
            addCriterion("pch <", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLessThanOrEqualTo(String value) {
            addCriterion("pch <=", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLike(String value) {
            addCriterion("pch like", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotLike(String value) {
            addCriterion("pch not like", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchIn(List<String> values) {
            addCriterion("pch in", values, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotIn(List<String> values) {
            addCriterion("pch not in", values, "pch");
            return (Criteria) this;
        }

        public Criteria andPchBetween(String value1, String value2) {
            addCriterion("pch between", value1, value2, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotBetween(String value1, String value2) {
            addCriterion("pch not between", value1, value2, "pch");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeIsNull() {
            addCriterion("sz_org_code is null");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeIsNotNull() {
            addCriterion("sz_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeEqualTo(String value) {
            addCriterion("sz_org_code =", value, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeNotEqualTo(String value) {
            addCriterion("sz_org_code <>", value, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeGreaterThan(String value) {
            addCriterion("sz_org_code >", value, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sz_org_code >=", value, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeLessThan(String value) {
            addCriterion("sz_org_code <", value, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("sz_org_code <=", value, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeLike(String value) {
            addCriterion("sz_org_code like", value, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeNotLike(String value) {
            addCriterion("sz_org_code not like", value, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeIn(List<String> values) {
            addCriterion("sz_org_code in", values, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeNotIn(List<String> values) {
            addCriterion("sz_org_code not in", values, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeBetween(String value1, String value2) {
            addCriterion("sz_org_code between", value1, value2, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgCodeNotBetween(String value1, String value2) {
            addCriterion("sz_org_code not between", value1, value2, "szOrgCode");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameIsNull() {
            addCriterion("sz_org_name is null");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameIsNotNull() {
            addCriterion("sz_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameEqualTo(String value) {
            addCriterion("sz_org_name =", value, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameNotEqualTo(String value) {
            addCriterion("sz_org_name <>", value, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameGreaterThan(String value) {
            addCriterion("sz_org_name >", value, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("sz_org_name >=", value, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameLessThan(String value) {
            addCriterion("sz_org_name <", value, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameLessThanOrEqualTo(String value) {
            addCriterion("sz_org_name <=", value, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameLike(String value) {
            addCriterion("sz_org_name like", value, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameNotLike(String value) {
            addCriterion("sz_org_name not like", value, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameIn(List<String> values) {
            addCriterion("sz_org_name in", values, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameNotIn(List<String> values) {
            addCriterion("sz_org_name not in", values, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameBetween(String value1, String value2) {
            addCriterion("sz_org_name between", value1, value2, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andSzOrgNameNotBetween(String value1, String value2) {
            addCriterion("sz_org_name not between", value1, value2, "szOrgName");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(String value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(String value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(String value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(String value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(String value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLike(String value) {
            addCriterion("manager_id like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotLike(String value) {
            addCriterion("manager_id not like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<String> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<String> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(String value1, String value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(String value1, String value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNull() {
            addCriterion("oper_type is null");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNotNull() {
            addCriterion("oper_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperTypeEqualTo(String value) {
            addCriterion("oper_type =", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotEqualTo(String value) {
            addCriterion("oper_type <>", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThan(String value) {
            addCriterion("oper_type >", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("oper_type >=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThan(String value) {
            addCriterion("oper_type <", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThanOrEqualTo(String value) {
            addCriterion("oper_type <=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLike(String value) {
            addCriterion("oper_type like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotLike(String value) {
            addCriterion("oper_type not like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeIn(List<String> values) {
            addCriterion("oper_type in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotIn(List<String> values) {
            addCriterion("oper_type not in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeBetween(String value1, String value2) {
            addCriterion("oper_type between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotBetween(String value1, String value2) {
            addCriterion("oper_type not between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumIsNull() {
            addCriterion("dzqd_zc_num is null");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumIsNotNull() {
            addCriterion("dzqd_zc_num is not null");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumEqualTo(String value) {
            addCriterion("dzqd_zc_num =", value, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumNotEqualTo(String value) {
            addCriterion("dzqd_zc_num <>", value, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumGreaterThan(String value) {
            addCriterion("dzqd_zc_num >", value, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumGreaterThanOrEqualTo(String value) {
            addCriterion("dzqd_zc_num >=", value, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumLessThan(String value) {
            addCriterion("dzqd_zc_num <", value, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumLessThanOrEqualTo(String value) {
            addCriterion("dzqd_zc_num <=", value, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumLike(String value) {
            addCriterion("dzqd_zc_num like", value, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumNotLike(String value) {
            addCriterion("dzqd_zc_num not like", value, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumIn(List<String> values) {
            addCriterion("dzqd_zc_num in", values, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumNotIn(List<String> values) {
            addCriterion("dzqd_zc_num not in", values, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumBetween(String value1, String value2) {
            addCriterion("dzqd_zc_num between", value1, value2, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andDzqdZcNumNotBetween(String value1, String value2) {
            addCriterion("dzqd_zc_num not between", value1, value2, "dzqdZcNum");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("id_type is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("id_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("id_type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("id_type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("id_type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("id_type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("id_type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("id_type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("id_type like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("id_type not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("id_type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("id_type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("id_type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("id_type not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("id_no is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("id_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("id_no =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("id_no <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("id_no >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_no >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("id_no <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("id_no <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("id_no like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("id_no not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("id_no in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("id_no not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("id_no between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("id_no not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andColunm1IsNull() {
            addCriterion("colunm1 is null");
            return (Criteria) this;
        }

        public Criteria andColunm1IsNotNull() {
            addCriterion("colunm1 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm1EqualTo(String value) {
            addCriterion("colunm1 =", value, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1NotEqualTo(String value) {
            addCriterion("colunm1 <>", value, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1GreaterThan(String value) {
            addCriterion("colunm1 >", value, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1GreaterThanOrEqualTo(String value) {
            addCriterion("colunm1 >=", value, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1LessThan(String value) {
            addCriterion("colunm1 <", value, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1LessThanOrEqualTo(String value) {
            addCriterion("colunm1 <=", value, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1Like(String value) {
            addCriterion("colunm1 like", value, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1NotLike(String value) {
            addCriterion("colunm1 not like", value, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1In(List<String> values) {
            addCriterion("colunm1 in", values, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1NotIn(List<String> values) {
            addCriterion("colunm1 not in", values, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1Between(String value1, String value2) {
            addCriterion("colunm1 between", value1, value2, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm1NotBetween(String value1, String value2) {
            addCriterion("colunm1 not between", value1, value2, "colunm1");
            return (Criteria) this;
        }

        public Criteria andColunm2IsNull() {
            addCriterion("colunm2 is null");
            return (Criteria) this;
        }

        public Criteria andColunm2IsNotNull() {
            addCriterion("colunm2 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm2EqualTo(String value) {
            addCriterion("colunm2 =", value, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2NotEqualTo(String value) {
            addCriterion("colunm2 <>", value, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2GreaterThan(String value) {
            addCriterion("colunm2 >", value, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2GreaterThanOrEqualTo(String value) {
            addCriterion("colunm2 >=", value, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2LessThan(String value) {
            addCriterion("colunm2 <", value, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2LessThanOrEqualTo(String value) {
            addCriterion("colunm2 <=", value, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2Like(String value) {
            addCriterion("colunm2 like", value, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2NotLike(String value) {
            addCriterion("colunm2 not like", value, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2In(List<String> values) {
            addCriterion("colunm2 in", values, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2NotIn(List<String> values) {
            addCriterion("colunm2 not in", values, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2Between(String value1, String value2) {
            addCriterion("colunm2 between", value1, value2, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm2NotBetween(String value1, String value2) {
            addCriterion("colunm2 not between", value1, value2, "colunm2");
            return (Criteria) this;
        }

        public Criteria andColunm3IsNull() {
            addCriterion("colunm3 is null");
            return (Criteria) this;
        }

        public Criteria andColunm3IsNotNull() {
            addCriterion("colunm3 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm3EqualTo(String value) {
            addCriterion("colunm3 =", value, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3NotEqualTo(String value) {
            addCriterion("colunm3 <>", value, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3GreaterThan(String value) {
            addCriterion("colunm3 >", value, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3GreaterThanOrEqualTo(String value) {
            addCriterion("colunm3 >=", value, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3LessThan(String value) {
            addCriterion("colunm3 <", value, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3LessThanOrEqualTo(String value) {
            addCriterion("colunm3 <=", value, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3Like(String value) {
            addCriterion("colunm3 like", value, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3NotLike(String value) {
            addCriterion("colunm3 not like", value, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3In(List<String> values) {
            addCriterion("colunm3 in", values, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3NotIn(List<String> values) {
            addCriterion("colunm3 not in", values, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3Between(String value1, String value2) {
            addCriterion("colunm3 between", value1, value2, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm3NotBetween(String value1, String value2) {
            addCriterion("colunm3 not between", value1, value2, "colunm3");
            return (Criteria) this;
        }

        public Criteria andColunm4IsNull() {
            addCriterion("colunm4 is null");
            return (Criteria) this;
        }

        public Criteria andColunm4IsNotNull() {
            addCriterion("colunm4 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm4EqualTo(String value) {
            addCriterion("colunm4 =", value, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4NotEqualTo(String value) {
            addCriterion("colunm4 <>", value, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4GreaterThan(String value) {
            addCriterion("colunm4 >", value, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4GreaterThanOrEqualTo(String value) {
            addCriterion("colunm4 >=", value, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4LessThan(String value) {
            addCriterion("colunm4 <", value, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4LessThanOrEqualTo(String value) {
            addCriterion("colunm4 <=", value, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4Like(String value) {
            addCriterion("colunm4 like", value, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4NotLike(String value) {
            addCriterion("colunm4 not like", value, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4In(List<String> values) {
            addCriterion("colunm4 in", values, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4NotIn(List<String> values) {
            addCriterion("colunm4 not in", values, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4Between(String value1, String value2) {
            addCriterion("colunm4 between", value1, value2, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm4NotBetween(String value1, String value2) {
            addCriterion("colunm4 not between", value1, value2, "colunm4");
            return (Criteria) this;
        }

        public Criteria andColunm5IsNull() {
            addCriterion("colunm5 is null");
            return (Criteria) this;
        }

        public Criteria andColunm5IsNotNull() {
            addCriterion("colunm5 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm5EqualTo(String value) {
            addCriterion("colunm5 =", value, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5NotEqualTo(String value) {
            addCriterion("colunm5 <>", value, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5GreaterThan(String value) {
            addCriterion("colunm5 >", value, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5GreaterThanOrEqualTo(String value) {
            addCriterion("colunm5 >=", value, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5LessThan(String value) {
            addCriterion("colunm5 <", value, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5LessThanOrEqualTo(String value) {
            addCriterion("colunm5 <=", value, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5Like(String value) {
            addCriterion("colunm5 like", value, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5NotLike(String value) {
            addCriterion("colunm5 not like", value, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5In(List<String> values) {
            addCriterion("colunm5 in", values, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5NotIn(List<String> values) {
            addCriterion("colunm5 not in", values, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5Between(String value1, String value2) {
            addCriterion("colunm5 between", value1, value2, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm5NotBetween(String value1, String value2) {
            addCriterion("colunm5 not between", value1, value2, "colunm5");
            return (Criteria) this;
        }

        public Criteria andColunm6IsNull() {
            addCriterion("colunm6 is null");
            return (Criteria) this;
        }

        public Criteria andColunm6IsNotNull() {
            addCriterion("colunm6 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm6EqualTo(String value) {
            addCriterion("colunm6 =", value, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6NotEqualTo(String value) {
            addCriterion("colunm6 <>", value, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6GreaterThan(String value) {
            addCriterion("colunm6 >", value, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6GreaterThanOrEqualTo(String value) {
            addCriterion("colunm6 >=", value, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6LessThan(String value) {
            addCriterion("colunm6 <", value, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6LessThanOrEqualTo(String value) {
            addCriterion("colunm6 <=", value, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6Like(String value) {
            addCriterion("colunm6 like", value, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6NotLike(String value) {
            addCriterion("colunm6 not like", value, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6In(List<String> values) {
            addCriterion("colunm6 in", values, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6NotIn(List<String> values) {
            addCriterion("colunm6 not in", values, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6Between(String value1, String value2) {
            addCriterion("colunm6 between", value1, value2, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm6NotBetween(String value1, String value2) {
            addCriterion("colunm6 not between", value1, value2, "colunm6");
            return (Criteria) this;
        }

        public Criteria andColunm7IsNull() {
            addCriterion("colunm7 is null");
            return (Criteria) this;
        }

        public Criteria andColunm7IsNotNull() {
            addCriterion("colunm7 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm7EqualTo(String value) {
            addCriterion("colunm7 =", value, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7NotEqualTo(String value) {
            addCriterion("colunm7 <>", value, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7GreaterThan(String value) {
            addCriterion("colunm7 >", value, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7GreaterThanOrEqualTo(String value) {
            addCriterion("colunm7 >=", value, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7LessThan(String value) {
            addCriterion("colunm7 <", value, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7LessThanOrEqualTo(String value) {
            addCriterion("colunm7 <=", value, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7Like(String value) {
            addCriterion("colunm7 like", value, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7NotLike(String value) {
            addCriterion("colunm7 not like", value, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7In(List<String> values) {
            addCriterion("colunm7 in", values, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7NotIn(List<String> values) {
            addCriterion("colunm7 not in", values, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7Between(String value1, String value2) {
            addCriterion("colunm7 between", value1, value2, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm7NotBetween(String value1, String value2) {
            addCriterion("colunm7 not between", value1, value2, "colunm7");
            return (Criteria) this;
        }

        public Criteria andColunm8IsNull() {
            addCriterion("colunm8 is null");
            return (Criteria) this;
        }

        public Criteria andColunm8IsNotNull() {
            addCriterion("colunm8 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm8EqualTo(String value) {
            addCriterion("colunm8 =", value, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8NotEqualTo(String value) {
            addCriterion("colunm8 <>", value, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8GreaterThan(String value) {
            addCriterion("colunm8 >", value, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8GreaterThanOrEqualTo(String value) {
            addCriterion("colunm8 >=", value, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8LessThan(String value) {
            addCriterion("colunm8 <", value, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8LessThanOrEqualTo(String value) {
            addCriterion("colunm8 <=", value, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8Like(String value) {
            addCriterion("colunm8 like", value, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8NotLike(String value) {
            addCriterion("colunm8 not like", value, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8In(List<String> values) {
            addCriterion("colunm8 in", values, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8NotIn(List<String> values) {
            addCriterion("colunm8 not in", values, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8Between(String value1, String value2) {
            addCriterion("colunm8 between", value1, value2, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm8NotBetween(String value1, String value2) {
            addCriterion("colunm8 not between", value1, value2, "colunm8");
            return (Criteria) this;
        }

        public Criteria andColunm9IsNull() {
            addCriterion("colunm9 is null");
            return (Criteria) this;
        }

        public Criteria andColunm9IsNotNull() {
            addCriterion("colunm9 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm9EqualTo(String value) {
            addCriterion("colunm9 =", value, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9NotEqualTo(String value) {
            addCriterion("colunm9 <>", value, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9GreaterThan(String value) {
            addCriterion("colunm9 >", value, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9GreaterThanOrEqualTo(String value) {
            addCriterion("colunm9 >=", value, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9LessThan(String value) {
            addCriterion("colunm9 <", value, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9LessThanOrEqualTo(String value) {
            addCriterion("colunm9 <=", value, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9Like(String value) {
            addCriterion("colunm9 like", value, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9NotLike(String value) {
            addCriterion("colunm9 not like", value, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9In(List<String> values) {
            addCriterion("colunm9 in", values, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9NotIn(List<String> values) {
            addCriterion("colunm9 not in", values, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9Between(String value1, String value2) {
            addCriterion("colunm9 between", value1, value2, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm9NotBetween(String value1, String value2) {
            addCriterion("colunm9 not between", value1, value2, "colunm9");
            return (Criteria) this;
        }

        public Criteria andColunm10IsNull() {
            addCriterion("colunm10 is null");
            return (Criteria) this;
        }

        public Criteria andColunm10IsNotNull() {
            addCriterion("colunm10 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm10EqualTo(String value) {
            addCriterion("colunm10 =", value, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10NotEqualTo(String value) {
            addCriterion("colunm10 <>", value, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10GreaterThan(String value) {
            addCriterion("colunm10 >", value, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10GreaterThanOrEqualTo(String value) {
            addCriterion("colunm10 >=", value, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10LessThan(String value) {
            addCriterion("colunm10 <", value, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10LessThanOrEqualTo(String value) {
            addCriterion("colunm10 <=", value, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10Like(String value) {
            addCriterion("colunm10 like", value, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10NotLike(String value) {
            addCriterion("colunm10 not like", value, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10In(List<String> values) {
            addCriterion("colunm10 in", values, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10NotIn(List<String> values) {
            addCriterion("colunm10 not in", values, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10Between(String value1, String value2) {
            addCriterion("colunm10 between", value1, value2, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm10NotBetween(String value1, String value2) {
            addCriterion("colunm10 not between", value1, value2, "colunm10");
            return (Criteria) this;
        }

        public Criteria andColunm11IsNull() {
            addCriterion("colunm11 is null");
            return (Criteria) this;
        }

        public Criteria andColunm11IsNotNull() {
            addCriterion("colunm11 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm11EqualTo(String value) {
            addCriterion("colunm11 =", value, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11NotEqualTo(String value) {
            addCriterion("colunm11 <>", value, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11GreaterThan(String value) {
            addCriterion("colunm11 >", value, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11GreaterThanOrEqualTo(String value) {
            addCriterion("colunm11 >=", value, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11LessThan(String value) {
            addCriterion("colunm11 <", value, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11LessThanOrEqualTo(String value) {
            addCriterion("colunm11 <=", value, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11Like(String value) {
            addCriterion("colunm11 like", value, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11NotLike(String value) {
            addCriterion("colunm11 not like", value, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11In(List<String> values) {
            addCriterion("colunm11 in", values, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11NotIn(List<String> values) {
            addCriterion("colunm11 not in", values, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11Between(String value1, String value2) {
            addCriterion("colunm11 between", value1, value2, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm11NotBetween(String value1, String value2) {
            addCriterion("colunm11 not between", value1, value2, "colunm11");
            return (Criteria) this;
        }

        public Criteria andColunm12IsNull() {
            addCriterion("colunm12 is null");
            return (Criteria) this;
        }

        public Criteria andColunm12IsNotNull() {
            addCriterion("colunm12 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm12EqualTo(String value) {
            addCriterion("colunm12 =", value, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12NotEqualTo(String value) {
            addCriterion("colunm12 <>", value, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12GreaterThan(String value) {
            addCriterion("colunm12 >", value, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12GreaterThanOrEqualTo(String value) {
            addCriterion("colunm12 >=", value, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12LessThan(String value) {
            addCriterion("colunm12 <", value, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12LessThanOrEqualTo(String value) {
            addCriterion("colunm12 <=", value, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12Like(String value) {
            addCriterion("colunm12 like", value, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12NotLike(String value) {
            addCriterion("colunm12 not like", value, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12In(List<String> values) {
            addCriterion("colunm12 in", values, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12NotIn(List<String> values) {
            addCriterion("colunm12 not in", values, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12Between(String value1, String value2) {
            addCriterion("colunm12 between", value1, value2, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm12NotBetween(String value1, String value2) {
            addCriterion("colunm12 not between", value1, value2, "colunm12");
            return (Criteria) this;
        }

        public Criteria andColunm13IsNull() {
            addCriterion("colunm13 is null");
            return (Criteria) this;
        }

        public Criteria andColunm13IsNotNull() {
            addCriterion("colunm13 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm13EqualTo(String value) {
            addCriterion("colunm13 =", value, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13NotEqualTo(String value) {
            addCriterion("colunm13 <>", value, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13GreaterThan(String value) {
            addCriterion("colunm13 >", value, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13GreaterThanOrEqualTo(String value) {
            addCriterion("colunm13 >=", value, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13LessThan(String value) {
            addCriterion("colunm13 <", value, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13LessThanOrEqualTo(String value) {
            addCriterion("colunm13 <=", value, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13Like(String value) {
            addCriterion("colunm13 like", value, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13NotLike(String value) {
            addCriterion("colunm13 not like", value, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13In(List<String> values) {
            addCriterion("colunm13 in", values, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13NotIn(List<String> values) {
            addCriterion("colunm13 not in", values, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13Between(String value1, String value2) {
            addCriterion("colunm13 between", value1, value2, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm13NotBetween(String value1, String value2) {
            addCriterion("colunm13 not between", value1, value2, "colunm13");
            return (Criteria) this;
        }

        public Criteria andColunm14IsNull() {
            addCriterion("colunm14 is null");
            return (Criteria) this;
        }

        public Criteria andColunm14IsNotNull() {
            addCriterion("colunm14 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm14EqualTo(String value) {
            addCriterion("colunm14 =", value, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14NotEqualTo(String value) {
            addCriterion("colunm14 <>", value, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14GreaterThan(String value) {
            addCriterion("colunm14 >", value, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14GreaterThanOrEqualTo(String value) {
            addCriterion("colunm14 >=", value, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14LessThan(String value) {
            addCriterion("colunm14 <", value, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14LessThanOrEqualTo(String value) {
            addCriterion("colunm14 <=", value, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14Like(String value) {
            addCriterion("colunm14 like", value, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14NotLike(String value) {
            addCriterion("colunm14 not like", value, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14In(List<String> values) {
            addCriterion("colunm14 in", values, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14NotIn(List<String> values) {
            addCriterion("colunm14 not in", values, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14Between(String value1, String value2) {
            addCriterion("colunm14 between", value1, value2, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm14NotBetween(String value1, String value2) {
            addCriterion("colunm14 not between", value1, value2, "colunm14");
            return (Criteria) this;
        }

        public Criteria andColunm15IsNull() {
            addCriterion("colunm15 is null");
            return (Criteria) this;
        }

        public Criteria andColunm15IsNotNull() {
            addCriterion("colunm15 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm15EqualTo(String value) {
            addCriterion("colunm15 =", value, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15NotEqualTo(String value) {
            addCriterion("colunm15 <>", value, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15GreaterThan(String value) {
            addCriterion("colunm15 >", value, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15GreaterThanOrEqualTo(String value) {
            addCriterion("colunm15 >=", value, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15LessThan(String value) {
            addCriterion("colunm15 <", value, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15LessThanOrEqualTo(String value) {
            addCriterion("colunm15 <=", value, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15Like(String value) {
            addCriterion("colunm15 like", value, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15NotLike(String value) {
            addCriterion("colunm15 not like", value, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15In(List<String> values) {
            addCriterion("colunm15 in", values, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15NotIn(List<String> values) {
            addCriterion("colunm15 not in", values, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15Between(String value1, String value2) {
            addCriterion("colunm15 between", value1, value2, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm15NotBetween(String value1, String value2) {
            addCriterion("colunm15 not between", value1, value2, "colunm15");
            return (Criteria) this;
        }

        public Criteria andColunm16IsNull() {
            addCriterion("colunm16 is null");
            return (Criteria) this;
        }

        public Criteria andColunm16IsNotNull() {
            addCriterion("colunm16 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm16EqualTo(String value) {
            addCriterion("colunm16 =", value, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16NotEqualTo(String value) {
            addCriterion("colunm16 <>", value, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16GreaterThan(String value) {
            addCriterion("colunm16 >", value, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16GreaterThanOrEqualTo(String value) {
            addCriterion("colunm16 >=", value, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16LessThan(String value) {
            addCriterion("colunm16 <", value, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16LessThanOrEqualTo(String value) {
            addCriterion("colunm16 <=", value, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16Like(String value) {
            addCriterion("colunm16 like", value, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16NotLike(String value) {
            addCriterion("colunm16 not like", value, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16In(List<String> values) {
            addCriterion("colunm16 in", values, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16NotIn(List<String> values) {
            addCriterion("colunm16 not in", values, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16Between(String value1, String value2) {
            addCriterion("colunm16 between", value1, value2, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm16NotBetween(String value1, String value2) {
            addCriterion("colunm16 not between", value1, value2, "colunm16");
            return (Criteria) this;
        }

        public Criteria andColunm17IsNull() {
            addCriterion("colunm17 is null");
            return (Criteria) this;
        }

        public Criteria andColunm17IsNotNull() {
            addCriterion("colunm17 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm17EqualTo(String value) {
            addCriterion("colunm17 =", value, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17NotEqualTo(String value) {
            addCriterion("colunm17 <>", value, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17GreaterThan(String value) {
            addCriterion("colunm17 >", value, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17GreaterThanOrEqualTo(String value) {
            addCriterion("colunm17 >=", value, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17LessThan(String value) {
            addCriterion("colunm17 <", value, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17LessThanOrEqualTo(String value) {
            addCriterion("colunm17 <=", value, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17Like(String value) {
            addCriterion("colunm17 like", value, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17NotLike(String value) {
            addCriterion("colunm17 not like", value, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17In(List<String> values) {
            addCriterion("colunm17 in", values, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17NotIn(List<String> values) {
            addCriterion("colunm17 not in", values, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17Between(String value1, String value2) {
            addCriterion("colunm17 between", value1, value2, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm17NotBetween(String value1, String value2) {
            addCriterion("colunm17 not between", value1, value2, "colunm17");
            return (Criteria) this;
        }

        public Criteria andColunm18IsNull() {
            addCriterion("colunm18 is null");
            return (Criteria) this;
        }

        public Criteria andColunm18IsNotNull() {
            addCriterion("colunm18 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm18EqualTo(String value) {
            addCriterion("colunm18 =", value, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18NotEqualTo(String value) {
            addCriterion("colunm18 <>", value, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18GreaterThan(String value) {
            addCriterion("colunm18 >", value, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18GreaterThanOrEqualTo(String value) {
            addCriterion("colunm18 >=", value, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18LessThan(String value) {
            addCriterion("colunm18 <", value, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18LessThanOrEqualTo(String value) {
            addCriterion("colunm18 <=", value, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18Like(String value) {
            addCriterion("colunm18 like", value, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18NotLike(String value) {
            addCriterion("colunm18 not like", value, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18In(List<String> values) {
            addCriterion("colunm18 in", values, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18NotIn(List<String> values) {
            addCriterion("colunm18 not in", values, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18Between(String value1, String value2) {
            addCriterion("colunm18 between", value1, value2, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm18NotBetween(String value1, String value2) {
            addCriterion("colunm18 not between", value1, value2, "colunm18");
            return (Criteria) this;
        }

        public Criteria andColunm19IsNull() {
            addCriterion("colunm19 is null");
            return (Criteria) this;
        }

        public Criteria andColunm19IsNotNull() {
            addCriterion("colunm19 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm19EqualTo(String value) {
            addCriterion("colunm19 =", value, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19NotEqualTo(String value) {
            addCriterion("colunm19 <>", value, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19GreaterThan(String value) {
            addCriterion("colunm19 >", value, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19GreaterThanOrEqualTo(String value) {
            addCriterion("colunm19 >=", value, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19LessThan(String value) {
            addCriterion("colunm19 <", value, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19LessThanOrEqualTo(String value) {
            addCriterion("colunm19 <=", value, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19Like(String value) {
            addCriterion("colunm19 like", value, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19NotLike(String value) {
            addCriterion("colunm19 not like", value, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19In(List<String> values) {
            addCriterion("colunm19 in", values, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19NotIn(List<String> values) {
            addCriterion("colunm19 not in", values, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19Between(String value1, String value2) {
            addCriterion("colunm19 between", value1, value2, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm19NotBetween(String value1, String value2) {
            addCriterion("colunm19 not between", value1, value2, "colunm19");
            return (Criteria) this;
        }

        public Criteria andColunm20IsNull() {
            addCriterion("colunm20 is null");
            return (Criteria) this;
        }

        public Criteria andColunm20IsNotNull() {
            addCriterion("colunm20 is not null");
            return (Criteria) this;
        }

        public Criteria andColunm20EqualTo(String value) {
            addCriterion("colunm20 =", value, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20NotEqualTo(String value) {
            addCriterion("colunm20 <>", value, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20GreaterThan(String value) {
            addCriterion("colunm20 >", value, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20GreaterThanOrEqualTo(String value) {
            addCriterion("colunm20 >=", value, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20LessThan(String value) {
            addCriterion("colunm20 <", value, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20LessThanOrEqualTo(String value) {
            addCriterion("colunm20 <=", value, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20Like(String value) {
            addCriterion("colunm20 like", value, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20NotLike(String value) {
            addCriterion("colunm20 not like", value, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20In(List<String> values) {
            addCriterion("colunm20 in", values, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20NotIn(List<String> values) {
            addCriterion("colunm20 not in", values, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20Between(String value1, String value2) {
            addCriterion("colunm20 between", value1, value2, "colunm20");
            return (Criteria) this;
        }

        public Criteria andColunm20NotBetween(String value1, String value2) {
            addCriterion("colunm20 not between", value1, value2, "colunm20");
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