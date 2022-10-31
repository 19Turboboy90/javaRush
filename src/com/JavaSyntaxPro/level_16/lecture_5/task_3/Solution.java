package com.JavaSyntaxPro.level_16.lecture_5.task_3;

import java.nio.file.Path;
import java.util.Scanner;

/*
Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли, при этом если путь не абсолютный,
то перед выводом его нужно преобразовать к таковому.

Требования:
•	Программа должна считать из консоли путь к файлу/папке.
•	Программа должна выводить в консоли этот путь, при необходимости преобразовывая в абсолютный.
•	Для проверки и преобразования в абсолютный должны быть использованы методы isAbsolute() и toAbsolutePath() класса Path.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        if (!path.isAbsolute()) {
            System.out.println(path.toAbsolutePath());
        }
    }
}
