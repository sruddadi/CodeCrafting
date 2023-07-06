package org.example.HashsetBasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Srikar", "Uddadi", "Mani", "Kandan", "Venkataraman", "Manasa", "Manthena", "Vaishnav", "Koratpalli", "Sritej"));

        System.out.println("Using For Each");
        set.forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("Using Stream");
        set.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("Using Iterator");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
        }
    }
}
