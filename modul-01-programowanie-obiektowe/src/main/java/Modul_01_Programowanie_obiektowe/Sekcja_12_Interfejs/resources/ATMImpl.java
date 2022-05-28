package Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources;

import static com.createdbyjurand.shared.display.Display.display;

public class ATMImpl implements ATM {

    public ATMImpl() {
        display("Object ATMImpl created");
    }

    public void deposit() {
        display("Method ATMImpl.deposit called");
    }

    public void payout() {
        display("Method ATMImpl.payout called");
    }
}
