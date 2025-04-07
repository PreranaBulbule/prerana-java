package com.xworkz.override17;

public class BrushStore {
    public void manage(Brush brush) {
        brush.getType();
        brush.getBrand();
        brush.getColor();
        brush.getPrice();
        brush.getSize();

        if (brush instanceof ToothBrush) {
            System.out.println("Brush is instance of ToothBrush");
            ToothBrush toothBrush = (ToothBrush) brush;
            toothBrush.getBristleType();
        }
    }
}

