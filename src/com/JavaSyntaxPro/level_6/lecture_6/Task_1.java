package com.JavaSyntaxPro.level_6.lecture_6;

/*
Создай треугольный массив, где значение каждого элемента — это сумма его индексов. Например:
array[7][3] = 7 + 3 = 10,
array[3][0] = 3 + 0 = 3.

Выведи массив на экран в следующем виде:
0
1 2
2 3 4
3 4 5 6
4 5 6 7 8
5 6 7 8 9 10
...
Числа в строке разделены пробелом.

Задать треугольный массив можно следующим образом:
int[][] array = new int[10][];
array[0] = new int[1];
array[1] = new int[2];
array[2] = new int[3];
...

Требования:
•	В методе main(String[]) двумерный массив result заполни числами согласно условию.
•	Выведенный текст должен содержать 10 строк.
•	Выведенные числа должны соответствовать условию.
 */
public class Task_1 {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        result[0] = new int[1];
        result[1] = new int[2];
        result[2] = new int[3];
        result[3] = new int[4];
        result[4] = new int[5];
        result[5] = new int[6];
        result[6] = new int[7];
        result[7] = new int[8];
        result[8] = new int[9];
        result[9] = new int[10];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
