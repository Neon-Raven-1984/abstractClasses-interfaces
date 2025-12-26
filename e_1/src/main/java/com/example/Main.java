package com.example;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(1, "Ali", 5000);
        Employee e2 = new HourlyEmployee(2, "Sara", 120, 25);

        System.out.println("---- Full Time Employee ----");
        e1.displayInfo();
        System.out.println("Salary: " + e1.calculateSalary());

        System.out.println("\n---- Hourly Employee ----");
        e2.displayInfo();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}
