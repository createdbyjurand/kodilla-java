package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private final ArrayList<Shape> arrayList = new ArrayList<Shape>();

    boolean addFigure(Shape shape) {
        return this.arrayList.add(shape);
    }

    boolean removeFigure(Shape shape) {
        return this.arrayList.remove(shape);
    }

    Shape getFigure(int n) {
        return this.arrayList.get(n);
    }

    int showFigures() {
        return this.arrayList.size();
    }
}
