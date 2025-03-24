package com.xworkz.AccessSpecifier;

public class Employee {
    public String name = "Alice";
    int empId = 101;
    private double salary = 75000;

    public void showName() {
        System.out.println("Employee Name: " + name);
    }

    void showEmpId() {
        System.out.println("Employee ID: " + empId);
    }

    private void showSalary() {
        System.out.println("Salary: " + salary);
    }

    public void accessPrivateSalary() {
        showSalary();
    }
}
