package com.javaCore.level_5.lecture_9.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В этой задаче тебе нужно:
В статическом блоке считать с консоли А и В — две переменные с типом int.
Обработать IOException в блоке catch.
Закрыть поток ввода методом close().
Требования:
•	Поле A должно быть публичным и статическим.
•	Поле B должно быть публичным и статическим.
•	Программа должна считывать данные с клавиатуры в статическом блоке.
•	Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
•	Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.
 */
public class Solution {
    public static int A;
    public static int B;

    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
