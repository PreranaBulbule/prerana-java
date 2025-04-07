package com.xworkz.override23;

public class SwitchStore {
    public void manage(Switch switchObj) {
        switchObj.getType();
        switchObj.getColor();
        switchObj.getSize();
        switchObj.getBrand();
        switchObj.getPrice();

        if (switchObj instanceof ButtonSwitch) {
            System.out.println("Switch is instance of ButtonSwitch");
            ButtonSwitch buttonSwitch = (ButtonSwitch) switchObj;
            buttonSwitch.getSwitchingMechanism();
        }
    }
}
