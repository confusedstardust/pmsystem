package com.hj.service;

import com.hj.pojo.Relevantmantable;

import java.util.List;

public interface RlmService {
    public boolean insertRelevantman(Relevantmantable relevantmantable);
    public List<Relevantmantable> queryrlmbyissueid(String issueid);
}
