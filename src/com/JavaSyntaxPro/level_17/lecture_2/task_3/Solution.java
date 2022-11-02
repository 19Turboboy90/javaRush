package com.JavaSyntaxPro.level_17.lecture_2.task_3;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Исправь ошибку, чтобы программа вывела "2010-01-06".
Инициализацию переменной date не меняй.

Требования:
•	Программа должна вывести: 2010-01-06
•	Должна быть исправлена одна ошибка
 */
public class Solution {
    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }
}