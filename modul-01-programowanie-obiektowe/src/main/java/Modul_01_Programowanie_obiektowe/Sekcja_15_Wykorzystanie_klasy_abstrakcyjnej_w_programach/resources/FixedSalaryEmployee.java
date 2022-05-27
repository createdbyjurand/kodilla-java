package Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources;

public class FixedSalaryEmployee implements Employee {

  private double salary;

  public FixedSalaryEmployee(double salary) {
    this.salary = salary;
  }

  public double calculateSalary() {
    return this.salary;
  }
}
