package com.hj.pojo;

public class Level {
    private Integer levelid;

    private String levelname;

    private Integer levelrank;

    private String leveldetal;

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname == null ? null : levelname.trim();
    }

    public Integer getLevelrank() {
        return levelrank;
    }

    public void setLevelrank(Integer levelrank) {
        this.levelrank = levelrank;
    }

    public String getLeveldetal() {
        return leveldetal;
    }

    public void setLeveldetal(String leveldetal) {
        this.leveldetal = leveldetal == null ? null : leveldetal.trim();
    }
}