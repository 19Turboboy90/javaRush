package com.javaCore.level_6.lecture_5.task_4;
/*
1. Разберись, что делает программа.
2. Нужно сделать так, чтобы все мыши ели одновременно.
3. Подумай, какой метод позволяет альфа-самцу мыши есть первым, и почему остальные мыши ждут.
4. Удали вызов этого метода.

Требования:
•	Вывод программы должен показывать, что сначала все мыши начали есть, а потом все закончили.
•	Метод join не должен вызываться у объектов типа Mouse.
•	Программа должна создавать 3 объекта типа Mouse.
•	Методы, которые отвечают за вывод в консоль, не изменять.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("#1");
        Mouse mouse1 = new Mouse("#2");
        Mouse mouse2 = new Mouse("#3");
    }

    private static void eat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " is starting to eat");
            eat();
            System.out.println(getName() + " has finished eating");
        }
    }
}
