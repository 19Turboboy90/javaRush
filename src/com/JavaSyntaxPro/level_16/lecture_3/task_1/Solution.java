package com.JavaSyntaxPro.level_16.lecture_3.task_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Напиши программу, которая считывает из консоли имя текстового файла, далее читает строки из этого файла
(используй метод readAllLines(Path) класса Files) и выводит их на экран через одну, начиная с первой.

Требования:
•	Программа должна считать из консоли путь к файлу.
•	Программа должна вывести в консоли содержимое файла согласно условию.
•	Для чтения строк из файла нужно использовать метод readAllLines(Path) класса Files.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            var fileList = Files.readAllLines(Path.of(scanner.nextLine()));
            for (int i = 0; i < fileList.size(); i += 2) {
                System.out.println(fileList.get(i));
            }
        }
    }
}
