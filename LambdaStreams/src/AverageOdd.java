import java.util.Arrays;

public class AverageOdd {
    public static void main(String[] args) {
        Integer[] numbers = {21,22,23,24,25,26,27,28,29,30,31};

        double average = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n * n)
                .average()
                .orElse(0);

        System.out.println("Average of squares of odd numbers: " + average);
    }
}
