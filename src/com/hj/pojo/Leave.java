package com.hj.pojo;

import java.util.Date;

public class Leave {
    private Integer lid;
    private String pnum;
    private Date ldate;
    private String lreason;
    private Date passdate;
    private String continueman;
    private String ltype;

    public Integer getLid() {
        return lid;
    }
    public void setLid(int lid) {
        this.lid = lid;
    }
    public String getPnum() {
        return pnum;
    }
    public void setPnum(String pnum) {
        this.pnum = pnum;
    }
    public Date getLdate() {
        return ldate;
    }
    public void setLdate(Date ldate) {
        this.ldate = ldate;
    }
    public String getLreason() {
        return lreason;
    }
    public void setLreason(String lreason) {
        this.lreason = lreason;
    }
    public Date getPassdate() {
        return passdate;
    }
    public void setPassdate(Date passdate) {
        this.passdate = passdate;
    }
    public String getContinueman() {
        return continueman;
    }
    public void setContinueman(String continueman) {
        this.continueman = continueman;
    }
    public String getLtype() {
        return ltype;
    }
    public void setLtype(String ltype) {
        this.ltype = ltype;
    }
    @Override
    public String toString() {
        return "Leave [lid=" + lid + ", pnum=" + pnum + ", ldate=" + ldate + ", lreason=" + lreason + ", passtate=" + passdate + ", continueman=" + continueman + ", ltype=" + ltype + "]";
    }


}
