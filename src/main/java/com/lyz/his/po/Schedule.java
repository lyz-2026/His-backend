package com.lyz.his.po;

public class Schedule
{
    private Integer id;
    private String schedDate;
    private Integer deptId;
    private Integer userId;
    private String noon;
    private Integer ruleId;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getSchedDate()
    {
        return schedDate;
    }

    public void setSchedDate(String schedDate)
    {
        this.schedDate = schedDate;
    }

    public Integer getDeptId()
    {
        return deptId;
    }

    public void setDeptId(Integer deptId)
    {
        this.deptId = deptId;
    }

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getNoon()
    {
        return noon;
    }

    public void setNoon(String noon)
    {
        this.noon = noon;
    }

    public Integer getRuleId()
    {
        return ruleId;
    }

    public void setRuleId(Integer ruleId)
    {
        this.ruleId = ruleId;
    }

}
