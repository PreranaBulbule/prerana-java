package com.xworkz.Runner;
import com.xworkz.override50.MakeupKit;
import com.xworkz.override50.LuxuryMakeupKit;
import com.xworkz.override50.MakeupKitStore;

public class MakeupKitRunner {
    public static void main(String[] args) {
        MakeupKit kit1 = new MakeupKit();
        kit1.getBrand();
        kit1.getContents();
        kit1.getSize();
        kit1.getColor();
        kit1.getPrice();

        System.out.println("-------------------");
        MakeupKit kit2 = new LuxuryMakeupKit();
        kit2.getBrand();
        kit2.getContents();
        kit2.getSize();
        kit2.getColor();
        kit2.getPrice();

        System.out.println("-----------------");
        LuxuryMakeupKit luxuryKit = new LuxuryMakeupKit();
        luxuryKit.getBrand();
        luxuryKit.getContents();
        luxuryKit.getSize();
        luxuryKit.getColor();
        luxuryKit.getPrice();
        luxuryKit.getPackaging();

        System.out.println("------------------");
        MakeupKitStore store = new MakeupKitStore();
        store.manage(kit2);
        store.manage(kit1);
        store.manage(luxuryKit);
    }
}
