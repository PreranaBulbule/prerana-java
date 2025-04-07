package com.xworkz.override37;

public class RiceStore {
    public void manage(Rice rice) {
        rice.getType();
        rice.getFlavor();
        rice.getGrainSize();
        rice.getCookingTime();
        rice.getPrice();

        if (rice instanceof BasmatiRice) {
            System.out.println("Rice is instance of BasmatiRice");
            BasmatiRice basmatiRice = (BasmatiRice) rice;
            basmatiRice.getOrigin();
        }
    }

}
