package com.lyz.his.po;

//CheckItem:检查项目
public class CheckItem
{
    private Integer id;
    private String itemName;
    private Double price;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "CheckItem{" + "id=" + id + ", itemName='" + itemName + '\'' + ", price=" + price + '}';
    }
}
