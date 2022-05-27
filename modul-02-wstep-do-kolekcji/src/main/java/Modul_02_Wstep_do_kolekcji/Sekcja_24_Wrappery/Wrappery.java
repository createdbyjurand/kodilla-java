package Modul_02_Wstep_do_kolekcji.Sekcja_24_Wrappery;

import static Shared.Display.display;
import static Shared.Display.displayTitle;

public class Wrappery {

  public static void main(String[] args) throws java.lang.Exception {

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("2.4. Wrappery");

    int n = 10;
    Integer k = n;
    int q = k;

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie: Wrapper prymitywowi (nie)równy?");

    boolean primitiveBoolean = true;
    byte primitiveByte = 127;
    char primitiveCharacter = 's';
    double primitiveDouble = 1.7e+308;
    float primitiveFloat = 3.4e+038F;
    int primitiveInteger = 2147483647;
    long primitiveLong = 9223372036854775807L;
    short primitiveShort = 32767;

    Boolean objectBoolean = true;
    Byte objectByte = 127;
    Character objectCharacter = 's';
    Double objectDouble = 1.7e+308;
    Float objectFloat = 3.4e+038F;
    Integer objectInteger = 2147483647;
    Long objectLong = 9223372036854775807L;
    Short objectShort = 32767;

    compare(primitiveBoolean, objectBoolean);
    compare(primitiveByte, objectByte);
    compare(primitiveCharacter, objectCharacter);
    compare(primitiveDouble, objectDouble);
    compare(primitiveFloat, objectFloat);
    compare(primitiveInteger, objectInteger);
    compare(primitiveLong, objectLong);
    compare(primitiveShort, objectShort);

  }

  private static void compare(Object a, Object b) {
    if (a == b) {
      display(a.toString() + " == " + b.toString());
    } else {
      display(a.toString() + " != " + b.toString());
    }
  }
}
