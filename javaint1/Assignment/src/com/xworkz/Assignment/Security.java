package com.xworkz.Assignment;

import java.util.List;

public class Security {
    String agency;
    int personnelCount;
    String securityLevel;
    List<Personnel> personnelList;

    public Security(String agency, int personnelCount, String securityLevel, List<Personnel> personnelList) {
        this.agency = agency;
        this.personnelCount = personnelCount;
        this.securityLevel = securityLevel;
        this.personnelList = personnelList;
    }

    public void display() {
        System.out.println("      Security: " + agency + " | Personnel Count: " + personnelCount + " | Level: " + securityLevel);
        for (Personnel personnel : personnelList) {
            personnel.display();
        }
    }
}
