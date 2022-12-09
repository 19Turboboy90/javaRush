package com.JavaSyntaxPro.level_20.lecture_3.task_2;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/*
Поработаем с методом setCellColor(int, int, Color), который будет разукрашивать клетку по переданным координатам.
Приступим к отрисовке радуги. Необходимо создать игровое поле размером 10x7 в методе initialize() и разукрасить
каждую строку разными цветами, используя метод setCellColor(int, int, Color). Порядок сверху вниз должен быть следующим:
Color.RED
Color.ORANGE
Color.YELLOW
Color.GREEN
Color.BLUE
Color.INDIGO
Color.VIOLET
Требования:
•	В классе RainbowGame должен быть переопределен метод initialize() родительского класса Game.
•	В методе initialize() должен быть вызван метод setScreenSize(int, int) с аргументами 10 и 7.
•	В методе initialize() с помощью метода setCellColor(int, int, Color) разукрась игровое поле в радужные цвета.
 */
public class RainbowGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(10, 7);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                switch (j) {
                    case 0:
                        setCellColor(i, j, Color.RED);
                        break;
                    case 1:
                        setCellColor(i, j, Color.ORANGE);
                        break;
                    case 2:
                        setCellColor(i, j, Color.YELLOW);
                        break;
                    case 3:
                        setCellColor(i, j, Color.GREEN);
                        break;
                    case 4:
                        setCellColor(i, j, Color.BLUE);
                        break;
                    case 5:
                        setCellColor(i, j, Color.INDIGO);
                        break;
                    default:
                        setCellColor(i, j, Color.VIOLET);
                        break;
                }
            }
        }
    }
//    Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET};
//        for (int x = 0; x < 10; x++) {
//        for (int y = 0; y < 7; y++) {
//            setCellColor(x, y, colors[y]);
//        }
//    }
}
