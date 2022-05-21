package com.hj.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hj.dao.IssueMapper;
import com.hj.dao.LogMapper;
import com.hj.dao.PoliceLogMapper;
import com.hj.pojo.Issue;
import com.hj.pojo.Log;
import com.hj.pojo.PoliceLog;
import com.hj.service.LogService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Resource
    private LogMapper logMapper;
    @Resource
    private IssueMapper issueMapper;
    @Resource
    private PoliceLogMapper policeLogMapper;
    @Override
    public boolean insertLog(Log log) {
        return logMapper.insertLog(log);
    }

    @Override
    public List<Log> queryWorkLog(String pnum) {
        return logMapper.queryWorkLog(pnum);
    }

    @Override
    public List<Issue> queryLogByPartten(String partten, String arg,String pnum) {
        int a=(Integer.parseInt(partten));
        if (a==1)
            return issueMapper.queryByname(arg,pnum);
        else
            return issueMapper.queryByIssueid(arg,pnum);
    }

    @Override
    public PageInfo queryIssueLog(String pnum,int pageNum) {
        PageHelper.startPage(pageNum,5);
        PageInfo page=new PageInfo(logMapper.queryIssueLog(pnum));
        System.out.println("-------page------"+page.getList());
        return page;
    }

    @Override
    public List<Log> queryIssueLog(String partten, String pnum, String arg) {
        if (Integer.parseInt(partten)==1)
            return logMapper.queryByname(arg,pnum);
        else
            return logMapper.queryByIssueid(arg,pnum);
    }


    @Override
    public boolean updateLog(Log log) {
        return logMapper.updateLog(log);
    }

    @Override
    public List<PoliceLog> queryPoliceLog() {
        return policeLogMapper.queryPoliceLog();
    }
}
