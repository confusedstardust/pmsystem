package com.hj.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hj.pojo.Items;

import java.lang.reflect.Type;
import java.util.*;

public class JsonUtils {

    public static void main(String[] args) {
//
        String a="[{\"itemsname\":\"催泪枪\",\"itemsid\":3,\"itemscount\":21,\"itempicture\":null},{\"itemsname\":\"警用制式刀\",\"itemsid\":4,\"itemscount\":23,\"itempicture\":null},{\"itemsname\":\"水壶\",\"itemsid\":7,\"itemscount\":231,\"itempicture\":null}]";
        a=a.replace("\\","");
//        转成对象
//       Items items=JSONArray.parseObject(a,Items.class);
//        String obj=JSON.toJSONString(a);
//        字符串转成list集合
        List<Items> list=JSON.parseArray(a,Items.class);
        for (Items items:list){
            System.out.println( items.getItemsname());
        }
    }
}
