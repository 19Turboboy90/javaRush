package com.javaCore.level_8.lecture_5.task_4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.

Требования:
•	Программа должна два раза считать имена файлов с консоли.
•	Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
•	Во второй файл нужно записать все байты из первого в обратном порядке.
•	Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream file1 = new FileInputStream(bufferedReader.readLine());
             FileOutputStream file2 = new FileOutputStream(bufferedReader.readLine())) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (file1.available() > 0) {
                arrayList.add(file1.read());
            }
            Collections.reverse(arrayList);
            for (Integer i : arrayList) {
                file2.write(i);
            }
        }
    }
}
