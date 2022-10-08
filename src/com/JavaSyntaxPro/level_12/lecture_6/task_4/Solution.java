package com.JavaSyntaxPro.level_12.lecture_6.task_4;
/*
В методе main вызывается метод add, который должен увеличить значение поля salary класса Solution на переданное значение,
но при выводе поля salary получаем 0. Сделай так, чтобы программа работала правильно.

Требования:
•	В классе Solution должно быть публичное статическое поле salary типа int.
•	В классе Solution должен быть публичный статический метод add(int) с типом возвращаемого значения void.
•	Исправь ошибку, чтобы программа работала корректно.
 */
public class Solution {
    public static int salary;

    public static void add(int increase) {
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
