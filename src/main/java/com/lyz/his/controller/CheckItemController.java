package com.lyz.his.controller;

import com.lyz.his.po.CheckItem;
import com.lyz.his.po.ResponseBean;
import com.lyz.his.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CheckItemController")
public class CheckItemController
{
    @Autowired
    private CheckItemService cis;

    public Integer addCheckItem(CheckItem ci)
    {
        return cis.addCheckItem(ci);
    }

    public Integer updateCheckItem(CheckItem ci)
    {
        return cis.updateCheckItem(ci);
    }

    @GetMapping("/listCheckItem")
    public ResponseBean<List<CheckItem>> listCheckItem()
    {
        List<CheckItem> list = cis.listCheckItem();
        ResponseBean<List<CheckItem>> rb = new ResponseBean<List<CheckItem>>(list);
        return rb;
    }
}
