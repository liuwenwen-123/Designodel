package com.lww.designdode.design_code观察者.拉模式;




import java.util.ArrayList;

/**
 * 气象站
 */
public class WeatherSattion implements WeatherSubject {
    ArrayList<Observer> observers = new ArrayList<>();
    private int wendu = 0;
    private int  shidu=0;



    @Override
    public void registerobserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeobserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyobserver(   ) {
        for (Observer observer : observers) {
             observer.update(this);
        }
    }


    public int getWendu() {
        return wendu;
    }
    public int getShidu() {
        return shidu;

    }

    public void setWendu(int wendu) {
        this.wendu = wendu;
        notifyobserver();
    }

    public void setShidu(int shidu) {
        this.shidu = shidu;
        notifyobserver();
    }


}
