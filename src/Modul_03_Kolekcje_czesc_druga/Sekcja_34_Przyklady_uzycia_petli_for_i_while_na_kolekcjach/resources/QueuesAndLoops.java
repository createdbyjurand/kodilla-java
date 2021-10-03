package Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class QueuesAndLoops {

  public static void main(String[] args) throws java.lang.Exception {

    //the first task's list
    ArrayDeque<String> taskQueue1 = new ArrayDeque<String>();
    for (int n = 0; n < 5; n++) {
      taskQueue1.offer("The first task number " + (n + 1));
    }

    //the second task's list
    ArrayDeque<String> taskQueue2 = new ArrayDeque<String>();
    for (int n = 0; n < 5; n++) {
      taskQueue2.offer("The second task number " + (n + 1));
    }

    TaskManager taskExecutor = new TaskManager();
    taskExecutor.executeTasks(taskQueue1);
    taskExecutor.executeTasks(taskQueue2);
  }
}
