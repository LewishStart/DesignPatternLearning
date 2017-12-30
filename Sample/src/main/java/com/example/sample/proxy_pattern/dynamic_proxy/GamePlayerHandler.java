package com.example.sample.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * author: sundong
 * created at 2017/4/26 11:02
 */

public class GamePlayerHandler implements InvocationHandler {
    Object target = null;

    public GamePlayerHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = method.invoke(this.target, objects);
        if(method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人登陆你账号！");
        }
        return result;
                
    }
}
