import java.io.IOException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice4 {
    public static void main(String[] args) throws IOException {

        // 4. Stream.of, sorted and findFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        String name = Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .get();

        System.out.println("get() name is " + name);

    }
}
