package com.xworkz.Interface.Internal;

public class ConchShellPackagerImpl implements ShellPackager {
    public ConchShellPackagerImpl() {
        System.out.println("No-arg constructor of ConchShellPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing shell using Conch Shell Packager");
    }
}
