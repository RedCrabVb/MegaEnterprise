package ru.neoflex;

import java.util.Random;

public class LogicHelloWorld {
    /*
    * HelloWorldStr
    * */
    private static String HelloWorldStr = "Hello world!";

    /*
     * Print
     */
    public void Print() {
        for (int i = 0; i < 2; i++) {
            if (new Random().nextBoolean()) {
                System.out.println(HelloWorldStr);
            }
        }
    }
}
