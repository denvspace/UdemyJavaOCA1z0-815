package Lesson3Homework;

public class Homework3 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
//               11 / 5.5 + 1.3%5 -20

        int a = 5;
        int res1 = a-- - --a + ++a + a++ + a; //5 -
        //         5   -   3 +   4 + 4   + 5
        int b = 8;
        int res2 = ++b - b++ + ++b - --b; //
                 //  9 - 9   +   11    10
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(result);
    }
}
