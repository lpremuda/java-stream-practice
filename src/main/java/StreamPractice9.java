import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice9 {
    public static void main(String[] args) throws IOException {

        // 9. Stream rows from text file and save to List
        List<String> bands2 = Files.lines(Paths.get("C:\\Users\\lpremuda\\Documents\\Personal\\Website\\java-stream-practice-youtube\\bands.txt"))
                .filter(str -> str.contains("jit"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x));
    }
}
