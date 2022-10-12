package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your divide() function!

        System.out.println(divide(8, 9));
        System.out.println(divide(8, 0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your checkFileExtension() function!
    }

    public static double divide(double dividend, double divisor) {
        try {
            return dividend / divisor;
        }
        catch (ArithmeticException e) {
            System.err.println("Division by zero detected.");
            return 0.0;
        }
    }

    public static int checkFileExtension(String fileName)
    {
        // Write code here!
        return -1;
    }

}
