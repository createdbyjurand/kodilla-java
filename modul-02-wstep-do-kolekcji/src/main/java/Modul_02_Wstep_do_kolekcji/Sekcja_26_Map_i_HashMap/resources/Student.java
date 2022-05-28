package Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources;

public class Student {

    String name;
    String surname;
    String pesel;
    String email;
    String phone;

    public Student(String name, String surname, String pesel, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        final Student student = (Student) o;
        return (
            this.name.equals(student.name) &&
            this.surname.equals(student.surname) &&
            this.pesel.equals(student.pesel) &&
            this.email.equals(student.email) &&
            this.phone.equals(student.phone)
        );
    }

    public int hashCode() {
        return Integer.parseInt(pesel.substring(0, 5));
    }

    public String toString() {
        return name + " " + surname + " (PESEL: " + pesel + ", EMAIL: " + email + ", PHONE: " + phone + ")";
    }
}
