package com.lww.designdode.ld;

public class KFC {
    public   Hunberger  mekdHamberger(){
        Beaf beaf=new Beaf();
        ShuCai shuCai=new ShuCai();
        Hunberger hunberger=new Hunberger(beaf,shuCai);
        return hunberger;
    }
}
