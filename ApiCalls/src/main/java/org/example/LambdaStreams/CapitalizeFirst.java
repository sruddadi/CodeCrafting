package org.example.LambdaStreams;

import java.util.Arrays;
import java.util.Comparator;

public class CapitalizeFirst {
    public static void main(String[] args) {
        String[] strings = {"srikar", "uddadi", "manasa", "mani"};

        Arrays.stream(strings)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}