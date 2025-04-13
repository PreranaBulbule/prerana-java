package com.xworkz.casting.Internal;

public class Company {
    private String name;
    private String industry;
    private double valuation;

    public Company() {
        System.out.println("Running no-arg constructor of Company");
        this.name = "DefaultCorp";
        this.industry = "General";
        this.valuation = 1000000.00;
    }

    public Company(String name, String industry, double valuation) {
        this.name = name;
        this.industry = industry;
        this.valuation = valuation;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Industry: " + industry + ", Valuation: " + valuation;
    }

    @Override
    public int hashCode() {
        System.out.println("CompanyHashCode (from super): " + super.hashCode());
        return 2025; // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Company) {
                System.out.println("have ref. will compare..");
                Company c1 = this;
                Company c2 = (Company) obj;
                if (c1.name.equals(c2.name)) {
                    System.out.println("both are same company name");
                    return true;
                }
            }
        }
        return false;
    }
}
