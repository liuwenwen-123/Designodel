package com.lww.designdode.design_code观察者.拉模式;

public class Laowang  implements Observer {

    @Override
    public void update(WeatherSattion weather) {
        System.out.println("Laowang  "+weather.getShidu());
    }
}
