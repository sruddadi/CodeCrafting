import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give the length of the array: ");
        int size = s.nextInt();
        System.out.println("Give a number to rotate the array: ");
        int number = s.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = s.nextInt();
        }
        String str = "";
        for(int i=0;i<number;i++) {
            str += arr[i];
        }

        for(int i=number,j=0;i<size;i++,j++) {
            arr[j] = arr[i];
        }

        for(int i=size-number,j=0; j<number; i++,j++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(j)));
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
