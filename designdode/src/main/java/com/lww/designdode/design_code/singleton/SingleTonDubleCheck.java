package com.lww.designdode.design_code.singleton;

public class SingleTonDubleCheck {
//    volatile（效率低） 保证变量 不会被编译器 改变执行 顺序
    private volatile   static SingleTonDubleCheck singleTonDubleCheck = null;
    private SingleTonDubleCheck() {
    }
    public static SingleTonDubleCheck getInstance() {
//   多线程时 多个线程能 singleTonDubleCheck ==null
        if (singleTonDubleCheck == null) {
            synchronized (SingleTonDubleCheck.class) {
                if (singleTonDubleCheck == null) {
                    singleTonDubleCheck = new SingleTonDubleCheck();
                }
            }
        }
        return singleTonDubleCheck;
    }
}
