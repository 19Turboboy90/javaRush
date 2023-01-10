package com.javaCore.level_5.lecture_12.task_7;

public class Earth implements Planet {
    private static Earth instance = null;

    private Earth() {
    }

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
