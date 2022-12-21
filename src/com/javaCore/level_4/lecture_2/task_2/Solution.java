package com.javaCore.level_4.lecture_2.task_2;

/*
Исправь строчку 'Cat cat = new Cat();' так, чтобы программа вывела "Bingo!".

Требования:
•	Класс Cat должен реализовывать интерфейс CanMove.
•	Класс Cat должен быть родителем (родительским классом) класса TomCat.
•	В переменной cat должен храниться объект, который будет одновременно являться и CanMove, и Cat, и Tomcat.
•	Программа должна выводить на экран: "Bingo!".
 */
public class Solution {
    public static void main(String[] args) {
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof CanMove;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) System.out.println("Bingo!");
    }

    interface CanMove {
    }

    static class Cat implements CanMove {
    }

    static class TomCat extends Cat {

    }
}
