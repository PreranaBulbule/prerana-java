package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.StickerPackager;

public class Sticker {
    private StickerPackager packager;

    public Sticker(StickerPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the sticker packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Sticker packager not available");
        }
    }
}
