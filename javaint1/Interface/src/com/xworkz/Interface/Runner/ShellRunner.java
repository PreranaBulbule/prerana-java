package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Shell;
import com.xworkz.Interface.Internal.ConchShellPackagerImpl;

public class ShellRunner {
    public static void main(String[] args) {
        ConchShellPackagerImpl packager = new ConchShellPackagerImpl();
        Shell shell = new Shell(packager);
        shell.startPackaging();
    }
}
