package com.hj.pojo;

public class Police {
    private String pname;

    private String pnum;

    private Integer plevel;

    private String ppsw;

    private String ptel;

    private String psex;

    private Integer departid;

    private Integer levelrank;

    private String picuture;

    private String pidcard;


    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
    }

    public Integer getPlevel() {
        return plevel;
    }

    public void setPlevel(Integer plevel) {
        this.plevel = plevel;
    }

    public String getPpsw() {
        return ppsw;
    }

    public void setPpsw(String ppsw) {
        this.ppsw = ppsw == null ? null : ppsw.trim();
    }

    public String getPtel() {
        return ptel;
    }

    public void setPtel(String ptel) {
        this.ptel = ptel == null ? null : ptel.trim();
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex == null ? null : psex.trim();
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public Integer getLevelrank() {
        return levelrank;
    }

    public void setLevelrank(Integer levelrank) {
        this.levelrank = levelrank;
    }

    public String getPicuture() {
        return picuture;
    }

    public void setPicuture(String picuture) {
        this.picuture = picuture;
    }

    public String getPidcard() {
        return pidcard;
    }

    public void setPidcard(String pidcard) {
        this.pidcard = pidcard;
    }
}