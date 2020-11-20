package com.lww.designdode.design_code.factory.factorymethod;

public class ProduceImpl implements IFactory {
    @Override
    public void doWork() {
        System.out.println("我生产  产品1");
    }
}
