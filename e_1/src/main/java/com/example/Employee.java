package com.example;

public abstract class Employee {

    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // متد مشترک
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // متد انتزاعی
    public abstract double calculateSalary();
}
