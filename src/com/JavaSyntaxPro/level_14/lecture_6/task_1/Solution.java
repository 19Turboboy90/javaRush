package com.JavaSyntaxPro.level_14.lecture_6.task_1;


/*
Нужно создать набор значений (enum) для времен года. Для этого нужно в отдельном файле создать enum Season и объявить в нем 4 значения.
В методе Solution выведи все перечисления с новой строки.

Требования:
•	В отдельном файле создай публичный enum Season и добавь значения: WINTER, SPRING, SUMMER, AUTUMN.
•	В классе Solution выведи в консоли каждый сезон с новой строки. Используй перечисления напрямую: например, Season.WINTER.
 */
public class Solution {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        System.out.println(winter);
        System.out.println(spring);
        System.out.println(summer);
        System.out.println(autumn);
    }
}
