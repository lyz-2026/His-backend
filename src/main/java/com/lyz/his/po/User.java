package com.lyz.his.po;

//His系统用户（不包括病患）
public class User
{
    private Integer userId;
    private String userName;
    private String password;
    private Integer roleId;
    private String realName;
    private Integer registerLevelId;
    private Integer deptId;
    private String isSchedule;

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Integer getRoleId()
    {
        return roleId;
    }

    public void setRoleId(Integer roleId)
    {
        this.roleId = roleId;
    }

    public String getRealName()
    {
        return realName;
    }

    public void setRealName(String realName)
    {
        this.realName = realName;
    }

    public Integer getRegisterLevelId()
    {
        return registerLevelId;
    }

    public void setRegisterLevelId(Integer registerLevelId)
    {
        this.registerLevelId = registerLevelId;
    }

    public Integer getDeptId()
    {
        return deptId;
    }

    public void setDeptId(Integer deptId)
    {
        this.deptId = deptId;
    }

    public String getIsSchedule()
    {
        return isSchedule;
    }

    public void setIsSchedule(String isSchedule)
    {
        this.isSchedule = isSchedule;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
