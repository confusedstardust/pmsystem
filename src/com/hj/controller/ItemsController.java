package com.hj.controller;

import com.alibaba.fastjson.JSON;
import com.hj.pojo.Items;
import com.hj.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/items")
public class ItemsController {
        @Autowired
        private ItemService itemService;
        @RequestMapping("/ItemsPage")
        public String itemsPage(){
                return "itemsPage";
        }

        @RequestMapping("/queryAllItems")
        @ResponseBody
        public List<Items> findAllItems(){
                return itemService.queryAllitems();
        }
        @RequestMapping(value = "/deleteitems",produces = "text/html;charset=UTF-8")
        @ResponseBody
        public String deleteItems(String itemsid){
                itemService.deleteItem(itemsid);
                return "删除成功！！";
        }

        @RequestMapping("/queryitem")
        @ResponseBody
        public List<Items> queryitem(String itemsname){
                System.out.println(itemsname);
                return itemService.queryItemByname(itemsname);
        }

        @RequestMapping(value = "/insertItems",produces = "text/html;charset=UTF-8")
        @ResponseBody
        public String insertItem(String data){
                List<Items> itemsList=JSON.parseArray(data,Items.class);
                for(Items ite: itemsList){
                        System.out.println(ite.getItemscount()+"---"+ite.getItemsname());
                    itemService.insertItem(ite);
                }
                return "添加成功！！";
        }

        @RequestMapping(value = "/setitems",produces = "text/html;charset=UTF-8")
        @ResponseBody
        public void setItem(int itemsid,int itemscount){
                itemService.setItemsCont(itemsid,itemscount);
        }

        @RequestMapping(value = "/itemsApplyFromChart")
        @ResponseBody
        public List<Map> countItemsApply(){
            return itemService.itemApplyCount();
        }
}
