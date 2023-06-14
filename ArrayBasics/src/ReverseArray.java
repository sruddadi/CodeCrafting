public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,1,4,13,19,12,5,90,71,99,27,101,11};

        for(int i=0,j=arr.length-1; i<arr.length;i++,j--) {
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
