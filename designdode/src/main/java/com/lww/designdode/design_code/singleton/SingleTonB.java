package com.lww.designdode.design_code.singleton;

/**
 *  蓝汉式
 *  需要使用的 时候采取  创建
 */
public class SingleTonB {
    private static SingleTonB singleTonA;
    private SingleTonB(){}
    /*public  static SingleTonB getInstance(){
        if(singleTonA==null){
            singleTonA=new SingleTonB();
        }
        return singleTonA;
    }*/
//    添加 synchronized 为了 线程安装
//     但是  synchronized 会降低 效率
    public synchronized static SingleTonB getInstance(){
        if(singleTonA==null){
            singleTonA=new SingleTonB();
        }
        return singleTonA;
    }

}
