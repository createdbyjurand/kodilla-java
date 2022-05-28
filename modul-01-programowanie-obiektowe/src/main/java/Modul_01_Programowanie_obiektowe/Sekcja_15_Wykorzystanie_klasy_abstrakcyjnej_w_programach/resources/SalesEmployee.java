package Modul_01_Programowanie_obiektowe.Sekcja_15_Wykorzystanie_klasy_abstrakcyjnej_w_programach.resources;

public class SalesEmployee implements Employee {

    private double baseSalary;
    private double salesProvisionPerProduct;
    private int additionalProductsSold;

    public SalesEmployee(double baseSalary, double salesProvisionPerProduct, int additionalProductsSold) {
        this.baseSalary = baseSalary;
        this.salesProvisionPerProduct = salesProvisionPerProduct;
        this.additionalProductsSold = additionalProductsSold;
    }

    public double calculateSalary() {
        return (
            this.baseSalary +
            this.additionalProductsSold *
            (this.baseSalary * (this.salesProvisionPerProduct / 100))
        );
    }
}
