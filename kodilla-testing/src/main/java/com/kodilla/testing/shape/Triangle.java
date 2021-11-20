package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("Lengths are not valid!");
        }
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        long s = (this.a + this.b + this.c) / 2;
        return (double) Math.round(Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c)) * 100) / 100;
    }
}
