package Lesson7Homework;


public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    Employee(int id, int age,String department) {
        this.id = id;
        this.age = age;
        this.department = department;
    }


    public void getId() {
        System.out.println("ID = " + id);
    }

    public void getSurname() {
        System.out.println("Surname = " + surname);
    }

    public void getSalary() {
        System.out.println("Salary = " + salary);
    }

    public void doubleSalary(){
        salary*=2;
    }
}