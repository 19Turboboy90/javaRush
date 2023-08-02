package com.game.minesweeperGame;

import com.javarush.engine.cell.*;

/**
 * //--module-path ./lib/javafx-sdk-16/lib --add-modules=javafx.controls,javafx.fxml,javafx.base
 */
public class MinesweeperGame extends Game {
    private static final int SIDE = 9;

    private int countMinesOnField;

    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }


    private void createGame() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                int countMine = getRandomNumber(10);
                if (countMine == 1) {
                    gameField[i][j] = new GameObject(j, i, true);
                    countMinesOnField++;
                } else {
                    gameField[i][j] = new GameObject(j, i, false);
                }
                setCellColor(i, j, Color.ORANGE);
            }
        }
    }
}
