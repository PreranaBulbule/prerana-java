package com.xworkz.Interface.Internal;

public class SoftBristleBrushPackagerImpl implements BrushPackager {
    public SoftBristleBrushPackagerImpl() {
        System.out.println("No-arg constructor of SoftBristleBrushPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing brush using Soft Bristle Brush Packager");
    }
}
