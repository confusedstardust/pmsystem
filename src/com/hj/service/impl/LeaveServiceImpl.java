package com.hj.service.impl;

import com.hj.dao.LeaveMapper;
import com.hj.dao.LevelMapper;
import com.hj.pojo.Leave;
import com.hj.pojo.Level;
import com.hj.service.LeaveService;
import com.hj.service.LevelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class LeaveServiceImpl implements LeaveService {
    @Resource
    private LeaveMapper leaveMapper;
    @Override
    public boolean insertLeaveCord(Leave leave) {
        return leaveMapper.insertLeaveCord(leave);
    }

    @Override
    public Leave findLeaveByPnum(String pnum) {
        return leaveMapper.findLeaveByPnum(pnum);
    }

    @Override
    public boolean agreeCord(String pnum, Date date) {
        return leaveMapper.agreeCord(pnum,date);
    }

    @Override
    public List<Leave> findNullLeave() {
        return leaveMapper.findNullLeave();
    }
}
