
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Streams {
    public static int addTwo(int input) {
        return input + 2;
    }
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ben", "James", "Jane", "Amanda", "Annie");

        names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
//                .forEach(result -> System.out.println(result));


        Stream<String> fruits = Stream.of("Apple", "Pear", "Banana");

        fruits
                .map(String::toLowerCase)
                .forEach(name -> System.out.println(name));



        Stream<Integer> intStream = Stream.of(1,2,3,4);

//        intStream
//                .map(Streams::addTwo)
//                .forEach(System.out::println);
        int total = intStream.reduce(0, (sum, nextNum) -> sum + nextNum);

//        int otherTotal = intStream.reduce(0, Integer::sum);

        System.out.println(total);

    }
}
