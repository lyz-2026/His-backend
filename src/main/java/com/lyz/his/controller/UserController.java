package com.lyz.his.controller;

import com.lyz.his.po.ResponseBean;
import com.lyz.his.po.User;
import com.lyz.his.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UserController")
public class UserController
{
    @Autowired
    private UserService us;

    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
//    @RequestMapping("/loginCheck")
    public ResponseBean<User> loginCheck(User user)
    {

        User result = us.loginCheck(user);
        ResponseBean<User> rb;
        if (result == null)
        {
            rb = new ResponseBean<>("notexist", 100); // 用户不存在
        }
        else if (result.getPassword().equals(user.getPassword()))
        {
            result.setPassword(""); // 防止前端得到密码
            rb = new ResponseBean<User>(result); // 用户密码正确
        }
        else
        {
            rb = new ResponseBean<User>("errorpwd", 101); // 用户密码错误
        }
        return rb;
    }

    @GetMapping("/listDoctor")
    public ResponseBean<List<User>> listDoctor(User con)
    {
        List<User> list = us.listDoctor(con);
        ResponseBean<List<User>> rb = new ResponseBean<List<User>>(list);
        return rb;
    }

}
