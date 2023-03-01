package com.lyz.his.service;

import com.lyz.his.dao.CheckRecordDao;
import com.lyz.his.po.CheckRecord;
import com.lyz.his.po.CheckRecordExt;
import com.lyz.his.po.CheckRecordSub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckRecordServiceImp implements CheckRecordService
{
    @Autowired
    private CheckRecordDao crd;

    @Override
    public Integer addCheckItemRecord(List<CheckRecord> list)
    {
        return crd.addCheckItemRecord(list);
    }

    @Override
    public Integer updateCheckItemRecord(CheckRecordExt cre)
    {
        return crd.updateCheckItemRecord(cre);
    }

    @Override
    public List<CheckRecordSub> listCheckRecordSub(Integer registerId)
    {
        return crd.listCheckRecordSub(registerId);
    }
}
