package Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources;

public class Employee {

    String firstName;
    String lastName;
    String peselId;

    // konstruktor
    public Employee(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    public void doBankTransfer() {}

    @Override
    public boolean equals(Object o) {
        final Employee e = (Employee) o;
        return (
            this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.peselId.equals(e.peselId)
        );
    }

    public int hashCode() {
        //This method cuts first 6 (0-5) characters from peselId
        //and then converts it into Integer
        //peselId includes year and month and day of birth in the first 6 characters
        //for example: beginning of peselId 800630 means that persone having this peselId
        //was born on 30 july 1980.
        //returning value will be 800630 (Integer type)
        return Integer.parseInt(peselId.substring(0, 5));
    }

    public String toString() {
        return firstName + " " + lastName + " (" + peselId + ")";
    }
}
