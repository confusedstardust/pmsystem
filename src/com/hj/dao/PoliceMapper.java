package com.hj.dao;

import com.hj.pojo.Police;
import com.hj.pojo.PoliceExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PoliceMapper {
    int countByExample(PoliceExample example);

    int deleteByExample(PoliceExample example);

    int insert(Police record);

    int insertSelective(Police record);

    List<Police> selectByExampleWithBLOBs(PoliceExample example);

    List<Police> selectByExample(PoliceExample example);

    int updateByExampleSelective(@Param("record") Police record, @Param("example") PoliceExample example);

    int updateByExampleWithBLOBs(@Param("record") Police record, @Param("example") PoliceExample example);

    int updateByExample(@Param("record") Police record, @Param("example") PoliceExample example);


    Police findPolice(@Param("pnum")String pnum,@Param("ppsw")String ppsw);
    Police checkIdentity(@Param("pnum")String pnum,@Param("pidcard")String pidcard,@Param("pname")String pname);
    boolean updatePpsw(@Param("pidcard") String pidcard,@Param("ppsw")String ppsw);
    boolean updatePtel(@Param("ptel")String ptel,@Param("pnum")String pnum);
    boolean updateImage(@Param("picuture") String picuture,@Param("pnum")String pnum);
    List<Police>queryAllMember();
    boolean insertMember(Police police);
    boolean deletePolice(String pnum);
    boolean updatePoliceInfo(Police police);
    int querysamepnum(String pnum);
    List<Police>queryByName(String name);
    List<Police>queryByPid(String pid);
    List<Police>queryByDepartid(String departid);
    List<Police>queryByPtel(String ptel);
    int countIssue();
    int countMember();
    int countNewIssue(@Param("issuestartdate")Date issuestartdate);
    int countBydepartid(int departid);
}