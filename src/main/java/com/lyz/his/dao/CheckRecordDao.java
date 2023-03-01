package com.lyz.his.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lyz.his.po.CheckRecord;
import com.lyz.his.po.CheckRecordExt;
import com.lyz.his.po.CheckRecordSub;

@Mapper
public interface CheckRecordDao
{
    // 门诊医生发起检查
    Integer addCheckItemRecord(List<CheckRecord> list);

    // 更新检查记录（涵盖缴费、检查完毕等多个过程）
    Integer updateCheckItemRecord(CheckRecordExt cre);

    // 查询特定病人的检查项明细
    List<CheckRecordSub> listCheckRecordSub(Integer registerId);
}
