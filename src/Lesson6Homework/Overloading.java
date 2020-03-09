package Lesson6Homework;

public class Overloading {
    public static int sum() {
        int res = 0;
        System.out.println("Сумма = " + res);
        return res;
    }

    public static int sum(int i1) {
        int res = i1;
        System.out.println("Сумма = " + res);
        return res;
    }

    public static int sum(int i1, int i2) {
        int res = i1 + i2;
        System.out.println("Сумма = " + res);
        return res;
    }

    public static int sum(int i1, int i2, int i3) {
        int res = i1 + i2 + i3;
        System.out.println("Сумма = " + res);
        return res;
    }

    public static int sum(int i1, int i2, int i3, int i4) {
        int res = i1 + i2 + i3 + i4;
        System.out.println("Сумма = " + res);
        return res;
    }

    public static void main(String[] args) {
        sum();
        sum(3);
        sum(3,6);
        sum(3,6,9);
        sum(3,6,9,12);
    }
}
