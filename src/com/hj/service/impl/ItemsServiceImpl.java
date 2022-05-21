package com.hj.service.impl;

import com.hj.dao.ItemsMapper;
import com.hj.dao.OrderdetailMapper;
import com.hj.pojo.Items;
import com.hj.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemsServiceImpl implements ItemService {
    @Resource
    private ItemsMapper itemsMapper;
    @Resource
    private OrderdetailMapper orderdetailMapper;
    @Override
    public List<Items> queryAllitems() {
        return itemsMapper.queryallitems();
    }

    @Override
    public boolean deleteItem(String itemsid) {
        return itemsMapper.deleteItem(Integer.parseInt(itemsid));
    }

    @Override
    public List<Items> queryItemByname(String itemsname) {
        return itemsMapper.queryItemByname(itemsname);
    }

    @Override
    public boolean insertItem(Items items) {
        return itemsMapper.insertItem(items);
    }

    @Override
    public boolean setItemsCont(int itemsid, int itemsCount) {
        return itemsMapper.setItemsCont(itemsid,itemsCount);
    }

    @Override
    public List<Map> itemApplyCount() {
        List<Map> mapList=new ArrayList<>();
        List<Items> itemsList=itemsMapper.queryallitems();
        for (Items i:itemsList){
            Map map= new HashMap();
            map.put("name",i.getItemsname());
            map.put("value", orderdetailMapper.countApplyTimes(i.getItemsid()));
            mapList.add(map);
        }
        return mapList;
    }
}
