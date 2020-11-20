package com.lww.designdode.design_code.factory.abstractfactory;

import com.lww.designdode.design_code.factory.factorymethod.IFactory;

public interface Factory {
    IProduce getProduct();

    IProduce2 getProduct2();
}
