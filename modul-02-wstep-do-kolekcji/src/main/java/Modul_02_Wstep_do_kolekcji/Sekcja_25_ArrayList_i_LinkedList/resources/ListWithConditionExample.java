package Modul_02_Wstep_do_kolekcji.Sekcja_25_ArrayList_i_LinkedList.resources;

import java.util.ArrayList;

/* Name of the class has to be "Main" only if the class is public. */
public class ListWithConditionExample {

    public static void main(String[] args) throws java.lang.Exception {
        //Create and fill the list with first names
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("Jennifer");
        userNames.add("Kimberly");
        userNames.add("Nicole");
        userNames.add("Amy");
        userNames.add("Sarah");
        userNames.add("Brandon");
        userNames.add("Robert");
        userNames.add("Ken");
        userNames.add("Jack");

        //Displaying that first names, which are no longer than 5 characters
        for (String name : userNames) {
            if (name.length() < 5) {
                System.out.println(name);
            }
        }
    }
}
