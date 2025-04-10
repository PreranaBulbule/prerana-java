package com.xworkz.casting.Internal;

public class Company {
    private String name;
    private String industry;
    private double revenue;

    public Company(String name, String industry, double revenue) {
        this.name = name;
        this.industry = industry;
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Company [name=" + name + ", industry=" + industry + ", revenue=" + revenue + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("CompanyHashCode (from super): " + super.hashCode());
        return 1200;
    }
}
