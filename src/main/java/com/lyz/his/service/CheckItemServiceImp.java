package com.lyz.his.service;

import com.lyz.his.dao.CheckItemDao;
import com.lyz.his.po.CheckItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckItemServiceImp implements CheckItemService
{
    @Autowired
    private CheckItemDao cid;

    @Override
    public Integer addCheckItem(CheckItem ci)
    {
        return cid.addCheckItem(ci);
    }

    @Override
    public Integer updateCheckItem(CheckItem ci)
    {
        return cid.updateCheckItem(ci);
    }

    @Override
    public List<CheckItem> listCheckItem()
    {
        return cid.listCheckItem();
    }
}
