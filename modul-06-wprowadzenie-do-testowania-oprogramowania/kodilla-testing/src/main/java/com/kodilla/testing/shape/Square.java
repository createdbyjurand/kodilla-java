package com.kodilla.testing.shape;

public class Square implements Shape {

    private final int a;

    public Square(int a) {
        this.a = a;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return (double) Math.round(Math.pow(a, 2) * 100) / 100;
    }
}
