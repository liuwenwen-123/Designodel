package com.lww.designdode.design_code.singleton;

public class Client {

    public static void main(String[] args) {
        new  Thread(new Runnable() {
            @Override
            public void run() {
            }
        }).start();
    }
}
