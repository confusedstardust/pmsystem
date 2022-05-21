package com.hj.service.impl;

import com.hj.dao.OrderdetailMapper;
import com.hj.pojo.Items;
import com.hj.pojo.Orderdetail;
import com.hj.service.OrderdetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class orderdetailServiceImpl implements OrderdetailService {
    @Resource
    private OrderdetailMapper orderdetailMapper;
    @Override
    public boolean insertOrderdetailCord(int itemsid,String orderid) {
        return orderdetailMapper.insertOrderdetailCord(itemsid,orderid);
    }

    @Override
    public List<Items> queryOrderDetailCord(String orderid) {
        return orderdetailMapper.queryOrderDetailCord(orderid);
    }
}
