package com.hj.dao;

import com.hj.pojo.Order;
import com.hj.pojo.OrderExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);


    boolean insertItemsApply(Order order);
    List<Order> queryitemscord(@Param("pnum")String pnum);
//    List<Order>checkCordByStatus(int orderstatus);
    List<Order>queryAllCord();
    boolean changeStatus(@Param("orderid") String orderid, @Param("orderstatus")int orderstatus, @Param("dealdate")Date dealdate);
    boolean denyItemsOrder(@Param("orderid") String orderid, @Param("orderstatus")int orderstatus, @Param("dealdate")Date dealdate,@Param("judgereason")String judgereason);

}