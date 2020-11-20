package com.lww.designdode.dip;

/**
 *  依赖倒置
 */
public class TestDip {
    public static void main(String[] args) {
        new Mother().read(new Book());
//        new Mother().read(new Newspager());
    }
}
