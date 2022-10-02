package com.JavaSyntaxPro.level_10.lecture_6;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
Используя StringTokenizer раздели query на части по разделителю delimiter.

Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}

Hint: решить задачу поможет метод countTokens().

Требования:
•	Нужно, чтобы метод getTokens(String, String) использовал StringTokenizer.
•	Нужно, чтобы метод getTokens(String, String) возвращал массив типа String, заполненный согласно условию задачи.
 */
public class Task_1 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        int index = 0;
        String[] result = new String[stringTokenizer.countTokens()];
        while (stringTokenizer.hasMoreTokens()) {
            result[index] = stringTokenizer.nextToken();
            index++;
        }
        return result;
    }
}
