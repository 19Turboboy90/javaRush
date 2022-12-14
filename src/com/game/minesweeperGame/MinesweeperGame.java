package com.game.minesweeperGame;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//--module-path ./lib/javafx-sdk-16/lib --add-modules=javafx.controls,javafx.fxml,javafx.base
public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private int countMinesOnField;
    private int countFlags;
    private boolean isGameStopped;
    private final GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private static final String FLAG = "\uD83D\uDEA9";
    private static final String MINE = "\uD83D\uDCA3";

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        openTile(x, y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void createGame() {
        isGameStopped = false;
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[0].length; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                countMinesOnField = isMine ? countMinesOnField + 1 : countMinesOnField;
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private void countMineNeighbors() {
//        for (int y = 0; y < gameField.length; y++) {
//            for (int x = 0; x < gameField[0].length; x++) {
//                GameObject gameObject = gameField[y][x];
//                if (!gameObject.isMine) {
//                    for (GameObject neighbor : getNeighbors(gameObject)) {
//                        if (neighbor.isMine) {
//                            gameObject.countMineNeighbors++;
//                        }
//                    }
//                }
//            }
//        }

        Arrays.stream(gameField)
                .forEach(gameObjects ->
                        Arrays.stream(gameObjects, 0, gameField[0].length)
                                .filter(gameObject -> !gameObject.isMine)
                                .forEach(gameObject -> getNeighbors(gameObject).stream()
                                        .filter(neighbor -> neighbor.isMine)
                                        .forEach(neighbor -> gameObject.countMineNeighbors++)));
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> gameObjectList = new ArrayList<>();
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
                gameObjectList.add(gameField[y][x]);
            }
        }
        return gameObjectList;
    }

    private void openTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        gameObject.isOpen = true;
        setCellColor(x, y, Color.GREEN);
        if (gameObject.isMine) {
            setCellValue(gameObject.x, gameObject.y, MINE);
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        } else if (gameObject.countMineNeighbors == 0) {
            setCellValue(gameObject.x, gameObject.y, "");
            List<GameObject> neighbors = getNeighbors(gameObject);
            neighbors.stream().filter(neighbor -> !neighbor.isOpen).forEach(neighbor -> openTile(neighbor.x, neighbor.y));
        } else {
            setCellNumber(x, y, gameObject.countMineNeighbors);
        }
    }

    private void markTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        if (gameObject.isOpen || (countFlags == 0 && !gameObject.isFlag) || isGameStopped) {
            return;
        }
        if (!gameObject.isFlag) {
            gameObject.isFlag = true;
            countFlags--;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, Color.YELLOW);
        } else {
            gameObject.isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.ORANGE);
        }
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "Game Over", Color.BLACK, 100);
    }
}
