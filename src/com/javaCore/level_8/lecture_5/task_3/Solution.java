package com.javaCore.level_8.lecture_5.task_3;

import java.io.*;

/*
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.

Требования:
•	Программа должна три раза считать имена файлов с консоли.
•	Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
•	Первую половину байт из первого файла нужно записать во второй файл.
•	Вторую половину байт из первого файла нужно записать в третий файл.
•	Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        String file3 = bufferedReader.readLine();
        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream outputStreamFile2 = new FileOutputStream(file2);
             FileOutputStream outputStreamFile3 = new FileOutputStream(file3)) {

            int halfOfFile = (fileInputStream.available() + 1) / 2;
            int numberOfByte = 0;
            while (fileInputStream.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    outputStreamFile2.write(fileInputStream.read());
                    numberOfByte++;
                } else {
                    outputStreamFile3.write(fileInputStream.read());
                }
            }
        }
    }
}
