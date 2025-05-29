package stream.basic;

import java.util.List;
import java.util.stream.Stream;

public class DuplicateExecutionMain {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(System.out::println);

        // java.lang.IllegalStateException: stream has already been operated upon or closed
        // stream.forEach(System.out::println);

        List<Integer> list = List.of(1, 2, 3);

        Stream.of(list).forEach(System.out::println);
        Stream.of(list).forEach(System.out::println);
    }
}
