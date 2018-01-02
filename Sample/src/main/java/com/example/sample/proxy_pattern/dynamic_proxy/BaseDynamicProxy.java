package com.example.sample.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * author: sundong
 * created at 2017/4/26 11:02
 */

public abstract class BaseDynamicProxy<T> implements InvocationHandler {
    protected T target;

    public T bind(T target) {
        this.target = target;
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
