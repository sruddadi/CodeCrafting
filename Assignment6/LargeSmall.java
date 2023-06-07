package Assignment6;

public class LargeSmall {
    public static void main(String[] args) {
        int[] arr = {10,1,4,13,19,12,5,90,71,99,27,101,11};
        System.out.println("Minimum number in the array: "+minNum(arr));
        System.out.println("Maximum number in the array: "+maxNum(arr));
    }

    private static int maxNum(int[] arr) {
        int max = arr[0];
        for(int i = 0; i<arr.length;i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    private static int minNum(int[] arr) {
        int min = arr[0];
        for(int i = 0; i<arr.length;i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
