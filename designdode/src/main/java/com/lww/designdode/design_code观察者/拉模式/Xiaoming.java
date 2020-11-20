package com.lww.designdode.design_code观察者.拉模式;


public class Xiaoming implements Observer {


/*    @Override
    public void update() {
        int shidu = weatherSattion.getShidu();
        if(shidu >50){
            System.out.println("湿度太大了 ");
        }
    }*/

    @Override
    public void update(WeatherSattion weather) {
        System.out.println("Xiaoming: "+  weather.getWendu());
    }
}
