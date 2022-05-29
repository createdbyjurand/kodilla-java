package Modul_03_Kolekcje_czesc_druga.Sekcja_33_Interfejs_Iterator_oraz_petla_while.resources;

import java.time.LocalDate;

/* Class Employee represents an employee in the company */
public class Employee {

    String firstName;
    String lastName;
    LocalDate birthDate;

    // Constructor
    public Employee(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Class LocalDate provided by java.time library is used
        // to store dates. Constructor of(int year, int month, int day) could be
        // used to initialize LocalDate variable value
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public int hashCode() {
        // methods getYear() and getMonthValue() of LocalDate class could be used
        // to retrieve a year and month of stored date
        return birthDate.getYear() * 100 + birthDate.getMonthValue();
    }

    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return (
            (firstName.equals(e.getFirstName())) &&
            (lastName.equals(e.getLastName())) &&
            (birthDate.getYear() == e.getBirthDate().getYear()) &&
            (birthDate.getMonthValue() == e.getBirthDate().getMonthValue()) &&
            (birthDate.getDayOfMonth() == e.getBirthDate().getDayOfMonth())
        );
    }

    public String toString() {
        return firstName + ", " + lastName + ", born: " + birthDate;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
