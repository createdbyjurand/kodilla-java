package Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources;

public class Pilot {

    public Pilot() {
        System.out.println("Pilot object created");
    }

    private int serialNumber;
    private String color;
    private String model;

    public void turnOn() {
        System.out.println("turnOn");
    }

    public void turnOff() {
        System.out.println("turnOff");
    }

    public void volumeUp() {
        System.out.println("volumeUp");
    }
}
