package com.JavaSyntaxPro.level_13.lecture_6.task_4;

import java.util.ArrayList;

/*
В методе main создается список ArrayList<String>, присваивается переменной var strings и заполняется пятью элементами.
Нужно переписать код, не изменяя логику, используя двойные фигурные скобки.

Требования:
•	Список strings должен заполняться пятью элементами в двойных фигурных скобках.
 */
public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>() {{
            add("Так");
            add("тоже");
            add("можно");
            add("делать");
            add("!");
        }};
    }
}
