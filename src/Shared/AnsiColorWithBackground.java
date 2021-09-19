package Shared;

public interface AnsiColorWithBackground {

  /**
   * default
   * @param color (AnsiColor)
   * @param background (AnsiColor)
   * @returns color + background (String)
   *
   * @example
   * AnsiColorWithBackground ansiColor = new AnsiColorWithBackground();
   * ansiColor.defaultAnsiColorWithBackground(AnsiColor, AnsiColor);
   *
   * @example
   * class Example extends AnsiColorWithBackground {
   *   this.defaultAnsiColorWithBackground(AnsiColor, AnsiColor)
   * }
   */
  default String defaultAnsiColorWithBackground(AnsiColor color, AnsiColor background) {
    return "" + color + background;
  }

  /**
   * static
   * @param color (AnsiColor)
   * @param background (AnsiColor)
   * @returns color + background (String)
   *
   * @example
   * AnsiColorWithBackground.staticAnsiColorWithBackground(AnsiColor, AnsiColor);
   */
  static String staticAnsiColorWithBackground(AnsiColor color, AnsiColor background) {
    return "" + color + background;
  }
}
