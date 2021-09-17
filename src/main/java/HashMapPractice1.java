import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class HashMapPractice1 {
    public static void main(String[] args) throws IOException {

        Map<String,Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy", 24);
        ages.put("Samuel", 30);

        // forEach takes BiConsumer<? super String,? super Integer>
        // PECS = Producer extends, Consumer supers
        ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old."));
    }
}
