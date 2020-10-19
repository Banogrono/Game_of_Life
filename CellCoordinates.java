package com.company;

public class CellCoordinates {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CellCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean value(boolean[][] matrix) {
        return matrix[this.x][this.y];
    }
}


