package Shared;

public class Display {

  public enum AnsiColor {
    RESET,
    BLACK,
    RED,
    GREEN,
    YELLOW,
    BLUE,
    PURPLE,
    CYAN,
    WHITE,

    WHITE_BACKGROUND,
    BLACK_BACKGROUND,
    RED_BACKGROUND,
    GREEN_BACKGROUND,
    YELLOW_BACKGROUND,
    BLUE_BACKGROUND,
    PURPLE_BACKGROUND,
    CYAN_BACKGROUND;

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
  }

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  // System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);

  public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
  public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
  public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
  public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
  public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
  public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
  public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
  public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";

  // System.out.println(ANSI_GREEN_BACKGROUND + "This text has a green background but default text!" + ANSI_RESET);
  // System.out.println(ANSI_RED + "This text has red text but a default background!" + ANSI_RESET);
  // System.out.println(ANSI_GREEN_BACKGROUND + ANSI_RED + "This text has a green background and red text!" + ANSI_RESET);

  public static final int CONSOLE_WIDTH = 120;

  public static String fill(String input, char character, int repeat) {
    String output = input;

    while (repeat > 0) {
      output += character;
      repeat--;
    }

    return output;
  }

  public static void displayTitle(String textToDisplay) {
    String output = "";

    int leftSide = (int) Math.floor((double) (CONSOLE_WIDTH - textToDisplay.length() - 2) / 2);
    int rightSide = (int) Math.ceil((double) (CONSOLE_WIDTH - textToDisplay.length() - 2) / 2);

    output = fill(output, '-', leftSide);
    output += " " + textToDisplay + " ";
    output = fill(output, '-', rightSide);

    System.out.println(ANSI_CYAN + output + ANSI_RESET);
  }

  public static void displaySubtitle(String textToDisplay) {
    String output = "";

    int leftSide = (int) Math.floor((double) (CONSOLE_WIDTH - textToDisplay.length() - 2) / 2);
    int rightSide = (int) Math.ceil((double) (CONSOLE_WIDTH - textToDisplay.length() - 2) / 2);

    output = fill(output, '-', leftSide);
    output += " " + textToDisplay + " ";
    output = fill(output, '-', rightSide);

    System.out.println(ANSI_WHITE + output + ANSI_RESET);
  }

  public static void display(String textToDisplay) {
    System.out.println(ANSI_YELLOW + textToDisplay + ANSI_RESET);
  }

  public static void display(String textToDisplay, AnsiColor color) {
    System.out.println(color + textToDisplay + ANSI_RESET);
  }
}
