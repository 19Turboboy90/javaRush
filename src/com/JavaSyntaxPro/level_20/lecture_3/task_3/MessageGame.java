package com.JavaSyntaxPro.level_20.lecture_3.task_3;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/*
Реализуем отображение диалогового окна с текстом. По нажатию левой кнопки мыши выводим текст "Вы выиграли" зеленым цветом,
а по нажатию правой кнопки мыши — "Вы проиграли" красным цветом.

Чтобы работать с нажатиями кнопок мыши, нужно переопределить методы onMouseLeftClick(int, int) и onMouseRightClick(int, int).
Для вывода диалогового окна используй метод showMessageDialog(Color, String, Color, int) класса Game. Цвет фона может быть любой.

Требования:
•	В классе MessageGame должен быть переопределен метод onMouseLeftClick(int, int) родительского класса Game.
•	В классе MessageGame должен быть переопределен метод onMouseRightClick(int, int) родительского класса Game.
•	В методе onMouseLeftClick(int, int) должно отображаться диалоговое окно согласно условию.
•	В методе onMouseRightClick(int, int) должно отображаться диалоговое окно согласно условию.
•	Метод showMessageDialog(Color, String, Color, int) класса Game не должен быть переопределен в классе MessageGame.
 */
public class MessageGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(3, 3);
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        showMessageDialog(Color.YELLOW,"Вы выиграли", Color.GREEN, 25);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        showMessageDialog(Color.RED,"Вы проиграли", Color.RED, 25);
    }
}

