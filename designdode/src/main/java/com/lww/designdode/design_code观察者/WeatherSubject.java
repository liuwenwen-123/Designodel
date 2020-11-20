package com.lww.designdode.design_code观察者;

/**
 *  观察天气
 *
 */
public interface WeatherSubject {
    void  registerobserver(Observer observer);
    void  removeobserver(Observer observer);
    void  notifyobserver();
}
