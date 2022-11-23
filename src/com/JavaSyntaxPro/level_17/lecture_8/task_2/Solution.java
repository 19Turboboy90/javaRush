package com.JavaSyntaxPro.level_17.lecture_8.task_2;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
В методе main выведи на экран переменную zonedDateTime в таком виде:
4 9.3.19 06:03:07.319180500 Europe/Kiev

Где:

4 — номер дня недели, т.е. четверг;
9 — день месяца;
3 — месяц;
19 — год;
06 — часы;
03 — минуты;
07 — секунды;
319180500 — наносекунды;
Europe/Kiev — временная зона.
Требования:
•	Метод main должен вывести в консоли значение переменной zonedDateTime согласно шаблону.
 */
public class Solution {
    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        System.out.println(dtf.format(zonedDateTime));
    }
}
