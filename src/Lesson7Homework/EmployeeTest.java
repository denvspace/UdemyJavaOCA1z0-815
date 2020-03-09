package Lesson7Homework;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Власов");
//        Employee emp2 = new Employee(2324.56);
        Employee emp3 = new Employee(25,17,"Sales");

        System.out.println(emp1.age);
        System.out.println(emp1.department);
        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);

        System.out.println(emp3.age);
        System.out.println(emp3.department);
        System.out.println(emp3.id);
        System.out.println(emp3.surname);
//        System.out.println(emp3.salary);
        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

        emp3.getId();
        emp3.getSalary();
        emp3.getSurname();
    }
}
