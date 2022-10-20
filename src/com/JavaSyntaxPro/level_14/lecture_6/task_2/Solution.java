package com.JavaSyntaxPro.level_14.lecture_6.task_2;

import java.util.Arrays;

/*
В enum JavarushQuest хранится список квестов. Твоя задача — получить массив всех элементов в методе main (используй метод values())
и вывести порядковый номер каждого из них (используй метод ordinal()) с новой строки.

Требования:
•	В методе main получи список всех констант из enum JavarushQuest с помощью метода values().
•	В методе main выведи порядковый номер каждого элемента с новой строки, используя метод ordinal().
 */
public class Solution {
    public static void main(String[] args) {
        for (JavarushQuest javarushQuest : JavarushQuest.values()) {
            int ordinal = javarushQuest.ordinal();
            System.out.println(ordinal);
        }

        Arrays.stream(JavarushQuest.values()).mapToInt(Enum::ordinal).forEach(System.out::println);
    }
}
