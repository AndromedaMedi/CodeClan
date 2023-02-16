import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams2 {

    public static void main(String[] args) {
//        Stream.of(1,2,3,4,5,6,7,8,9)
//                .filter(num -> num % 2 == 0)
//                .forEach(System.out::println);

//        Stream.of(2,9,1,3,5,7,4,6)
//                .filter(num -> num % 2 == 0)
//                .sorted()
//                .forEach(System.out::println);

//        Stream.of("Apple", "Banana", "Orange")
//                .limit(2)
//                .forEach(System.out::println);

//        double avg = Stream.of(99,3,61,20,81)
//                .mapToInt(n -> n)
//                .average()
//                .getAsDouble();
//
//        int max = Stream.of(99,3,61,20,81)
//                .mapToInt(n -> n)
//                .max()
//                .getAsInt();

//        Stream.of("Apple")
//                .peek(val -> System.out.println("Value was: " + val))
//                .map(String::toUpperCase)
//                .peek(val -> System.out.println("Value was: " + val))
//                .forEach(n -> System.out.println("done"));

        IntStream.of(99, 3, 61, 20, 81)
                .average().getAsDouble();

    }
}
