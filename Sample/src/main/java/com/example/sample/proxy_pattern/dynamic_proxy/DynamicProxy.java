package com.example.sample.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author: sundong
 * created at 2017/4/26 11:02
 */

public class DynamicProxy<T> implements InvocationHandler {
    private T target;

    public T bind(T target) {
        this.target = target;
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = method.invoke(this.target, objects);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人登陆你账号！");
        }
        return result;
    }

}
