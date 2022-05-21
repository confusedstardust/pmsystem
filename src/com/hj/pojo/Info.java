package com.hj.pojo;

import java.util.Date;

public class Info {
    private String infotitle;

    private String infodetail;

    private Integer infoid;

    private Date infodate;

    public String getInfotitle() {
        return infotitle;
    }

    public void setInfotitle(String infotitle) {
        this.infotitle = infotitle == null ? null : infotitle.trim();
    }

    public String getInfodetail() {
        return infodetail;
    }

    public void setInfodetail(String infodetail) {
        this.infodetail = infodetail == null ? null : infodetail.trim();
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public Date getInfodate() {
        return infodate;
    }

    public void setInfodate(Date infodate) {
        this.infodate = infodate;
    }
}