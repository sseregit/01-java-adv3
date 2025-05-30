package optional;

import java.util.Optional;

public class OptionalRetrievalMain {

    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<Object> optEmpty = Optional.empty();

        System.out.println("optValue.isPresent() = " + optValue.isPresent());
        System.out.println("optEmpty.isPresent() = " + optEmpty.isPresent());
        System.out.println("optValue.isEmpty() = " + optValue.isEmpty());
        System.out.println("optEmpty.isEmpty() = " + optEmpty.isEmpty());

        System.out.println("optValue.get() = " + optValue.get());
        // java.util.NoSuchElementException: No value present
        // System.out.println("optEmpty.get() = " + optEmpty.get());

        System.out.println("optValue.orElse(\"Default\") = " + optValue.orElse("Default"));
        System.out.println("optEmpty.orElse(\"Default\") = " + optEmpty.orElse("Default"));

        System.out.println(
            "optValue.orElseGet(() -> \"Lambda Default\") = " + optValue.orElseGet(() -> "Lambda Default"));
        System.out.println(
            "optEmpty.orElseGet(() -> \"Lambda Default\") = " + optEmpty.orElseGet(() -> "Lambda Default"));

        System.out.println(
            "optValue.orElseThrow(() -> new RuntimeException(\"No value present\")) = " + optValue.orElseThrow(
                () -> new RuntimeException("No value present")));
        // java.lang.RuntimeException: No value present
        // System.out.println(
        //     "optEmpty.orElseThrow(() -> new RuntimeException(\"No value present\")) = " + optEmpty.orElseThrow(
        //         () -> new RuntimeException("No value present")));

        System.out.println(
            "optValue.or(() -> Optional.of(\"Fallback\")) = " + optValue.or(() -> Optional.of("Fallback")));
        System.out.println(
            "optEmpty.or(() -> Optional.of(\"Fallback\")) = " + optEmpty.or(() -> Optional.of("Fallback")));
    }
}
