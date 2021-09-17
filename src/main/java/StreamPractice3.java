import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamPractice3 {
    public static void main(String[] args) throws IOException {

        // 3. Integer Stream with Sum
        IntStream intStream = IntStream.range(1,5);

        int sum = intStream.sum();
        System.out.println("sum is " + sum + "\n");

        List<Integer> list = Arrays.asList(1,2,3,4);

        boolean anyMatch1 = list.stream().anyMatch(x -> x == 3);
        System.out.println("3 matches any value in int stream: " + anyMatch1);

        boolean anyMatch2 = list.stream().anyMatch(x -> x == 6);
        System.out.println("6 matches any value in int stream: " + anyMatch2);
        System.out.println();

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Lucas");
        strList.add("premuda");
        strList.add("chelsea");
        strList.add("Wieland");
        strList.add("Connor");

        System.out.println("String list to stream (sorted):");
        strList.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();


        boolean allMatch1 = strList.stream()
                .allMatch(str -> Character.isUpperCase(str.charAt(0)));
        System.out.println("All values in stream start with an upper-case letter: " + allMatch1);
        System.out.println();

        System.out.println("All names starting with an upper-case letter:");
        strList.stream()
                .filter(str -> Character.isUpperCase(str.charAt(0)))
                .forEach(System.out::println);

        // Stream terminal operations
//        anyMatch()
//        allMatch()
//        noneMatch()
//        collect()
//        count()
//        findAny()
//        findFirst()
//        forEach()
//        min()
//        max()
//        reduce()
//        toArray()
    }
}
