package StringLearnings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first String: ");
        String str1 = s.nextLine();
        System.out.println("Enter your second String: ");
        String str2 = s.nextLine();
        int res = checkAnagram(str1,str2);
        if(res == 0) System.out.println("Given two strings are anagrams");
        else System.out.println("Given two strings are not anagrams");
    }

    private static int checkAnagram(String str1, String str2) {
        char[] ch = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        if(Arrays.equals(ch,ch2)) return 0;
        else return -1;
    }
}
