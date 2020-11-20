package com.lww.designdode.design_code观察者.java观察者;

public class Test {
    public static void main(String[] args) {
        WeatherStationjava weatherStationjava=new WeatherStationjava();

        Laowang laowang=new Laowang();
        weatherStationjava.addObserver(laowang);

        weatherStationjava.setWendu(20);
    }
}
