import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamPractice6 {
    public static void main(String[] args) throws IOException {

        // 6. Average of squares of an array
        int[] numbers = new int[] {2, 4, 6, 8, 10};
        Arrays.stream(numbers) // returns IntStream
                // map(IntUnaryOperator mapper), returns IntStream
                .map(x -> x * x)
                .average() // returns OptionalDouble
                .ifPresent(x -> System.out.println("Average of squares is " + x));
    }
}
