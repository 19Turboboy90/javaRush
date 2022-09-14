package com.JavaSyntaxPro.level_7.lecture_6;

/*
Посмотри, что делает программа. Расставь модификатор final общепринятым константам (переменным с неизменными значениями).

Требования:
•	Модификатор final должен быть установлен всем константам.
 */
public class Task_1 {
    public static final double PI = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Площадь круга равна: " + PI * radius * radius);
        System.out.println("Периметр круга равен: " + PI * diameter);
    }
}
