package com.JavaSyntaxPro.level_14.lecture_3.task_3;

import java.util.ArrayList;
import java.util.Collections;

/*
В классе Solution объявлены методы: min(ArrayList<Integer>), max(ArrayList<Integer>), frequency(ArrayList<Integer>, Integer),
binarySearch(ArrayList<Integer>, Integer). Тебе нужно разобраться, что делают методы, переписать их реализацию,
используя при этом только соответствующие методы класса Collections.

Требования:
•	В классе Solution должен быть публичный статический метод min(ArrayList<Integer>) с типом возвращаемого значения Integer.
•	В классе Solution должен быть публичный статический метод max(ArrayList<Integer>) с типом возвращаемого значения Integer.
•	В классе Solution должен быть публичный статический метод frequency(ArrayList<Integer>, Integer) с типом возвращаемого значения int.
•	В классе Solution должен быть публичный статический метод binarySearch(ArrayList<Integer>, Integer) с типом возвращаемого значения int.
•	Метод min(ArrayList<Integer>) нужно переписать, используя метод min класса Collections.
•	Метод max(ArrayList<Integer>) нужно переписать, используя метод max класса Collections.
•	Метод frequency(ArrayList<Integer>, Integer) нужно переписать, используя метод frequency класса Collections.
•	Метод binarySearch(ArrayList<Integer>, Integer) нужно переписать, используя метод binarySearch класса Collections.
 */
public class Solution {
    public static Integer min(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        Collections.sort(list);
       return Collections.binarySearch(list, key);
    }
}
