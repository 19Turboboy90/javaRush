package com.JavaSyntaxPro.level_20.lecture_4.task_1;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/*
Ознакомимся с методами, которые вызываются при нажатии кнопок мыши и с их помощью разукрасим поле.

В методе initialize() задай размеры поля 5х5 и закрась каждую клетку белым цветом.
Переопредели метод onMouseLeftClick(int, int) класса Game, чтобы он разукрашивал зеленым цветом (Color.GREEN) клетку по полученным координатам.
Переопредели метод onMouseRightClick(int, int) класса Game, чтобы он разукрашивал оранжевым цветом (Color.ORANGE) клетку по полученным координатам.
Требования:
•	Метод initialize() должен задать размер поля 5x5 и зарисовать каждую клетку белым цветом.
•	В методе onMouseLeftClick(int, int) клетка по переданным координатам должна закрашиваться в зеленый цвет.
•	В методе onMouseRightClick(int, int) клетка по переданным координатам должна закрашиваться в оранжевый цвет.
 */
public class PaintGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(5, 5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                setCellColor(i, j, Color.WHITE);
            }
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        setCellColor(x, y,Color.GREEN);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        setCellColor(x, y,Color.ORANGE);
    }
}
