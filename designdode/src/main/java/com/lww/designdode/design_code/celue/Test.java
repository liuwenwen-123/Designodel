package com.lww.designdode.design_code.celue;

public class Test {
    public static void main(String[] args) {
        BikeTranvel bikeTranvel = new BikeTranvel();
        Person person = new Person(bikeTranvel);
        person.toplay();
    }
}
