package com.lyz.his.controller;

import com.lyz.his.po.Register;
import com.lyz.his.po.ResponseBean;
import com.lyz.his.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RegisterController")

public class RegisterController
{
    @Autowired
    private RegisterService rs;

    @RequestMapping("/findMaxCaseNumber")
    public Integer findMaxCaseNumber()
    {
        Integer maxCaseNumber = rs.findMaxCaseNumber();
        return maxCaseNumber + 1;
    }

    @PostMapping("/addRegister")
    public Integer addRegister(Register p)
    {
        return rs.addRegister(p);
    }

    @GetMapping("/findRegisterByCaseNumber")
    public ResponseBean<Register> findRegisterByCaseNumber(Integer caseNumber)
    {
        Register reg = rs.findRegisterByCaseNumber(caseNumber);
        ResponseBean<Register> rb = new ResponseBean<Register>(reg);
        return rb;
    }

    @GetMapping("/findRegisterByidNumber")
    public ResponseBean<Register> findRegisterByidNumber(Integer idNumber)
    {
        Register reg = rs.findRegisterByidNumber(idNumber);
        ResponseBean<Register> rb = new ResponseBean<Register>(reg);
        return rb;
    }

    @RequestMapping("/deleteRegister")
    public Integer deleteRegister(Integer caseNumber)
    {
        return rs.deleteRegister(caseNumber);
    }
}
