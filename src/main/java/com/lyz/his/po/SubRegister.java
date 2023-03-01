package com.lyz.his.po;

public class SubRegister extends Register
{
    private RegistLevel registLevel;
    private Dept dept;
    private User user;

    public RegistLevel getRegistLevel()
    {
        return registLevel;
    }

    public void setRegistLevel(RegistLevel registLevel)
    {
        this.registLevel = registLevel;
    }

    public Dept getDept()
    {
        return dept;
    }

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
