package Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources;

import static com.createdbyjurand.shared.display.Display.display;

public class Circle implements Shape {

    public Circle() {
        display("Object Circle created");
    }

    public void draw() {
        System.out.println("I am drawing a circle!");
    }
}
