package com.lww.designdode.design_code.factory.shipeiqi;

import javax.xml.crypto.dsig.Transform;

/**
 *  类适配器  电压适配器
 */
public class PowerAdapter  extends  Power220V implements Power5v{

    @Override
    public void getPower5V() {
//        先获取 原理的220v
        super.getPower220V();
        transform();
        System.out.println("输出5v ");
    }

    private void transform() {
        System.out.println("做变压处理");
    }
}
