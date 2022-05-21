package com.hj.service.impl;

import com.hj.dao.LevelMapper;
import com.hj.pojo.Level;
import com.hj.service.LevelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LevelServiceImpl implements LevelService {
    @Resource
    private LevelMapper levelMapper;

    public void setLevelMapper(LevelMapper levelMapper) {
        this.levelMapper = levelMapper;
    }
    @Override
    public Level findLevelInfo(int levelrank) {
        return levelMapper.findLevelInfo(levelrank);
    }


}
