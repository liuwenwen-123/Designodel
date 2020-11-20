package com.lww.designdode.design_code.factory.abstractfactory;

public class Test {
    public static void main(String[] args) {
        Factory shop1 = new Shop1();
        shop1.getProduct().profuce1();
        shop1.getProduct2().profuce2();

        shop1=new Shop2();
        shop1.getProduct().profuce1();
    }
}
