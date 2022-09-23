package com.JavaSyntaxPro.level_9.lecture_6;

/*
Реализуй методы:

setFlag(int number, int flagPos) — устанавливает значение "1" биту под индексом flagPos числа number и возвращает новое значение.
resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos числа number и возвращает новое значение.
checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos числа number и возвращает true, если значение "1" и false, если "0".
Требования:
•	Реализуй метод setFlag(int, int) согласно условию.
•	Реализуй метод resetFlag(int, int) согласно условию.
•	Реализуй метод checkFlag(int, int) согласно условию.
 */
public class Task_2 {
    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}
