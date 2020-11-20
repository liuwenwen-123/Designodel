package com.lww.designdode.design_code观察者.推模式;

public class Test {
    public static void main(String[] args) {
        Laowang laowang=new Laowang();
        Xiaoming xiaoming=new Xiaoming();

        WeatherSattion sattion=new WeatherSattion();
        sattion.registerobserver(laowang);
        sattion.registerobserver(xiaoming);

        sattion.setShidu(20);
        sattion.setWendu(50);
    }
}
