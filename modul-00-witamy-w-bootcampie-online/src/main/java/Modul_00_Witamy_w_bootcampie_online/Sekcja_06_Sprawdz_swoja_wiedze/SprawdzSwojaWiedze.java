package Modul_00_Witamy_w_bootcampie_online.Sekcja_06_Sprawdz_swoja_wiedze;

import static com.createdbyjurand.shared.display.Display.displayTitle;

import Modul_00_Witamy_w_bootcampie_online.Sekcja_06_Sprawdz_swoja_wiedze.resources.ForumUser;

public class SprawdzSwojaWiedze {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("0.6. Sprawdź swoja wiedzę!");

        ForumUser forumUser = new ForumUser(
            "Adam",
            432,
            true,
            "Adam",
            "Florczak",
            "male",
            "em@il.com",
            1997,
            12,
            23
        );

        forumUser.sayHi();
    }
}
