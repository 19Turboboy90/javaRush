package com.JavaSyntaxPro.level_16.lecture_7.task_3;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/*
Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, отправляя туда данные, получать ответные данные и выводить их на экран.

Подсказки:

Используй метод openConnection() класса URL.
Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
Если не знаешь, какой API использовать, бери http://httpbin.org/post.
Требования:
•	Программа должна выводить полученную информацию на экран.
•	В программе должен вызываться метод openConnection() класса URL.
•	В программе должны вызываться методы setDoOutput(true), getOutputStream() и getInputStream() класса URLConnection.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        try (OutputStream outputStream = connection.getOutputStream();
             InputStream inputStream = connection.getInputStream()) {

            PrintStream print = new PrintStream(outputStream);
            print.println("Hello");

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}
