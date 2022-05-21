package com.hj.service.impl;

import com.hj.dao.ApplyMapper;
import com.hj.dao.ItemsMapper;
import com.hj.pojo.Apply;
import com.hj.pojo.Items;
import com.hj.service.ApplyService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ApplyServiceImpl  implements ApplyService {
    @Resource
    private ApplyMapper applyMapper;
    @Resource
    private ItemsMapper itemsMapper;
    @Override
    public boolean insertApplyCord(Apply apply) {
        return applyMapper.insertApplyCord(apply) ;
    }

    @Override
    public List<Apply> queryAllCordByPnum(String pnum) {
        return applyMapper.queryAllCordByPnum(pnum);
    }

    @Override
    public List<Items> queryallitems() {
        return itemsMapper.queryallitems();
    }

    @Override
    public boolean dealHolidayStatus(int applytypeid, int applyid, Date confirmdate) {
       return applyMapper.dealHolidayStatus(applytypeid,applyid,confirmdate);
    }

    @Override
    public List<Map> queryAllCordByStatus(int applytypeid) {
        return applyMapper.queryAllCordByStatus(applytypeid);
    }

    @Override
    public boolean denyHoliday(int applyid, int applytypeid, Date confirmdate, String denyreason) {
        return applyMapper.denyHoliday(applyid,applytypeid,confirmdate,denyreason);
    }


}
