package com.hj.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hj.dao.IssueMapper;
import com.hj.pojo.Issue;
import com.hj.pojo.Items;
import com.hj.pojo.Relevantmantable;
import com.hj.service.IssueService;
import com.hj.utils.DateTools;
import com.hj.utils.PageUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IssueServiceImpl implements IssueService {
    @Resource
    private IssueMapper issueMapper;

    @Override
    public boolean insertIssue(Issue issue)throws Exception {

        return issueMapper.insertIssue(issue);
    }

    @Override
    public PageInfo queryIssueByPnum(String pnum,int pageNum) {
        PageHelper.startPage(pageNum,5);
        PageInfo page=new PageInfo(issueMapper.queryIssueByPnum(pnum));
        System.out.println("-------page------"+page.getList());
        return page;
    }

    @Override
    public boolean updateIssueInfo(Issue issue) {
        return issueMapper.updateIssueInfo(issue);
    }

    @Override
    public Issue queryByIssueid(String issueid) {
        return issueMapper.queryByIssueid(issueid);
    }
//查询警情类型的次数
    @Override
    public List<Map> queryIssuetypeChart() {
        List<Map> mapList=new ArrayList<>();
        List<String> stringList=issueMapper.queryIssueType();
        for (String i:stringList){
            Map map= new HashMap();
            map.put("name",i);
            map.put("value", issueMapper.countIssuetypeTimes(i));
            mapList.add(map);
        }
        return mapList;
    }
    //    查询警情进度统计
    @Override
    public List<Map> queryIssueProccessChart() {
        List<Map> mapList=new ArrayList<>();
        List<String> stringList=issueMapper.queryIssueProcess();
        for (String i:stringList){
            Map map= new HashMap();
            map.put("name",i);
            map.put("value", issueMapper.countIssueProcessTimes(i));
            mapList.add(map);
        }
        return mapList;
    }

    @Override
    public List<Issue> queryIssueByProcess(String process) {
        return issueMapper.queryIssueByProcess(process);
    }

}
