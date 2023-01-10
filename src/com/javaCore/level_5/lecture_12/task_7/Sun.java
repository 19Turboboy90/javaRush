package com.javaCore.level_5.lecture_12.task_7;

public class Sun implements Planet {
    private static Sun instance = null;

    private Sun() {
    }

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
