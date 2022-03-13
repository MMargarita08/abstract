package com.company2;

public class Circle implements GeometricObject{
    protected double radius;
     public Circle(double radius) {
         this.radius = 1.0;
     }

    public Circle() {
        this.radius = radius;
    }

    public double getPerimeter() {
         return radius*Math.PI;
     }
     public double getArea() {
         return 2*radius*Math.PI;
     }
}
