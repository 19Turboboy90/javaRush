package com.JavaSyntaxPro.level_6.lecture_7;

import java.util.Arrays;

/*
Реализуй метод main(String[]), который выводит массивы strings и ints в консоли с помощью метода Arrays.toString().

Требования:
•	В классе Solution должна быть публичная статическая переменная strings типа String[].
•	В классе Solution должна быть публичная статическая переменная ints типа int[].
•	В методе main(String[]) выведи в консоли массив strings с помощью метода Arrays.toString(Object[]).
•	В методе main(String[]) выведи в консоли массив ints с помощью метода Arrays.toString(int[]).
 */
public class Task_1 {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
