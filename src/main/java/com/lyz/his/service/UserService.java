package com.lyz.his.service;

import com.lyz.his.po.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService
{

    // 根据挂号级别和科室查询对应的医生
    List<User> listDoctor(User con);

    // 系统登录
    User loginCheck(User user);

    // 根据病例号查询对应的医生
    User findByCaseNumber(Integer casenumber);
}
