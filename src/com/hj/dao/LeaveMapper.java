package com.hj.dao;

import com.hj.pojo.Leave;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;


public interface LeaveMapper {
    boolean insertLeaveCord(Leave leave);
    Leave findLeaveByPnum(String pnum);
    boolean agreeCord(@Param("pnum") String pnum,@Param("passdate") Date passdate);
    List<Leave> findNullLeave();
}