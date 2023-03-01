package com.lyz.his.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.lyz.his.po.User;

@Mapper
public interface UserDao
{

    // 根据挂号级别和科室查询对应的医生
    @Select("select * from user where registerLevelId=#{registerLevelId} and deptId=#{deptId} and isSchedule='是'")
    List<User> listDoctor(User con);

    // 系统登录
    @Select("select * from user where userName=#{userName}")
    User loginCheck(User user);

    // 根据病例号查询对应的医生
    User findByCaseNumber(Integer casenumber);

}
