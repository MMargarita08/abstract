package com.company1;

public class MovablePoint implements Movable {
    private int x;
    int y;
    private int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed,int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "{" + x + "." + y + "}";
    }

    @Override
    public void moveUp() {
        y = ySpeed;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

}
