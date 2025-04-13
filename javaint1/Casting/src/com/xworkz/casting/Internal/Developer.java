package com.xworkz.casting.Internal;

public class Developer {
    private String name;
    private String specialization;
    private double salary;

    public Developer() {
        System.out.println("Running no-arg constructor of Developer");
        this.name = "Default Developer";
        this.specialization = "Frontend";
        this.salary = 60000.00;
    }

    public Developer(String name, String specialization, double salary) {
        this.name = name;
        this.specialization = specialization;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Specialization: " + specialization + ", Salary: " + salary;
    }

    @Override
    public int hashCode() {
        System.out.println("DeveloperHashCode (from super): " + super.hashCode());
        return 4040; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Developer) {
                System.out.println("have ref. will compare..");
                Developer d1 = this;
                Developer d2 = (Developer) obj;
                if (d1.name.equals(d2.name)) {
                    System.out.println("both are same developer name");
                    return true;
                }
            }
        }
        return false;
    }
}
