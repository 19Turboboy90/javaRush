package com.JavaSyntaxPro.level_11.lecture_6.task_1;

import java.util.Arrays;

/*
Рассмотрим аналог памяти компьютера на примере массива строк. Если удалить некоторые элементы,
то в массиве появятся так называемые "дыры" - то есть элементы равные null. Метод executeDefragmentation(String[]),
принимающий массив строк, выполняет его "дефрагментацию", то есть перемещает все объекты в начало массива в таком же порядке,
передвинув все "дыры" (элементы равные null) в конец массива. В этой задаче тебе нужно реализовать метод executeDefragmentation(String[]).
Метод main() можешь использовать для проверки результата работы метода executeDefragmentation(String[]).

Требования:
•	В классе Memory должен быть метод public static void executeDefragmentation(String[]).
•	Реализуй метод executeDefragmentation(String[]) согласно условию.
 */
public class Memory {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] newArray = new String[array.length];
        int count = 0;
        for (String s : array) {
            if (s != null) {
                newArray[count++] = s;
            }
        }
        System.arraycopy(newArray, 0, array, 0, newArray.length);
    }
}

