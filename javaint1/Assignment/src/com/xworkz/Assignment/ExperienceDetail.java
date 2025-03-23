package com.xworkz.Assignment;

public class ExperienceDetail {
    String company;
    String education;

    public ExperienceDetail(String company, String education) {
        this.company = company;
        this.education = education;
    }

    public void display() {
        System.out.println("ExperienceDetail - Company: " + company + " | Education: " + education);
    }
}

