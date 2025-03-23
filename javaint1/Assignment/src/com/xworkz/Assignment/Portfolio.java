package com.xworkz.Assignment;

import javax.xml.soap.Detail;

public class Portfolio {
    String name;
    String responsibility;
    int budget;
    Detail detail;

    public Portfolio(String name, String responsibility, int budget, Detail detail) {
        this.name = name;
        this.responsibility = responsibility;
        this.budget = budget;
        this.detail = detail;
    }

    public class Detail {
        public void display() {
            System.out.println("      Portfolio: " + name + " | Responsibility: " + responsibility + " | Budget: $" + budget);
            detail.display();
        }
    }
}
