package com.lww.designdode.design_code观察者;

public class Laowang  implements Observer{
    WeatherSattion weatherSattion;

    public Laowang(WeatherSattion weatherSattion) {
        this.weatherSattion = weatherSattion;
    }

    @Override
    public void update() {
        int wendu = weatherSattion.getWendu();
        if(wendu<0){
            System.out.println("温度很低");
        }
    }
}
