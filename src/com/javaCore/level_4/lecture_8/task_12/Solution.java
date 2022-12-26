package com.javaCore.level_4.lecture_8.task_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.
Требования:
•	Программа должна считывать с клавиатуры 2 строки.
•	Программа должна выводить данные на экран.
•	Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        System.out.println(NOD(Integer.parseInt(num1), Integer.parseInt(num2)));
    }

    public static int NOD(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return num1 + num2;
        }
        if (num1 > num2) {
            return NOD(num1 - num2, num2);
        } else {
            return NOD(num1, num2 - num1);
        }
    }
}
