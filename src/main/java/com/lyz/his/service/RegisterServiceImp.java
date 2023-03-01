package com.lyz.his.service;

import com.lyz.his.dao.RegisterDao;
import com.lyz.his.po.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterServiceImp implements RegisterService
{
    @Autowired
    private RegisterDao rd;

    @Override
    public Integer addRegister(Register p)
    {
        return rd.addRegister(p);
    }

    @Override
    public Integer updateRegister(Register p)
    {
        return rd.updateRegister(p);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Register findRegisterByCaseNumber(Integer casennumber)
    {
        return rd.findRegisterByCaseNumber(casennumber);
    }

    @Override
    public Register findRegisterByidNumber(Integer idNumber)
    {
        return rd.findRegisterByidNumber(idNumber);
    }

    @Override
    public Integer findMaxCaseNumber()
    {
        return rd.findMaxCaseNumber();
    }

    @Override
    public Integer deleteRegister(Integer casennumber)
    {
        return rd.deleteRegister(casennumber);
    }
}
