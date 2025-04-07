package com.xworkz.Runner;
import com.xworkz.override23.Switch;
import com.xworkz.override23.SwitchStore;
import com.xworkz.override23.ButtonSwitch;

public class SwitchRunner {
    public static void main(String[] args) {
        Switch switch1 = new Switch();
        switch1.getType();
        switch1.getColor();
        switch1.getSize();
        switch1.getBrand();
        switch1.getPrice();

        System.out.println("-------------------");
        Switch switch2 = new ButtonSwitch();
        switch2.getType();
        switch2.getColor();
        switch2.getSize();
        switch2.getBrand();
        switch2.getPrice();

        System.out.println("-----------------");
        ButtonSwitch buttonSwitch = new ButtonSwitch();
        buttonSwitch.getType();
        buttonSwitch.getColor();
        buttonSwitch.getSize();
        buttonSwitch.getBrand();
        buttonSwitch.getPrice();
        buttonSwitch.getSwitchingMechanism();

        System.out.println("------------------");
        SwitchStore switchStore = new SwitchStore();
        switchStore.manage(switch2);
        switchStore.manage(switch1);
        switchStore.manage(buttonSwitch);
    }
}
