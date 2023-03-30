package com.javaCore.level_8.lecture_5.task_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.

Требования:
•	Программа должна считать имена файлов с консоли.
•	Для чтения из файлов используй поток FileInputStream.
•	Программа должна работать, пока введенный файл не окажется меньше 1000 байт.
•	Программа должна завершиться исключением DownloadException.
•	Поток FileInputStream должен быть закрыт.
 */
public class Solution {
    public static void main(String[] args) throws IOException, DownloadException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         while (true){
             String date = bufferedReader.readLine();

             try ( FileInputStream file = new FileInputStream(date)){
                 if(file.available() < 1000) throw new DownloadException();
             }
         }
    }

    public static class DownloadException extends Exception {
    }
}
