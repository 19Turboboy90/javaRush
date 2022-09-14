package com.JavaSyntaxPro.level_7.lecture_5;
/*
Метод printSqrt(int[] array) должен выводить корень квадратный для каждого элемента переданного массива.
Но этого не происходит из-за конфликта имен переменных. Исправь имена переменных так, чтобы код компилировался.
В результате работы программа должна выводить в консоли соответствующую строку для каждого элемента массива.

Пример строки:
Корень квадратный для числа 64 равен 8.0

Требования:
•	Код должен компилироваться.
•	Метод printSqrt(int[] array) для каждого элемента массива должен выводить строку согласно условию.
 */
public class Task_1 {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String titleSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(titleSqrt + element + " равен " + elementSqrt);
        }
    }
}
