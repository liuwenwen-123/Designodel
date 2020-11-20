package com.lww.designdode.design_code.factory.shipeiqi.duixiang;

import com.lww.designdode.design_code.factory.shipeiqi.Power5v;

/**
 *  类适配器  电压适配器
 */
public class PowerAdapter  implements Power5v{
    Power220V  power220V;
    public PowerAdapter(Power220V power220V) {
         this.power220V=power220V;
    }

    @Override
    public void getPower5V() {
//        先获取 原理的220v
        power220V.getPower220V();
        transform();
        System.out.println("输出5v ");
    }

    private void transform() {
        System.out.println("做变压处理");
    }
}
