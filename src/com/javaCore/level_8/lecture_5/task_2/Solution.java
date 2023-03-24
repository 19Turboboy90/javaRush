package com.javaCore.level_8.lecture_5.task_2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ','.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должно выводится число запятых в считанном файле.
•	Поток чтения из файла должен быть закрыт.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = bufferedReader.readLine();
        try (FileInputStream fileInputStream = new FileInputStream(nameFile)) {
            int count = 0;
            char asc = ',';
            while (fileInputStream.available() > 0) {
                if (fileInputStream.read() == asc) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
