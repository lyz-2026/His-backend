package com.lyz.his.service;

import com.lyz.his.po.MedicalRecord;

public interface MedicalRecordService
{
    // 增加病例本信息
    Integer addMedicalRecord(MedicalRecord mr);

    // 按casenumber更新病人病例信息
    Integer updateMedicalRecord(MedicalRecord mr);

    // 查询病例信息
    MedicalRecord findMedicalRecordByMRId(MedicalRecord mr);
}
