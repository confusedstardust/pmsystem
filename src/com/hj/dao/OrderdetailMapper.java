package com.hj.dao;

import com.hj.pojo.Items;
import com.hj.pojo.Orderdetail;
import com.hj.pojo.OrderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailMapper {
    int countByExample(OrderdetailExample example);

    int deleteByExample(OrderdetailExample example);

    int insert(Orderdetail record);

    int insertSelective(Orderdetail record);

    List<Orderdetail> selectByExample(OrderdetailExample example);

    int updateByExampleSelective(@Param("record") Orderdetail record, @Param("example") OrderdetailExample example);

    int updateByExample(@Param("record") Orderdetail record, @Param("example") OrderdetailExample example);
    boolean insertOrderdetailCord(@Param("itemsid")int itemsid,@Param("orderid") String orderid);
    List<Items> queryOrderDetailCord(@Param("orderid")String orderid);
    int countApplyTimes(int itemsid);
}