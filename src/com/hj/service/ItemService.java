package com.hj.service;

import com.hj.pojo.Items;

import java.util.List;
import java.util.Map;

public interface ItemService {
    List<Items>queryAllitems();
    boolean deleteItem(String itemsid);
    List<Items>queryItemByname(String itemsname);
    boolean insertItem(Items items);
    boolean setItemsCont(int itemsid,int itemsCount);
    List<Map>itemApplyCount();
}
