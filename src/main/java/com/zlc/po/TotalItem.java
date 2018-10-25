package com.zlc.po;

/**
 * @author : ZLC
 * @create : 2018-08-23 9:33
 * @desc :
 **/
public class TotalItem {

    private String otalIvrCode;
    private String totalCount;
    private String percent;

    public String getOtalIvrCode() {
        return otalIvrCode;
    }

    public void setOtalIvrCode(String otalIvrCode) {
        this.otalIvrCode = otalIvrCode;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "TotalItem{" +
                "otalIvrCode='" + otalIvrCode + '\'' +
                ", totalCount='" + totalCount + '\'' +
                ", percent='" + percent + '\'' +
                '}';
    }
}
