import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = s.nextLine();
        StringBuilder str2 = new StringBuilder(str);
        String reverseString = str2.reverse().toString();
        System.out.println("Reversed String is: "+reverseString);
    }
}
