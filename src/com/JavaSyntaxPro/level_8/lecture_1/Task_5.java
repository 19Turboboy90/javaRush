package com.JavaSyntaxPro.level_8.lecture_1;

/*
В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity", а второй — "-Infinity".
Код метода div() изменять нельзя.

Требования:
•	В методе main() метод div() должен вызываться 2 раза.
•	Результатом двух вызовов метода div() должен быть вывод в консоли "Infinity" и "-Infinity".
•	Код метода div() не изменя
 */
public class Task_5 {
    public static void main(String[] args) {
        double aDouble_1 = 1d;
        double bDouble_2 = aDouble_1 / 0d;
        div(aDouble_1, bDouble_2);
        div(-aDouble_1, bDouble_2);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
