package Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc;

import static Shared.Display.displaySubtitle;
import static Shared.Display.displayTitle;

import Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources.Animal;
import Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources.Baby;
import Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources.Calculator;
import Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources.Car;
import Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources.Cat;
import Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources.Dog;
import Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources.Pilot;
import Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources.SimpleCalculator;
import Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources.User;
import Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources.Vehicle;

public class CzymJestObiektowosc {

  public static void main(String[] args) throws java.lang.Exception {

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("0.5. Czym jest obiektowość?");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Klasa");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Więcej o klasie");

    Pilot pilotOne = new Pilot();

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie - metody");

    Vehicle vehicleOne = new Vehicle();

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Budowa klasy i jej składowe");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Metoda");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie - tworzenie własnej klasy użytkownika");

    User userOne = new User();
    SimpleCalculator simpleCalculatorOne = new SimpleCalculator();

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Przykład projektu prostej klasy");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Jak utworzyć obiekt w Javie?");

    SimpleCalculator simpleCalculatorTwo = new SimpleCalculator();

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Mamy obiekt! Co teraz?");

    simpleCalculatorTwo.addAToB(5, 5);

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie - odejmowanie liczb zmiennoprzecinkowych");

    Calculator calculator = new Calculator();
    calculator.subtractDoubleAfromB(8.7, 4.34);

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Przykład tworzenia klasy z atrybutami");

    Pilot pilotTwo = new Pilot();
    Car carOne = new Car();
    Cat catOne = new Cat();

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Tworzenie jawnego konstruktora");

    User andrewOne = new User("Andrew", "male");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Gettery - metody zwracające właściwości");

    User andrewTwo = new User("Andrew", "male");
    System.out.println(andrewTwo.getSex() + " " + andrewTwo.getName());

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie - tworzenie obiektu");

    Baby jula = new Baby("Julia", "Baranowska", 29, 4, 2019);
    System.out.println(jula.getName() + " ma " + jula.getAge() + " lata");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Dziedziczenie");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Czym jest?");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Po co nam dziedziczenie?");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Jak to działa?");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Przykład zastosowania dziedziczenia");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Tworzenie klasy po której będziemy dziedziczyć");

    Vehicle vehicleTwo = new Vehicle("Audi", "2019");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Tworzenie klasy dziedziczącej");

    Vehicle vehicleThree = new Vehicle("Mazda", "2001");
    Car carTwo = new Car();

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Extends - rozszerzenie klasy");

    Car carThree = new Car(1.8, "VW", "2004");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Konstruktor klasy dziedziczącej");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Metoda super()");

    Car carFour = new Car(2.5, "XYZ", "2014");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Dziedziczenie metod");

    Car carFive = new Car(2.5, "JWT", "2001");
    String model = carFive.getModel();

    System.out.println(model);

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie - dziedziczenie klas");

    Animal animalOne = new Animal();
    Dog dogOne = new Dog();
    dogOne.eat();
    dogOne.drink();
  }
}
