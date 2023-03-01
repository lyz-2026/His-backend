package com.lyz.his.service;

import com.lyz.his.po.CheckRecord;
import com.lyz.his.po.CheckRecordExt;
import com.lyz.his.po.CheckRecordSub;

import java.util.List;

public interface CheckRecordService
{
    // 门诊医生发起检查
    Integer addCheckItemRecord(List<CheckRecord> list);

    // 更新检查记录（涵盖缴费、检查完毕等多个过程）
    Integer updateCheckItemRecord(CheckRecordExt cre);

    List<CheckRecordSub> listCheckRecordSub(Integer registerId);
}
