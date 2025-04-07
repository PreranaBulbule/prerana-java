package com.xworkz.Runner;
import com.xworkz.override24.Door;
import com.xworkz.override24.DoorStore;
import com.xworkz.override24.WoodenDoor;

public class DoorRunner {
    public static void main(String[] args) {
        Door door1 = new Door();
        door1.getMaterial();
        door1.getSize();
        door1.getColor();
        door1.getPrice();
        door1.getType();

        System.out.println("-------------------");
        Door door2 = new WoodenDoor();
        door2.getMaterial();
        door2.getSize();
        door2.getColor();
        door2.getPrice();
        door2.getType();

        System.out.println("-----------------");
        WoodenDoor woodenDoor = new WoodenDoor();
        woodenDoor.getMaterial();
        woodenDoor.getSize();
        woodenDoor.getColor();
        woodenDoor.getPrice();
        woodenDoor.getType();
        woodenDoor.getDurability();

        System.out.println("------------------");
        DoorStore doorStore = new DoorStore();
        doorStore.manage(door2);
        doorStore.manage(door1);
        doorStore.manage(woodenDoor);
    }
}
