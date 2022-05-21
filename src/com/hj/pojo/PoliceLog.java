package com.hj.pojo;

import java.util.Date;

public class PoliceLog {
    private String optype;
    private Date opdate;
    private int opid;
    private String pname;
    private String pnum;
    public PoliceLog() {
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getOpdate() {
        return opdate;
    }

    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    public String getOptype() {
        return optype;
    }

    public void setOptype(String optype) {
        this.optype = optype;
    }

    public int getOpid() {
        return opid;
    }

    public void setOpid(int opid) {
        this.opid = opid;
    }
}
