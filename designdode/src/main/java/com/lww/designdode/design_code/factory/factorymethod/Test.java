package com.lww.designdode.design_code.factory.factorymethod;

public class Test {
    public static void main(String[] args) {
        Factory shop1 = new Shop1();

        shop1.getProduct().doWork();
    }
}
