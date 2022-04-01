package com.smart.app.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseUtils {
    public static void responseToJson(HttpServletResponse resp,Object o) throws IOException {
        resp.setCharacterEncoding("UTF-8");
        //设置返回数据类型
        resp.setContentType("application/json; charset=utf-8");
        resp.getWriter().println(JSONObject.toJSONString(o));
    }
}
