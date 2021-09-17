import java.io.IOException;
import java.util.stream.IntStream;

public class StreamPractice2 {
    public static void main(String[] args) throws IOException {

        // 1. Integer Stream
        IntStream
                .rangeClosed(4, 15)
                .skip(5)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
