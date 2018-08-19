package com.sbtic.db.data.patient;

import java.io.Serializable;

public class MedicalAid implements Serializable
{
    private String number;
    private String dependentCode;
    private String company;
    private String plan;
    private String mainMemberName;
    private String mainMemberID;
    private String usageHistory;

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getDependentCode()
    {
        return dependentCode;
    }

    public void setDependentCode(String dependentCode)
    {
        this.dependentCode = dependentCode;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getPlan()
    {
        return plan;
    }

    public void setPlan(String plan)
    {
        this.plan = plan;
    }

    public String getMainMemberName()
    {
        return mainMemberName;
    }

    public void setMainMemberName(String mainMemberName)
    {
        this.mainMemberName = mainMemberName;
    }

    public String getMainMemberID()
    {
        return mainMemberID;
    }

    public void setMainMemberID(String mainMemberID)
    {
        this.mainMemberID = mainMemberID;
    }

    public String getUsageHistory()
    {
        return usageHistory;
    }

    public void setUsageHistory(String usageHistory)
    {
        this.usageHistory = usageHistory;
    }
}
