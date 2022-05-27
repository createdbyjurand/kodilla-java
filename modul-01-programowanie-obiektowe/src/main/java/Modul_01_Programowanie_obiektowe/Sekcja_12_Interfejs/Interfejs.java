package Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs;

import static Shared.Display.displaySubtitle;
import static Shared.Display.displayTitle;

import Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources.ATM;
import Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources.ATMImpl;
import Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources.Circle;
import Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources.Mobile;
import Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources.Shape;
import Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources.ShapeDrawer;
import Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources.Telephone;

public class Interfejs {

  public static void main(String[] args) throws java.lang.Exception {

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("1.2. Interfejs");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Czym jest interfejs?");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Wykorzystanie interfejsu do projektu klasy");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Implementacja");

    ShapeDrawer drawer = new ShapeDrawer(new Circle());
    drawer.process();

    Shape circle = new Circle();
    ShapeDrawer shapeDrawer = new ShapeDrawer(circle);
    shapeDrawer.process();

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Interfejsy w Javie 8");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Metody domyślne");

    Mobile mobile = new Mobile();
    mobile.callTo("Adam");
    mobile.callToMom();

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Metody statyczne");

    System.out.println(Telephone.getMyNumber());

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie: Bankomat");

    ATMImpl atm = new ATMImpl();
    atm.deposit();
    atm.payout();
    atm.connection();
    ATM.end();
  }
}
