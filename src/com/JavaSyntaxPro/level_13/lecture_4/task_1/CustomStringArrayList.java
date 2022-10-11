package com.JavaSyntaxPro.level_13.lecture_4.task_1;

import java.util.Arrays;

public class CustomStringArrayList {
    public int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = capacity + capacity / 2;
        String[] newArray = new String[capacity];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }
}
