package Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources;

public class ProductEmployee implements Employee {

    private int products;
    private double perProductPay;

    public ProductEmployee(int products, double perProductPay) {
        this.products = products;
        this.perProductPay = perProductPay;
    }

    public double calculateSalary() {
        return this.perProductPay * this.products;
    }
}
