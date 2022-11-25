package com.JavaSyntaxPro.level_18.lecture_5.task_1;

import java.util.Arrays;
import java.util.Collections;

/*
В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
В классе MinMaxUtil создай публичные статические методы min() и max(), которые в качестве аргументов принимают целочисленные (тип int)
значения и возвращают минимальное и максимальное из них соответственно.

Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
Все аргументы методов должны быть типа int.

Требования:
•	В классе MinMaxUtil должно быть создано 4 перегруженных метода min() в соответствии с условием задания.
•	В классе MinMaxUtil должно быть создано 4 перегруженных метода max() в соответствии с условием задания.
•	Методы min() должны возвращать минимальное из переданных чисел.
•	Методы max() должны возвращать максимальное из переданных чисел.
 */
public class MinMaxUtil {
    public static int max(int number1, int number2) {
        return Math.max(number1, number2);
    }

    public static int max(int number1, int number2, int number3) {
        return Collections.max(Arrays.asList(number1, number2, number3));
    }

    public static int max(int number1, int number2, int number3, int number4) {
        return Collections.max(Arrays.asList(number1, number2, number3, number4));
    }

    public static int max(int number1, int number2, int number3, int number4, int number5) {
        return Collections.max(Arrays.asList(number1, number2, number3, number4, number5));
    }

    public static int min(int number1, int number2) {
        return Math.min(number1, number2);
    }

    public static int min(int number1, int number2, int number3) {
        return Collections.min(Arrays.asList(number1, number2, number3));
    }

    public static int min(int number1, int number2, int number3, int number4) {
        return Collections.min(Arrays.asList(number1, number2, number3, number4));
    }

    public static int min(int number1, int number2, int number3, int number4, int number5) {
        return Collections.min(Arrays.asList(number1, number2, number3, number4, number5));
    }
}
