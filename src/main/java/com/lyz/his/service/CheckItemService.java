package com.lyz.his.service;

import com.lyz.his.po.CheckItem;

import java.util.List;

public interface CheckItemService
{
    // 系统维护人员操作增加检查项目
    Integer addCheckItem(CheckItem ci);

    // 系统维护人员更新项目
    Integer updateCheckItem(CheckItem ci);

    // 查询检查项目
    List<CheckItem> listCheckItem();
}
