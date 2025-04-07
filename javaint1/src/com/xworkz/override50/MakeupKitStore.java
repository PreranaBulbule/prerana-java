package com.xworkz.override50;

public class MakeupKitStore {
    public void manage(MakeupKit makeupKit) {
        makeupKit.getBrand();
        makeupKit.getContents();
        makeupKit.getSize();
        makeupKit.getColor();
        makeupKit.getPrice();

        if (makeupKit instanceof LuxuryMakeupKit) {
            System.out.println("MakeupKit is an instance of LuxuryMakeupKit");
            LuxuryMakeupKit luxuryMakeupKit = (LuxuryMakeupKit) makeupKit;
            luxuryMakeupKit.getPackaging();
        }
    }

}
