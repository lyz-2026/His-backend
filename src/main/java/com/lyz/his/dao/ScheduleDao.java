package com.lyz.his.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.lyz.his.po.Schedule;
import com.lyz.his.po.User;

@Mapper
public interface ScheduleDao
{
//	增加排班数据

    Integer addSchedule(Map<String, Object> schedule);

    // 列出在排班日期范围内的医生
    List<User> listScheduledUser(Schedule s);

}
