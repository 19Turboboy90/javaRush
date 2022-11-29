package com.JavaSyntaxPro.level_18.lecture_8.task_3;

public interface Vehicle {
    void move();

    default void start() {
        System.out.println("Начинаю движение.");
    }

    default void stop() {
        System.out.println("Останавливаюсь.");
    }
}
