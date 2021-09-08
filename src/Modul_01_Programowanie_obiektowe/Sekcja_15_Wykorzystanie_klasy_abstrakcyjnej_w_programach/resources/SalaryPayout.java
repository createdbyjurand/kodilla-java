package Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources;

abstract class SalaryPayout {

  private Employee employee;

  public SalaryPayout(Employee employee) {
    this.employee = employee;
  }

  protected abstract void payout();

  public void processPayout() {
    System.out.println("Creating payout for: " + this.employee.calculateSalary() + " PLN");
    this.payout();
    System.out.println("Payout has been completed!");
  }
}
