package com.javaCore.level_5.lecture_9.task_1;

import java.util.HashMap;
import java.util.Map;

/*
¬ статическом блоке инициализируй labels п€тью различными парами ключ-значение.

“ребовани€:
Х	¬ классе Solution должен быть только один метод Ч main().
Х	¬ классе Solution должно быть объ€влено статическое поле labels типа Map.
Х	ѕоле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
Х	ћетод main должен выводить содержимое labels на экран.
 */
public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.1, "1.1");
        labels.put(1.2, "1.1");
        labels.put(1.3, "1.1");
        labels.put(1.4, "1.1");
        labels.put(1.5, "1.1");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
