package com.lyz.his.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.lyz.his.po.Dept;

@Mapper
public interface DeptDao
{
    // 列出可挂号的科室列表
    @Select("select * from dept where deptTypeId=1")
    List<Dept> listDept();

    // 按ID查询科室信息，用于医生生成病例
    Dept findByDeptid(Integer userid);

}
