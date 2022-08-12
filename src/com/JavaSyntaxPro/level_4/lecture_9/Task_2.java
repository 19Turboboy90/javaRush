package com.JavaSyntaxPro.level_4.lecture_9;

import java.util.Scanner;

/*
Давай разделим ящик колы на кабинет программистов. Для этого напишем программу, в которой:

Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике. Второе - количество людей в кабинете.
Вывести на экран результат деления первого числа на второе.
Результатом должно быть вещественное число.
Пример ввода:
3
2

Пример вывода:
1.5

Требования:
•	Программа должна считывать целые числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран вещественное число - результат деления первого введенного целого числа на второе.
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        double result = firstNumber * 1. / secondNumber;
        System.out.println(result);
    }
}
