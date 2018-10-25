package com.zlc.po;

import java.util.ArrayList;

/**
 * @author : ZLC
 * @create : 2018-08-23 9:54
 * @desc :
 **/
public class Data {

    private int refreshTime;
    private TotalItem totalItem;
    private ArrayList<Project> project;

    public int getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(int refreshTime) {
        this.refreshTime = refreshTime;
    }

    public TotalItem getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(TotalItem totalItem) {
        this.totalItem = totalItem;
    }



    @Override
    public String toString() {
        return "Data{" +
                "refreshTime=" + refreshTime +
                ", totalItem=" + totalItem +
                ", project=" + project +
                '}';
    }

    public static void main(String[] args) {
        Data data = new Data();
        TotalItem totalItem = new TotalItem();
        //赋值顺序
        data.setTotalItem(totalItem);
        totalItem.setPercent("==========");
        System.out.println(data);//Data{refreshTime=0, totalItem=TotalItem{otalIvrCode='null', totalCount='null', percent='=========='}, project=null}

    }


}


