package com.JavaSyntaxPro.level_19.lecture_1.task_2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    }
}
