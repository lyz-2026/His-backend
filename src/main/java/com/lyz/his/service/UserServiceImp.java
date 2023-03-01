package com.lyz.his.service;

import com.lyz.his.dao.UserDao;
import com.lyz.his.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService
{
    @Autowired
    private UserDao ud;

    @Override
    public List<User> listDoctor(User con)
    {
        return ud.listDoctor(con);
    }

    @Override
    public User loginCheck(User user)
    {
        return ud.loginCheck(user);
    }

    @Override
    public User findByCaseNumber(Integer casenumber)
    {
        return null;
    }
}
