package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Salt;
import com.xworkz.Interface.Internal.SeaSaltPackagerImpl;

public class SaltRunner {
    public static void main(String[] args) {
        SeaSaltPackagerImpl packager = new SeaSaltPackagerImpl();
        Salt salt = new Salt(packager);
        salt.startPackaging();
    }
}
