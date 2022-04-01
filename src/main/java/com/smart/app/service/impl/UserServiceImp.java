package com.smart.app.service.impl;

import com.smart.app.dao.UserDao;
import com.smart.app.dao.impl.UserDaoImpl;
import com.smart.app.entity.User;
import com.smart.app.service.UserService;

public class UserServiceImp implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public String login() {
        return null;
    }

    @Override
    public boolean register(User user) {
        boolean flag = false;
        User temp = userDao.selectUserByName(user.getUsername());
        if (temp == null){
            try {
                int count = userDao.insert(user);
                flag = count > 0;
            }catch (Exception exception){
                System.out.println("注册失败");
            }
        }else {
            System.out.println("用户名已经存在");
        }
        return flag;
    }

}
