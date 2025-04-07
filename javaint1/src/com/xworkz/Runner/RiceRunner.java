package com.xworkz.Runner;
import com.xworkz.override37.Rice;
import com.xworkz.override37.BasmatiRice;
import com.xworkz.override37.RiceStore;

public class RiceRunner {
    public static void main(String[] args) {
        Rice rice1 = new Rice();
        rice1.getType();
        rice1.getFlavor();
        rice1.getGrainSize();
        rice1.getCookingTime();
        rice1.getPrice();

        System.out.println("-------------------");
        Rice rice2 = new BasmatiRice();
        rice2.getType();
        rice2.getFlavor();
        rice2.getGrainSize();
        rice2.getCookingTime();
        rice2.getPrice();

        System.out.println("-----------------");
        BasmatiRice basmatiRice = new BasmatiRice();
        basmatiRice.getType();
        basmatiRice.getFlavor();
        basmatiRice.getGrainSize();
        basmatiRice.getCookingTime();
        basmatiRice.getPrice();
        basmatiRice.getOrigin();

        System.out.println("------------------");
        RiceStore riceStore = new RiceStore();
        riceStore.manage(rice2);
        riceStore.manage(rice1);
        riceStore.manage(basmatiRice);
    }
}
