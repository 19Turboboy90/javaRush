package com.javaCore.level_6.lecture_13.task_9;

/*
Разберись, как работает программа.
По образу и подобию CountdownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number.

Требования:
•	Класс CountUpRunnable должен реализовывать интерфейс Runnable.
•	Класс CountUpRunnable должен иметь публичный метод run без параметров.
•	Метод run класса CountUpRunnable должен работать примерно 2,5 секунды.
•	Метод run класса CountUpRunnable должен каждые полсекунды выводить имя потока, двоеточие и значение счетчика от 1 до 5 (например: "Увеличиваем: 1").
•	Метод run класса CountUpRunnable должен вызывать Thread.sleep(500).
 */
public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 1; i <= number; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
