package Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TaskManager {

    ArrayList<String> executedTasks;

    //constructor
    public TaskManager() {
        executedTasks = new ArrayList<String>();
    }

    //method serving the list of tasks
    public void executeTasks(ArrayDeque<String> theQueue) {
        while (theQueue.size() > 0) {
            String theTask = theQueue.poll();
            System.out.println("Processing the task: " + theTask);
            executedTasks.add(theTask);
        }
        System.out.println("\nExecuted total " + executedTasks.size() + " tasks\n");
    }
}
