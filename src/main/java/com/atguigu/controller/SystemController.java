package com.atguigu.controller;

import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String test()
    {
        System.out.println("请求处理中，请稍后");
        System.out.println(userService.GetUserById(1));
        return "success";
    }
}
