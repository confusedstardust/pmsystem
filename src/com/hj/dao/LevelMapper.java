package com.hj.dao;

import com.hj.pojo.Level;
import com.hj.pojo.LevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LevelMapper {
    int countByExample(LevelExample example);

    int deleteByExample(LevelExample example);

    int insert(Level record);

    int insertSelective(Level record);

    List<Level> selectByExample(LevelExample example);

    int updateByExampleSelective(@Param("record") Level record, @Param("example") LevelExample example);

    int updateByExample(@Param("record") Level record, @Param("example") LevelExample example);
    Level findLevelInfo(@Param("levelrank") int levelrank);
}