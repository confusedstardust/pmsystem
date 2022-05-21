package com.hj.pojo;

import java.util.Date;

public class Log {
    private Integer logid;

    private Date logdate;

    private String logdetail;

    private String pnum;

    private String issueid;

    private Integer logtype;

    private String logtitle;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public String getLogdetail() {
        return logdetail;
    }

    public void setLogdetail(String logdetail) {
        this.logdetail = logdetail == null ? null : logdetail.trim();
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum == null ? null : pnum.trim();
    }

    public String getIssueid() {
        return issueid;
    }

    public void setIssueid(String issueid) {
        this.issueid = issueid == null ? null : issueid.trim();
    }

    public Integer getLogtype() {
        return logtype;
    }

    public void setLogtype(Integer logtype) {
        this.logtype = logtype;
    }

    public String getLogtitle() {
        return logtitle;
    }

    public void setLogtitle(String logtitle) {
        this.logtitle = logtitle == null ? null : logtitle.trim();
    }
}