package com.javaCore.level_7.lecture_4.task_5;

public class IMF {
    private static IMF imf;

    public static IMF getFund() {
        synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}
