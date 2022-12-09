package com.JavaSyntaxPro.level_20.lecture_4.task_3;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/*
В методе initialize() устанавливается размер поля 3x3 и таймер на обновление поля каждую секунду (1 кадр в секунду).
Тебе нужно переопределить и реализовать метод onTurn(int), который должен посреди поля (x = 1, y = 1) выводить переменную step.
Если step четная, то закрашивать всё поле в зеленый цвет, иначе — в оранжевый.

Требования:
•	В классе TimerGame должен быть переопределен метод onTurn(int) родительского класса Game.
•	В методе onTurn(int) нужно выводить в центре поля переданное значение с помощью метода setCellNumber(int, int, int) .
•	Метод onTurn(int) должен закрашивать всё поле в зеленый цвет, если переданный аргумент — четное число.
•	Метод onTurn(int) должен закрашивать всё поле в оранжевый цвет, если переданный аргумент — нечетное число.
 */
public class TimerGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    @Override
    public void onTurn(int step) {
        setCellNumber(1, 1, step);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                setCellColor(i, j, step % 2 == 0 ? Color.GREEN : Color.ORANGE);
            }
        }
    }
}
