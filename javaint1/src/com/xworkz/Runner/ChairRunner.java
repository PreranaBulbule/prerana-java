package com.xworkz.Runner;
import com.xworkz.override11.Chair;
import com.xworkz.override11.ChairStore;
import com.xworkz.override11.OfficeChair;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair1 = new Chair();
        chair1.getMaterial();
        chair1.getType();
        chair1.getColor();
        chair1.getPrice();
        chair1.getWeight();

        System.out.println("-------------------");
        Chair chair2 = new OfficeChair();
        chair2.getMaterial();
        chair2.getType();
        chair2.getColor();
        chair2.getPrice();
        chair2.getWeight();

        System.out.println("-----------------");
        OfficeChair officeChair = new OfficeChair();
        officeChair.getMaterial();
        officeChair.getType();
        officeChair.getColor();
        officeChair.getPrice();
        officeChair.getWeight();
        officeChair.adjustHeight();

        System.out.println("------------------");
        ChairStore chairStore = new ChairStore();
        chairStore.manage(chair2);
        chairStore.manage(chair1);
        chairStore.manage(officeChair);
    }
}