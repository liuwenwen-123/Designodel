package com.lww.designdode.design_code.factory.shipeiqi;

public class NodeBook {
    //     给 笔记本 设置5v 电压
    public void set5vAdapter(Power5v power5v) {
        power5v.getPower5V();
        System.out.println("笔记被 获取额5v 电压  开始 工作的了");
    }
}
