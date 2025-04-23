package com.xworkz.Interface.Internal;

public class HardcoverNovelPackagerImpl implements NovelPackager {
    public HardcoverNovelPackagerImpl() {
        System.out.println("No-arg constructor of HardcoverNovelPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing novel using Hardcover Novel Packager");
    }
}
