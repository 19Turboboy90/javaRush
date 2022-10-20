package com.JavaSyntaxPro.level_14.lecture_6.task_4;

/*
В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц,
а если передан последний месяц, возвращать первый. Используй методы values и ordinal.
Метод main не участвует в проверке.

Требования:
•	Реализуй метод public static Month getNextMonth(Month): он должен работать согласно условию.
•	В методе getNextMonth должны использоваться методы ordinal() и values().
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        Month lastMont = Month.values()[11];
        if (month == lastMont) {
            return Month.values()[0];
        } else {
            return Month.values()[month.ordinal() + 1];
        }

//        int ordinal = month == Month.DECEMBER ? 0 : month.ordinal() + 1;
//        return Month.values()[ordinal];
    }
}
