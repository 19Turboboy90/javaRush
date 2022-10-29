package com.JavaSyntaxPro.level_16.lecture_3.task_3;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Программа считывает из консоли строку и выводит список букв, из которых состоит введенная строка.
Не меняя функциональности программы, перепиши код с использованием Scanner для чтения из консоли.

Требования:
•	Программа должна считать из консоли строку и вывести на экран список букв, из которых состоит введенная строка.

 */
public class Solution {
    public static void main(String[] args) {
        try (InputStream inputStream = System.in;
             Scanner scanner = new Scanner(inputStream)) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (
                    char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
