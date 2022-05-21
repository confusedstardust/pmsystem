package com.hj.service;

import com.hj.pojo.Police;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface PoliceService {
    public Police findPolice(String pnum,String ppsw);
    public Police checkIdentity(String pnum,String pidcard,String pname);
    public boolean  updatePpsw(String pidcard,String ppsw);
    public boolean updatePtel(String ptel,String pnum);
    public boolean updateImage(String filepath,String pnum);
//    增删改查警员
    public List<Police> queryAllMember();
    public boolean insertMember(Police police);
    public boolean deletePolice(String pnum);
    public boolean updatePoliceInfo(Police police);
    public int querysamepnum(String pnum);
    public List<Police>queryByPartten(String arg,String partten);
    Map queryMessInfo() throws ParseException;
}
