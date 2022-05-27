package Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources;

public class SalaryPayoutProcessor extends SalaryPayout {

  private Employee employee;

  public SalaryPayoutProcessor(Employee employee) {
    super(employee);
  }

  protected void payout() {
    System.out.println("Sending money to employee");
  }
}
