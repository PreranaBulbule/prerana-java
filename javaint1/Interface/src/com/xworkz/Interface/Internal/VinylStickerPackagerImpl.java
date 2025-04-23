package com.xworkz.Interface.Internal;

public class VinylStickerPackagerImpl implements StickerPackager {
    public VinylStickerPackagerImpl() {
        System.out.println("No-arg constructor of VinylStickerPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing sticker using Vinyl Sticker Packager");
    }
}
