package com.xworkz.Runner;
import com.xworkz.override40.ClawClip;
import com.xworkz.override40.HairClawClip;
import com.xworkz.override40.ClawClipStore;

public class ClawClipRunner {
    public static void main(String[] args) {
        ClawClip clawClip1 = new ClawClip();
        clawClip1.getMaterial();
        clawClip1.getColor();
        clawClip1.getSize();
        clawClip1.getPrice();
        clawClip1.getShape();

        System.out.println("-------------------");
        ClawClip clawClip2 = new HairClawClip();
        clawClip2.getMaterial();
        clawClip2.getColor();
        clawClip2.getSize();
        clawClip2.getPrice();
        clawClip2.getShape();

        System.out.println("-----------------");
        HairClawClip hairClawClip = new HairClawClip();
        hairClawClip.getMaterial();
        hairClawClip.getColor();
        hairClawClip.getSize();
        hairClawClip.getPrice();
        hairClawClip.getShape();
        hairClawClip.getGripType();

        System.out.println("------------------");
        ClawClipStore clawClipStore = new ClawClipStore();
        clawClipStore.manage(clawClip2);
        clawClipStore.manage(clawClip1);
        clawClipStore.manage(hairClawClip);
    }
}
