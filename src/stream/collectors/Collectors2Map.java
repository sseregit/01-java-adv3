package stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {

    public static void main(String[] args) {
        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
            .collect(Collectors.toMap(name -> name, name -> name.length()));
        System.out.println("map1 = " + map1);

        // java.lang.IllegalStateException: Duplicate key Apple (attempted merging values 5 and 5)
/*
        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato")
            .collect(Collectors.toMap(name -> name, name -> name.length()));
        System.out.println("map2 = " + map2);
*/
        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Tomato")
            .collect(Collectors.toMap(name -> name, name -> name.length(), (oldVal, newVal) -> oldVal + newVal));
        System.out.println("map3 = " + map3);

        Map<String, Integer> map4 = Stream.of("Apple", "Apple", "Tomato")
            .collect(Collectors.toMap(name -> name, name -> name.length(), (oldVal, newVal) -> oldVal + newVal,
                LinkedHashMap::new));
        System.out.println("map4 = " + map4.getClass());

    }
}
