package com.xworkz.override40;

public class ClawClipStore {
    public void manage(ClawClip clawClip) {
        clawClip.getMaterial();
        clawClip.getColor();
        clawClip.getSize();
        clawClip.getPrice();
        clawClip.getShape();

        if (clawClip instanceof HairClawClip) {
            System.out.println("ClawClip is instance of HairClawClip");
            HairClawClip hairClawClip = (HairClawClip) clawClip;
            hairClawClip.getGripType();
        }
    }

}
