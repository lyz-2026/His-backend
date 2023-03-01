package com.lyz.his.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lyz.his.po.MedicalRecord;
import com.lyz.his.po.Register;

@Mapper
public interface MedicalRecordDao
{

    // 增加病例本信息
    @Insert("insert into medicalrecord (caseNumber,registId,description,medicalHistory,familyHistory,initialResult,operatorId,operateDate) "
            + "values (#{caseNumber},#{registId},#{description},#{medicalHistory},#{familyHistory},#{initialResult},#{operatorId},curdate())")
    Integer addMedicalRecord(MedicalRecord mr);

    // 按casenumber更新病人病例信息
    @Update("update medicalrecord set description=#{description},medicalHistory=#{medicalHistory},familyHistory=#{familyHistory},initialResult=#{initialResult},checkResult=#{checkResult},finalResult=#{finalResult},caseState=#{caseState} where registId=#{registId}")
    Integer updateMedicalRecord(MedicalRecord mr);

    // 查询病例信息
    @Select("select * from medicalrecord where caseNumber=#{caseNumber} and registId=#{registId}")
    MedicalRecord findMedicalRecordByMRId(MedicalRecord mr);

}
