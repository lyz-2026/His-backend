package com.lyz.his.po;

import java.util.List;

public class Plan
{
    private List<RuleSub> deals;
    private String startDate;
    private String endDate;

    public List<RuleSub> getDeals()
    {
        return deals;
    }

    public void setDeals(List<RuleSub> deals)
    {
        this.deals = deals;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

}
