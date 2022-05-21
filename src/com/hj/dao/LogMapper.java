package com.hj.dao;

import com.hj.pojo.Log;
import com.hj.pojo.LogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogMapper {
    int countByExample(LogExample example);

    int deleteByExample(LogExample example);

    int insert(Log record);

    int insertSelective(Log record);

    List<Log> selectByExample(LogExample example);

    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);


    boolean insertLog(Log log);
    List<Log>queryWorkLog(String pnum);
    List<Log>queryIssueLog(String pnum);
    boolean updateLog(Log log);
    List<Log>queryByname(@Param("arg")String arg,@Param("pnum")String pnum);
    List<Log>queryByIssueid(@Param("arg")String arg,@Param("pnum")String pnum);
}