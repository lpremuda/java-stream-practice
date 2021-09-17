import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamPractice5 {
    public static void main(String[] args) throws IOException {

        // 5. Stream from Array, sort, filter, and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shavika", "Sam"};
        Arrays.stream(names)
                .filter(str -> str.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

    }
}
