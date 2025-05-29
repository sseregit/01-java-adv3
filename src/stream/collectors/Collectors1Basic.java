package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {

    public static void main(String[] args) {
        List<String> list = Stream.of("Java", "Spring", "JPA")
            .collect(Collectors.toList());
        list.add("Hello");
        System.out.println("list = " + list);

        List<Integer> unmodifiableList = Stream.of(1, 2, 3)
            .collect(Collectors.toUnmodifiableList());
        // unmodifiableList.add(4); // java.lang.UnsupportedOperationException
        System.out.println("unmodifiableList = " + unmodifiableList);

        Set<Integer> set = Stream.of(1, 2, 2, 3, 3, 3)
            .collect(Collectors.toSet());
        System.out.println("set = " + set);

        TreeSet<Integer> treeset = Stream.of(3, 4, 5, 2, 1)
            .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("treeset = " + treeset);
    }
}
