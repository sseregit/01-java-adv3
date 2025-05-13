package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        Function<String, Integer> toNumber = s -> Integer.valueOf(s);
        List<Integer> numbers = map(list, toNumber);
        System.out.println("numbers = " + numbers);

        Function<String, Integer> toLength = s -> s.length();
        List<Integer> lengths = map(list, toLength);
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : list) {
            numbers.add(mapper.apply(s));
        }

        return numbers;
    }

}
