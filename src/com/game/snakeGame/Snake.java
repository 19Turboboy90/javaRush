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

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        if (newHead.x < 0 || newHead.y < 0 || newHead.x >= SnakeGame.WIDTH || newHead.y >= SnakeGame.HEIGHT) {
            isAlive = false;
            return;
        }
        boolean check = checkCollision(newHead);
        if (check) {
            isAlive = false;
            return;
        }
        snakeParts.add(0, newHead);
        if (apple.x == newHead.x && apple.y == newHead.y) {
            apple.isAlive = false;
        } else {
            removeTail();
        }
    }

    public GameObject createNewHead() {
        GameObject gameObject = snakeParts.get(0);

        switch (direction) {
            case LEFT:
                return new GameObject(gameObject.x - 1, gameObject.y);
            case DOWN:
                return new GameObject(gameObject.x, gameObject.y + 1);
            case RIGHT:
                return new GameObject(gameObject.x + 1, gameObject.y);
            case UP:
                return new GameObject(gameObject.x, gameObject.y - 1);
            default:
                return null;
        }
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public void setDirection(Direction direction) {
        if (Direction.LEFT == direction && this.direction == Direction.RIGHT) {
            return;
        } else if (Direction.UP == direction && this.direction == Direction.DOWN) {
            return;
        } else if (Direction.RIGHT == direction && this.direction == Direction.LEFT) {
            return;
        } else if (Direction.DOWN == direction && this.direction == Direction.UP) {
            return;
        }
        this.direction = direction;
    }

    public boolean checkCollision(GameObject object) {
        for (GameObject snakePart : snakeParts) {
            if (object.x == snakePart.x && object.y == snakePart.y)
                return true;
        }
        return false;
    }
}
