package com.xworkz.Runner;
import com.xworkz.override15.Juice;
import com.xworkz.override15.JuiceStore;
import com.xworkz.override15.OrangeJuice;

public class JuiceRunner {
    public static void main(String[] args) {
        Juice juice1 = new Juice();
        juice1.getFlavor();
        juice1.getColor();
        juice1.getSize();
        juice1.getPrice();
        juice1.getType();

        System.out.println("-------------------");
        Juice juice2 = new OrangeJuice();
        juice2.getFlavor();
        juice2.getColor();
        juice2.getSize();
        juice2.getPrice();
        juice2.getType();

        System.out.println("-----------------");
        OrangeJuice orangeJuice = new OrangeJuice();
        orangeJuice.getFlavor();
        orangeJuice.getColor();
        orangeJuice.getSize();
        orangeJuice.getPrice();
        orangeJuice.getType();
        orangeJuice.getVitaminCContent();

        System.out.println("------------------");
        JuiceStore juiceStore = new JuiceStore();
        juiceStore.manage(juice2);
        juiceStore.manage(juice1);
        juiceStore.manage(orangeJuice);
    }
}
