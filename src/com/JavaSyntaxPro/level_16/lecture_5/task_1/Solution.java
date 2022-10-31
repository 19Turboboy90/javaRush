package com.JavaSyntaxPro.level_16.lecture_5.task_1;

import java.nio.file.Path;
import java.util.Scanner;

/*
Напиши программу, в которой пользователь вводит с клавиатуры путь к файлу или папке,
после чего в консоли выводится диск (корень для Unix-like), на котором находится этот файл (или папка).
Для решения задачи используй Path и его методы.

Требования:
•	Программа должна считать из консоли путь к файлу/папке.
•	Программа должна выводить в консоли диск, на котором находится этот файл (или папка).
•	Для получения диска из пути нужно использовать метод getRoot() класса Path.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path file = Path.of(str);
        System.out.println(file.getRoot());
    }
}
