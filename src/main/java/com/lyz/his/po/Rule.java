package com.lyz.his.po;

//Rule：排班规则
public class Rule
{
    private Integer id;
    private String ruleName;
    private Integer deptId;
    private Integer userId;
    private String week;
    private Integer delMark;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getRuleName()
    {
        return ruleName;
    }

    public void setRuleName(String ruleName)
    {
        this.ruleName = ruleName;
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

    public String getWeek()
    {
        return week;
    }

    public void setWeek(String week)
    {
        this.week = week;
    }

    public Integer getDelMark()
    {
        return delMark;
    }

    public void setDelMark(Integer delMark)
    {
        this.delMark = delMark;
    }

}
