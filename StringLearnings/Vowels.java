package StringLearnings;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give a string: ");
        String str = s.nextLine();
        int count =0;
        char[] ch = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        for(int i=0,j=0;i<str.length() && j<ch.length;i++) {
            if(str.charAt(i) == ch[j]) {
                count++;
            }
            if(i==str.length()-1) {
                j++; i=-1;
            }
        }
        System.out.println("Number of vowels in the string is: "+count);
    }
}
