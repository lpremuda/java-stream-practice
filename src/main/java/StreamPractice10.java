import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice10 {
    public static void main(String[] args) throws IOException {

        // 10.
        Stream<String> rows1 = Files.lines(Paths.get("C:\\Users\\lpremuda\\Documents\\Personal\\Website\\java-stream-practice-youtube\\data.txt"));
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length  == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();
    }
}
