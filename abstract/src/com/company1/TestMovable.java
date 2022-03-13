package com.company1;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint m2 = new MovablePoint(2,1,2,20);
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
    }
}
