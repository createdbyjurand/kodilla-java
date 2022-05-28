package Modul_02_Wstep_do_kolekcji.Sekcja_23_Kolekcje_czesc_pierwsza.resources;

import java.util.ArrayList;

public class IterableTest {

    public static void main(String[] args) throws java.lang.Exception {
        //Creating ArrayList, which implements the Iterable interface and fill it
        ArrayList<String> theList = new ArrayList<String>();
        theList.add("object 1");
        theList.add("object 2");
        theList.add("object 3");
        theList.add("object 4");
        theList.add("object 5");
        //Displaying the list using Iterable interface and for-each loop
        for (String theObject : theList) {
            System.out.println(theObject);
        }
    }
}
