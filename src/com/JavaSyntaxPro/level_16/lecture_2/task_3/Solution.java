package com.JavaSyntaxPro.level_16.lecture_2.task_3;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*

Напиши программу, которая считывает из консоли имя текстового файла, далее читает символы из этого файла
(используй метод readAllLines(Path) класса Files) и выводит на экран все, за исключением точки, запятой и пробела.

Требования:
•	Программа должна считать с консоли путь к файлу.
•	Программа должна вывести в консоль содержимое файла согласно условию.
•	Для чтения строк из файла должен быть использован метод readAllLines(Path) класса Files.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */
public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> listLine = Files.readAllLines(Paths.get(scanner.nextLine()));
            listLine.forEach(str -> {
                char[] chars = str.toCharArray();
                for (char ch : chars) {
                    if (ch != ' ' && ch != '.' && ch != ',') {
                        System.out.print(ch);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}