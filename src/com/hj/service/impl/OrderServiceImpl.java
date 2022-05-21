package com.hj.service.impl;

import com.hj.dao.OrderMapper;
import com.hj.dao.OrderdetailMapper;
import com.hj.dao.orderTDOMapper;
import com.hj.pojo.Items;
import com.hj.pojo.Order;
import com.hj.pojo.Orderdetail;
import com.hj.pojo.TDO.OrderTDO;
import com.hj.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    OrderMapper orderMapper;
    @Resource
    orderTDOMapper orderTDOMapper;
    @Resource
    OrderdetailMapper orderdetailMapper;
    @Override
    public boolean insertItemsApply(Order order) {
        return orderMapper.insertItemsApply(order);
    }

    @Override
    public List<Order> queryitemscord(String pnum) {
        List<Order>ol=orderMapper.queryitemscord(pnum);
        for (Order order:ol){
            System.out.println(order.getOrderstatus());
        }
        return orderMapper.queryitemscord(pnum);
    }

    @Override
    public List<OrderTDO> checkCordByStatus(int orderstatus) {
        List<OrderTDO>orderTDOS=orderTDOMapper.checkCordByStatus(orderstatus);
        for(OrderTDO o :orderTDOS){
            List<Items> itemsList=orderdetailMapper.queryOrderDetailCord(o.getOrderid());
            o.setItemsList(itemsList);
        }
        return orderTDOS;
    }

    @Override
    public boolean changeStatus(String orderid, int orderstatus, Date dealdate) {
        return orderMapper.changeStatus(orderid,orderstatus,dealdate);
    }

    @Override
    public boolean denyItemsOrder(String orderid, int orderstatus, Date dealdate, String judgereason) {
        return orderMapper.denyItemsOrder(orderid,orderstatus,dealdate,judgereason);
    }

    @Override
    public List<Order> queryAllCord() {
        return orderMapper.queryAllCord();
    }

}
