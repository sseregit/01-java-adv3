package stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        numbers
            .stream()
            .filter(n -> n % 2 == 0)
            .forEach(IntermediateOperationsMain::printNumberWithSpace);
        System.out.println();

        numbers
            .stream()
            .map(n -> n * n)
            .forEach(IntermediateOperationsMain::printNumberWithSpace);
        System.out.println();

        numbers.stream()
            .distinct()
            .forEach(IntermediateOperationsMain::printNumberWithSpace);
        System.out.println();

        Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
            .sorted()
            .forEach(IntermediateOperationsMain::printNumberWithSpace);
        System.out.println();

        Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
            .sorted(Comparator.reverseOrder())
            .forEach(IntermediateOperationsMain::printNumberWithSpace);
        System.out.println();

        numbers.stream()
            .peek(n -> System.out.print("before: " + n + ", "))
            .map(n -> n * n)
            .peek(n -> System.out.print("after: " + n + ", "))
            .limit(5)
            .forEach(n -> System.out.println("result: " + n));

        numbers.stream()
            .limit(5)
            .forEach(IntermediateOperationsMain::printNumberWithSpace);
        System.out.println();

        numbers.stream()
            .skip(5)
            .forEach(IntermediateOperationsMain::printNumberWithSpace);
        System.out.println();

        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        numbers2.stream()
            .takeWhile(n -> n < 5)
            .forEach(IntermediateOperationsMain::printNumberWithSpace);
        System.out.println();

        numbers2.stream()
            .dropWhile(n -> n < 5)
            .forEach(IntermediateOperationsMain::printNumberWithSpace);
        System.out.println();
    }

    private static void printNumberWithSpace(Integer n) {
        System.out.print(n + " ");
    }

}
