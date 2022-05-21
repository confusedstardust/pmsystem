package com.hj.dao;

import com.hj.pojo.Info;
import com.hj.pojo.InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoMapper {
    int countByExample(InfoExample example);

    int deleteByExample(InfoExample example);

    int insert(Info record);

    int insertSelective(Info record);

    List<Info> selectByExample(InfoExample example);

    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    List<Info> queryAllInfo();
    boolean insertInfo(Info info);
    boolean deleteInfo(int infoid);
    boolean setInfotoZero();
    boolean goTop(int infoid);
    Info getTopInfo();
}