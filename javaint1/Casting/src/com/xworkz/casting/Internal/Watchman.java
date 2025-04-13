package com.xworkz.casting.Internal;

public class Watchman {
    private String name;
    private String shift;
    private double salary;

    public Watchman(String name, String shift, double salary) {
        this.name = name;
        this.shift = shift;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Watchman{name='" + name + "', shift='" + shift + "', salary=" + salary + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Watchman HashCode: " + super.hashCode());
        return 56789; // Custom hashCode value
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Watchman) {
                System.out.println("Comparing Watchman objects...");
                Watchman wm1 = this;
                Watchman wm2 = (Watchman) obj;
                if (wm1.name.equals(wm2.name) &&
                        wm1.shift.equals(wm2.shift) &&
                        wm1.salary == wm2.salary) {
                    System.out.println("Both Watchman objects are identical.");
                    return true;
                }
            }
        }
        return false;
    }
}
