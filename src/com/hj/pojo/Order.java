package com.hj.pojo;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderid;

    private String pnum;

    private Date orderdate;

    private Integer orderstatus;
    private String judgereason;
    private Date dealdate;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum == null ? null : pnum.trim();
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }


    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getJudgereason() {
        return judgereason;
    }

    public void setJudgereason(String judgereason) {
        this.judgereason = judgereason;
    }

    public Date getDealdate() {
        return dealdate;
    }

    public void setDealdate(Date dealdate) {
        this.dealdate = dealdate;
    }
}