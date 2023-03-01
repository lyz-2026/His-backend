package com.lyz.his.po;

import java.util.List;

public class CheckRecordExt extends CheckRecord
{
//	所有检查项目记录的id的集合
    private List<Integer> list;

    public List<Integer> getList()
    {
        return list;
    }

    public void setList(List<Integer> list)
    {
        this.list = list;
    }

}
