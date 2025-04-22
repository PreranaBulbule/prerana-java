package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Brush;
import com.xworkz.Interface.Internal.SoftBristleBrushPackagerImpl;

public class BrushRunner {
    public static void main(String[] args) {
        SoftBristleBrushPackagerImpl packager = new SoftBristleBrushPackagerImpl();
        Brush brush = new Brush(packager);
        brush.startPackaging();
    }
}
