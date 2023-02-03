package com.javaCore.level_7.lecture_4.task_4;

public class OurPresident {
    private static final OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }

    static {
        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }
}
