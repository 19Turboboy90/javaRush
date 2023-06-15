package com.javaMultithreading.level_1.lecture_5.task_3;
import java.util.Date;
import java.util.Objects;

/*
Исправьте ошибки реализаций методов equals и hashCode для класса Solution.

Требования:
•	Хешкоды одинаковых объектов должны быть равны.
•	Метод equals должен проверять равен ли переданный объект равен текущему (сравнение через ==).
•	Метод equals должен проверять является ли переданный объект объектом класса Solution.
•	Метод equals должен проверять значения всех полей у переданного объекта и текущего (учти что некоторые
из них могут быть равны null).
•	Должно быть обеспечено корректное поведение HashSet с типом элементов Solution.
•	В классе Solution должен быть реализован метод hashCode.
 */
public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;
        Solution solution1 = (Solution) o;
        return anInt == solution1.anInt && Double.compare(solution1.aDouble, aDouble) == 0 && Objects.equals(string, solution1.string) && Objects.equals(date, solution1.date) && Objects.equals(solution, solution1.solution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anInt, string, aDouble, date, solution);
    }

    public static void main(String[] args) {

    }
}
