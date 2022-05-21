package com.hj.dao;

import com.hj.pojo.Relevantmantable;
import com.hj.pojo.RelevantmantableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelevantmantableMapper {
    int countByExample(RelevantmantableExample example);

    int deleteByExample(RelevantmantableExample example);

    int insert(Relevantmantable record);

    int insertSelective(Relevantmantable record);

    List<Relevantmantable> selectByExample(RelevantmantableExample example);

    int updateByExampleSelective(@Param("record") Relevantmantable record, @Param("example") RelevantmantableExample example);

    int updateByExample(@Param("record") Relevantmantable record, @Param("example") RelevantmantableExample example);


    boolean insertRelevantman(Relevantmantable relevantmantable);
    List<Relevantmantable>queryrlmbyissueid(String issueid);
}