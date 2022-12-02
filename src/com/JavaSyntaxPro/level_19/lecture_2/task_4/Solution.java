package com.JavaSyntaxPro.level_19.lecture_2.task_4;

import java.util.ArrayList;
import java.util.Collections;

/*
В классе Solution публичный метод print(ArrayList<Integer>) выводит в консоли все элементы списка по порядку.
Сейчас метод реализован с использованием метода списка forEach(), который принимает ссылку на метод.
Необходимо переписать реализацию метода print(ArrayList<Integer>), чтобы метод списка forEach() вместо ссылки на метод принимал лямбда-выражения.

Метод main() не принимает участие в тестировании.

Требования:
•	В методе print(ArrayList<Integer>) нужно использовать метод списка forEach(), принимающий лямбда-выражения.
•	В методе print(ArrayList<Integer>) нужно выводить в консоли все элементы полученного списка.
 */
public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(x -> System.out.println(x));
    }
}
