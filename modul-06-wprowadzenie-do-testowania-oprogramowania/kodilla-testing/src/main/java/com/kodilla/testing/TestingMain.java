package com.kodilla.testing;

import static com.createdbyjurand.shared.display.Display.display;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) throws Exception {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->

        // Testing Calculator class
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        if (calculator.add(3, 5) == 8) {
            // display('true'); TODO: import display from shared module
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (calculator.subtract(9, 3) == 6) {
            display("true");
        } else {
            display("false");
        }

        int addResult = calculator.add(180, 19);
        int subResult = calculator.subtract(200, 150);
        if (addResult == 199 && subResult == 50) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }
    }
}
