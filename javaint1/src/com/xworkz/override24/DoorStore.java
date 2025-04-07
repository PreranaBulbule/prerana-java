package com.xworkz.override24;

public class DoorStore {
    public void manage(Door door) {
        door.getMaterial();
        door.getSize();
        door.getColor();
        door.getPrice();
        door.getType();

        if (door instanceof WoodenDoor) {
            System.out.println("Door is instance of WoodenDoor");
            WoodenDoor woodenDoor = (WoodenDoor) door;
            woodenDoor.getDurability();
        }
    }
    }
