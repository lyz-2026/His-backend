package com.lyz.his.po;

//MedicalRecord:医生看病的诊疗记录
public class MedicalRecord
{
    private Integer id;
    private Integer registId;
    private Integer caseNumber;
    private String description;
    private String medicalHistory;
    private String familyHistory;
    private String initialResult;
    private String checkResult;
    private String finalResult;
    private Integer caseState;
    private Integer operatorId;
    private String operateDate;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getRegistId()
    {
        return registId;
    }

    public void setRegistId(Integer registId)
    {
        this.registId = registId;
    }

    public Integer getCaseNumber()
    {
        return caseNumber;
    }

    public void setCaseNumber(Integer caseNumber)
    {
        this.caseNumber = caseNumber;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getMedicalHistory()
    {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory)
    {
        this.medicalHistory = medicalHistory;
    }

    public String getFamilyHistory()
    {
        return familyHistory;
    }

    public void setFamilyHistory(String familyHistory)
    {
        this.familyHistory = familyHistory;
    }

    public String getInitialResult()
    {
        return initialResult;
    }

    public void setInitialResult(String initialResult)
    {
        this.initialResult = initialResult;
    }

    public String getCheckResult()
    {
        return checkResult;
    }

    public void setCheckResult(String checkResult)
    {
        this.checkResult = checkResult;
    }

    public String getFinalResult()
    {
        return finalResult;
    }

    public void setFinalResult(String finalResult)
    {
        this.finalResult = finalResult;
    }

    public Integer getCaseState()
    {
        return caseState;
    }

    public void setCaseState(Integer caseState)
    {
        this.caseState = caseState;
    }

    public Integer getOperatorId()
    {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId)
    {
        this.operatorId = operatorId;
    }

    public String getOperateDate()
    {
        return operateDate;
    }

    public void setOperateDate(String operateDate)
    {
        this.operateDate = operateDate;
    }

}
