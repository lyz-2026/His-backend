package com.lyz.his.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.lyz.his.po.Register;

@Mapper
public interface RegisterDao
{
    // 挂号时增加一条病人挂号记录
    @Insert("insert into register(caseNumber,realName,gender,idNumber,birthdate,age,visitDate,deptId,userId,registerLevelId,isBook,operatorId,visitState,DelMark) values "
            + "(#{caseNumber},#{realName},#{gender},#{idNumber},#{birthdate},#{age},#{visitDate},#{deptId},#{userId},#{registerLevelId},#{isBook},#{operatorId},1,1)")
    Integer addRegister(Register p);

    // 按照ID更新挂号记录
    Integer updateRegister(Register p);

    // 按病例号查询单个挂号信息
    Register findRegisterByCaseNumber(Integer caseNumber);

    // 按身份证号查询单个挂号信息
    Register findRegisterByidNumber(Integer idNumber);

    // 找到挂号信息表中最SubRegister大病例号
    @Select("select max(caseNumber) from register")
    Integer findMaxCaseNumber();

    // 删除挂号信息
    @Delete("update register set DelMark='0' where caseNumber=#{caseNumber}")
    Integer deleteRegister(Integer caseNumber);

}
