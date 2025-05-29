package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers1 = numbers.stream()
            .filter(number -> number % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("evenNumbers1 = " + evenNumbers1);

        List<Integer> evenNumbers2 = numbers.stream()
            .filter(number -> number % 2 == 0)
            .toList();
        System.out.println("evenNumbers2 = " + evenNumbers2);

        Integer[] arr = numbers.stream()
            .filter(number -> number % 2 == 0)
            .toArray(Integer[]::new);
        System.out.println("arr = " + Arrays.toString(arr));

        numbers.stream()
            .limit(5)
            .forEach(number -> System.out.print(number + " "));
        System.out.println();

        long count = numbers.stream()
            .filter(number -> number > 5)
            .count();
        System.out.println("count = " + count);

        Optional<Integer> sum1 = numbers.stream()
            .reduce((a, b) -> a + b);
        System.out.println("sum1 = " + sum1.get());

        Integer sum2 = numbers.stream()
            .reduce(100, (a, b) -> a + b);
        System.out.println("sum2 = " + sum2);

        Optional<Integer> min = numbers.stream()
            .min(Integer::compare);
        System.out.println("min = " + min.get());

        Optional<Integer> max = numbers.stream()
            .max(Integer::compare);
        System.out.println("max = " + max.get());

        Optional<Integer> first = numbers.stream()
            .filter(n -> n > 5)
            .findFirst();
        System.out.println("first = " + first.get());

        Optional<Integer> any = numbers.stream()
            .filter(n -> n > 5)
            .findAny();
        System.out.println("any = " + any.get());

        boolean hasEven = numbers.stream()
            .anyMatch(n -> n % 2 == 0);
        System.out.println("hasEven = " + hasEven);

        boolean allPositive = numbers.stream()
            .allMatch(n -> n > 0);
        System.out.println("allPositive = " + allPositive);

        boolean noNegative = numbers.stream()
            .noneMatch(n -> n < 0);
        System.out.println("noNegative = " + noNegative);
    }
}
