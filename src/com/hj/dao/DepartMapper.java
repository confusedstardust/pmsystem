package com.hj.dao;

import com.hj.pojo.Depart;
import com.hj.pojo.DepartExample;
import java.util.List;

import com.hj.pojo.Level;
import org.apache.ibatis.annotations.Param;

public interface DepartMapper {
    int countByExample(DepartExample example);

    int deleteByExample(DepartExample example);

    boolean insert(Depart depart);

    int insertSelective(Depart record);

    List<Depart> selectByExample(DepartExample example);

    int updateByExampleSelective(@Param("record") Depart record, @Param("example") DepartExample example);

    int updateByExample(@Param("record") Depart record, @Param("example") DepartExample example);

    Depart FindDepartInfo(@Param("departid")int departit);
    List<Depart>FindDepartList();
    boolean deleteBydepartid(int departid);
    boolean updateBydepartid(Depart depart);
}