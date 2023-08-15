package com.game.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                setCellColor(x, y, Color.PURPLE);
            }
        }
    }

    private void createNewNumber() {
        boolean isFlag = false;
        do {
            int x = getRandomNumber(SIDE);
            int y = getRandomNumber(SIDE);
            if (gameField[x][y] == 0){
                gameField[x][y]  = getRandomNumber(10) < 9 ? 2 : 4;
                isFlag = true;
            }
        } while (!isFlag);
    }
}
