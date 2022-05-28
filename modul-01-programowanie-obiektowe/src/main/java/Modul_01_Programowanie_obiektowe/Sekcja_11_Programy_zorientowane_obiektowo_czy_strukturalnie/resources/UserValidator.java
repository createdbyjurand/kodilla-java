package Modul_01_Programowanie_obiektowe.Sekcja_11_Programy_zorientowane_obiektowo_czy_strukturalnie.resources;

import static com.createdbyjurand.shared.display.Display.display;

import com.createdbyjurand.shared.ansi_color.AnsiColor;

public class UserValidator {

    public boolean validateAge(int age) {
        display("validateAge", AnsiColor.GREEN);
        if (age <= 15) {
            System.out.println("Too young!");
            return false;
        } else {
            System.out.println("User age is okey!");
            return true;
        }
    }

    public void validateSex(char sex) {
        display("validateSex", AnsiColor.GREEN);
        if (sex == 'm') {
            System.out.println("User is a male");
        } else if (sex == 'f') {
            System.out.println("User is a female");
        } else {
            System.out.println("Unknown sex!");
        }
    }
}
