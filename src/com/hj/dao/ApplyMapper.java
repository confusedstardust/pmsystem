package com.hj.dao;

import com.hj.pojo.Apply;
import com.hj.pojo.ApplyExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hj.pojo.Items;
import org.apache.ibatis.annotations.Param;

public interface ApplyMapper {
    int countByExample(ApplyExample example);
    int deleteByExample(ApplyExample example);
    int insert(Apply record);
    int insertSelective(Apply record);
    List<Apply> selectByExample(ApplyExample example);
    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);
    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);



    boolean insertApplyCord(Apply apply);
    List<Apply> queryAllCordByPnum(@Param("pnum") String pnum);
//    通过请假审批
    boolean dealHolidayStatus(@Param("applytypeid")int applytypeid,@Param("applyid")int applyid,@Param("confirmdate") Date confirmdate);
    List<Map>queryAllCordByStatus(int applytypeid);
    boolean denyHoliday(@Param("applyid")int applyid ,@Param("applytypeid")int applytypeid ,@Param("confirmdate")Date confirmdate ,@Param("denyreason")String denyreason );

}