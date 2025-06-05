package functional;

import java.util.function.Function;

public class CompositionMain1 {

    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;

        Function<Integer, Integer> add = x -> x + 1;

        Function<Integer, Integer> newFunc1 = square.compose(add);
        System.out.println("newFunc1.apply(2) = " + newFunc1.apply(2));

        Function<Integer, Integer> newFunc2 = square.andThen(newFunc1);
        System.out.println("newFunc2.apply(2) = " + newFunc2.apply(2));
    }
}
