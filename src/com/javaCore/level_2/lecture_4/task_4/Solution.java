package com.javaCore.level_2.lecture_4.task_4;

/*
Напиши public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.

Требования:
•	Программа не должна выводить текст на экран.
•	Класс Solution должен содержать четыре метода.
•	Класс Solution должен содержать статический метод int min(int, int).
•	Метод int min(int, int) должен возвращать минимальное из двух чисел типа int.
•	Класс Solution должен содержать статический метод long min(long, long).
•	Метод long min(long, long) должен возвращать минимальное из двух чисел типа long.
•	Класс Solution должен содержать статический метод double min(double, double).
•	Метод double min(double, double) должен возвращать минимальное из двух чисел типа double.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public static long min(long num1, long num2) {
        return Math.min(num1, num2);
    }

    public static double min(double num1, double num2) {
        return Math.min(num1, num2);
    }
}
