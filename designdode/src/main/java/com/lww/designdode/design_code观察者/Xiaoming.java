package com.lww.designdode.design_code观察者;

public class Xiaoming implements Observer{
    WeatherSattion weatherSattion;

    public Xiaoming(WeatherSattion weatherSattion) {
        this.weatherSattion = weatherSattion;
    }

    @Override
    public void update() {
        int shidu = weatherSattion.getShidu();
        if(shidu >50){
            System.out.println("湿度太大了 ");
        }
    }
}
