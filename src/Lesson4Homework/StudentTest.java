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

        System.out.println("Студент: " + vasya.name + " " + vasya.surname + " средняя оценка по предметам - " + (vasya.avgEconomy+vasya.avgForeignLanguage+vasya.avgMaths)/3);
        System.out.println("Студент: " + petya.name + " " + petya.surname + " средняя оценка по предметам - " + (petya.avgEconomy+petya.avgForeignLanguage+petya.avgMaths)/3);
        System.out.println("Студент: " + vanya.name + " " + vanya.surname + " средняя оценка по предметам - " + (vanya.avgEconomy+vanya.avgForeignLanguage+vanya.avgMaths)/3);
    }
}
