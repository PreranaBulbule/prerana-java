package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.ShellPackager;

public class Shell {
    private ShellPackager packager;

    public Shell(ShellPackager packager) {
        this.packager = packager;
    }

    public void startPackaging() {
        System.out.println("Starting the shell packaging process");
        if (this.packager != null) {
            this.packager.pack();
        } else {
            System.out.println("Shell packager not connected");
        }
    }
}
