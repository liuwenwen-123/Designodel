package com.lww.designdode.design_code观察者.java观察者;

import java.util.Observable;
import java.util.Observer;

public class Laowang implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherStationjava o1 = (WeatherStationjava) o;
        System.out.println(o1.getWendu());
    }
}
