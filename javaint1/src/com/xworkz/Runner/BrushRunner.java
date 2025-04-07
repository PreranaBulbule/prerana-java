package com.xworkz.Runner;
import com.xworkz.override17.Brush;
import com.xworkz.override17.BrushStore;
import com.xworkz.override17.ToothBrush;

public class BrushRunner {
    public static void main(String[] args) {
        Brush brush1 = new Brush();
        brush1.getType();
        brush1.getBrand();
        brush1.getColor();
        brush1.getPrice();
        brush1.getSize();

        System.out.println("-------------------");
        Brush brush2 = new ToothBrush();
        brush2.getType();
        brush2.getBrand();
        brush2.getColor();
        brush2.getPrice();
        brush2.getSize();

        System.out.println("-----------------");
        ToothBrush toothBrush = new ToothBrush();
        toothBrush.getType();
        toothBrush.getBrand();
        toothBrush.getColor();
        toothBrush.getPrice();
        toothBrush.getSize();
        toothBrush.getBristleType();

        System.out.println("------------------");
        BrushStore brushStore = new BrushStore();
        brushStore.manage(brush2);
        brushStore.manage(brush1);
        brushStore.manage(toothBrush);
    }
}
