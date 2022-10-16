package com.JavaSyntaxPro.level_14.lecture_1.task_1;

import java.util.Arrays;
import java.util.HashSet;

/*
В классе Solution есть метод arrayToHashSet(String[]), который должен из переданного массива вернуть HashSet<String> с теми же элементами.
Метод main не участвует в проверке.

Требования:
•	В классе Solution должен быть public static HashSet<String> arrayToHashSet(String[]) метод.
•	Метод arrayToHashSet(String[]) должен быть реализован согласно условию.
 */
public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        return new HashSet<>(Arrays.asList(strings));
    }
}
