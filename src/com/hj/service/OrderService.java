package com.hj.service;

import com.hj.pojo.Order;
import com.hj.pojo.TDO.OrderTDO;

import java.util.Date;
import java.util.List;

public interface OrderService {
    boolean insertItemsApply(Order order);
    List<Order> queryitemscord(String pnum);
    List<OrderTDO> checkCordByStatus(int orderstatus);
    boolean changeStatus(String orderid, int orderstatus, Date dealdate);
    boolean denyItemsOrder(String orderid, int orderstatus, Date dealdate,String judgereason);

    List<Order>queryAllCord();
}
