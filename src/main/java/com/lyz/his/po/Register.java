package com.lyz.his.po;

//Register:挂号信息
public class Register
{
    private Integer id;
    private Integer caseNumber;
    private String realName;
    private String gender;
    private Integer age;
    private String birthdate;
    private String idNumber;
    private String address;
    private Integer registerLevelId;
    private Integer deptId;
    private Integer userId;
    private String visitDate;
    private Double cost;
    private String isBook;
    private Integer visitState;
    private Integer operatorId;
    private String operatedate;
    private char noon;

    public Integer getDelMark()
    {
        return DelMark;
    }

    public void setDelMark(Integer delMark)
    {
        DelMark = delMark;
    }

    private Integer DelMark;

    @Override
    public String toString()
    {
        return super.toString();
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getCaseNumber()
    {
        return caseNumber;
    }

    public void setCaseNumber(Integer caseNumber)
    {
        this.caseNumber = caseNumber;
    }

    public String getRealName()
    {
        return realName;
    }

    public void setRealName(String realName)
    {
        this.realName = realName;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(String birthdate)
    {
        this.birthdate = birthdate;
    }

    public String getIdNumber()
    {
        return idNumber;
    }

    public void setIdNumber(String idNumber)
    {
        this.idNumber = idNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
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

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getVisitDate()
    {
        return visitDate;
    }

    public void setVisitDate(String visitDate)
    {
        this.visitDate = visitDate;
    }

    public Double getCost()
    {
        return cost;
    }

    public void setCost(Double cost)
    {
        this.cost = cost;
    }

    public String getIsBook()
    {
        return isBook;
    }

    public void setIsBook(String isBook)
    {
        this.isBook = isBook;
    }

    public Integer getVisitState()
    {
        return visitState;
    }

    public void setVisitState(Integer visitState)
    {
        this.visitState = visitState;
    }

    public Integer getOperatorId()
    {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId)
    {
        this.operatorId = operatorId;
    }

    public String getOperatedate()
    {
        return operatedate;
    }

    public void setOperatedate(String operatedate)
    {
        this.operatedate = operatedate;
    }

    public char getNoon()
    {
        return noon;
    }

    public void setNoon(char noon)
    {
        this.noon = noon;
    }
}
