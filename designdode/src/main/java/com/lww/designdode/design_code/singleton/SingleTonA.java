package com.lww.designdode.design_code.singleton;

/**
 *  饿汉式
 */
public class SingleTonA {
    private static SingleTonA singleTonA=new SingleTonA();
    private  SingleTonA (){}
    public  static  SingleTonA getInstance(){
        return singleTonA;
    }

}
