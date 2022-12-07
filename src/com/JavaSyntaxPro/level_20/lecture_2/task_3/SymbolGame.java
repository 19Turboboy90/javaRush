package com.JavaSyntaxPro.level_20.lecture_2.task_3;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/*
А сейчас научимся раскрашивать клетки и выводить в них текст. Необходимо вывести слово JAVARUSH.
Для начала переопредели метод initialize() класса Game, в котором задай размер поля (8x3).
Далее с помощью метода setCellValueEx(int, int, Color, String) выведи слово в одну линию.
Этот метод раскрашивает клетку и выводит в ней текст по заданным координатам.
Каждая буква в линии должна быть в отдельной клетке. Координаты первой буквы: x = 0, y = 1. Цвет клетки — оранжевый (Color.ORANGE).
Требования:
•	В классе SymbolGame должен быть переопределен метод initialize().
•	В методе initialize() должен быть вызван метод setScreenSize(int, int) с аргументами 8 и 3.
•	В методе initialize() с помощью вызовов метода setCellValueEx(int, int, Color, String) выведи слово JAVARUSH,
каждую букву — в отдельной клетке (нужно вызвать метод для каждой буквы).
•	Метод setScreenSize(int, int) нужно вызвать до setCellValueEx(int, int, Color, String).
 */
public class SymbolGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(8, 3);
        setCellValueEx(0, 1, Color.ORANGE, "J");
        setCellValueEx(1, 1, Color.ORANGE, "A");
        setCellValueEx(2, 1, Color.ORANGE, "V");
        setCellValueEx(3, 1, Color.ORANGE, "A");
        setCellValueEx(4, 1, Color.ORANGE, "R");
        setCellValueEx(5, 1, Color.ORANGE, "U");
        setCellValueEx(6, 1, Color.ORANGE, "S");
        setCellValueEx(7, 1, Color.ORANGE, "H");
    }
}
