package com.lww.designdode.design_code.singleton;

public class SingleTnHolder {

    private static class SingleTnInnerHolder {
        private static SingleTnHolder singleTnHolder = new SingleTnHolder();  }

    private SingleTnHolder() {
    }
    public static SingleTnHolder getInstance() {
        return SingleTnInnerHolder.singleTnHolder;
    }
}
