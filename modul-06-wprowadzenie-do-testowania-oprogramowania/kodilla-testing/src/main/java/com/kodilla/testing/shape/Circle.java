package com.kodilla.testing.shape;

public class Circle implements Shape {

    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return (double) Math.round(Math.PI * Math.pow(r, 2) * 100) / 100;
    }
}
