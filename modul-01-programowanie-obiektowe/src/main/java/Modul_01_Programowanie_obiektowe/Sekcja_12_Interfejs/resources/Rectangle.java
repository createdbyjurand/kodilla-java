package Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources;

import static com.createdbyjurand.shared.display.Display.display;

public class Rectangle implements Shape {

    public Rectangle() {
        display("Object Rectangle created");
    }

    public void draw() {
        System.out.println("I am drawing a Rectangle!");
    }
}
