package com.hj.service;


import com.hj.pojo.Leave;

import java.util.Date;
import java.util.List;

public interface LeaveService {
    public boolean insertLeaveCord(Leave leave);
    public Leave findLeaveByPnum(String pnum);
    public boolean agreeCord(String pnum, Date date);
    public List<Leave>findNullLeave();
}
