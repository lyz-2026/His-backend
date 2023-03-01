package com.lyz.his.service;

import com.lyz.his.po.RegistLevel;

import java.util.List;

public interface RegistLevelService
{
    // 列出全部挂号级别
    List<RegistLevel> listLevel();

    // 按ID查询挂号级别，用于医生生成病例的页面
    RegistLevel findbyLid(Integer levelid);
}
