package com.javaCore.level_5.lecture_4.task_4;

/*
Измени метод printName() так, чтобы он выполнялся для man и woman.
Реализация метода printName() должна быть одна.

Требования:
•	В классе Solution должен быть реализован только один метод printName().
•	Метод printName() должен принимать один параметр типа Human.
•	Класс Man должен быть потомком класса Human.
•	Класс Woman должен быть потомком класса Human.
 */
public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human man) {

    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
