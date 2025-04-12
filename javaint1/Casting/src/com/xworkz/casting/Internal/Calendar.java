package com.xworkz.casting.Internal;

public class Calendar {
    private String year;
    private String type;
    private double price;

    public Calendar() {
        System.out.println("Running no-arg constructor of Calendar");
        this.year = "2024";
        this.type = "Desk Calendar";
        this.price = 10.00;
    }

    public Calendar(String year, String type, double price) {
        this.year = year;
        this.type = type;
        this.price = price;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Year: " + year + ", Type: " + type + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("CalendarHashCode (from super): " + super.hashCode());
        return 5555; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Calendar) {
                System.out.println("have ref. will compare..");
                Calendar cal1 = this;
                Calendar cal2 = (Calendar) obj;
                if (cal1.year.equals(cal2.year)) {
                    System.out.println("both are same year");
                    return true;
                }
            }
        }
        return false;
    }
}
