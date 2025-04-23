package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Desk;
import com.xworkz.Interface.Internal.WoodenDeskPackagerImpl;

public class DeskRunner {
    public static void main(String[] args) {
        WoodenDeskPackagerImpl packager = new WoodenDeskPackagerImpl();
        Desk desk = new Desk(packager);
        desk.startPackaging();
    }
}
