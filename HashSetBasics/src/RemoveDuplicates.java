import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "SrikarSrikaUddadi";
        Set<Character> set = new HashSet<>();
        for(int i=0; i<str.length();i++)
            set.add(str.charAt(i));
        System.out.println("The String is: "+str);
        System.out.println("After Removing the duplicates: ");
        set.forEach(System.out::print);
    }
}
