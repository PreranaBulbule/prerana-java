package com.xworkz.Access;

public class JailArray {
    public void showJails() {
        Jail j1 = new Jail();
        j1.setName("Alcatraz");
        j1.setLocation("San Francisco");
        j1.setJailerName("John Smith");
        j1.setTotalCells(300);

        Jail j2 = new Jail();
        j2.setName("Sing Sing");
        j2.setLocation("New York");
        j2.setJailerName("Robert Brown");
        j2.setTotalCells(500);

        j1.displayDetails();
        j2.displayDetails();
    }
}

