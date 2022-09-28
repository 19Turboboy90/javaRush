package com.game.minesweeperGame;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

//--module-path ./lib/javafx-sdk-16/lib --add-modules=javafx.controls,javafx.fxml,javafx.base
public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private int countMinesOnField;
    private final GameObject[][] gameField = new GameObject[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                boolean isMine = getRandomNumber(10) < 1;
                countMinesOnField = isMine ? countMinesOnField + 1 : countMinesOnField;
                gameField[i][j] = new GameObject(j, i, isMine);
                setCellColor(j, i, Color.ORANGE);
            }
        }
    }
}
