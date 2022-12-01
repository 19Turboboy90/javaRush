package com.JavaSyntaxPro.level_19.lecture_1.task_3;

import java.util.Comparator;

public class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor o1, JavaRushMentor o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
