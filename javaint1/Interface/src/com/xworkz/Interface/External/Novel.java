package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.NovelPackager;

public class Novel {
    private NovelPackager packager;

    public Novel(NovelPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the novel packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Novel packager not available");
        }
    }
}
