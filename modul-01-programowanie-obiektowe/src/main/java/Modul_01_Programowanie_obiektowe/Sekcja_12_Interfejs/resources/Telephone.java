package Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources;

public interface Telephone {
    // Metody w interfejsie są publiczne i… tylko publiczne!

    void sendMessageTo(String name);

    public void callTo(String name);

    default void callToMom() {
        System.out.println("I am calling to my mom!");
    }

    static String getMyNumber() {
        return "+48 909 901 928";
    }
}
