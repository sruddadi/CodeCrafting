package StringLearnings;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first String: ");
        String str1 = s.nextLine();
        System.out.println("Enter your second String: ");
        String str2 = s.nextLine();

        String strConcat = str1.concat(str1);
        System.out.println(checkRotate(strConcat,str2));

    }
    public static boolean checkRotate(String s1, String s2) {
        if(s1.length()/2 != s2.length()) return false;
        return s1.contains(s2);
    }
}


