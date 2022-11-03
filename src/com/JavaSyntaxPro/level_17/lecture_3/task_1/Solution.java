package com.JavaSyntaxPro.level_17.lecture_3.task_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
Проинициализируй переменную birthDate объектом GregorianCalendar с датой своего рождения.
Реализуй метод getDayOfWeek(Calendar calendar), чтобы он возвращал русское название дня недели аргумента calendar.
Помни, что в григорианском календаре неделя начинается с воскресенья.

Требования:
•	Переменная birthDate должна быть проинициализирована при объявлении.
•	Метод getDayOfWeek(Calendar calendar) должен возвращать день недели аргумента calendar.
 */
public class Solution {
    static Calendar birthDate = new GregorianCalendar(1990, Calendar.NOVEMBER, 28);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                return "Воскресенье";
            case 2:
                return "Понедельник";
            case 3:
                return "Вторник";
            case 4:
                return "Среда";
            case 5:
                return "Четверг";
            case 6:
                return "Пятница";
            case 7:
                return "Суббота";
            default:
                return "ничего не найдено";
        }
    }
}