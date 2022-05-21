package com.hj.service;

import com.hj.pojo.Apply;
import com.hj.pojo.Items;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ApplyService {
    boolean insertApplyCord(Apply apply);
    List<Apply> queryAllCordByPnum(String pnum);
    List<Items> queryallitems();
    boolean dealHolidayStatus(int applytypeid, int applyid, Date confirmdate);
    List<Map>queryAllCordByStatus(int applytypeid);
    boolean denyHoliday(int applyid,int applytypeid,Date confirmdate,String denyreason);
}
