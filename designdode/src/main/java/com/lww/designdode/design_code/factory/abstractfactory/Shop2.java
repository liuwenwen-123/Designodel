package com.lww.designdode.design_code.factory.abstractfactory;

public class Shop2 implements Factory {
    @Override
    public IProduce getProduct() {

        return new Produce1();
    }

    @Override
    public IProduce2 getProduct2() {
        return new Produce2();
    }
}
