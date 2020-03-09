package Lesson6Homework;

public class StudentTest {
    public static void main(String[] args) {
        Student vasya = new Student("Василий","Петров",645438841,2019);
        vasya.avgEconomy = 9.6;
        vasya.avgForeignLanguage = 7.5;
        vasya.avgMaths = 8.7;

        Student petya = new Student("Петр","Смирнов",645465128,2003,6.8,7.0,8.7);

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
