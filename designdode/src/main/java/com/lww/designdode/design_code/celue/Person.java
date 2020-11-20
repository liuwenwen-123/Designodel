package com.lww.designdode.design_code.celue;

public class Person {
    private Tranvel tranvel;
    public Person(Tranvel tranvel) {
        this.tranvel = tranvel;
    }
    public   void toplay(){
        System.out.println("我怎么去北京");
        tranvel.tranvel();
    }
}
