package com.javaCore.level_5.lecture_6.task_2;

/*
Упрости код — удали все конструкторы и вызовы конструкторов суперклассов, которые автоматически добавятся при компиляции.

Взаимосвязь между объектами классов NakedCat и NormalCat, SiamCat — Is-a: http://en.wikipedia.org/wiki/Is-a
Требования:
•	Класс NormalCat должен быть потомком класса NakedCat.
•	Класс SiamCat должен быть потомком класса NormalCat.
•	Упрости код класса NakedCat.
•	Упрости код класса NormalC
 */
public class Solution {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat {

    }

    public static class NormalCat extends NakedCat {
        public NormalCat() {

        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}
