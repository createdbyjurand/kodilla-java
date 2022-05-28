package Modul_01_Programowanie_obiektowe.Sekcja_11_Programy_zorientowane_obiektowo_czy_strukturalnie;

import Modul_01_Programowanie_obiektowe.Sekcja_11_Programy_zorientowane_obiektowo_czy_strukturalnie.resources.UserValidator;

public class ProgramyZorientowaneObiektowoCzyStrukturalnie {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("1. Programowanie obiektowe");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Wyzwania:");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Dodatkowe informacje");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("1.1. Programy zorientowane obiektowo czy strukturalnie?");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Podejście strukturalne");

        System.out.println("Starting...");
        int age = 15;
        char sex = 'm';
        if (age <= 15) {
            System.out.println("Too young!");
        } else {
            System.out.println("User age is okey!");
            if (sex == 'm') {
                System.out.println("User is a male");
            } else if (sex == 'f') {
                System.out.println("User is a female");
            } else {
                System.out.println("Unknown sex!");
            }
        }
        System.out.println("End of the program");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Podejście obiektowe");

        System.out.println("Starting...");
        age = 15;
        sex = 'm';
        UserValidator validator = new UserValidator();
        // validator.validateAge(age);
        boolean isHigherThanFifteen = validator.validateAge(age);
        if (isHigherThanFifteen) {
            validator.validateSex(sex);
        }
        System.out.println("End of the program");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Wniosek");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie: Kod obiektowy to jest to!");
    }

    private static void displayTitle(String s) {}
}
