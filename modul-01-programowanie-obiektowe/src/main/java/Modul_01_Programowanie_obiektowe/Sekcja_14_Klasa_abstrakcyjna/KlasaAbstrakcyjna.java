package Modul_01_Programowanie_obiektowe.Sekcja_14_Klasa_abstrakcyjna;

import Modul_01_Programowanie_obiektowe.Sekcja_14_Klasa_abstrakcyjna.resources.ATM;
import Modul_01_Programowanie_obiektowe.Sekcja_14_Klasa_abstrakcyjna.resources.ComplicatedAlgorithmRunner;
import Modul_01_Programowanie_obiektowe.Sekcja_14_Klasa_abstrakcyjna.resources.Male;
import java.util.*;
import java.lang.*;
import java.io.*;

import static Shared.Display.displaySubtitle;
import static Shared.Display.displayTitle;

public class KlasaAbstrakcyjna {

  public static void main(String[] args) throws java.lang.Exception {

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("1.4. Klasa abstrakcyjna");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Czym jest klasa abstrakcyjna?");

    Male male = new Male("John");
    String name = male.getName();
    System.out.println(name);
    male.voice();

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zastosowanie");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Metody o dostępności protected");

    ComplicatedAlgorithmRunner runner = new ComplicatedAlgorithmRunner();
    runner.runOne();

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Nadpisywanie");

    runner.runTwo();
    runner.runThree();

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie: Transakcja bankowa");

    ATM atm = new ATM();
    atm.requestCard();
    atm.requestPIN();
    atm.requestWithdrawAmount();
    atm.accountBalanceCheck();
    atm.withdrawalAcceptance();
    atm.withdrawCash();
    atm.withdrawalConfirmation();
  }
}
