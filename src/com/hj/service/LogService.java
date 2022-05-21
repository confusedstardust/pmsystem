package com.hj.service;

import com.github.pagehelper.PageInfo;
import com.hj.pojo.Issue;
import com.hj.pojo.Log;
import com.hj.pojo.PoliceLog;

import java.util.List;

public interface LogService {
    public boolean insertLog(Log log);
    public List<Log>queryWorkLog(String pnum);
    public List<Issue>queryLogByPartten(String partten, String arg,String pnum);
    public PageInfo queryIssueLog(String pnum, int pageNum);
    public List<Log>queryIssueLog(String partten,String pnum ,String arg);
    boolean updateLog(Log log);
    public List<PoliceLog>queryPoliceLog();
}
