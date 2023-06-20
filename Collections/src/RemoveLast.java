import java.util.ArrayList;
import java.util.List;

public class RemoveLast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("This is");
        list.add("Srikar");
        list.add("Uddadi");

        System.out.println("Before removing the last object:");
        System.out.println("ArrayList: " + list);

        list.remove(list.size() - 1);

        System.out.println("After removing the last object:");
        System.out.println("ArrayList: " + list);
    }
}
