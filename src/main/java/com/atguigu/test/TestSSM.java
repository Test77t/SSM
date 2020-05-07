package com.atguigu.test;

import com.atguigu.bean.User;
import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

public class TestSSM {
    @Test
    public void Test1()
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
    }

}
