# Kodilla Java Bootcamp

## Notes

## Java

```java
import Shared.AnsiColor;
import Shared.Generate;
import static Shared.Display.display;
import static Shared.Display.displayComment;
import static Shared.Display.displaySubSubtitle;
import static Shared.Display.displaySubtitle;
import static Shared.Display.displayTitle;

import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Kodilla
{
  public static void main (String[] args) throws java.lang.Exception
  {
    System.out.println("Rozpoczynamy naukę w Javie!");
  }
}
```

### System

#### JAVA_HOME

`...\jdk1.8.0_131`

Zmienne środowiskowe dla systemów Windows
Po udanej instalacji JDK, musimy ustawić:

zmienną środowiskową JAVA_HOME, aby wskazywała na katalog, w którym zainstalowane jest JDK
zmienną środowiskową PATH, tak aby widoczny w niej był podkatalog \bin naszego pakietu JDK, który zawiera programy wykonywalne Javy - m.in. java.exe (program do uruchamiania programów w Javie) oraz javac.exe (kompilator)

#### Path

`...\jdk1.8.0_131\bin`

#### Kill all git.exe system processes created by Sourcetree

`Taskkill /IM git.exe /F`
