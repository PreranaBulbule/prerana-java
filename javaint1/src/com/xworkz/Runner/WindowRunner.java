package com.xworkz.Runner;
import com.xworkz.override29.Window;
import com.xworkz.override29.WindowStore;
import com.xworkz.override29.GlassWindow;

public class WindowRunner {
    public static void main(String[] args) {
        Window window1 = new Window();
        window1.getMaterial();
        window1.getSize();
        window1.getType();
        window1.getColor();
        window1.getPrice();

        System.out.println("-------------------");
        Window window2 = new GlassWindow();
        window2.getMaterial();
        window2.getSize();
        window2.getType();
        window2.getColor();
        window2.getPrice();

        System.out.println("-----------------");
        GlassWindow glassWindow = new GlassWindow();
        glassWindow.getMaterial();
        glassWindow.getSize();
        glassWindow.getType();
        glassWindow.getColor();
        glassWindow.getPrice();
        glassWindow.getTransparency();

        System.out.println("------------------");
        WindowStore windowStore = new WindowStore();
        windowStore.manage(window2);
        windowStore.manage(window1);
        windowStore.manage(glassWindow);
    }
}
