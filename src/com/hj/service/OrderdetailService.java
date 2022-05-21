package com.hj.service;

import com.hj.pojo.Items;
import com.hj.pojo.Orderdetail;

import java.util.List;

public interface OrderdetailService {
    boolean insertOrderdetailCord(int itemsid,String orderid);
    List<Items> queryOrderDetailCord(String orderid);
}
