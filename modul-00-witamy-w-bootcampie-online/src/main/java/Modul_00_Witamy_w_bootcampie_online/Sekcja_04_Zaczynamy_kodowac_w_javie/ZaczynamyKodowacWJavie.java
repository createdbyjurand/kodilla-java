package Modul_00_Witamy_w_bootcampie_online.Sekcja_04_Zaczynamy_kodowac_w_javie;

import static com.createdbyjurand.shared.display.Display.displaySubtitle;
import static com.createdbyjurand.shared.display.Display.displayTitle;

import java.util.Calendar;

public class ZaczynamyKodowacWJavie {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Typy danych");

        System.out.println("Rozpoczynamy naukę w Javie!");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie - pierwsza kompilacja");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Jurand");
        System.out.println(year - 1979);
        System.out.println("N");

        String name = "Jurand Niemczycki";
        int born = 1979;
        System.out.println(name.substring(0, name.indexOf(" ")));
        System.out.println(year - born);
        System.out.println(name.charAt(name.indexOf(" ") + 1));

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zmienne");

        String myName = "Janusz";
        int myAge = 22;
        double height = 1.78;
        char carClass = 'A';
        boolean isGoodProgrammer = true;

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie - typy zmiennych");

        name = "Jurand";
        char charA = 'A';
        double speed = 3.5;
        boolean isTrue = false;

        System.out.println(name + " " + charA + " " + speed + " " + isTrue);

        String jName = "Jurand";
        System.out.println("name: " + jName);
        int jAge = 37;
        System.out.println("age: " + jAge);
        double jHeight = 1.87;
        System.out.println("height: " + jHeight);
        char jCarClass = 'S';
        System.out.println("car class: " + jCarClass);
        boolean isJAGoodProgrammer = true;
        System.out.println("is good programmer: " + isJAGoodProgrammer);

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Instrukcje warunkowe");

        if (isGoodProgrammer) {
            System.out.println("Java, java, java!!!");
        } else {
            System.out.println("Musze się jeszcze pouczyć!");
        }

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie - instrukcje warunkowe");

        boolean isGoodWeather = false;

        if (isGoodWeather) {
            System.out.println("Pogoda jest piękna");
        } else {
            System.out.println("Pogoda jest fatalna");
        }

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Podstawowe operacje na zmiennych");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Dodawanie i odejmowanie");

        int numberOne = 30;
        int numberTwo = 50;

        int result = numberOne + numberTwo;
        System.out.println(numberOne + " + " + numberTwo + " = " + result);

        result = numberOne - numberTwo;
        System.out.println(numberOne + " - " + numberTwo + " = " + result);

        double numberThree = 5.5;
        double resultDouble = numberOne - numberThree;

        System.out.println(numberOne + " - " + numberThree + " = " + resultDouble);

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Mnożenie i dzielenie");

        numberOne = 3;
        numberTwo = 5;
        result = numberOne * numberTwo;

        System.out.println(result);

        double numberOneDouble = 3.5;
        double numberTwoDouble = 2.5;
        resultDouble = numberOneDouble * numberTwoDouble;

        System.out.println(resultDouble);

        numberOne = 15;
        numberTwo = 5;
        result = numberOne / numberTwo;

        System.out.println(result);

        numberOneDouble = 15.90;
        numberTwoDouble = 5.30;
        resultDouble = numberOneDouble / numberTwoDouble;

        System.out.println(resultDouble);

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Modulo, czyli otrzymanie reszty z dzielenia");

        numberOne = 25;
        numberTwo = 6;
        int modulo = numberOne % numberTwo;

        System.out.println(modulo);

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Konkatenacja");

        // Konkatenacja jest połączeniem ze sobą zmiennych typu String

        String stringOne = "Gosia ma";

        String stringTwo = "psa";
        String stringThree = "3 koty";
        String stringFour = "brata o imieniu Stefan";
        String space = " ";

        System.out.println(stringOne + space + stringTwo);
        System.out.println(stringOne + space + stringThree);
        System.out.println(stringOne + space + stringFour);

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Równości i operatory relacyjne");

        name = "Krzysiek";
        if (name == "Krzysiek") {
            System.out.println("On ma na imie " + name + " to pewne!");
        }

        name = "Janek";
        if (name != "Krzysiek") {
            System.out.println("On na pewno nie ma na imię Krzysiek, tylko " + name + " to pewne!!!");
        }

        int age = 11;
        if (age > 10) {
            System.out.println("Janek na pewno ma więcej niż 10 lat");
        }

        age = 10;
        if (age >= 10) {
            System.out.println("Janek na pewno ma 10 lat lub więcej");
        }

        age = 9;
        if (age < 10) {
            System.out.println("Janek ma na pewno mniej niż 10 lat");
        }

        age = 10;
        if (age <= 10) {
            System.out.println("Janek na pewno ma mniej lub dokładnie 10 lat");
        }

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie - operacje na zmiennych");

        int x = (int) Math.round(Math.random() * 10);

        if (x % 7 == 0) {
            System.out.println("Liczba 7 jest dzielnikiem liczby " + x + " :)");
        } else {
            System.out.println("Liczba 7 NIE jest dzielnikiem liczby " + x + " :(");
        }

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Tablice jednowymiarowe");

        String names[] = new String[5];
        names[0] = "Ania";
        names[1] = "Krzysiek";
        names[2] = "Paula";
        names[3] = "Janusz";
        names[4] = "Wiesław";

        name = names[2];
        System.out.println(name);

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie - tablica ulubionych filmów");

        String[] films = {
            "Candyman",
            "Shang-Chi and the Legend of the Ten Rings",
            "The Many Saints of Newark",
            "No Time to Die",
            "Venom: Let There Be Carnage",
            "Halloween Kills",
            "Dune",
            "The French Dispatch",
            "Last Night in Soho",
            "Eternals",
        };
        System.out.println(films[6]);
    }
}
