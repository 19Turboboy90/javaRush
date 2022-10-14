package com.JavaSyntaxPro.level_13.lecture_6.task_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
В классе Solution есть поля number, string и метод main с объявленными в нем переменными.
Тебе нужно заменить объявления переменных на var, где это возможно. Порядок следования переменных не должен меняться.

Пример:
Scanner console = new Scanner(System.in);
Заменить на:
var console = new Scanner(System.in);

Требования:
•	Замени типы переменных на var, где это возможно.
•	Не изменяй правую часть выражени
 */
public class Solution {
    private int number = 54;
    private String string = "string";

    public static void main(String[] args) {
        var integer = 22;
        var string = "string";
        var array = new int[5];
        var strings = new ArrayList<String>();
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        var maxValue = Integer.valueOf(Integer.MAX_VALUE);
    }
}
