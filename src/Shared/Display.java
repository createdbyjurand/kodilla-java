package Shared;

import java.io.*;
import java.lang.*;
import java.net.*;
import java.time.*;
import java.util.*;

public class Display {

  private static final int CONSOLE_WIDTH = 120;

  private static String fill(String input, char character, int repeat) {
    String output = input;

    while (repeat > 0) {
      output += character;
      repeat--;
    }

    return output;
  }

  private static String displayInTheMiddle(String stringToDisplay) {
    String output = "";

    int leftSide = (int) Math.floor((double) (CONSOLE_WIDTH - stringToDisplay.length() - 2) / 2);
    int rightSide = (int) Math.ceil((double) (CONSOLE_WIDTH - stringToDisplay.length() - 2) / 2);

    output = fill(output, '-', leftSide);
    output += " " + stringToDisplay + " ";
    output = fill(output, '-', rightSide);

    return output;
  }

  private static String mergeAnsiColors(AnsiColor... ansiColors) {
    String colors = "";
    for (AnsiColor color : ansiColors) {
      colors += color;
    }
    return colors;
  }

  /////////////////////////// display ///////////////////////////

  public static void display(String stringToDisplay, AnsiColor... ansiColors) {
    System.out.println("" + AnsiColor.BLUE + mergeAnsiColors(ansiColors) + stringToDisplay + AnsiColor.RESET);
  }

  public static void display(Number numberToDisplay, AnsiColor... ansiColors) {
    System.out.println("" + AnsiColor.BLUE + mergeAnsiColors(ansiColors) + numberToDisplay + AnsiColor.RESET);
  }

  /////////////////////////// displayTitle ///////////////////////////

  public static void displayTitle(String stringToDisplay, AnsiColor... ansiColors) {
    String output = displayInTheMiddle("" + stringToDisplay);
    System.out.println("" + AnsiColor.CYAN + mergeAnsiColors(ansiColors) + output + AnsiColor.RESET);
  }

  public static void displayTitle(Number numberToDisplay, AnsiColor... ansiColors) {
    String output = displayInTheMiddle("" + numberToDisplay);
    System.out.println("" + AnsiColor.CYAN + mergeAnsiColors(ansiColors) + output + AnsiColor.RESET);
  }

  /////////////////////////// displaySubtitle ///////////////////////////

  public static void displaySubtitle(String stringToDisplay, AnsiColor... ansiColors) {
    String output = displayInTheMiddle("" + stringToDisplay);
    System.out.println("" + AnsiColor.WHITE + mergeAnsiColors(ansiColors) + output + AnsiColor.RESET);
  }

  public static void displaySubtitle(Number numberToDisplay, AnsiColor... ansiColors) {
    String output = displayInTheMiddle("" + numberToDisplay);
    System.out.println("" + AnsiColor.WHITE + mergeAnsiColors(ansiColors) + output + AnsiColor.RESET);
  }

  /////////////////////////// displayComment ///////////////////////////

  public static void displayComment(String stringToDisplay, AnsiColor... ansiColors) {
    System.out.println("" + AnsiColor.GREEN + mergeAnsiColors(ansiColors) + "// " + stringToDisplay + AnsiColor.RESET);
  }

  public static void displayComment(Number numberToDisplay, AnsiColor... ansiColors) {
    System.out.println("" + AnsiColor.GREEN + mergeAnsiColors(ansiColors) + "// " + numberToDisplay + AnsiColor.RESET);
  }
}
