package com.lww.designdode.design_code.factory.daili.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

//     代理对象
    Object  realSubject;
    public ProxyHandler(Object subject) {
        this.realSubject=subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       System.out.println("代理之前");
        Object invoke = method.invoke(realSubject, args);
        System.out.println("代理之后");
        return invoke;
    }
}
