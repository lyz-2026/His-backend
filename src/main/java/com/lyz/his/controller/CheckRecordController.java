package com.lyz.his.controller;

import com.lyz.his.po.CheckRecord;
import com.lyz.his.po.CheckRecordExt;
import com.lyz.his.po.CheckRecordSub;
import com.lyz.his.po.ResponseBean;
import com.lyz.his.service.CheckRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CheckRecordController")
public class CheckRecordController
{
    @Autowired
    private CheckRecordService crs;

    @PostMapping("/addCheckItemRecord")
    public Integer addCheckItemRecord(@RequestBody List<CheckRecord> checkrecorditems)
    {
        return crs.addCheckItemRecord(checkrecorditems);

    }

    @PostMapping("/updateCheckItemRecord")
    public Integer updateCheckItemRecord(@RequestBody CheckRecordExt cre)
    {
        return crs.updateCheckItemRecord(cre);
    }

    @GetMapping("/listCheckRecordSub")
    public ResponseBean<List<CheckRecordSub>> listCheckRecordSub(Integer registerId)
    {
        List<CheckRecordSub> list = crs.listCheckRecordSub(registerId);
        ResponseBean<List<CheckRecordSub>> rb = new ResponseBean<List<CheckRecordSub>>(list);
        return rb;
    }
}
