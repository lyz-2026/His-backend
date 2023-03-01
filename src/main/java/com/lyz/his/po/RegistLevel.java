package com.lyz.his.po;

//RegistLevel：挂号级别
public class RegistLevel
{
    private Integer id;
    private String registName;
    private Double registFee;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getRegistName()
    {
        return registName;
    }

    public void setRegistName(String registName)
    {
        this.registName = registName;
    }

    public Double getRegistFee()
    {
        return registFee;
    }

    public void setRegistFee(Double registFee)
    {
        this.registFee = registFee;
    }

}
