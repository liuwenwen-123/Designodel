package com.lww.designdode.design_code.factory.daili.jingtai;

public class User2 implements IShop {
     IShop iShop=new User1();
    @Override
    public void buy() {
        iShop.buy();
        System.out.println("香港  买了一个包子");
    }
}
