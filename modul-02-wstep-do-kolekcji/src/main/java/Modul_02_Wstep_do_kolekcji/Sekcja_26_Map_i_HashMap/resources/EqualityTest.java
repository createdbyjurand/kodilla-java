package Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources;

public class EqualityTest {

  public static void main(String[] args) throws java.lang.Exception {

    Employee worker1 = new Employee("Zachary", "Taylor", "12345678901");
    Employee worker2 = new Employee("Elizabeth", "Kowalski", "10987654321");
    System.out.println("worker1 == worker2: " + (worker1 == worker2));

    Employee worker3 = new Employee("Monica", "Smith", "99999888887");
    Employee worker4 = new Employee("Monica", "Smith", "99999888887");
    System.out.println("worker3 == worker4: " + (worker3 == worker4));

    Employee worker5 = new Employee("Zachary", "Taylor", "12345678901");
    Employee worker6 = new Employee("Elizabeth", "Kowalski", "10987654321");
    System.out.println("worker1 == worker2: " + (worker5.equals(worker6)));

    Employee worker7 = new Employee("Monica", "Smith", "99999888887");
    Employee worker8 = new Employee("Monica", "Smith", "99999888887");
    System.out.println("worker3 == worker4: " + (worker7.equals(worker8)));

  }
}
