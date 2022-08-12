package com.JavaSyntaxPro.level_2.lecture_6;

/*
В методе main на экран выводятся три строки.
Внеси изменения в код, чтобы все буквы в этих строках стали заглавными.

Требования:
•	Не изменяй значения переменных caps и usa.
•	У трех строк, переданных в метод println, вызови метод toUpperCase.
•	Вывод программы должен содержать три строки.
 */
public class Task_7 {
    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";
        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
}
