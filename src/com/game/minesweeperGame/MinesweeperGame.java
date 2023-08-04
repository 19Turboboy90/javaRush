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
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private int countMinesOnField;
    private boolean isGameStopped;
    private int countFlags;

    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }


    private void createGame() {
        isGameStopped = false;
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
        countFlags = countMinesOnField;
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

    private void openTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        gameObject.isOpen = true;
        setCellColor(x, y, Color.GREEN);
        if (gameObject.isMine) {
            setCellValue(gameObject.x, gameObject.y, MINE);
            setCellValueEx(gameObject.x, gameObject.y, Color.RED, MINE);
            gameOver();
        } else if (gameObject.countMineNeighbors == 0) {
            setCellValue(gameObject.x, gameObject.y, "");
            List<GameObject> neighbors = getNeighbors(gameObject);
            for (GameObject neighbor : neighbors) {
                if (!neighbor.isOpen) {
                    openTile(neighbor.x, neighbor.y);
                }
            }
        } else {
            setCellNumber(gameObject.x, gameObject.y, gameObject.countMineNeighbors);
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        openTile(x, y);
    }

    private void markTile(int x, int y) {
        GameObject gameObject = gameField[y][x];

        if (gameObject.isOpen || (countFlags == 0 && !gameObject.isFlag) && isGameStopped) {
            return;
        }

        if (!gameObject.isFlag) {
            gameObject.isFlag = true;
            countFlags--;
            setCellColor(gameObject.x, gameObject.y, Color.YELLOW);
            setCellValue(gameObject.x, gameObject.y, FLAG);
        } else {
            gameObject.isFlag = false;
            countFlags++;
            setCellColor(gameObject.x, gameObject.y, Color.ORANGE);
            setCellValue(gameObject.x, gameObject.y, "");
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "GAME OVER", Color.BLACK, 100);
    }
}
