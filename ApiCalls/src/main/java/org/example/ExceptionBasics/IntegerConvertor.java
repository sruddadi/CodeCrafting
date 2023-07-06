package org.example.ExceptionBasics;

import java.util.Scanner;

public class IntegerConvertor {
    public static int convertToInteger(String string) throws NumberFormatException {
        try {
            int in = Integer.parseInt(string);
            return in;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input: '" + string + "' cannot be converted to an integer.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        try {
            int result = convertToInteger(str);
            System.out.println("Input: '" + str + "' - Converted value: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Input: '" + str + "' - Exception: " + e.getMessage());
        }

    }
}
