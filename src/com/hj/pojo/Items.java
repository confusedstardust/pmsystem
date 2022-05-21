package com.hj.pojo;

public class Items {
    private String itemsname;

    private Integer itemsid;

    private Integer itemscount;

    private String itempicture;

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname == null ? null : itemsname.trim();
    }

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public Integer getItemscount() {
        return itemscount;
    }

    public void setItemscount(Integer itemscount) {
        this.itemscount = itemscount;
    }

    public String getItempicture() {
        return itempicture;
    }

    public void setItempicture(String itempicture) {
        this.itempicture = itempicture == null ? null : itempicture.trim();
    }
}