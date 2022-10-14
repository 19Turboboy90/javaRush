package com.JavaSyntaxPro.level_13.lecture_6.task_3;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
В методе main создаются объекты разных типов. В некоторых случаях тип элементов объекта можно опустить и просто использовать оператор diamond(<>).
Замени тип элементов объекта на оператор diamond там, где это возможно, не меняя левую часть выражений.
Порядок следования переменных не должен меняться.

Требования:
•	Замени тип элементов объекта на оператор diamond где это возможно.
•	Левую часть выражений изменять нельзя.
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        var exceptionsList = new ArrayList<Exception>();
        var filesStack = new Stack<File>();
    }
}
