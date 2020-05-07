package com.atguigu.dao;

import com.atguigu.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Select("select * from user where id=#{id}")
    public User GetUserById(Integer id);
    @Insert("insert into user(username, password, age) values(#{username},#{password},#{age})")
    public void InsertUser(User user);
}
