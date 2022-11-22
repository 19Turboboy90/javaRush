package com.JavaSyntaxPro.level_17.lecture_7.task_3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
Можно ли, зная время в одном часовом поясе, определить время в другом?
Реши эту задачу в методе changeZone. Его параметры:

fromTime — известное время;
fromZone — временная зона, в которой известно время.
toZone — временная зона, в которой нужно определить время.
Требования:
•	Метод changeZone должен вернуть LocalDateTime во временной зоне toZone.
 */
public class Solution {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(fromDateTime, fromZone);
        ZonedDateTime withLocal = zonedDateTime.withZoneSameInstant(toZone);
        return withLocal.toLocalDateTime();
    }
}
