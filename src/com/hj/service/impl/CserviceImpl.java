package com.hj.service.impl;

import com.hj.dao.CaMapper;
import com.hj.service.cService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class CserviceImpl implements cService {
    @Resource
    private CaMapper caMapper;
    @Override
    public Map<String, Double> getval(int id) {
        return caMapper.nvpy(id);
    }
}
