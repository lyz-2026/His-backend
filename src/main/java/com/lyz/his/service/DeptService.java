package com.lyz.his.service;

import com.lyz.his.po.Dept;

import java.util.List;

public interface DeptService
{
    // 列出可挂号的科室列表
    List<Dept> listDept();

    // 按ID查询科室信息，用于医生生成病例
    Dept findByDeptid(Integer userid);
}
