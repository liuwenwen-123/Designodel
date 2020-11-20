package com.lww.designdode.opc;

/**
 *  开放封闭 原则
 */
public class TestOpc {

    public static void main(String[] args) {
        ChartManager chartManager=new ChartManager();
        chartManager.shoowDisplay(new AChart());
        chartManager.shoowDisplay(new BChart());
        chartManager.shoowDisplay(new CChart());
    }
}
