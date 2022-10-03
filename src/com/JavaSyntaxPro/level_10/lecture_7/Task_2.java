package com.JavaSyntaxPro.level_10.lecture_7;

/*

Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.

Требования:
•	Нужно, чтобы метод reverseString(String) использовал StringBuilder.
•	Нужно, чтобы метод reverseString(String) возвращал развернутую строку.
 */
public class Task_2 {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString();
    }
}
