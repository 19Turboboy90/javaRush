package com.javaCore.level_8.lecture_3.task_2;

import java.io.*;

/*
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должен выводиться минимальный байт, считанный из файла.
•	Поток чтения из файла должен быть закрыт.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        int minByte = Integer.MAX_VALUE;
        try (InputStream inputStream = new FileInputStream(file)) {
            while (inputStream.available() > 0) {
                int date = inputStream.read();
                if (minByte > date) minByte = date;
            }
            System.out.println(minByte);
        }
    }
}
