package com.lyz.his.dao;

import java.util.List;

import com.lyz.his.po.CheckItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CheckItemDao
{
    // 系统维护人员操作增加检查项目
    Integer addCheckItem(CheckItem ci);

    // 系统维护人员更新项目
    Integer updateCheckItem(CheckItem ci);

    // 查询检查项目
    @Select("select * from checkitem")
    List<CheckItem> listCheckItem();

}
