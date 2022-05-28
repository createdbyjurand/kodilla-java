package Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources;

import static com.createdbyjurand.shared.display.Display.display;

public class ShapeDrawer {

    private Shape shape;

    public ShapeDrawer(Shape shape) {
        display("Object ShapeDrawer created");

        this.shape = shape;
    }

    public void process() {
        System.out.println("Starting to draw the chosen shape...");
        this.shape.draw();
        System.out.println("Shape has been drawn.");
    }
}
