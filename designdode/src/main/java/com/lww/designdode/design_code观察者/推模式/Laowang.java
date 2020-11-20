package com.lww.designdode.design_code观察者.推模式;

import com.lww.designdode.design_code观察者.WeatherSattion;

public class Laowang  implements Observer{

    @Override
    public void update(Weather weather) {
        System.out.println("Laowang  "+weather.toString());
    }
}
