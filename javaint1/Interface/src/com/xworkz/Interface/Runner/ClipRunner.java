package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Clip;
import com.xworkz.Interface.Internal.MetalClipPackagerImpl;

public class ClipRunner {
    public static void main(String[] args) {
        MetalClipPackagerImpl packager = new MetalClipPackagerImpl();
        Clip clip = new Clip(packager);
        clip.startPackaging();
    }
}
