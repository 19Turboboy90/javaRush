package com.javaCore.level_5.lecture_12.task_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
Для решения этой задачи:
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
Требования:
•	Константа FILE_NAME не должна быть пустой.
•	В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по отдельности в список lines.
•	Поле FILE_NAME НЕ должно быть final.
•	Класс Solution должен содержать список lines.
 */
public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try (FileReader fileReader = new FileReader(Statics.FILE_NAME);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String s;
            while ((s = reader.readLine()) != null) {
                lines.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
