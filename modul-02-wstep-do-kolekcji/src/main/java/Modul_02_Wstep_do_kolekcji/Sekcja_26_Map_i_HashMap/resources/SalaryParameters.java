package Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources;

public class SalaryParameters {

    Double baseSalary;
    Double regulatedBonus;
    Double chefBonus;
    Double functionAddSalary;

    public SalaryParameters(Double baseSalary, Double regulatedBonus, Double chefBonus, Double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.regulatedBonus = regulatedBonus;
        this.chefBonus = chefBonus;
        this.functionAddSalary = functionAddSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public String toString() {
        return baseSalary + " + " + regulatedBonus + " + " + chefBonus + " + " + functionAddSalary;
    }
}
