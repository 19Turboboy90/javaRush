package com.JavaSyntaxPro.level_20.lecture_4.task_2;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Key;

/*
Пришло время реализовать методы, которые вызываются при нажатии клавиш. Это onKeyPress(Key) и onKeyReleased(Key).
При запуске игры поле состоит из 3x3 клеток.

Тебе нужно сделать так, чтобы:
при нажатии клавиши Key.LEFT закрашивались три левые клетки;
при нажатии Key.RIGHT закрашивались три правые клетки;
при нажатии Key.UP — три верхние;
при нажатии Key.DOWN — три нижние.
Клетки должны закрашиваться в зеленый цвет.
При отпускании любой из этих четырех клавиш все клетки должны закрашиваться в белый.
Требования:
•	В классе KeyboardGame должен быть переопределен метод onKeyPress(Key) родительского класса Game.
•	В классе KeyboardGame должен быть переопределен метод onKeyReleased(Key) родительского класса Game.
•	При нажатии клавиши Key.LEFT должны быть закрашены три левые клетки в зеленый цвет.
•	При нажатии клавиши Key.RIGHT должны быть закрашены три правые клетки в зеленый цвет.
•	При нажатии клавиши Key.UP должны быть закрашены три верхние клетки в зеленый цвет.
•	При нажатии клавиши Key.DOWN должны быть закрашены три нижние клетки в зеленый цвет.
•	При отпускании клавиш Key.LEFT, Key.RIGHT, Key.UP или Key.DOWN все клетки должны быть закрашены в белый.
 */
public class KeyboardGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onKeyPress(Key key) {
        switch (key) {
            case LEFT:
                setCellColor(0, 0, Color.GREEN);
                setCellColor(0, 1, Color.GREEN);
                setCellColor(0, 2, Color.GREEN);
                break;
            case RIGHT:
                setCellColor(2, 0, Color.GREEN);
                setCellColor(2, 1, Color.GREEN);
                setCellColor(2, 2, Color.GREEN);
                break;
            case UP:
                setCellColor(0, 0, Color.GREEN);
                setCellColor(1, 0, Color.GREEN);
                setCellColor(2, 0, Color.GREEN);
                break;
            default:
                setCellColor(0, 2, Color.GREEN);
                setCellColor(1, 2, Color.GREEN);
                setCellColor(2, 2, Color.GREEN);
                break;
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key == Key.LEFT || key == Key.RIGHT || key == Key.UP || key == Key.DOWN) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    setCellColor(x, y, Color.WHITE);
                }
            }
        }
    }
}
