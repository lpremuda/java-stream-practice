import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class StreamPractice7 {
    public static void main(String[] args) throws IOException {

        // 7. Stream from List
        List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shavika", "Sam");
        people.stream()
                .map(str -> str.toLowerCase())
                .filter(str -> str.startsWith("a"))
                .sorted()
                .forEach(System.out::println);
    }
}
