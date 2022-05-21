package com.hj.service;

import com.hj.pojo.Depart;

import java.util.List;
import java.util.Map;

public interface DepartService {
    public Depart FindDepartInfo(int departId);
    public List<Depart> FindDepartList();
    public List<Map> queryMapData();
    boolean deleteDepart(int departid);
    boolean insertDepart(Depart depart);
    boolean updateDepart(Depart depart);
}
