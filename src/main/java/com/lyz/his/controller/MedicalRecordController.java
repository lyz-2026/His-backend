package com.lyz.his.controller;

import com.lyz.his.po.MedicalRecord;
import com.lyz.his.po.ResponseBean;
import com.lyz.his.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MedicalRecordController")
public class MedicalRecordController
{
    @Autowired
    private MedicalRecordService ms;

    @PostMapping("/addMedicalRecord")
    public Integer addMedicalRecord(MedicalRecord mr)
    {
        return ms.addMedicalRecord(mr);
    }

    @PostMapping("/commitMedicalRecord")
    public Integer commitMedicalRecord(MedicalRecord mr)
    {
        return ms.updateMedicalRecord(mr);
    }

    @GetMapping("/findMedicalRecordByMRId")
    public ResponseBean<MedicalRecord> findMedicalRecordByMRId(MedicalRecord mr)
    {
        MedicalRecord mrd = ms.findMedicalRecordByMRId(mr);
        ResponseBean<MedicalRecord> rb = new ResponseBean<MedicalRecord>(mrd);
        return rb;
    }
}
