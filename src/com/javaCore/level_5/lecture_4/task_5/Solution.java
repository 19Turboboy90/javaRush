package com.javaCore.level_5.lecture_4.task_5;

/*
Убери в методе main() лишние строки, для которых метод add() не реализован.

Требования:
•	В классе Solution должно быть реализовано три метода add().
•	В методе main() нужно убрать лишние строки.
•	Все методы класса Solution должны быть статическими.
•	Все методы класса Solution должны быть публичными.
 */
public class Solution {
    public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }
}
