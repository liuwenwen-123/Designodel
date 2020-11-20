package com.lww.designdode.design_code.factory.factorymethod;

public class Shop2 implements Factory {

    @Override
    public IFactory getProduct() {
        System.out.println("商定222");
        return new Produce2Impl();
    }
}
