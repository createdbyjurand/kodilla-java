package Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources;

public class HourlySalaryEmployee implements Employee {

  private double hours;
  private double hourlyPay;

  public HourlySalaryEmployee(double hours, double hourlyPay) {
    this.hours = hours;
    this.hourlyPay = hourlyPay;
  }

  public double calculateSalary() {
    return this.hourlyPay * this.hours;
  }
}
