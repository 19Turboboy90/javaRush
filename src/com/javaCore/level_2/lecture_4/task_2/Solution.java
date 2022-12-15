package com.javaCore.level_2.lecture_4.task_2;

/*
Реализуй два метода: print(int) и print(Integer).
Напиши такой код в методе main(), чтобы вызвались оба.

Требования:
•	Класс Solution должен содержать статический метод main().
•	Класс Solution должен содержать статический void метод print() с параметром типа int.
•	Класс Solution должен содержать статический void метод print() с параметром типа Integer.
•	Метод main() должен вызывать метод print() с параметром типа int.
•	Метод main() должен вызывать метод print() с параметром типа Integer.
 */
public class Solution {
    public static void main(String[] args) {
        print(1);
        print(Integer.valueOf(1));
    }

    public static void print(int num) {
    }

    public static void print(Integer num) {
    }
}
