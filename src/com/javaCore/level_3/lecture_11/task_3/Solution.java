package com.javaCore.level_3.lecture_11.task_3;

import java.io.*;
import java.util.Scanner;

/*
В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
Требования:
•	Программа должна считывать c консоли путь к файлу.
•	Программа должна выводить на экран содержимое файла.
•	Поток чтения из файла (FileInputStream) должен быть закрыт.
•	BufferedReader также должен быть закрыт.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(bufferedReader.readLine())) {
            Scanner console = new Scanner(inputStream);
            StringBuilder builder = new StringBuilder();
            while (console.hasNextLine()) {
                builder.append(console.nextLine()).append("\n");
            }
            System.out.println(builder.toString());
        }
    }
}

