package org.example.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("This is");
        list.add("Srikar");
        list.add("Uddadi");

        String[] array = list.toArray(String[]::new);

        System.out.println(Arrays.asList(array));
    }
}
