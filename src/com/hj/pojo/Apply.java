package com.hj.pojo;

import java.util.Date;

public class Apply {
    private Integer applyid;

    private String pnum;

    private String applytype;

    private String applydetail;

    private Integer departid;

    private Integer applytypeid;

    private Date applydate;

    private Date confirmdate;

    private Date enddate;
    private Date startdate;
    private String denyreason;

    public Integer getApplyid() {
        return applyid;
    }

    public void setApplyid(Integer applyid) {
        this.applyid = applyid;
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum == null ? null : pnum.trim();
    }

    public String getApplytype() {
        return applytype;
    }

    public void setApplytype(String applytype) {
        this.applytype = applytype == null ? null : applytype.trim();
    }

    public String getApplydetail() {
        return applydetail;
    }

    public void setApplydetail(String applydetail) {
        this.applydetail = applydetail == null ? null : applydetail.trim();
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public Integer getApplytypeid() {
        return applytypeid;
    }

    public void setApplytypeid(Integer applytypeid) {
        this.applytypeid = applytypeid;
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }



    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getConfirmdate() {
        return confirmdate;
    }

    public void setConfirmdate(Date confirmdate) {
        this.confirmdate = confirmdate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getDenyreason() {
        return denyreason;
    }

    public void setDenyreason(String denyreason) {
        this.denyreason = denyreason;
    }
}