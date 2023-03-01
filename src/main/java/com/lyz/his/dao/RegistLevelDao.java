package com.lyz.his.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.lyz.his.po.RegistLevel;

@Mapper
public interface RegistLevelDao
{
    // 列出全部挂号级别
    @Select("select * from registlevel")
    List<RegistLevel> listLevel();

    // 按ID查询挂号级别，用于医生生成病例的页面
    RegistLevel findbyLid(Integer levelid);

}
