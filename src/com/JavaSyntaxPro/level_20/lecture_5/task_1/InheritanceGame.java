package com.JavaSyntaxPro.level_20.lecture_5.task_1;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/*
Программа не компилируется. Сделай так, чтобы программа запускалась. Для этого тебе нужно наследовать класс InheritanceGame от класса Game.

Требования:
•	Работу метода initialize() не изменять.
•	Класс InheritanceGame должен наследоваться от класса Game.
 */
public class InheritanceGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(10,10);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                setCellColor(x, y, Color.ORANGE);
            }
        }
        setTurnTimer(500);
    }

    @Override
    public void onTurn(int step) {
        int x = getRandomNumber(10);
        int y = getRandomNumber(10);
        setCellValue(x, y, "\uD83D\uDE09");
    }
}
