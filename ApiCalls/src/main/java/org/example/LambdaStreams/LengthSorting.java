package org.example.LambdaStreams;

import java.util.Arrays;
import java.util.Comparator;

public class LengthSorting {
    public static void main(String[] args) {
        String[] strings = {"srikar", "sritej", "mani", "manasa", "prateek"};

        Arrays.stream(strings)
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()))
                .forEach(System.out::println);
    }
}
