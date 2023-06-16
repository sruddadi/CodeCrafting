import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumOfElements {

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 5;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        int partitionSize = array.length / 5;
        int startIndex = 0;
        int endIndex = partitionSize;

        SumCalculator[] sumCalculators = new SumCalculator[5];
        for (int i = 0; i < 5; i++) {
            sumCalculators[i] = new SumCalculator(array, startIndex, endIndex);
            startIndex = endIndex;
            endIndex += partitionSize;
        }

        Future<Integer>[] results = new Future[5];
        for (int i = 0; i < 5; i++) {
            results[i] = executorService.submit(sumCalculators[i]);
        }

        int sum = 0;
        try {
            for (int i = 0; i < 5; i++) {
                sum += results[i].get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Sum of elements in the array: " + sum);

    }

    static class SumCalculator implements Callable<Integer> {
        private final int[] array;
        private final int startIndex;
        private final int endIndex;

        public SumCalculator(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public Integer call() {
            int sum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                sum += array[i];
            }
            return sum;
        }
    }
}
