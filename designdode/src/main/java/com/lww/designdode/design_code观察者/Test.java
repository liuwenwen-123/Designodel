package com.lww.designdode.design_code观察者;

public class Test {
    public static void main(String[] args) {
        WeatherSattion weatherSattion=new WeatherSattion();

        Laowang laowang=new Laowang(weatherSattion);
        Xiaoming xiaoming=new Xiaoming(weatherSattion);

        weatherSattion.registerobserver(laowang);
        weatherSattion.registerobserver(xiaoming);

        weatherSattion.setWendu(-1);
        weatherSattion.setShidu(60);

    }
}
