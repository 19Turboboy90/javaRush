package com.game.minesweeperGame;

public class GameObject {
    public final int x;
    public final int y;
    public boolean isMine;
    public int countMineNeighbors;

    public GameObject(int x, int y, boolean isMine) {
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isMine() {
        return isMine;
    }

    public int getCountMineNeighbors() {
        return countMineNeighbors;
    }
}
