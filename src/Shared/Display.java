package Shared;

public class Display {

  public enum AnsiColor {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),

    WHITE_BACKGROUND("\u001B[47m"),
    BLACK_BACKGROUND("\u001B[40m"),
    RED_BACKGROUND("\u001B[41m"),
    GREEN_BACKGROUND("\u001B[42m"),
    YELLOW_BACKGROUND("\u001B[43m"),
    BLUE_BACKGROUND("\u001B[44m"),
    PURPLE_BACKGROUND("\u001B[45m"),
    CYAN_BACKGROUND("\u001B[46m");

    private final String ansiCode;

    AnsiColor(String ansiCode) {
      this.ansiCode = ansiCode;
    }

    @Override
    public String toString() {
      return ansiCode;
    }
  }

  private static final int CONSOLE_WIDTH = 120;

  private static String fill(String input, char character, int repeat) {
    String output = input;

    while (repeat > 0) {
      output += character;
      repeat--;
    }

    return output;
  }

  public static void displayTitle(String stringToDisplay) {
    String output = "";

    int leftSide = (int) Math.floor((double) (CONSOLE_WIDTH - stringToDisplay.length() - 2) / 2);
    int rightSide = (int) Math.ceil((double) (CONSOLE_WIDTH - stringToDisplay.length() - 2) / 2);

    output = fill(output, '-', leftSide);
    output += " " + stringToDisplay + " ";
    output = fill(output, '-', rightSide);

    System.out.println(AnsiColor.CYAN + output + AnsiColor.RESET);
  }

  public static void displaySubtitle(String stringToDisplay) {
    String output = "";

    int leftSide = (int) Math.floor((double) (CONSOLE_WIDTH - stringToDisplay.length() - 2) / 2);
    int rightSide = (int) Math.ceil((double) (CONSOLE_WIDTH - stringToDisplay.length() - 2) / 2);

    output = fill(output, '-', leftSide);
    output += " " + stringToDisplay + " ";
    output = fill(output, '-', rightSide);

    System.out.println(AnsiColor.WHITE + output + AnsiColor.RESET);
  }

  public static void display(String stringToDisplay) {
    System.out.println(AnsiColor.BLUE + stringToDisplay + AnsiColor.RESET);
  }

  public static void display(Number numberToDisplay) {
    System.out.println(AnsiColor.BLUE + "" + numberToDisplay + AnsiColor.RESET);
  }

  public static void display(String stringToDisplay, AnsiColor color) {
    System.out.println(color + stringToDisplay + AnsiColor.RESET);
  }

  public static void display(Number numberToDisplay, AnsiColor color) {
    System.out.println(color + "" + numberToDisplay + AnsiColor.RESET);
  }
}
