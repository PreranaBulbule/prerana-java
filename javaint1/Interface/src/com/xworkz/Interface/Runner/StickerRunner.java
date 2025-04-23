package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Sticker;
import com.xworkz.Interface.Internal.VinylStickerPackagerImpl;

public class StickerRunner {
    public static void main(String[] args) {
        VinylStickerPackagerImpl packager = new VinylStickerPackagerImpl();
        Sticker sticker = new Sticker(packager);
        sticker.startPackaging();
    }
}
