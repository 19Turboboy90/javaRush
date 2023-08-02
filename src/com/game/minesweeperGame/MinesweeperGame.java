package com.game.minesweeperGame;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[i][j] = new GameObject(j, i, isMine);
                setCellColor(i, j, Color.ORANGE);
            }
        }
        countMineNeighbors();
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        Arrays.stream(gameField).flatMap(Arrays::stream).filter(object -> !object.isMine).forEach(object -> {
            for (GameObject gameObject : getNeighbors(object)) {
                if (gameObject.isMine) {
                    object.countMineNeighbors++;
                }
            }
        });
    }
}
