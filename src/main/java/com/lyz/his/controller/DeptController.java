package com.lyz.his.controller;

import com.lyz.his.po.Dept;
import com.lyz.his.po.ResponseBean;
import com.lyz.his.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DeptController")
public class DeptController
{
    @Autowired
    private DeptService ds;

    @RequestMapping("/listDept")
    public ResponseBean<List<Dept>> listDept()
    {
        List<Dept> list = ds.listDept();
        ResponseBean<List<Dept>> rb = new ResponseBean<List<Dept>>(list);
        return rb;
    }

    public Dept findByDeptid(Integer userid)
    {
        return null;
    }

}
