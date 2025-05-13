package lambda.lambda5.map;

import java.util.List;

public class MapMainV5 {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");

        List<String> upperFruits = GenericMapper.map(fruits, fruit -> fruit.toUpperCase());
        System.out.println("upperFruits = " + upperFruits);

        List<Integer> lengthFruits = GenericMapper.map(upperFruits, fruit -> fruit.length());
        System.out.println("lengthFruits = " + lengthFruits);

        List<Integer> integers = List.of(1, 2, 3);
        List<String> starList = GenericMapper.map(integers, n -> "*".repeat(n));
        System.out.println("starList = " + starList);
    }
}
