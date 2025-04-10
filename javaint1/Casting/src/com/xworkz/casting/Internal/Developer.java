package com.xworkz.casting.Internal;

public class Developer {
    private String name;
    private String programmingLanguage;
    private double salary;

    public Developer(String name, String programmingLanguage, double salary) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer [name=" + name + ", programmingLanguage=" + programmingLanguage + ", salary=" + salary + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("DeveloperHashCode (from super): " + super.hashCode());
        return 1400;
    }
}
