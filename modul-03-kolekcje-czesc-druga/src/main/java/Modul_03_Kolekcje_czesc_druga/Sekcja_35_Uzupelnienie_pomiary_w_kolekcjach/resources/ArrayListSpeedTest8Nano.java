package Modul_03_Kolekcje_czesc_druga.Sekcja_35_Uzupelnienie_pomiary_w_kolekcjach.resources;

import java.util.ArrayList;

public class ArrayListSpeedTest8Nano {

    public static void main(String[] args) throws java.lang.Exception {
        //Creating collection with 8000000 elements of type Integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n = 0; n < 8000000; n++) {
            list.add(n);
        }

        //Displaying quantity of elements
        System.out.println("Quantity of elements in the collection: " + list.size());

        //Adding element at the end of the collection
        long begin = System.nanoTime();
        list.add(list.size());
        long end = System.nanoTime();

        //Displaying time of the operation
        System.out.println("Adding element at the od of the collection has taken: " + (end - begin) + "ns");

        //Adding element at the beginning of the collection
        begin = System.nanoTime();
        list.add(0, list.size());
        end = System.nanoTime();

        //Displaying time of the operation
        System.out.println("Adding element at the beginning of the collection has taken: " + (end - begin) + "ns");
    }
}
