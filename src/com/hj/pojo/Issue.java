package com.hj.pojo;

import java.util.Date;

public class Issue {
    private String issuedetail;

    private String issueid;

    private String issuetitle;

    private String issueproccess;

    private Integer logid;

    private Date issuestartdate;

    private Date actdate;

    private String pnum;

    private Integer publiclevel;

    private String issuetype;

    private String issueaddress;

    private String puteventmanname;

    private String chulijieguo;

    private String baojingfangshi;

    private String baojingneirong;

    private String pickman;

    public String getIssuedetail() {
        return issuedetail;
    }

    public void setIssuedetail(String issuedetail) {
        this.issuedetail = issuedetail == null ? null : issuedetail.trim();
    }

    public String getIssueid() {
        return issueid;
    }

    public void setIssueid(String issueid) {
        this.issueid = issueid == null ? null : issueid.trim();
    }

    public String getIssuetitle() {
        return issuetitle;
    }

    public void setIssuetitle(String issuetitle) {
        this.issuetitle = issuetitle == null ? null : issuetitle.trim();
    }

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Date getIssuestartdate() {
        return issuestartdate;
    }

    public void setIssuestartdate(Date issuestartdate) {
        this.issuestartdate = issuestartdate;
    }

    public Date getActdate() {
        return actdate;
    }

    public void setActdate(Date actdate) {
        this.actdate = actdate;
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum == null ? null : pnum.trim();
    }

    public Integer getPubliclevel() {
        return publiclevel;
    }

    public void setPubliclevel(Integer publiclevel) {
        this.publiclevel = publiclevel;
    }

    public String getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(String issuetype) {
        this.issuetype = issuetype == null ? null : issuetype.trim();
    }

    public String getIssueaddress() {
        return issueaddress;
    }

    public void setIssueaddress(String issueaddress) {
        this.issueaddress = issueaddress == null ? null : issueaddress.trim();
    }

    public String getPuteventmanname() {
        return puteventmanname;
    }

    public void setPuteventmanname(String puteventmanname) {
        this.puteventmanname = puteventmanname == null ? null : puteventmanname.trim();
    }

    public String getChulijieguo() {
        return chulijieguo;
    }

    public void setChulijieguo(String chulijieguo) {
        this.chulijieguo = chulijieguo == null ? null : chulijieguo.trim();
    }

    public String getBaojingfangshi() {
        return baojingfangshi;
    }

    public void setBaojingfangshi(String baojingfangshi) {
        this.baojingfangshi = baojingfangshi == null ? null : baojingfangshi.trim();
    }

    public String getBaojingneirong() {
        return baojingneirong;
    }

    public void setBaojingneirong(String baojingneirong) {
        this.baojingneirong = baojingneirong == null ? null : baojingneirong.trim();
    }

    public String getPickman() {
        return pickman;
    }

    public void setPickman(String pickman) {
        this.pickman = pickman == null ? null : pickman.trim();
    }

    public String getIssueproccess() {
        return issueproccess;
    }

    public void setIssueproccess(String issueproccess) {
        this.issueproccess = issueproccess;
    }
}