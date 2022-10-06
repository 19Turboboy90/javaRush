package com.JavaSyntaxPro.level_12.lecture_2.task_1;

/*
Программа выводит на экран основные факты о Солнечной системе.
Перепиши код так, чтобы в выводе использовались все переменные класса SolarSystem, но результат работы программы при этом не изменился.

Ожидаемый вывод:
Человечество живет в Солнечной системе.
Ее возраст около 4568200000 лет.
В Солнечной системе 8 известных планет.
Как и большинство звездных систем, состоит из 1 звезды.
Звезды по имени Солнце.
Расстояние к центру галактики составляет 27170 световых лет.
Каждый обитатель Солнечной системы должен знать эту информацию!

Требования:
•	Программа должна выводить на экран текст, указанный в примере.
•	При выводе текста нужно использовать все переменные класса SolarSystem.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + SolarSystem.age + " лет.");
        System.out.println("В Солнечной системе " + SolarSystem.planetsCount + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + SolarSystem.starsCount + "  звезды.");
        System.out.println("Звезды по имени " + SolarSystem.starName + ".");
        System.out.println("Расстояние к центру галактики составляет " + SolarSystem.galacticCenterDistance + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");
    }
}
