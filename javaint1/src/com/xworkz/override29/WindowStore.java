package com.xworkz.override29;

public class WindowStore {
    public void manage(Window window) {
        window.getMaterial();
        window.getSize();
        window.getType();
        window.getColor();
        window.getPrice();

        if (window instanceof GlassWindow) {
            System.out.println("Window is instance of GlassWindow");
            GlassWindow glassWindow = (GlassWindow) window;
            glassWindow.getTransparency();
        }
    }

}
