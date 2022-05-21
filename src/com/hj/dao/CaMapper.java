package com.hj.dao;

import com.hj.pojo.Ca;
import com.hj.pojo.CaExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CaMapper {
    int countByExample(CaExample example);

    int deleteByExample(CaExample example);

    int insert(Ca record);

    int insertSelective(Ca record);

    List<Ca> selectByExample(CaExample example);

    int updateByExampleSelective(@Param("record") Ca record, @Param("example") CaExample example);

    int updateByExample(@Param("record") Ca record, @Param("example") CaExample example);
    Map<String, Double> nvpy(int id);
}