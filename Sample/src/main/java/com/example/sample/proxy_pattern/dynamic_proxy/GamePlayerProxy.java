package com.example.sample.proxy_pattern.dynamic_proxy;

import java.lang.reflect.Method;

/**
 * author: sundong
 * created at 2018/1/2 10:25
 */

public class GamePlayerProxy<T> extends BaseDynamicProxy<T> {
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = method.invoke(this.target, objects);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人登陆你账号！");
        }
        return result;
    }
}
