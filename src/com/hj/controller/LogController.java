package com.hj.controller;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hj.pojo.Issue;
import com.hj.pojo.Log;
import com.hj.pojo.Police;
import com.hj.pojo.PoliceLog;
import com.hj.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
@RequestMapping("/log")
public class LogController {
    @Autowired
    private LogService logService;
//    跳转至日志页
    @RequestMapping("/logpage")
    public String LogPage(){
        return "logpage";
    }
    @RequestMapping(value = "/insertlog",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String insertLog(String data){
        Log log= JSON.parseObject(data,Log.class);
        System.out.println(log.getIssueid()+"-----"
                +log.getLogdate()+"----------"+log.getLogtitle());
        logService.insertLog(log);
        return "新增日志成功";
    }
    @RequestMapping("/queryworklog")
    @ResponseBody
    public List<Log> queryWorkLog(String pnum){
        return logService.queryWorkLog(pnum);
    }
    @RequestMapping("/searchlog")
    @ResponseBody
    public List<Issue>searchlog(String partten, String arg, HttpSession session){
        Police police= (Police) session.getAttribute("policeSession");
        System.out.println(police.getPnum()+"____"+arg+"_____"+partten);
        return logService.queryLogByPartten(partten,arg,police.getPnum());
    }
    @RequestMapping(value = "/insertissuelog",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String inseryIssueLog(String data){
        Log log=JSON.parseObject(data,Log.class);
        System.out.println(log.toString());
        logService.insertLog(log);
        return "新增日志成功";
    }
    @RequestMapping("/queryissuelog")
    @ResponseBody
    public List<Log> queryIssueLog(String pnum,String pageNum,HttpSession  session){
        PageInfo pageInfo=logService.queryIssueLog(pnum,Integer.parseInt(pageNum));
        session.setAttribute("pagesCount",pageInfo.getTotal());
        return pageInfo.getList();
    }
    @RequestMapping(value = "/updatelog",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String updateLog(String data){
        Log log1=JSON.parseObject(data, Log.class);
        System.out.println(log1.getIssueid()+"XXXXX"+log1.getLogdetail());
        logService.updateLog(log1);
        return "更新成功";
    }
    @RequestMapping(value = "/qilbp")
    @ResponseBody
    public List<Log> queryIssueLogByPartten(String partten, String arg, String pnum){
        return logService.queryIssueLog(partten,pnum,arg);
    }
//    查询人员变更日志
    @RequestMapping(value = "querypolicelog")
    @ResponseBody
    public List<PoliceLog> queryPoliceLog(){
        return logService.queryPoliceLog();
    }
}