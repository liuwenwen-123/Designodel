package com.lww.designdode.design_code.factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        Mcdonlad mcdonla = new Mcdonlad();
        IFood name = mcdonla.getName("1");
        if(name!=null){
            name.eat();
        }
    }
}
