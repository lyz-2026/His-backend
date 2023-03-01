package com.lyz.his.controller;

import com.lyz.his.po.RegistLevel;
import com.lyz.his.po.ResponseBean;
import com.lyz.his.service.RegistLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/RegistLevelController")
public class RegistLevelController
{
    @Autowired
    private RegistLevelService rls;

    @RequestMapping("/listLevel")
    public ResponseBean<List<RegistLevel>> listLevel()
    {
        List<RegistLevel> list = rls.listLevel();
        ResponseBean<List<RegistLevel>> rb = new ResponseBean<List<RegistLevel>>(list);
        return rb;
    }
}
