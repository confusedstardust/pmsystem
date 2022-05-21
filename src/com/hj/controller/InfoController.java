package com.hj.controller;

import com.alibaba.fastjson.JSON;
import com.hj.pojo.Info;
import com.hj.service.InfoService;
import com.hj.utils.DateTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping("info")
public class InfoController {
    @Autowired
    private InfoService infoService;
    @RequestMapping("infoPage")
    public String infoPage(){
        return "infoPage";
    }

    @RequestMapping(value = "getInfoData")
    @ResponseBody
    public List<Info> infoData(){
        return infoService.getInfoData();
    }

    @RequestMapping(value = "insertNewInfo",produces = "text/html")
    @ResponseBody
    public String insertInfo(String data) throws ParseException {
        Info info=JSON.parseObject(data,Info.class);
        info.setInfodate(DateTools.change(DateTools.getNowDateShort()));
        System.out.println(info.getInfodate()+info.getInfotitle()+info.getInfodetail());
        infoService.insertInfo(info);
        return "添加成功";
    }

    @RequestMapping(value = "deleteInfo",produces = "text/html")
    @ResponseBody
    public String deleteInfo(int infoid) {
        infoService.deleteInfo(infoid);
        return "删除成功";
    }

    @RequestMapping(value = "goTopInfo",produces = "text/html")
    @ResponseBody
    public String goTop(int infoid) {
        infoService.goTop(infoid);
        return "成功";
    }

    @RequestMapping(value = "getTopInfo")
    @ResponseBody
    public Info getTopInfo(){
       return infoService.getTopInfo();
    }
}
