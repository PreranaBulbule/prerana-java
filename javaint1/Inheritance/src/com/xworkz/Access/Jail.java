package com.xworkz.Access;

public class Jail {
    private String name;
    private String location;
    private String jailerName;
    private int totalCells;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getJailerName() {
        return jailerName;
    }

    public int getTotalCells() {
        return totalCells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setJailerName(String jailerName) {
        this.jailerName = jailerName;
    }

    public void setTotalCells(int totalCells) {
        this.totalCells = totalCells;
    }

    public void displayDetails() {
        System.out.println("Jail Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Jailer Name: " + jailerName);
        System.out.println("Total Cells: " + totalCells);
    }
}

