package com.lww.designdode.design_code观察者.推模式;

/**
 *  天气 属性
 */
public class Weather {
    public  int  wendu;
    public int shidu;

    @Override
    public String toString() {
        return "Weather{" +
                "wendu=" + wendu +
                ", shidu=" + shidu +
                '}';
    }
}
