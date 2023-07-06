package org.example.OptionalDateTime;

import java.util.Optional;

public class EmptyOptional {
    public static Optional<Integer> getStringLength(String input) {
        if (input == null) {
            return Optional.empty();
        } else {
            int length = input.length();
            return Optional.of(length);
        }
    }
    public static void main(String[] args) {
        String s ="";
        System.out.println(getStringLength("Srikar Uddadi"));
    }
}