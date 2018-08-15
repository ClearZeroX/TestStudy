package com.zlc.generator.po;

import java.util.Date;

public class IvrOrder {
    private Long id;

    private String msgId;

    private String ivrParam;

    private String type;

    private String telNo;

    private String smsRandomNum;

    private String randomNum;

    private String status;

    private String fOrderId;

    private String backListOrderids;

    private String originaAppsheetNo;

    private String voucherNo;

    private String voucherType;

    private Date revokeTimePoint;

    private String errorCode;

    private String errorMsg;

    private Date insertTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getIvrParam() {
        return ivrParam;
    }

    public void setIvrParam(String ivrParam) {
        this.ivrParam = ivrParam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getSmsRandomNum() {
        return smsRandomNum;
    }

    public void setSmsRandomNum(String smsRandomNum) {
        this.smsRandomNum = smsRandomNum;
    }

    public String getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(String randomNum) {
        this.randomNum = randomNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getfOrderId() {
        return fOrderId;
    }

    public void setfOrderId(String fOrderId) {
        this.fOrderId = fOrderId;
    }

    public String getBackListOrderids() {
        return backListOrderids;
    }

    public void setBackListOrderids(String backListOrderids) {
        this.backListOrderids = backListOrderids;
    }

    public String getOriginaAppsheetNo() {
        return originaAppsheetNo;
    }

    public void setOriginaAppsheetNo(String originaAppsheetNo) {
        this.originaAppsheetNo = originaAppsheetNo;
    }

    public String getVoucherNo() {
        return voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }

    public String getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(String voucherType) {
        this.voucherType = voucherType;
    }

    public Date getRevokeTimePoint() {
        return revokeTimePoint;
    }

    public void setRevokeTimePoint(Date revokeTimePoint) {
        this.revokeTimePoint = revokeTimePoint;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}