package com.JavaSyntaxPro.level_6.lecture_3;

import java.util.Arrays;
import java.util.Scanner;

/*
Чтобы выполнить эту задачу, тебе нужно:

Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.
Требования:
•	В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов и заполни числами с клавиатуры.
•	В методе main(String[]) выведи в консоль минимальное число среди элементов массива.
 */
public class Task_2 {
    public static int[] array;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        array = new int[number];
        if (number > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = console.nextInt();
            }
        }
        int min = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println(min);
//        System.out.println(Arrays.stream(array).min());
    }
}
