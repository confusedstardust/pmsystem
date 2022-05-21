package com.hj.service.impl;

import com.hj.dao.PoliceMapper;
import com.hj.pojo.Police;
import com.hj.service.PoliceService;
import com.hj.utils.DateTools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PoliceServiceImpl implements PoliceService {
    @Resource
    private PoliceMapper mapper;
    public void setMapper(PoliceMapper mapper) {
        this.mapper = mapper;
    }
    @Override
    public Police findPolice(String pnum, String ppsw) {
        return mapper.findPolice(pnum,ppsw);
    }

    @Override
    public Police checkIdentity(String pnum, String pidcard,String pname) {
        return mapper.checkIdentity(pnum,pidcard,pname);
    }

    @Override
    public boolean updatePpsw(String pidcard, String ppsw) {
        if (mapper.updatePpsw(pidcard,ppsw)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updatePtel(String ptel, String pnum) {
        if (mapper.updatePtel(ptel,pnum)){
            return true;
        }else{
            return false;
        }


    }

    @Override
    public boolean updateImage(String filepath, String pnum) {
        if (mapper.updateImage(filepath,pnum)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<Police> queryAllMember() {
        return mapper.queryAllMember();
    }

    @Override
    public boolean insertMember(Police police) {
        return mapper.insertMember(police);
    }

    @Override
    public boolean deletePolice(String pnum) {
        return mapper.deletePolice(pnum);
    }

    @Override
    public boolean updatePoliceInfo(Police police) {
        return mapper.updatePoliceInfo(police);
    }

    @Override
    public int querysamepnum(String pnum) {
        return mapper.querysamepnum(pnum);
    }

    @Override
    public List<Police> queryByPartten(String arg, String partten) {
        System.out.println("arg是："+arg+"partten是："+partten);
        if (Integer.parseInt(partten)==1)
            return mapper.queryByName(arg);
        else if (Integer.parseInt(partten)==2)
            return mapper.queryByPid(arg);
        else if (Integer.parseInt(partten)==3)
            return mapper.queryByDepartid(arg);
        else
            return mapper.queryByPtel(arg);
    }

    @Override
    public Map queryMessInfo() throws ParseException {
        Map map=new HashMap();
        map.put("issuecount",mapper.countIssue());
        map.put("membercount",mapper.countMember());
        map.put("newissue",mapper.countNewIssue(DateTools.change(DateTools.getNowDateShort())));
        return map;
    }
}
