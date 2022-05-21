package com.hj.pojo;

public class Relevantmantable {
    private String relevantname;

    private String relevantaddress;

    private String relevanttel;

    private String relevantidcard;

    private String isssueid;

    private int relevantid;

    public String getRelevantname() {
        return relevantname;
    }

    public void setRelevantname(String relevantname) {
        this.relevantname = relevantname == null ? null : relevantname.trim();
    }

    public String getRelevantaddress() {
        return relevantaddress;
    }

    public void setRelevantaddress(String relevantaddress) {
        this.relevantaddress = relevantaddress == null ? null : relevantaddress.trim();
    }

    public String getRelevanttel() {
        return relevanttel;
    }

    public void setRelevanttel(String relevanttel) {
        this.relevanttel = relevanttel == null ? null : relevanttel.trim();
    }

    public String getRelevantidcard() {
        return relevantidcard;
    }

    public void setRelevantidcard(String relevantidcard) {
        this.relevantidcard = relevantidcard == null ? null : relevantidcard.trim();
    }

    public String getIsssueid() {
        return isssueid;
    }

    public void setIsssueid(String isssueid) {
        this.isssueid = isssueid == null ? null : isssueid.trim();
    }

    public int getRelevantid() {
        return relevantid;
    }

    public void setRelevantid(int relevantid) {
        this.relevantid = relevantid;
    }
}