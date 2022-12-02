package com.JavaSyntaxPro.level_19.lecture_2.task_3;

import java.util.ArrayList;
import java.util.Collections;

/*
В классе Solution публичный метод print(ArrayList<String>) выводит в консоли все элементы списка по порядку.
Сейчас метод реализован с использованием метода списка forEach(), который принимает лямбда-выражение.
Необходимо переписать реализацию метода print(ArrayList<String>), чтобы метод списка forEach() вместо лямбда-выражения принимал ссылку на метод.

Метод main() не принимает участие в тестировании.

Требования:
•	В методе print(ArrayList<String>) нужно использовать метод списка forEach(), принимающий ссылку на метод.
•	В методе print(ArrayList<String>) нужно выводить в консоли все элементы полученного списка по порядку.
 */
public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        strings.forEach(System.out::println);
    }
}
