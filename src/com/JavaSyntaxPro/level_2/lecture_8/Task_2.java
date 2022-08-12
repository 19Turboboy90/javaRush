package com.JavaSyntaxPro.level_2.lecture_8;

import java.util.Scanner;

/*
Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое.

Пример ввода:

51
101
201
Пример вывода:

117
Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
Используй деление без остатка.

Требования:
•	Программа должна считывать с клавиатуры три целых числа.
•	Программа должна выводить на экран среднее арифметическое считанных чисел.
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        System.out.println((i1 + i2 + i3) / 3);
    }
}
