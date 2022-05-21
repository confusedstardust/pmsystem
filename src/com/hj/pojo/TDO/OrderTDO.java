package com.hj.pojo.TDO;

import com.hj.pojo.Items;
import com.hj.pojo.Order;

import java.util.List;
public class OrderTDO extends Order {
    private List<Items> itemsList;
    private String pname;
    private String pnum;

    @Override
    public String getPnum() {
        return pnum;
    }

    @Override
    public void setPnum(String pnum) {
        this.pnum = pnum;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }
}
