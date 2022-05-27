package Shared;

import java.util.ArrayList;
import java.util.List;

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

  private static String displayOnTheLeft(String stringToDisplay) {
    stringToDisplay += " ";
    stringToDisplay = fill(stringToDisplay, '.', CONSOLE_WIDTH - stringToDisplay.length());
    return stringToDisplay;
  }

  private static String mergeAnsiColors(AnsiColor... ansiColors) {
    String colors = "";
    for (AnsiColor color : ansiColors) {
      colors += color;
    }
    return colors;
  }

  private static String[] wrap(String stringToWrap, int maxLength) {
    List<String> arrayListOfStrings = new ArrayList<String>();

    while (stringToWrap.length() > maxLength) {
      int cutPoint = stringToWrap.lastIndexOf(" ", maxLength);
      arrayListOfStrings.add(stringToWrap.substring(0, cutPoint));
      stringToWrap = "    " + stringToWrap.substring(cutPoint + 1);
    }

    arrayListOfStrings.add(stringToWrap);
    return arrayListOfStrings.toArray(new String[0]);
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

  /////////////////////////// displaySubSubtitle ///////////////////////////

  public static void displaySubSubtitle(String stringToDisplay, AnsiColor... ansiColors) {
    String output = displayOnTheLeft("" + stringToDisplay);
    System.out.println("" + AnsiColor.WHITE + mergeAnsiColors(ansiColors) + output + AnsiColor.RESET);
  }

  public static void displaySubSubtitle(Number numberToDisplay, AnsiColor... ansiColors) {
    String output = displayOnTheLeft("" + numberToDisplay);
    System.out.println("" + AnsiColor.WHITE + mergeAnsiColors(ansiColors) + output + AnsiColor.RESET);
  }

  /////////////////////////// displayComment ///////////////////////////

  public static void displayComment(String stringToDisplay, AnsiColor... ansiColors) {
    for (String line : wrap(stringToDisplay, CONSOLE_WIDTH)) {
      System.out.println("" + AnsiColor.GREEN + "// " + mergeAnsiColors(ansiColors) + line + AnsiColor.RESET);
    }
  }

  public static void displayComment(Number numberToDisplay, AnsiColor... ansiColors) {
    for (String line : wrap(numberToDisplay.toString(), CONSOLE_WIDTH)) {
      System.out.println("" + AnsiColor.GREEN + "// " + mergeAnsiColors(ansiColors) + line + AnsiColor.RESET);
    }
  }
}
