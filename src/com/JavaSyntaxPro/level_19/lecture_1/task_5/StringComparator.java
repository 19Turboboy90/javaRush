package com.JavaSyntaxPro.level_19.lecture_1.task_5;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return -1;
        } else if (o1.length() > o2.length()) {
            return 1;
        } else {
            return 0;
        }
    }
}
