package ThreadBasics;

public class ThreadNumbers extends Thread {
    public void run() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr)
            System.out.println(i);
    }

    public static void main(String[] args) {
        ThreadNumbers numbers = new ThreadNumbers();
        numbers.start();
    }
}
