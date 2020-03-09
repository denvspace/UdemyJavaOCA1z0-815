package Lesson6Homework;

public class Student {
    String name;
    String surname;
    int studentTicket;
    int course;
    double avgMaths;
    double avgEconomy;
    double avgForeignLanguage;

    public Student(String name, String surname, int studentTicket, int course, double avgMaths, double avgEconomy, double avgForeignLanguage) {
        this.name = name;
        this.surname = surname;
        this.studentTicket = studentTicket;
        this.course = course;
        this.avgMaths = avgMaths;
        this.avgEconomy = avgEconomy;
        this.avgForeignLanguage = avgForeignLanguage;
    }

    public Student(String name, String surname, int studentTicket, int course) {
        this(name, surname, studentTicket, course, 0,0,0);
    }

    public Student() {
    }

    public static void printAvgGrade (Student student) {
        System.out.println("Студент: " + student.name + " " + student.surname + " средняя оценка по предметам - " + (student.avgEconomy+student.avgForeignLanguage+student.avgMaths)/3);
    }
}