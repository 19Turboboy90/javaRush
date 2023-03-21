package com.javaCore.level_8.lecture_3.task_4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль через пробел должны выводиться все байты из файла с минимальным количеством повторов.
•	Данные в консоль должны выводится в одну строку.
•	Поток чтения из файла должен быть закрыт.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        ArrayList<Integer> listByte = new ArrayList<>();
        int minCount = Integer.MAX_VALUE;
        int[] arrayByte = new int[1024];
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            while (fileInputStream.available() > 0) {
                int date = fileInputStream.read();
                arrayByte[date] += 1;
            }
            for (int count : arrayByte) {
                if (count > 0 && count < minCount) minCount = count;
            }

            for (int i = 0; i < arrayByte.length; i++) {
                if (arrayByte[i] == minCount) listByte.add(i);
            }
            listByte.forEach(i -> System.out.print(i + " "));
        }
    }
}
