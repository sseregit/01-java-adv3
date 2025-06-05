package functional;

import java.util.function.Function;

public class CompositionMain2 {

    public static void main(String[] args) {
        Function<String, Integer> parseInt = Integer::parseInt;

        Function<Integer, Integer> square = x -> x * x;

        Function<Integer, String> toString = x -> "결과: " + x;

        Function<String, String> finalFunc = parseInt.andThen(square).andThen(toString);
        System.out.println("finalFunc.apply(\"8\") = " + finalFunc.apply("8"));

        Function<String, Integer> stringToSquareFunc = parseInt.andThen(square);
        System.out.println("stringToSquareFunc.apply(\"8\") = " + stringToSquareFunc.apply("8"));

    }
}
