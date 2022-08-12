package com.JavaSyntaxPro.level_4.lecture_4;

/*
Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.

Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.

Требования:
•	Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
•	В программе необходимо использовать цикл while.
•	В программе необходимо использовать оператор continue.
 */
public class Task_2 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            sum = sum + number;
            number++;
        }
        System.out.println(sum);
    }
}
