package com.JavaSyntaxPro.level_3.lecture_9;

import java.util.Scanner;

/*
 Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.

Требования:
•	Программа должна считывать две строки c клавиатуры.
•	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
•	Если строки разные, то программа должна вывести сообщение "строки разные".
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        if (string1.equals(string2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}
