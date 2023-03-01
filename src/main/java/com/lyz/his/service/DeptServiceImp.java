package com.lyz.his.service;

import com.lyz.his.dao.DeptDao;
import com.lyz.his.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImp implements DeptService
{
    @Autowired
    private DeptDao dd;

    @Override
    public List<Dept> listDept()
    {
        return dd.listDept();
    }

    @Override
    public Dept findByDeptid(Integer userid)
    {
        return dd.findByDeptid(userid);
    }
}
