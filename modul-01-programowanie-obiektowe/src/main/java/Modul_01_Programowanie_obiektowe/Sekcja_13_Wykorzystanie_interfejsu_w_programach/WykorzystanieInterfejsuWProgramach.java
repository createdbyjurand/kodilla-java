package Modul_01_Programowanie_obiektowe.Sekcja_13_Wykorzystanie_interfejsu_w_programach;

import static com.createdbyjurand.shared.display.Display.displayTitle;

import Modul_01_Programowanie_obiektowe.Sekcja_13_Wykorzystanie_interfejsu_w_programach.resources.AnimalRecognizer;
import Modul_01_Programowanie_obiektowe.Sekcja_13_Wykorzystanie_interfejsu_w_programach.resources.Cat;
import Modul_01_Programowanie_obiektowe.Sekcja_13_Wykorzystanie_interfejsu_w_programach.resources.DeadIslandQuest;
import Modul_01_Programowanie_obiektowe.Sekcja_13_Wykorzystanie_interfejsu_w_programach.resources.EliteKnightQuest;
import Modul_01_Programowanie_obiektowe.Sekcja_13_Wykorzystanie_interfejsu_w_programach.resources.Knight;

public class WykorzystanieInterfejsuWProgramach {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("1.3. Wykorzystanie interfejsu w programach");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Wstępny projekt aplikacji");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Tworzenie interfejsu dla aplikacji");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Implementacja");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Uruchomienie programu");

        AnimalRecognizer recogonizer = new AnimalRecognizer();
        String recognizedAnimal = recogonizer.recognize(new Cat());
        System.out.println(recognizedAnimal);

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie: Odważny rycerz");

        Knight knight_one = new Knight(new DeadIslandQuest());
        knight_one.howItEnds();
        Knight knight_two = new Knight(new EliteKnightQuest());
        knight_two.howItEnds();
    }
}
