package com.JavaSyntaxPro.level_17.lecture_8.task_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
В методе main выведи на экран переменную localDateTime в таком виде:
19.03.2020г. 5ч.4мин

Требования:
•	Метод main должен вывести в консоли значение переменной localDateTime согласно шаблону.
 */
public class Solution {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy'г. 'H'ч'.m'мин'");
        System.out.println(dtf.format(localDateTime));
    }
}
