package com.smart.app.dao;

import com.smart.app.entity.User;

public interface UserDao {
    //根据用户名查询用户信息
    User selectUserByName(String username);
    //添加用户
    int insert(User user);
}
