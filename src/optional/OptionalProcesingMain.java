package optional;

import java.util.Optional;

public class OptionalProcesingMain {

    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        optValue.ifPresent(System.out::println);
        optEmpty.ifPresent(System.out::println);

        optValue.ifPresentOrElse(System.out::println, () -> {
            System.out.println("값이 없음");
        });
        optEmpty.ifPresentOrElse(System.out::println, () -> {
            System.out.println("값이 없음");
        });

        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1);

        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
        System.out.println("lengthOpt2 = " + lengthOpt2);

        Optional<Optional<String>> nestedOpt = optValue.map(Optional::of);
        System.out.println("nestedOpt = " + nestedOpt);

        Optional<String> flattenedOpt = optValue.flatMap(Optional::of);
        System.out.println("flattenedOpt = " + flattenedOpt);

        Optional<String> filtered1 = optValue.filter(s -> s.startsWith("H"));
        Optional<String> filtered2 = optValue.filter(s -> s.startsWith("X"));
        System.out.println("filtered1(H) = " + filtered1);
        System.out.println("filtered2(X) = " + filtered2);

        optValue.stream()
            .forEach(System.out::println);

        optEmpty.stream()
            .forEach(System.out::println);

    }
}
