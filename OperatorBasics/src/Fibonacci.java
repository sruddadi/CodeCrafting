import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            int fibNum = fibonacci(i);
            System.out.print(fibNum+ " ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}