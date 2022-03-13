package com.company1;

public abstract class MovableCircle implements Movable{
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        center.y = center.ySpeed;
    }
}
