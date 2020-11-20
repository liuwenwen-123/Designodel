package com.lww.designdode.design_code.factory.simplefactory;

import jdk.nashorn.internal.ir.IfNode;

public class Mcdonlad {

    public IFood getName(String name) {
        switch (name) {
            case "1":
                return new Chips();
            case "2":
                return new MxChicjen();
            default:
                return null;
        }
    }
}
