package Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach;

import static Shared.Display.displaySubtitle;
import static Shared.Display.displayTitle;

import Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources.FixedSalaryEmployee;
import Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources.HourlySalaryEmployee;
import Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources.ProductEmployee;
import Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources.SalaryPayoutProcessor;
import Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources.SalesEmployee;

public class WykorzystanieKlasyAbstrakcyjnejWProgramach {

  public static void main(String[] args) throws java.lang.Exception {

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("1.5. Wykorzystanie klasy abstrakcyjnej w programach");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Wstępny projekt aplikacji");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Klasa abstrakcyjna SalaryPayout");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Klasa SalaryPayoutProcessor");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Implementacja");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Uruchomienie programu");

    FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
    SalaryPayoutProcessor employeeProcessor = new SalaryPayoutProcessor(employee);
    employeeProcessor.processPayout();

    HourlySalaryEmployee contractor = new HourlySalaryEmployee(40, 19);
    SalaryPayoutProcessor contractorProcessor = new SalaryPayoutProcessor(contractor);
    contractorProcessor.processPayout();

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie: Tworzenie obiektów z wykorzystaniem klasy abstrakcyjnej");

    ProductEmployee productEmployee = new ProductEmployee(1, 5);
    SalaryPayoutProcessor productEmployeeProcessor = new SalaryPayoutProcessor(productEmployee);
    productEmployeeProcessor.processPayout();

    SalesEmployee salesEmployee = new SalesEmployee(2000, 20, 1);
    SalaryPayoutProcessor salesEmployeeProcessor = new SalaryPayoutProcessor(salesEmployee);
    salesEmployeeProcessor.processPayout();

  }
}
