package Modul_01_Programowanie_obiektowe.Sekcja_14_Klasa_abstrakcyjna.resources;

public class ComplicatedAlgorithmRunner extends ComplicatedAlgorithm {

    protected void firstMethodToExecute() {
        System.out.println("This is first method to execute");
    }

    protected void secondMethodToExecute() {
        System.out.println("This is second method to execute");
    }

    @Override
    public void runTwo() {
        //Implementation
    }

    @Override
    public void runThree() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
    }
}
