package Modul_00_Witamy_w_bootcampie_online.Sekcja_06_Sprawdz_swoja_wiedze.resources;

import static com.createdbyjurand.shared.display.Display.display;

import com.createdbyjurand.shared.ansi_color.AnsiColor;
import java.util.Calendar;

public class User {

    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String name;
    private String sex;
    private String surname;

    public User() {
        display("User object created", AnsiColor.BLUE);
    }

    public User(
        String name,
        String surname,
        String sex,
        String email,
        int yearOfBirth,
        int monthOfBirth,
        int dayOfBirth
    ) {
        display("User object created", AnsiColor.BLUE);

        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getSurname() {
        return surname;
    }

    public void login() {
        display("User login");
    }

    public void logout() {
        display("User logout");
    }

    public void deleteAccount() {
        display("User deleteAccount");
    }
}
