package com.hj.controller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hj.pojo.Issue;
import com.hj.pojo.Log;
import com.hj.pojo.Police;
import com.hj.pojo.Relevantmantable;
import com.hj.service.IssueService;
import com.hj.service.RlmService;
import com.hj.utils.DateTools;
import com.mysql.cj.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/issue")
public class IssueController {
    @Autowired
    private IssueService issueService;
    @Autowired
    private RlmService rlmService;

//    跳转到警情页面
    @RequestMapping("/issuepage")
    public String issuePage(){
        return "issuepage";
    }

//    新增案情
    @RequestMapping("/insertissue")
    public String insertIssue(HttpServletRequest request, HttpSession session) throws Exception {

        Police police= (Police) session.getAttribute("policeSession");
        Issue issue=new Issue();
        issue.setActdate(DateTools.change(request.getParameter("actdate")));
        issue.setIssueid(request.getParameter("issueid"));
        issue.setBaojingfangshi(request.getParameter("baojingfangshi"));
        issue.setIssueaddress(request.getParameter("issueaddress"));
        issue.setIssuestartdate(DateTools.change(DateTools.getNowDateShort()));
        issue.setIssuetitle(request.getParameter("issuetitle"));
        issue.setIssueproccess(request.getParameter("issueproccess"));
        issue.setChulijieguo(request.getParameter("chulijieguo"));
        issue.setPickman(request.getParameter("pickman"));
        issue.setBaojingneirong(request.getParameter("baojingneirong"));
        issue.setPnum(police.getPnum());
        issue.setIssuetype(request.getParameter("issuetype"));
//        此处的报案人变成了警情详细信息
        issue.setPuteventmanname(request.getParameter("puteventman"));
        issue.setIssuedetail(request.getParameter("issuedetail"));
        issueService.insertIssue(issue);
        return "main";
    }

//    新增案件相关人
    @RequestMapping("/insertrelevent")
    public String insertrelevent(String data,HttpServletRequest request)throws Exception{
        Relevantmantable relevantmantable=new Relevantmantable();
        List<Relevantmantable> rlmList= JSON.parseArray(data,Relevantmantable.class);
        for (Relevantmantable item :rlmList){
            rlmService.insertRelevantman(item);
        }
        return "main";
    }

//    查询案件
    @RequestMapping("/queryissue")
    @ResponseBody
    public List<Issue> QueryIssueBypnum(String pnum,HttpSession session,String pageNum){
        PageInfo pageInfo=issueService.queryIssueByPnum(pnum,Integer.parseInt(pageNum));
        session.setAttribute("pagesCount",pageInfo.getTotal());
        System.out.println("pagesCount-----"+pageInfo.getTotal());
        return pageInfo.getList();

    }
//    查询案件相关人
    @RequestMapping(value = "/queryrlmbyissueid")
    @ResponseBody
    public List<Relevantmantable> queryRlmByIssueid(String issueid){
        return rlmService.queryrlmbyissueid(issueid);

    }

//    更新警情的详细信息
    @RequestMapping(value = "/updateissue")
    @ResponseBody
    public String updateissue(String data){
        Map<String,Object>map=JSONObject.parseObject(data);
        Issue issue=new Issue();
        issue.setIssuetype((String) map.get("issuetype"));
        issue.setChulijieguo((String) map.get("chulijieguo"));
        issue.setIssueproccess((String) map.get("issueproccess"));
        issue.setPuteventmanname((String) map.get("puteventmanname"));
        issue.setIssueid((String) map.get("issueid"));
        issueService.updateIssueInfo(issue);
        return "main";
    }

    @RequestMapping("/queryissuebyissueid")
    @ResponseBody
    public Issue QueryIssueByIssueid(String issueid){
        return issueService.queryByIssueid(issueid);
    }

    @RequestMapping("/issueTypeFromChart")
    @ResponseBody
    public List<Map> QueryissueTypeChart(){
        return issueService.queryIssuetypeChart();
    }
    @RequestMapping("/issueProccessFromChart")
    @ResponseBody
    public List<Map> QueryissueProccessChart(){
        return issueService.queryIssueProccessChart();
    }
    @RequestMapping("/queryissueByProccess")
    @ResponseBody
    public List<Issue> QueryissueByProccess(String proccess){
        return issueService.queryIssueByProcess(proccess);
    }

}