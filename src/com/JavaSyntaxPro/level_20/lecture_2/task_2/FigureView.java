package com.JavaSyntaxPro.level_20.lecture_2.task_2;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/*
Попробуем отрисовать простую фигуру на игровом поле. Тебе нужно переопределить метод initialize() класса Game,
и в этом методе задать размер игрового поля (5х7) с помощью метода setScreenSize(int, int). Также нужно вызвать метод showShip(),
который отрисовывает корабль.
Требования:
•	В классе FigureView должен быть переопределен метод initialize().
•	В методе initialize() должен быть вызван метод setScreenSize(int, int) с аргументами 5 и 7.
•	В методе initialize() должен быть вызван метод showShip().
•	Метод showShip() должен вызываться после setScreenSize(int, int).
•	Работу метода showShip() не изменять.
•	Поле SHIP класса FigureView не изменять.
 */
public class FigureView extends Game {
    public static final int[][] SHIP = new int[][]{
            {0, 0, 7, 0, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {7, 7, 7, 7, 7},
            {7, 0, 7, 0, 7},
    };

    @Override
    public void initialize() {
        setScreenSize(5,7);
        showShip();
    }

    public void showShip() {
        for (int i = 0; i < SHIP.length; i++) {
            for (int j = 0; j < SHIP[0].length; j++) {
                setCellColor(j, i, Color.values()[SHIP[i][j]]);
            }
        }
    }
}
