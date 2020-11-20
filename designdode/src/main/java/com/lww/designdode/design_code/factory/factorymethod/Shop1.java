package com.lww.designdode.design_code.factory.factorymethod;

public class Shop1 implements Factory{

    @Override
    public IFactory getProduct() {
        System.out.println("我买 商品 111");
        return new ProduceImpl();
    }
}
