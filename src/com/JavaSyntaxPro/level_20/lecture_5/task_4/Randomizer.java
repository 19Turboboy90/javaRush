package com.JavaSyntaxPro.level_20.lecture_5.task_4;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/*
Метод onTurn(int) вызывается каждую секунду. Тебе нужно:

получить случайное число (от 0 до 100 не включительно) с помощью метода getRandomNumber(int) класса Game;
отобразить это число с помощью метода setCellNumber(int, int, int) в клетке с координатами x = 1, y = 1 .
Требования:
•	Реализуй метод onTurn(int) согласно условию.
 */
public class Randomizer extends Game {
    @Override
    public void initialize() {
        setScreenSize(3, 3);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
        setTurnTimer(1000);
    }

    @Override
    public void onTurn(int step) {
        int number = getRandomNumber(100);
        setCellNumber(1, 1, number);
    }
}
