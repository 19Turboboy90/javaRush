package com.JavaSyntaxPro.level_17.lecture_7.task_2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
В методе main присвой значение переменной globalTime, используя переменные localDateTime и zoneId.

Требования:
•	Метод main должен присвоить значение переменной globalTime, используя переменные localDateTime и zoneId.
 */
public class Solution {
    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        globalTime = localDateTime.atZone(zoneId);
        System.out.println(globalTime);
    }
}
