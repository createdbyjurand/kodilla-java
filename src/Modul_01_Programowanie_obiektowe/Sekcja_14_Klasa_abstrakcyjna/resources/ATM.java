package Modul_01_Programowanie_obiektowe.Sekcja_14_Klasa_abstrakcyjna.resources;

import static Shared.Display.display;

public class ATM extends Bank {

  public void requestCard() {
    display("Method ATM.RequestCard called");
  }

  public void requestPIN() {
    display("Method ATM.RequestPIN called");
  }

  public void requestWithdrawAmount() {
    display("Method ATM.RequestWithdrawAmount called");
  }

  public void withdrawCash() {
    display("Method ATM.WithdrawCash called");
  }

  public void withdrawalAcceptance() {
    display("Method ATM.withdrawalAcceptance called");
  }

  public void accountBalanceCheck() {
    display("Method ATM.accountBalanceCheck called");
  }

  public void withdrawalConfirmation() {
    display("Method ATM.withdrawalConfirmation called");
  }
}
