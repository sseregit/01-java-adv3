package stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors3Group {

    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Avocado", "Banana", "Blueberry", "Orange", "Cherry");
        Map<String, List<String>> grouped = names.stream()
            .collect(Collectors.groupingBy(
                name -> name.substring(0, 1)
            ));
        System.out.println("grouped = " + grouped);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("partitioned = " + partitioned);
    }
}
