package com.company;

abstract public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + ", area = " + getArea() + "}";
    }
}
