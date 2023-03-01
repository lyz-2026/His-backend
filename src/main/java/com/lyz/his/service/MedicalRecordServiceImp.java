package com.lyz.his.service;

import com.lyz.his.dao.MedicalRecordDao;
import com.lyz.his.po.MedicalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicalRecordServiceImp implements MedicalRecordService
{
    @Autowired
    private MedicalRecordDao mrd;

    @Override
    public Integer addMedicalRecord(MedicalRecord mr)
    {
        // 先查询诊疗信息是否存在
        MedicalRecord mrc = findMedicalRecordByMRId(mr);
        // 如果治疗信息存在，则暂存功能起到更新数据的作用
        if (mrc == null)
        {
            return mrd.addMedicalRecord(mr);
        }
        else
        // 如果不存在，则起到增加记录的作用
        {
            return mrd.updateMedicalRecord(mr);
        }
    }

    @Override
    public Integer updateMedicalRecord(MedicalRecord mr)
    {
        return mrd.updateMedicalRecord(mr);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public MedicalRecord findMedicalRecordByMRId(MedicalRecord mr)
    {
        return mrd.findMedicalRecordByMRId(mr);
    }
}
