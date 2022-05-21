package com.hj.service.impl;

import com.hj.dao.DepartMapper;
import com.hj.dao.PoliceMapper;
import com.hj.pojo.Depart;
import com.hj.service.DepartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartServiceImpl implements DepartService {
    @Resource
    private DepartMapper departMapper;
    @Resource
    private PoliceMapper policeMapper;
    @Override
    public Depart FindDepartInfo(int departId) {
        return departMapper.FindDepartInfo(departId);
    }

    @Override
    public List<Depart> FindDepartList() {
        return departMapper.FindDepartList();
    }

    @Override
    public List<Map> queryMapData() {
        List<Map> mapList=new ArrayList<>();
        List<Depart> intList=departMapper.FindDepartList();
        for (Depart i:intList){
            Map map= new HashMap();
            map.put("departid",i.getDepartid());
            map.put("departname",i.getDepartname());
            map.put("departroot",i.getDepartroot());
            map.put("count", policeMapper.countBydepartid(i.getDepartid()));
            mapList.add(map);
        }
        return mapList;
    }

    @Override
    public boolean deleteDepart(int departid) {
        return departMapper.deleteBydepartid(departid);
    }

    @Override
    public boolean insertDepart(Depart depart) {
        return departMapper.insert(depart);
    }

    @Override
    public boolean updateDepart(Depart depart) {
        return departMapper.updateBydepartid(depart);
    }
}
