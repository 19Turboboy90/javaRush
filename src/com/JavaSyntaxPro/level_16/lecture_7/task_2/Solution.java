package com.JavaSyntaxPro.level_16.lecture_7.task_2;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.util.Arrays;

/*

Твоя задача — обратиться к публичному API в интернете и получить данные. Напиши программу,
которая будет обращаться по ссылке к публичному API в интернете, получать данные и выводить их на экран.

Подсказки:

Используй метод openStream() класса URL.
Если не знаешь, какой API использовать, можешь запросить у нас на сервере список проектов-игр:
https://javarush.ru/api/1.0/rest/projects
Требования:
•	Программа должна выводить полученную информацию на экран.
•	В программе должен вызываться метод openStream() класса URL.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        try (InputStream inputStream = url.openStream();) {
            byte[] buffer = inputStream.readAllBytes();
            String result = new String(buffer);
            System.out.println(result);
        }
    }
}
