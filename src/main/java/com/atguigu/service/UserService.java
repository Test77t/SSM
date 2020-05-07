package com.atguigu.service;

import com.atguigu.bean.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User GetUserById(Integer id);
    public void InsertUser(User user);
}
