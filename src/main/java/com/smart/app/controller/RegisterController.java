package com.smart.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.smart.app.entity.User;
import com.smart.app.resp.BaseResponseEntity;
import com.smart.app.service.UserService;
import com.smart.app.service.impl.UserServiceImp;
import com.smart.app.utils.ResponseUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterController extends HttpServlet {
    private UserService userService = new UserServiceImp();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User();
        user.setUsername(username);
        String result;
        BaseResponseEntity<Boolean> entity = null;
        boolean isSuccess = userService.register(user);
        if (isSuccess){
            //将该对象转换json
            entity = BaseResponseEntity.success(isSuccess);
//            result = JSONObject.toJSONString(entity);
        }else {
            entity = BaseResponseEntity.error();
        }
        ResponseUtils.responseToJson(resp,entity);
    }
}
