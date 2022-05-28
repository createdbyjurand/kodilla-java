package Modul_01_Programowanie_obiektowe.Sekcja_16_Klasa_object;

import static com.createdbyjurand.shared.display.Display.display;
import static com.createdbyjurand.shared.display.Display.displayTitle;

import Modul_01_Programowanie_obiektowe.Sekcja_16_Klasa_object.resources.JClass;

public class KlasaObject {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("1.6. Klasa Object");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie: Użycie metody hashCode()");

        JClass jClass = new JClass();
        display("jClass.hashCode(): " + jClass.hashCode());
    }
}
