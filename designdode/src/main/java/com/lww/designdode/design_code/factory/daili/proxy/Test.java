package com.lww.designdode.design_code.factory.daili.proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        IKfc iKfc = (IKfc) Proxy.newProxyInstance(Test.class.getClassLoader(),
                new  Class[]{IKfc.class},
                new ProxyHandler(new Kfc()));

        iKfc.eat();



        IXiaomi xiaoxiFans = (IXiaomi) Proxy.newProxyInstance(Test.class.getClassLoader(),
                XiaoxiFans.class.getInterfaces(),
                new ProxyHandler(new XiaoxiFans()));

        xiaoxiFans.buy();

    }
}
