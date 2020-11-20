package com.lww.designdode.dip;

public class Book  implements Ireader {
    @Override
    public void getContent() {
        System.out.println("book");
    }
}
