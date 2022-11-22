package com.JavaSyntaxPro.level_17.lecture_7.task_1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/*
Что общего у всех временных зон и Пекина?
Правильно! Они позволят нам потренироваться в использовании классов ZoneId и ZonedDateTime :)

Реализуй два метода:

В методе getSortedZones верни множество TreeSet всех временных зон;
в методе getBeijingTime верни текущую дату и время в Пекине (временная зона для него — "Asia/Shanghai").
Требования:
•	Метод getSortedZones должен вернуть множество всех временных зон.
•	Метод getBeijingDateTime должен вернуть текущую дату и время в Пекине.
 */
public class Solution {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        return new TreeSet<>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        return ZonedDateTime.now(zoneId);
    }
}
