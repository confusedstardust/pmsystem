package com.hj.dao;

import com.hj.pojo.Items;
import com.hj.pojo.ItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapper {
    int countByExample(ItemsExample example);

    int deleteByExample(ItemsExample example);

    int insert(Items record);

    int insertSelective(Items record);

    List<Items> selectByExample(ItemsExample example);

    int updateByExampleSelective(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByExample(@Param("record") Items record, @Param("example") ItemsExample example);
    List<Items> queryallitems();
    boolean deleteItem(int itemsid);
    List<Items>queryItemByname(String itemsname);
    boolean insertItem(Items items);
    boolean setItemsCont(@Param("itemsid") int itemsid,@Param("itemscount")int itemscount);
}