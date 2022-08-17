package com.JavaSyntaxPro.level_6.lecture_3;

import java.util.Scanner;

/*
Тебе нужно написать программу, которая:

Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.
Требования:
•	Программа должна считывать число N и за ним еще N чисел.
•	В классе должен быть метод public static void main(String[]).
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
•	Программа должна выводить введенные N чисел в том же порядке, если N нечётное.
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int[] array = new int[number];
        if (number > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = console.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 1) {
                System.out.println(array[i]);
            } else {
                int temp = array[array.length - i - 1];
                System.out.println(temp);
            }
        }
    }
}
