package com.company2;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public ResizableCircle() {
        this.radius = radius;
    }

    @Override
    public double resize(int percent) {
        radius = (percent*0.01)*radius;
        return radius;
    }
}
