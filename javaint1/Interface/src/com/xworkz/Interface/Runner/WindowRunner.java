package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Window;
import com.xworkz.Interface.Internal.GlassWindowPackagerImpl;

public class WindowRunner {
    public static void main(String[] args) {
        GlassWindowPackagerImpl packager = new GlassWindowPackagerImpl();
        Window window = new Window(packager);
        window.startPackaging();
    }
}
