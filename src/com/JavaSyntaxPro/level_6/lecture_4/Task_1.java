package com.JavaSyntaxPro.level_6.lecture_4;

import java.util.Scanner;

/*
В этой задаче тебе нужно:

Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
Примеры.

Массив после чтения строк:
{"Hello", "Hello", "World", "Java", "Tasks", "World"}
Массив после удаления повторяющихся строк:
{null, null, null, "Java", "Tasks", null}

Требования:
•	В методе main(String[]) считай с клавиатуры 6 строк и заполнить ими массив strings.
•	В методе main(String[]) удали(заменить строку на null) элементы из массива strings с одинаковыми строками.
 */
public class Task_1 {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (word == null) {
                    break;
                }
                if (word.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        for (String string : strings) {
            System.out.print(string + ", ");
        }
    }
}
