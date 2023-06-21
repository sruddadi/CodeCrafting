import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values of an array: ");
        for(int i =0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = s.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0,j=0; i < arr.length && j < arr.length; i++) {
            int diff = target - arr[i];
            if(arr[j] == diff)
                map.put(i,j);
            if(j != arr.length-1) {
                j++;i=-1;
            }
        }
        if(map.isEmpty()) System.out.println("No pair found");
        else map.forEach((key,value) -> System.out.println("["+key+ ", "+value+"]"));
    }
}