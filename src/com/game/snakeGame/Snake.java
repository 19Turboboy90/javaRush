package com.game.snakeGame;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    private Direction direction = Direction.LEFT;
    public boolean isAlive = true;

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void draw(Game game) {
        snakeParts.forEach(snakePart -> {
            if (snakePart.equals(snakeParts.get(0))) {
                game.setCellValueEx(snakePart.x, snakePart.y, Color.NONE, HEAD_SIGN,
                        isAlive ? Color.BLUE : Color.RED, 75);
            } else {
                game.setCellValueEx(snakePart.x, snakePart.y, Color.NONE, BODY_SIGN,
                        isAlive ? Color.BLUE : Color.RED, 75);
            }
        });
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
