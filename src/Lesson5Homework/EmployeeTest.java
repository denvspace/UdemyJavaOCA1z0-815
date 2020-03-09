package Lesson5Homework;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(68765,"Кириллова", 29, 400, "Отдел продаж");
        Employee employee2 = new Employee(68765,"Савкина", 33, 500, "Коммерческий отдел");

        employee1.doubleSalary();
        employee2.doubleSalary();

        System.out.println(employee1.surname + " - оклад: " + employee1.salary + "$");
        System.out.println(employee2.surname + " - оклад: " + employee2.salary + "$");
    }
}
