package com.xworkz.Assignment;
import java.util.List;
import com.xworkz.Assignment.HouseKeep;


public class House {
    String address;
    int rooms;
    List<Room> roomList;
    List<HouseKeep> houseKeeps;

    public House(String address, int rooms, List<Room> roomList, List<HouseKeep> houseKeeps) {
        this.address = address;
        this.rooms = rooms;
        this.roomList = roomList;
        this.houseKeeps = houseKeeps;
    }

    public void display() {
        System.out.println("      House Address: " + address + " | Rooms: " + rooms);
        for (Room room : roomList) {
            room.display();
        }
        for (HouseKeep hk : houseKeeps) {
            hk.display();
        }
    }
}
