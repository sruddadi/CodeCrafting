package org.example.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseBasics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("This is");
        list.add("Srikar");

        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Using enhanced for loop:");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Using iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Using forEach:");
        list.forEach(str -> System.out.println(str));
        System.out.println();

        System.out.println("Using parallel stream:");
        list.parallelStream().forEach(str -> System.out.println(str));
    }
}