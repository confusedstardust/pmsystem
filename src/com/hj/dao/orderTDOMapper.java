package com.hj.dao;

import com.hj.pojo.TDO.OrderTDO;

import java.util.List;

public interface orderTDOMapper {
    List<OrderTDO> checkCordByStatus(int orderstatus);
}
