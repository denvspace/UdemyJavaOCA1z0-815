package Lesson5Homework;

public class Employee {
    int id;
    String surnaame;
    int age;
    double salary;
    String department;

    public Employee(int id, String surnaame, int age, double salary, String department) {
        this.id = id;
        this.surnaame = surnaame;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public void doubleSalary(){
        salary*=2;
    }
}
