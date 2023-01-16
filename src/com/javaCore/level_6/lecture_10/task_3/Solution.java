package com.javaCore.level_6.lecture_10.task_3;

/*
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().

Требования:
•	Класс TestThread должен быть унаследован от Thread.
•	Класс TestThread должен иметь public void метод run.
•	Метод main должен создавать объект типа TestThread.
•	Метод main должен вызывать метод start у объекта типа TestThread.
•	Метод main должен вызывать метод interrupt у объекта типа TestThread.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    public static class TestThread extends Thread {
        @Override
        public void run() {

        }
    }
}
