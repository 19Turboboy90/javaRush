package com.JavaSyntaxPro.level_4.lecture_3;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.

Пример вывода:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна выводить прямоугольник высотой 5 и шириной 10, заполненный буквами 'Q'.
•	В программе необходимо использовать вложенные циклы while (цикл в цикле).
•	Вывод на экран должен происходить в цикле while.
 */
public class Task_4 {
    public static void main(String[] args) {
        int height = 0;
        while (height < 5) {
            int width = 0;
            while (width < 10) {
                System.out.print('Q');
                width++;
            }
            System.out.println();
            height++;
        }
    }
}
