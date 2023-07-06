package org.example.CollectionAdvanced;

import java.util.HashMap;

public class DistinctCharacters {
    public static void main(String[] args) {
        String input = "test string";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0;i<input.length();i++) {
            if(input.charAt(i)!=' ') {
                char c = input.charAt(i);
                map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
            }
        }
        map.forEach((key, value) -> System.out.print(key + "-" + value+" "));
    }
}
