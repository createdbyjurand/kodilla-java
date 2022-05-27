# Kodilla Java Bootcamp

`npm i -D prettier@latest prettier-plugin-java@latest @prettier/plugin-xml@latest`

## Notes

## Java

```java
import static Shared.Display.display;
import static Shared.Display.displayComment;
import static Shared.Display.displaySubSubtitle;
import static Shared.Display.displaySubtitle;
import static Shared.Display.displayTitle;
import static com.createdbyjurand.shared.Display.display;
import static com.createdbyjurand.shared.Display.displayComment;
import static com.createdbyjurand.shared.Display.displaySubSubtitle;
import static com.createdbyjurand.shared.Display.displaySubtitle;
import static com.createdbyjurand.shared.Display.displayTitle;

import Shared.AnsiColor;
import Shared.Generate;
import com.createdbyjurand.shared.AnsiColor;
import com.createdbyjurand.shared.Generate;
import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Kodilla {

  public static void main(String[] args) throws java.lang.Exception {
    System.out.println("Rozpoczynamy naukę w Javie!");
  }
}

```

### Lists

| list       | description |
| ---------- | ----------- |
| LinkedList |             |

### Interfaces and classes

| interface | class      | description |
| --------- | ---------- | ----------- |
| Set       | HashSet    |
| Iterator  |
| Queue     | ArrayDeque |

## node/npm

`npm i --save-dev --save-exact prettier`

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

## Getting Started

### Reference Documentation

For further reference, please consider the following sections:

- [Official Gradle documentation](https://docs.gradle.org)
- [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.5/gradle-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.5/gradle-plugin/reference/html/#build-image)
- [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links

These additional references should also help you:

- [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
