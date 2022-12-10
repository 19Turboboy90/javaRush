package com.JavaSyntaxPro.level_20.lecture_5.task_2;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/*
Перед тобой класс FillGame. В методе initialize() задается поле размером 5x5 и вызывается метод fill(),
который закрашивает все клетки в белый цвет. Тебе нужно в классе FillOrangeGame переопределить метод fill(),
который должен будет закрашивать всё поле в оранжевый цвет.

Требования:
•	Метод initialize() класса FillGame не изменять.
•	В классе FillGame метод fill() должен закрашивать поле в белый цвет.
•	Класс FillOrangeGame должен быть наследником класса FillGame.
•	В классе FillOrangeGame переопределенный метод fill() класса FillGame должен закрашивать всё поле в оранжевый цвет.
 */
public class FillGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(5, 5);
        fill();
    }

    public void fill() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }
}
