package com.xworkz.override31;

public class WallCalendar extends Calendar {
    public WallCalendar() {
        super();
        System.out.println("Running non-arg constructor WallCalendar--child");
    }

    @Override
    public void getYear() {
        System.out.println("WallCalendar year is 2025--child");
    }

    @Override
    public void getMonth() {
        System.out.println("WallCalendar month is December--child");
    }

    @Override
    public void getDay() {
        System.out.println("WallCalendar day is Sunday--child");
    }

    @Override
    public void getType() {
        System.out.println("WallCalendar is a wall-hanging type--child");
    }

    @Override
    public void getPrice() {
        System.out.println("WallCalendar price is $10--child");
    }

    public void getDesign() {
        System.out.println("WallCalendar design is floral--child only method");
    }
}