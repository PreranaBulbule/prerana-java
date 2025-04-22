package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Sink;
import com.xworkz.Interface.Internal.StainlessSteelSinkPackagerImpl;

public class SinkRunner {
    public static void main(String[] args) {
        StainlessSteelSinkPackagerImpl packager = new StainlessSteelSinkPackagerImpl();
        Sink sink = new Sink(packager);
        sink.startPackaging();
    }
}
