package com.lww.designdode.design_code观察者.java观察者;

import java.util.Observable;

import javafx.beans.InvalidationListener;


public class WeatherStationjava extends Observable {

    int wendu=0;

    public int getWendu() {
        return wendu;
    }

    public void setWendu(int wendu) {
        this.wendu = wendu;
        setChanged();
        notifyObservers();
    }


}
