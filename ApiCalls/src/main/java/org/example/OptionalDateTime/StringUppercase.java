package org.example.OptionalDateTime;

import java.util.Optional;

public class StringUppercase {
    public static Optional<String> toUpper(String input) {
        if (input == null) {
            return Optional.empty();
        } else {
            int length = input.length();
            return Optional.of(input.toUpperCase());
        }
    }
    public static void main(String[] args) {
        String s ="";
        System.out.println(toUpper("Srikar Uddadi"));
    }
}
