package com.JavaSyntaxPro.level_13.lecture_5.task_3;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.stream.IntStream;

/*
Задача простая: нужно разобрать пирамиду из бокалов, в чем нам поможет метод removeGlassesReverse.
Этот метод должен снимать каждый ряд, начиная сверху (с конца списка). Тебе нужно реализовать этот метод.
В тестировании тебе поможет метод main.
Попробуй запустить программу и посмотреть на вывод.

Требования:
•	В классе Solution должен быть публичный статический метод removeGlassesReverse(ArrayList<String>).
•	Метод removeGlassesReverse должен удалить все элементы из переданного списка, начиная с конца (используй метод remove(int) у списка).
 */
public class Solution {
    private static ArrayList<String> initList() {
        String glassTop = "       🍷       ";
        String glassSecond = "      🍷🍷      ";
        String glassThird = "     🍷🍷🍷     ";
        String glassFourth = "    🍷🍷🍷🍷    ";
        String glassFifth = "   🍷🍷🍷🍷🍷   ";
        String glassSixth = "  🍷🍷🍷🍷🍷🍷  ";
        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String glassEighth = "🍷🍷🍷🍷🍷🍷🍷🍷";
        ArrayList<String> list = new ArrayList<>();
        list.add(glassEighth);
        list.add(glassSeventh);
        list.add(glassSixth);
        list.add(glassFifth);
        list.add(glassFourth);
        list.add(glassThird);
        list.add(glassSecond);
        list.add(glassTop);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for (int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("Начинаем разбирать пирамиду...");

//        while (glasses.size() != 0) {
//            glasses.remove(glasses.size() - 1);
//        }

//        for (int i = glasses.size() - 1; i >= 0; i--) {
//            glasses.remove(i);
//        }

        IntStream.iterate(glasses.size() - 1, i -> i >= 0, i -> i - 1).forEach(glasses::remove);

        if (glasses.size() == 0) {
            System.out.println("Пирамида разобрана!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);

        removeGlassesReverse(glasses);
        print(glasses);
    }
}
