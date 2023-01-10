package com.javaCore.level_5.lecture_12.task_7;

public class Moon implements Planet {
    private static Moon instance = null;

    private Moon() {
    }

    public static Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
