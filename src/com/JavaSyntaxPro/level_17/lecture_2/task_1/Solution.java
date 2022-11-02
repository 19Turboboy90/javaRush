package com.JavaSyntaxPro.level_17.lecture_2.task_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Проинициализируй переменную birthDate объектом Date с датой своего рождения.
Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название дня недели аргумента date.

Требования:
•	Переменная birthDate должна быть проинициализирована при объявлении.
•	Метод getDayOfWeek(Date date) должен возвращать русское название дня недели.
 */
public class Solution {
    static Date birthDate = new Date(90, 11, 28);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("EEEE", new Locale("ru"));
        return format.format(date);
    }
}