package com.hj.dao;

import com.hj.pojo.Issue;
import com.hj.pojo.IssueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IssueMapper {
    int countByExample(IssueExample example);

    int deleteByExample(IssueExample example);

    int insert(Issue record);

    int insertSelective(Issue record);

    List<Issue> selectByExample(IssueExample example);

    int updateByExampleSelective(@Param("record") Issue record, @Param("example") IssueExample example);

    int updateByExample(@Param("record") Issue record, @Param("example") IssueExample example);


    boolean insertIssue(Issue issue);
    List<Issue>queryIssueByPnum(String pnum);
    boolean updateIssueInfo(Issue issue);
    List<Issue>queryByname(@Param("arg") String arg,@Param("pnum")String pnum);
    List<Issue>queryByIssueid(@Param("arg") String arg,@Param("pnum")String pnum);
    Issue queryByIssueid(String issueid);
    List<String>queryIssueType();
    int countIssuetypeTimes(String issuetype);
//    查询所有案件进度
    List<String>queryIssueProcess();
    int countIssueProcessTimes(String issueproccess);
//    通过进度查询案件
    List<Issue>queryIssueByProcess(String issueprocess);
}