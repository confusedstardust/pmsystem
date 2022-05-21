package com.hj.service;

import com.github.pagehelper.PageInfo;
import com.hj.pojo.Issue;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface IssueService {
    boolean insertIssue(Issue issue) throws Exception;
    PageInfo queryIssueByPnum(String pnum, int pageNum);
    boolean updateIssueInfo(Issue issue);
    Issue queryByIssueid(String issueid);
    List<Map>queryIssuetypeChart();
    List<Map>queryIssueProccessChart();
    List<Issue>queryIssueByProcess(String process);
}
