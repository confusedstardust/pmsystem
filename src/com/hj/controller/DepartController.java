package com.hj.controller;

import com.alibaba.fastjson.JSON;
import com.hj.pojo.Depart;
import com.hj.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/depart")
public class DepartController {
    @Autowired
    private com.hj.service.cService cService;
    @Autowired
    private DepartService departService;
    @RequestMapping("/finddepartinfo")
    @ResponseBody
    public Depart findDepartInfo(int departid){
        return departService.FindDepartInfo(departid);
    }
    @RequestMapping("/departlist")
    @ResponseBody
    public List<Depart> findDepartList(){
        return departService.FindDepartList();
    }

    @RequestMapping("/departPage")
//    @ResponseBody
    public String departManagePage(){
        return "departManagePage";
    }

    @RequestMapping("/queryAlldepart")
    @ResponseBody
    public List<Map> queryDepartData(){

        return departService.queryMapData();
    }

    @RequestMapping(value = "/deletedepart",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryDepartData(int departid){
        departService.deleteDepart(departid);
        return "删除成功！";
    }

    @RequestMapping(value = "/insertdepart",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String insertDepartData(String data){
        List<Depart> departsList= JSON.parseArray(data,Depart.class);
        for(Depart d: departsList){
            departService.insertDepart(d);
        }
        return "添加成功！";
    }

    @RequestMapping(value = "/modifydepart",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String updateDepartData(String data){
        Depart departsList= JSON.parseObject(data,Depart.class);
        departService.updateDepart(departsList);
        return "修改成功！";
    }
}

//给小张的数据
//    @RequestMapping("/nv")
//    @ResponseBody
//    public List<String> insertData(){
//        List<String> stringList=new ArrayList<>();
//        for (int i=5;i<=180;i++){
//            try {
//                Map<String, Double> mapList=cService.getval(i);
//
//                stringList.add("被试编号："+i+"   "+"高道德疼痛:"+mapList.get("a1")+"   "+"高道德非疼:"+mapList.get("b1")+"   "+"低道德疼痛:"+mapList.get("a2")+"   "+"低道德非疼:"+mapList.get("b2")+"   "+"高道德疼痛反应时:"+mapList.get("c1")+"   "+"高道德非疼反应时:"+mapList.get("d1")+"   "+"低道德疼痛反应时:"+mapList.get("c2")+"   "+"低道德非疼反应时:"+mapList.get("d2")+"\n");
//
//
////                System.out.println("id="+i);
////                System.out.println(mapList.get("a1")+" "+mapList.get("b1")+" "+mapList.get("c1")+" "+mapList.get("d1"));
////                System.out.println(mapList.get("a2")+" "+mapList.get("b2")+" "+mapList.get("c2")+" "+mapList.get("d2"));
//            }catch (Exception e){
//                continue;
//            }
//
//        }
//        return stringList ;
//    }
//
