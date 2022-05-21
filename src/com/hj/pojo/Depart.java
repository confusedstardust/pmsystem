package com.hj.pojo;

public class Depart {
    private String departname;

    private Integer departid;

    private String departroot;

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname == null ? null : departname.trim();
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public String getDepartroot() {
        return departroot;
    }

    public void setDepartroot(String departroot) {
        this.departroot = departroot == null ? null : departroot.trim();
    }
}