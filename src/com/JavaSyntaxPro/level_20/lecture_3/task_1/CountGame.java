package com.JavaSyntaxPro.level_20.lecture_3.task_1;
/*
Перед тобой поле 10x10, в котором в случайном порядке расставлены клетки зеленого цвета, а в них — числа.
Чтобы это увидеть, можешь запустить программу.

Твоя задача — реализовать метод showResult(), который должен:

Подсчитать сумму всех чисел в зеленых клетках и вывести в консоли: Сумма всех чисел = [сумма].
Подсчитать количество всех зеленых клеток и вывести в консоли: Количество зеленых клеток = [количество]
Мы написали методы printSum(int) и printCountOfGreenCells(int) которые выводят в консоли соответствующий текст.

Подсказка:
Чтобы узнать, какое число находится в конкретной клетке, нужно использовать метод getCellNumber(int, int), а чтобы узнать цвет клетки,
воспользуйся методом getCellColor(int, int) класса Game.
Чтобы пройтись по всему полю, можешь воспользоваться вложенным циклом.

Требования:
•	В классе CountGame должен присутствовать публичный метод showResult с типом возвращаемого значения void.
•	Метод showResult должен правильно подсчитывать и выводить в консоли сумму всех чисел и количество зеленых клеток.
 */

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class CountGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(10, 10);
        showGrid(false);
        for (int j = 0; j < 50; j++) {
            int x = getRandomNumber(10);
            int y = getRandomNumber(10);
            setCellColor(x, y, Color.GREEN);
            setCellNumber(x, y, getRandomNumber(100));
        }
        showResult();
    }

    public void showResult() {
        int sumNumber = 0;
        int countColor = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (getCellColor(i, j) == Color.GREEN) {
                    countColor++;
                    sumNumber += getCellNumber(i, j);
                }
            }
        }
        printSum(sumNumber);
        printCountOfGreenCells(countColor);
    }

    private void printSum(int sum) {
        System.out.println("Сумма всех чисел = " + sum);
    }

    private void printCountOfGreenCells(int count) {
        System.out.println("Количество зеленых клеток = " + count);
    }
}
