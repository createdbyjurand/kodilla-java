package Modul_01_Programowanie_obiektowe.Sekcja_14_Klasa_abstrakcyjna.resources;

abstract class ComplicatedAlgorithm {

    protected abstract void firstMethodToExecute();

    protected abstract void secondMethodToExecute();

    private void thirdMethodToExecute() {
        System.out.println("This is third method to execute!");
    }

    private void fourthMethodToExecute() {
        System.out.println("This is fourth method to execute.");
    }

    public void runOne() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
        this.thirdMethodToExecute();
        this.fourthMethodToExecute();
    }

    public void runTwo() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
        this.thirdMethodToExecute();
        this.fourthMethodToExecute();
    }

    public void runThree() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
        this.thirdMethodToExecute();
        this.fourthMethodToExecute();
    }
}
