package com.JavaSyntaxPro.level_8.lecture_1;

/*
В методе main вызови метод div() с таким аргументом, чтобы вывод в консоли был "NaN".
Код метода div() изменять нельзя.

Требования:
•	В методе main() должен вызываться метод div().
•	Результатом вызова метода div() должен быть вывод в консоли "NaN".
•	Код метода div() не изменя
 */
public class Task_6 {
    public static void main(String[] args) {
        div(0.0, 0.0);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
