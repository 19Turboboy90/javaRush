package com.javaCore.level_3.lecture_11.task_9;

import java.awt.*;

/*
Реализуй интерфейс Animal в классе Fox.
Поменяй код так, чтобы в классе Fox был только один метод - getName.
Учти, что методы удалять нельзя.

Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В классе Fox должен быть реализован только один метод — getName.
•	Интерфейс Animal изменять нельзя.
•	Дополнительные классы или интерфейсы создавать нельзя.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
