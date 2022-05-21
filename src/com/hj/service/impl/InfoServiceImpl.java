package com.hj.service.impl;

import com.hj.dao.InfoMapper;
import com.hj.pojo.Info;
import com.hj.service.InfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Resource
    private InfoMapper infoMapper;
    @Override
    public List<Info> getInfoData() {
        return infoMapper.queryAllInfo();
    }

    @Override
    public boolean insertInfo(Info info) {
        return infoMapper.insertInfo(info);
    }

    @Override
    public boolean deleteInfo(int infoid) {
        return infoMapper.deleteInfo(infoid);
    }

    @Override
    @Transactional
    public boolean goTop(int infoid) {
        infoMapper.setInfotoZero();
        infoMapper.goTop(infoid);
        return true;
    }

    @Override
    public Info getTopInfo() {
        return infoMapper.getTopInfo();
    }
}
