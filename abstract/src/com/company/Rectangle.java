package com.company;

abstract public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle {" + "length=" + length + ", width=" + width + ", area= " + getArea() + "}";
    }
}
