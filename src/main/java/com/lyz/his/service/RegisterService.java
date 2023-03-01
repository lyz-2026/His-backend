package com.lyz.his.service;

import com.lyz.his.po.Register;

public interface RegisterService
{
    // 挂号时增加一条病人挂号记录
    Integer addRegister(Register p);

    // 按照ID更新挂号记录
    Integer updateRegister(Register p);

    // 按病例号查询单个挂号信息
    Register findRegisterByCaseNumber(Integer casenumber);

    // 按身份证号查询单个挂号信息
    Register findRegisterByidNumber(Integer idNumber);

    // 找到挂号信息表中最大病例号
    Integer findMaxCaseNumber();

    // 删除挂号信息
    Integer deleteRegister(Integer caseNumber);

}
