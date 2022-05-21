package com.hj.service.impl;

import com.hj.dao.RelevantmantableMapper;
import com.hj.pojo.Relevantmantable;
import com.hj.service.RlmService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class RlmServiceImpl implements RlmService {
    @Resource
    private RelevantmantableMapper relevantmantableMapper;
    @Override
    public boolean insertRelevantman(Relevantmantable relevantmantable) {
        return relevantmantableMapper.insertRelevantman(relevantmantable);
    }

    @Override
    public List<Relevantmantable> queryrlmbyissueid(String issueid) {
        return relevantmantableMapper.queryrlmbyissueid(issueid);
    }
}
