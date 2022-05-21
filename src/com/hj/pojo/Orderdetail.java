package com.hj.pojo;

public class Orderdetail {
    private Integer id;

    private Integer ordersId;

    private Integer itemsId;

    private String itemsNum;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public String getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(String itemsNum) {
        this.itemsNum = itemsNum == null ? null : itemsNum.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}