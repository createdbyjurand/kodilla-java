package com.kodilla.testing.shape;

import static com.createdbyjurand.shared.Display.display;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ShapeCollectorTestSuite {

    ShapeCollector shapeCollector;

    @BeforeAll
    static void beforeAllTests() {
        display("Before all tests");
    }

    @AfterAll
    static void afterAllTests() {
        display("After all tests");
    }

    @BeforeEach
    void beforeEachTest(TestInfo testInfo) {
        shapeCollector = new ShapeCollector();
        display(String.format("About to execute %s", testInfo.getDisplayName()));
    }

    @AfterEach
    void afterEachTest(TestInfo testInfo) {
        display(String.format("Finished executing %s", testInfo.getDisplayName()));
    }

    @Test
    public void testAddFigureCircle() {
        //Given
        Circle circle = new Circle(10);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    public void testGetShapeNameCircle() {
        //Given
        Circle circle = new Circle(10);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(circle.getShapeName(), shapeCollector.getFigure(0).getShapeName());
    }

    @Test
    public void testGetFieldCircle() {
        //Given
        Circle circle = new Circle(10);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(circle.getField(), shapeCollector.getFigure(0).getField());
    }

    @Test
    public void testRemoveFigureCircle() {
        //Given
        Assertions.assertEquals(0, shapeCollector.showFigures());
        Shape shape = new Circle(10);
        shapeCollector.addFigure(shape);
        //When
        Assertions.assertEquals(1, shapeCollector.showFigures());
        shapeCollector.removeFigure(shape);
        //Then
        Assertions.assertEquals(0, shapeCollector.showFigures());
    }

    @Test
    public void testAddFigureSquare() {
        //Given
        Square square = new Square(10);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assertions.assertEquals(square, shapeCollector.getFigure(0));
    }

    @Test
    public void testAddFigureTriangle() {
        //Given
        Triangle triangle = new Triangle(10, 10, 10);
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assertions.assertEquals(triangle, shapeCollector.getFigure(0));
    }
}
