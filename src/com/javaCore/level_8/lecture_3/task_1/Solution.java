package com.javaCore.level_8.lecture_3.task_1;

import java.io.*;

/*
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должен выводиться максимальный байт, считанный из файла.

 */
public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int maxByte = 0;
        try {
            String file = bufferedReader.readLine();
            FileInputStream inputStream = new FileInputStream(file);
            while (inputStream.available() > 0) {
                int date = inputStream.read();
                if (maxByte < date) {
                    maxByte = date;
                }
            }
            System.out.println(maxByte);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
