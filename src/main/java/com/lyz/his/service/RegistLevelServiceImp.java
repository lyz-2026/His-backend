package com.lyz.his.service;

import com.lyz.his.dao.RegistLevelDao;
import com.lyz.his.po.RegistLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistLevelServiceImp implements RegistLevelService
{
    @Autowired
    private RegistLevelDao rd;

    @Override
    public List<RegistLevel> listLevel()
    {
        return rd.listLevel();
    }

    @Override
    public RegistLevel findbyLid(Integer levelid)
    {
        return rd.findbyLid(levelid);
    }
}
