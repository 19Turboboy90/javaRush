package com.JavaSyntaxPro.level_20.lecture_5.task_2;

import com.javarush.engine.cell.Color;

public class FillOrangeGame extends FillGame {
    @Override
    public void fill() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                setCellColor(x, y, Color.ORANGE);
            }
        }
    }
}
