package com.JavaSyntaxPro.level_20.lecture_2.task_1;

import com.javarush.engine.cell.Game;
/*

Чтобы запустить игру, создай класс FirstGame и унаследуй его от класса Game. Также переопредели метод "игрового движка" — initialize().
Попробуй запустить на выполнение класс FirstGame и посмотри, что получилось.
Требования:
Должен быть создан класс FirstGame.
Класс FirstGame должен быть публичным.
Класс FirstGame должен быть наследником класса Game.
В классе FirstGame должен быть переопределен метод initialize() родительского класса Game.
В классе FirstGame должен быть импорт класса com.javarush.engine.cell.Game
 */
public class FirstGame extends Game {
    @Override
    public void initialize() {
        super.initialize();
    }
}
