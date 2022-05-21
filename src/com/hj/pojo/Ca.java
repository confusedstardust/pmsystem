package com.hj.pojo;

public class Ca {
    private String name;

    private Integer id;

    private String type;

    private Integer case1;

    private Integer time1;

    private Integer case2;

    private Integer time2;

    private Integer case3;

    private Integer time3;

    private Integer case4;

    private Integer time4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getCase1() {
        return case1;
    }

    public void setCase1(Integer case1) {
        this.case1 = case1;
    }

    public Integer getTime1() {
        return time1;
    }

    public void setTime1(Integer time1) {
        this.time1 = time1;
    }

    public Integer getCase2() {
        return case2;
    }

    public void setCase2(Integer case2) {
        this.case2 = case2;
    }

    public Integer getTime2() {
        return time2;
    }

    public void setTime2(Integer time2) {
        this.time2 = time2;
    }

    public Integer getCase3() {
        return case3;
    }

    public void setCase3(Integer case3) {
        this.case3 = case3;
    }

    public Integer getTime3() {
        return time3;
    }

    public void setTime3(Integer time3) {
        this.time3 = time3;
    }

    public Integer getCase4() {
        return case4;
    }

    public void setCase4(Integer case4) {
        this.case4 = case4;
    }

    public Integer getTime4() {
        return time4;
    }

    public void setTime4(Integer time4) {
        this.time4 = time4;
    }
}