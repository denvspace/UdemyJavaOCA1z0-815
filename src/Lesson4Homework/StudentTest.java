package Lesson4Homework;

public class StudentTest {
    public static void main(String[] args) {
        Student vasya = new Student();
        vasya.name = "Василий";
        vasya.surname = "Петров";
        vasya.studentTicket = 645438841;
        vasya.course = 2019;
        vasya.avgMaths = 8.7;
        vasya.avgForeignLanguage = 7.5;
        vasya.avgEconomy = 9.6;

        Student petya = new Student();
        petya.name = "Петр";
        petya.surname = "Смирнов";
        petya.studentTicket = 645465128;
        petya.course = 2003;
        petya.avgMaths = 6.8;
        petya.avgForeignLanguage = 8.7;
        petya.avgEconomy = 7.0;

        Student vanya = new Student();
        vanya.name = "Иван";
        vanya.surname = "Сергеев";
        vanya.studentTicket = 645411256;
        vanya.course = 2039;
        vanya.avgMaths = 9.9;
        vanya.avgForeignLanguage = 8.6;
        vanya.avgEconomy = 7.3;

        printAvgGrade(vasya);
        printAvgGrade(petya);
        printAvgGrade(vanya);
    }

    public static void printAvgGrade (Student student) {
        System.out.println("Студент: " + student.name + " " + student.surname + " средняя оценка по предметам - " + (student.avgEconomy+student.avgForeignLanguage+student.avgMaths)/3);
    }
}
