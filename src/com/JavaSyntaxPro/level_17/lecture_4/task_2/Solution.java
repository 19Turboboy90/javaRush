package com.JavaSyntaxPro.level_17.lecture_4.task_2;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

/*
Реализуй метод getDayOfWeek(LocalDate date), чтобы он возвращал русское название дня недели аргумента date.
Воспользуйся методами getDayOfWeek и getDisplayName.

Пример параметров метода getDisplayName, чтобы получить русское название дня недели:

getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"))
Требования:
•	Метод getDayOfWeek(LocalDate date) должен возвращать день недели на русском.
•	Чтобы получить название дня недели, нужно использовать методы getDayOfWeek и getDisplayName.
 */
public class Solution {
    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
       return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
    }
}
