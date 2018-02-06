package stream;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example4 {
    public static String myFunction1(List<String> list1, List<String> list2) {
        return list1
                .stream()
                .flatMap(l1 -> list2.stream().map(e -> l1 + e))
                .collect(Collectors.joining(","));
    }

    public static String myFunction2(List<String> list1, List<String> list2) {
        return list1
                .stream()
                .map(l1 -> list2.stream().map(e -> l1 + e).collect(Collectors.joining(",")))
                .collect(Collectors.joining(","));
    }

    public static Set<String> myFunction3(List<Set<String>> sets) {
        return sets
                .stream()
                .reduce(new LinkedHashSet<>(), (oldE, newE) -> {
                    oldE.addAll(newE);
                    return oldE;
                });
    }
}
