package com.JavaSyntaxPro.level_9.lecture_5.task_2;

/*
В классе Pair реализуй метод swap() так, чтобы он менял местами значения переменных x и y.
Можно использовать только операции:

Исключающее или.
Присваивание.
Исключающее или с присваиванием.
Не оставляй комментарии, не меняй остальной код.
Требования:
•	В классе Pair должен присутствовать метод swap().
•	В классе Pair в методе swap() используй только разрешенные операции.
•	Вызов метода swap() должен поменять значения полей x и y.
•	Не изменяй никакой код, кроме метода swap().
 */
public class Solution {
    public static void main(String[] args) {
        /* expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}
