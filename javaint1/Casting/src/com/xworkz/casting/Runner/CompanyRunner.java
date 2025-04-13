package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        Company techCompany = new Company("Tech Innovations", "Technology", 5000000000.00);
        System.out.println(techCompany);
        System.out.println("Custom hashCode (overridden): " + techCompany.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(techCompany));

        Company c1 = new Company();
        c1.setName("Tech Innovations");

        Company c2 = new Company();
        c2.setName("Tech Innovations");

        boolean same = c1.equals(c2);
        System.out.println("Both same company name: " + same);
    }
}


