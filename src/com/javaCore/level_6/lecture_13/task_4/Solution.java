package com.javaCore.level_6.lecture_13.task_4;

/*
1. В методе printMsg присвой переменной t текущую нить.
2. В методе printMsg после всех действий поставь задержку в 1 миллисекунду.

Требования:
•	Метод printMsg должен получать текущую нить с помощью Thread.currentThread.
•	Метод printMsg должен должен усыплять нить на 1 миллисекунду.
•	Метод printMsg должен вызывать метод getName у текущей нити.
•	Метод main должен вызвать метод printMsg у объекта типа ThreadNamePrinter 5 раз.
•	Метод run должен вызвать метод printMsg 5 раз.
•	Метод printMsg у объекта типа ThreadNamePrinter суммарно должен быть вызван 10 раз.
 */
public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println("Name=" + name);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
