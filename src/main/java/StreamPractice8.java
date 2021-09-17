import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice8 {
    public static void main(String[] args) throws IOException {

        // 8. Stream rows from text file, sort, filter, and print
        Stream<String> bands = Files.lines(Paths.get("C:\\Users\\lpremuda\\Documents\\Personal\\Website\\java-stream-practice-youtube\\bands.txt"));
        bands
                .sorted()
                .filter(str -> str.length() > 13)
                .forEach(System.out::println);
        bands.close();
    }
}
