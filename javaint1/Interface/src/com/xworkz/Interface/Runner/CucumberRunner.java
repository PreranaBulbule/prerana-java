package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Cucumber;
import com.xworkz.Interface.Internal.FreshCucumberPackagerImpl;

public class CucumberRunner {
    public static void main(String[] args) {
        FreshCucumberPackagerImpl packager = new FreshCucumberPackagerImpl();
        Cucumber cucumber = new Cucumber(packager);
        cucumber.startPackaging();
    }
}
