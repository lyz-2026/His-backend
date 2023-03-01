package com.lyz.his.po;

//Dept:医院院系 科室
public class Dept
{
    private Integer id;
    private String deptName;
    private Integer deptTypeId;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getDeptName()
    {
        return deptName;
    }

    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    public Integer getDeptTypeId()
    {
        return deptTypeId;
    }

    public void setDeptTypeId(Integer deptTypeId)
    {
        this.deptTypeId = deptTypeId;
    }
}
