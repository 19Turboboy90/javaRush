package com.JavaSyntaxPro.level_13.lecture_5.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/*
В методе main найди и удали язык программирования Pascal из списка programmingLanguages.

Требования:
•	В методе main должен удаляться Pascal из списка programmingLanguages.
 */
public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
//        IntStream.range(0, programmingLanguages.size()).filter(i -> programmingLanguages.get(i).equals("Pascal")).forEach(list -> programmingLanguages.remove(list));

        programmingLanguages.removeIf(list -> list.equals("Pascal"));
        programmingLanguages.forEach(System.out::println);
    }
}
