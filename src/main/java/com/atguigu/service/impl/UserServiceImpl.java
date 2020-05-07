package com.atguigu.service.impl;

import com.atguigu.bean.User;
import com.atguigu.dao.UserDao;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User GetUserById(Integer id) {
        System.out.println("业务层正在工作中");
        return userDao.GetUserById(id);
    }

    @Override
    public void InsertUser(User user) {
        userDao.InsertUser(user);
    }
}
