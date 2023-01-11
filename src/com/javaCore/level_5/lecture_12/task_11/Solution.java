package com.javaCore.level_5.lecture_12.task_11;

/*
Программа выводит 0 9, а должна — 6 9. Найди одну(!) ошибку и исправь ее.
Используй дебаг. Для этого поставь breakpoint-ы (Ctrl+F8), потом зайди в меню Run -> Debug.
F9 - выполнение кода до следующего breakpoint-а.
F8 - переход к следующей строке кода.

Требования:
•	Программа должна выводить данные на экран.
•	Вывод на экран должен соответствовать условию задачи.
•	У метода initialize() в классе A должен быть правильный модификатор доступа.
•	Программа не должна считывать данные с клавиатуры.
 */
public class Solution {
    public static void main(String[] args) {
        new B(6);
    }

    public static class A {
        private int f1 = 7;

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        private void initialize() {
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) {
            super(f1);
            this.f1 += f1;
            initialize();
        }

        protected void initialize() {
            System.out.println(f1);
        }
    }
}
