package com.hj.service;

import com.hj.pojo.Info;

import java.util.List;
import java.util.Map;

public interface InfoService {
    public List<Info> getInfoData();
    public boolean insertInfo(Info info);
    public boolean deleteInfo(int infoid);
    public boolean goTop(int infoid);
    public Info getTopInfo();
}
