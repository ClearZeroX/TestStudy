package com.zlc.generator.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IvrOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IvrOrderExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(String value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(String value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(String value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(String value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(String value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLike(String value) {
            addCriterion("msg_id like", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotLike(String value) {
            addCriterion("msg_id not like", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<String> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<String> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(String value1, String value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(String value1, String value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andIvrParamIsNull() {
            addCriterion("ivr_param is null");
            return (Criteria) this;
        }

        public Criteria andIvrParamIsNotNull() {
            addCriterion("ivr_param is not null");
            return (Criteria) this;
        }

        public Criteria andIvrParamEqualTo(String value) {
            addCriterion("ivr_param =", value, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamNotEqualTo(String value) {
            addCriterion("ivr_param <>", value, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamGreaterThan(String value) {
            addCriterion("ivr_param >", value, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamGreaterThanOrEqualTo(String value) {
            addCriterion("ivr_param >=", value, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamLessThan(String value) {
            addCriterion("ivr_param <", value, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamLessThanOrEqualTo(String value) {
            addCriterion("ivr_param <=", value, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamLike(String value) {
            addCriterion("ivr_param like", value, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamNotLike(String value) {
            addCriterion("ivr_param not like", value, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamIn(List<String> values) {
            addCriterion("ivr_param in", values, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamNotIn(List<String> values) {
            addCriterion("ivr_param not in", values, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamBetween(String value1, String value2) {
            addCriterion("ivr_param between", value1, value2, "ivrParam");
            return (Criteria) this;
        }

        public Criteria andIvrParamNotBetween(String value1, String value2) {
            addCriterion("ivr_param not between", value1, value2, "ivrParam");
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

        public Criteria andTelNoIsNull() {
            addCriterion("tel_no is null");
            return (Criteria) this;
        }

        public Criteria andTelNoIsNotNull() {
            addCriterion("tel_no is not null");
            return (Criteria) this;
        }

        public Criteria andTelNoEqualTo(String value) {
            addCriterion("tel_no =", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotEqualTo(String value) {
            addCriterion("tel_no <>", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoGreaterThan(String value) {
            addCriterion("tel_no >", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoGreaterThanOrEqualTo(String value) {
            addCriterion("tel_no >=", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLessThan(String value) {
            addCriterion("tel_no <", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLessThanOrEqualTo(String value) {
            addCriterion("tel_no <=", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLike(String value) {
            addCriterion("tel_no like", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotLike(String value) {
            addCriterion("tel_no not like", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoIn(List<String> values) {
            addCriterion("tel_no in", values, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotIn(List<String> values) {
            addCriterion("tel_no not in", values, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoBetween(String value1, String value2) {
            addCriterion("tel_no between", value1, value2, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotBetween(String value1, String value2) {
            addCriterion("tel_no not between", value1, value2, "telNo");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumIsNull() {
            addCriterion("sms_random_num is null");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumIsNotNull() {
            addCriterion("sms_random_num is not null");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumEqualTo(String value) {
            addCriterion("sms_random_num =", value, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumNotEqualTo(String value) {
            addCriterion("sms_random_num <>", value, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumGreaterThan(String value) {
            addCriterion("sms_random_num >", value, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumGreaterThanOrEqualTo(String value) {
            addCriterion("sms_random_num >=", value, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumLessThan(String value) {
            addCriterion("sms_random_num <", value, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumLessThanOrEqualTo(String value) {
            addCriterion("sms_random_num <=", value, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumLike(String value) {
            addCriterion("sms_random_num like", value, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumNotLike(String value) {
            addCriterion("sms_random_num not like", value, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumIn(List<String> values) {
            addCriterion("sms_random_num in", values, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumNotIn(List<String> values) {
            addCriterion("sms_random_num not in", values, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumBetween(String value1, String value2) {
            addCriterion("sms_random_num between", value1, value2, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andSmsRandomNumNotBetween(String value1, String value2) {
            addCriterion("sms_random_num not between", value1, value2, "smsRandomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumIsNull() {
            addCriterion("random_num is null");
            return (Criteria) this;
        }

        public Criteria andRandomNumIsNotNull() {
            addCriterion("random_num is not null");
            return (Criteria) this;
        }

        public Criteria andRandomNumEqualTo(String value) {
            addCriterion("random_num =", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumNotEqualTo(String value) {
            addCriterion("random_num <>", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumGreaterThan(String value) {
            addCriterion("random_num >", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumGreaterThanOrEqualTo(String value) {
            addCriterion("random_num >=", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumLessThan(String value) {
            addCriterion("random_num <", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumLessThanOrEqualTo(String value) {
            addCriterion("random_num <=", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumLike(String value) {
            addCriterion("random_num like", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumNotLike(String value) {
            addCriterion("random_num not like", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumIn(List<String> values) {
            addCriterion("random_num in", values, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumNotIn(List<String> values) {
            addCriterion("random_num not in", values, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumBetween(String value1, String value2) {
            addCriterion("random_num between", value1, value2, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumNotBetween(String value1, String value2) {
            addCriterion("random_num not between", value1, value2, "randomNum");
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

        public Criteria andFOrderIdIsNull() {
            addCriterion("f_order_id is null");
            return (Criteria) this;
        }

        public Criteria andFOrderIdIsNotNull() {
            addCriterion("f_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andFOrderIdEqualTo(String value) {
            addCriterion("f_order_id =", value, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdNotEqualTo(String value) {
            addCriterion("f_order_id <>", value, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdGreaterThan(String value) {
            addCriterion("f_order_id >", value, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("f_order_id >=", value, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdLessThan(String value) {
            addCriterion("f_order_id <", value, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdLessThanOrEqualTo(String value) {
            addCriterion("f_order_id <=", value, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdLike(String value) {
            addCriterion("f_order_id like", value, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdNotLike(String value) {
            addCriterion("f_order_id not like", value, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdIn(List<String> values) {
            addCriterion("f_order_id in", values, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdNotIn(List<String> values) {
            addCriterion("f_order_id not in", values, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdBetween(String value1, String value2) {
            addCriterion("f_order_id between", value1, value2, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andFOrderIdNotBetween(String value1, String value2) {
            addCriterion("f_order_id not between", value1, value2, "fOrderId");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsIsNull() {
            addCriterion("back_list_orderids is null");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsIsNotNull() {
            addCriterion("back_list_orderids is not null");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsEqualTo(String value) {
            addCriterion("back_list_orderids =", value, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsNotEqualTo(String value) {
            addCriterion("back_list_orderids <>", value, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsGreaterThan(String value) {
            addCriterion("back_list_orderids >", value, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsGreaterThanOrEqualTo(String value) {
            addCriterion("back_list_orderids >=", value, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsLessThan(String value) {
            addCriterion("back_list_orderids <", value, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsLessThanOrEqualTo(String value) {
            addCriterion("back_list_orderids <=", value, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsLike(String value) {
            addCriterion("back_list_orderids like", value, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsNotLike(String value) {
            addCriterion("back_list_orderids not like", value, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsIn(List<String> values) {
            addCriterion("back_list_orderids in", values, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsNotIn(List<String> values) {
            addCriterion("back_list_orderids not in", values, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsBetween(String value1, String value2) {
            addCriterion("back_list_orderids between", value1, value2, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andBackListOrderidsNotBetween(String value1, String value2) {
            addCriterion("back_list_orderids not between", value1, value2, "backListOrderids");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoIsNull() {
            addCriterion("origina_appSheet_no is null");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoIsNotNull() {
            addCriterion("origina_appSheet_no is not null");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoEqualTo(String value) {
            addCriterion("origina_appSheet_no =", value, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoNotEqualTo(String value) {
            addCriterion("origina_appSheet_no <>", value, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoGreaterThan(String value) {
            addCriterion("origina_appSheet_no >", value, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoGreaterThanOrEqualTo(String value) {
            addCriterion("origina_appSheet_no >=", value, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoLessThan(String value) {
            addCriterion("origina_appSheet_no <", value, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoLessThanOrEqualTo(String value) {
            addCriterion("origina_appSheet_no <=", value, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoLike(String value) {
            addCriterion("origina_appSheet_no like", value, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoNotLike(String value) {
            addCriterion("origina_appSheet_no not like", value, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoIn(List<String> values) {
            addCriterion("origina_appSheet_no in", values, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoNotIn(List<String> values) {
            addCriterion("origina_appSheet_no not in", values, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoBetween(String value1, String value2) {
            addCriterion("origina_appSheet_no between", value1, value2, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andOriginaAppsheetNoNotBetween(String value1, String value2) {
            addCriterion("origina_appSheet_no not between", value1, value2, "originaAppsheetNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoIsNull() {
            addCriterion("voucher_no is null");
            return (Criteria) this;
        }

        public Criteria andVoucherNoIsNotNull() {
            addCriterion("voucher_no is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherNoEqualTo(String value) {
            addCriterion("voucher_no =", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoNotEqualTo(String value) {
            addCriterion("voucher_no <>", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoGreaterThan(String value) {
            addCriterion("voucher_no >", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_no >=", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoLessThan(String value) {
            addCriterion("voucher_no <", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoLessThanOrEqualTo(String value) {
            addCriterion("voucher_no <=", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoLike(String value) {
            addCriterion("voucher_no like", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoNotLike(String value) {
            addCriterion("voucher_no not like", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoIn(List<String> values) {
            addCriterion("voucher_no in", values, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoNotIn(List<String> values) {
            addCriterion("voucher_no not in", values, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoBetween(String value1, String value2) {
            addCriterion("voucher_no between", value1, value2, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoNotBetween(String value1, String value2) {
            addCriterion("voucher_no not between", value1, value2, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeIsNull() {
            addCriterion("voucher_type is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeIsNotNull() {
            addCriterion("voucher_type is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeEqualTo(String value) {
            addCriterion("voucher_type =", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeNotEqualTo(String value) {
            addCriterion("voucher_type <>", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeGreaterThan(String value) {
            addCriterion("voucher_type >", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_type >=", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeLessThan(String value) {
            addCriterion("voucher_type <", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeLessThanOrEqualTo(String value) {
            addCriterion("voucher_type <=", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeLike(String value) {
            addCriterion("voucher_type like", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeNotLike(String value) {
            addCriterion("voucher_type not like", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeIn(List<String> values) {
            addCriterion("voucher_type in", values, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeNotIn(List<String> values) {
            addCriterion("voucher_type not in", values, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeBetween(String value1, String value2) {
            addCriterion("voucher_type between", value1, value2, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeNotBetween(String value1, String value2) {
            addCriterion("voucher_type not between", value1, value2, "voucherType");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointIsNull() {
            addCriterion("revoke_time_point is null");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointIsNotNull() {
            addCriterion("revoke_time_point is not null");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointEqualTo(Date value) {
            addCriterion("revoke_time_point =", value, "revokeTimePoint");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointNotEqualTo(Date value) {
            addCriterion("revoke_time_point <>", value, "revokeTimePoint");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointGreaterThan(Date value) {
            addCriterion("revoke_time_point >", value, "revokeTimePoint");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointGreaterThanOrEqualTo(Date value) {
            addCriterion("revoke_time_point >=", value, "revokeTimePoint");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointLessThan(Date value) {
            addCriterion("revoke_time_point <", value, "revokeTimePoint");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointLessThanOrEqualTo(Date value) {
            addCriterion("revoke_time_point <=", value, "revokeTimePoint");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointIn(List<Date> values) {
            addCriterion("revoke_time_point in", values, "revokeTimePoint");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointNotIn(List<Date> values) {
            addCriterion("revoke_time_point not in", values, "revokeTimePoint");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointBetween(Date value1, Date value2) {
            addCriterion("revoke_time_point between", value1, value2, "revokeTimePoint");
            return (Criteria) this;
        }

        public Criteria andRevokeTimePointNotBetween(Date value1, Date value2) {
            addCriterion("revoke_time_point not between", value1, value2, "revokeTimePoint");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("error_code is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("error_code is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("error_code =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("error_code <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("error_code >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("error_code >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("error_code <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("error_code <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("error_code like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("error_code not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("error_code in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("error_code not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("error_code between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("error_code not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNull() {
            addCriterion("error_msg is null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNotNull() {
            addCriterion("error_msg is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgEqualTo(String value) {
            addCriterion("error_msg =", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotEqualTo(String value) {
            addCriterion("error_msg <>", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThan(String value) {
            addCriterion("error_msg >", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThanOrEqualTo(String value) {
            addCriterion("error_msg >=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThan(String value) {
            addCriterion("error_msg <", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThanOrEqualTo(String value) {
            addCriterion("error_msg <=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLike(String value) {
            addCriterion("error_msg like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotLike(String value) {
            addCriterion("error_msg not like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIn(List<String> values) {
            addCriterion("error_msg in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotIn(List<String> values) {
            addCriterion("error_msg not in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgBetween(String value1, String value2) {
            addCriterion("error_msg between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotBetween(String value1, String value2) {
            addCriterion("error_msg not between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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