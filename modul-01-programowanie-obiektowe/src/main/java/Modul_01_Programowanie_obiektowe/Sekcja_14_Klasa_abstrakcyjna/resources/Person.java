package Modul_01_Programowanie_obiektowe.Sekcja_14_Klasa_abstrakcyjna.resources;

abstract class Person {

    /**
     * Attribute same as basic class
     */
    private String name;

    /**
     * Constructor same as basic class
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Public method same as basic class
     */
    public String getName() {
        return this.name;
    }

    /**
     * Abstract method which requires implementation in class that extends abstract class Person.
     */
    abstract void voice();
}
