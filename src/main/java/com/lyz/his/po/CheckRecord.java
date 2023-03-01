package com.lyz.his.po;

//CheckRecord:检查记录
public class CheckRecord
{
    private Integer id;
    private Integer registerId;
    private Integer checkItemId;
    private Integer amount;
    private Integer payStatus;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getRegisterId()
    {
        return registerId;
    }

    public void setRegisterId(Integer registerId)
    {
        this.registerId = registerId;
    }

    public Integer getCheckItemId()
    {
        return checkItemId;
    }

    public void setCheckItemId(Integer checkItemId)
    {
        this.checkItemId = checkItemId;
    }

    public Integer getAmount()
    {
        return amount;
    }

    public void setAmount(Integer amount)
    {
        this.amount = amount;
    }

    public Integer getPayStatus()
    {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus)
    {
        this.payStatus = payStatus;
    }

}
