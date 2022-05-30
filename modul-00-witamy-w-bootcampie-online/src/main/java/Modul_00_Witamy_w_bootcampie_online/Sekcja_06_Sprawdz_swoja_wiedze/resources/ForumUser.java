package Modul_00_Witamy_w_bootcampie_online.Sekcja_06_Sprawdz_swoja_wiedze.resources;

import static com.createdbyjurand.shared.display.Display.display;

import com.createdbyjurand.shared.ansi_color.AnsiColor;

public class ForumUser extends User {

    private String userName;
    private int numberOfPosts;
    private boolean isLoggedIn;

    public ForumUser() {
        display("ForumUser object created", AnsiColor.BLUE);
    }

    public ForumUser(
            String userName,
            int numberOfPosts,
            boolean isLoggedIn,
            String name,
            String surname,
            String sex,
            String email,
            int yearOfBirth,
            int monthOfBirth,
            int dayOfBirth
    ) {
        super(name, surname, sex, email, yearOfBirth, monthOfBirth, dayOfBirth);
        display("ForumUser object created", AnsiColor.BLUE);

        this.isLoggedIn = isLoggedIn;
        this.userName = userName;
        this.numberOfPosts = numberOfPosts;
    }

    public void publishPost() {
        display("ForumUser publishPost");
    }

    public void commentPost() {
        display("ForumUser commentPost");
    }

    public void consoleName() {
        display("ForumUser consoleName");
    }

    public void sayHi() {
        display("Hi, my name is " + getName() + ". I am " + getAge() + " years old.");
    }
}
