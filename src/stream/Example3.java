package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example3 {
    public static int[] myFunction1(int[] numbers) {
        return IntStream.of(numbers).filter(e -> e % 2 != 0).toArray();
    }

    public static int[] myFunction2(Integer[] numbers) {
        return Arrays.stream(numbers)
                .filter(e -> e % 2 == 0)
                .mapToInt(x -> x).toArray();
    }

    public static Map<Integer, Student> myFunction3(List<Student> std, List<Integer> ids) {
        return std.stream()
                .filter(e -> ids.contains(e.getId()))
                .collect(Collectors.toMap(Student::getId, Function.identity()));
    }

    public static int[] myFunction4(int first, int last) {
        return IntStream.range(first, last).toArray();
    }

    public static int[] myFunction5(int first, int last, int skip) {
        return IntStream.range(first, last).skip(skip).toArray();
    }

    public static int myFunction6(List<Integer> numbers) {
        return numbers.stream().mapToInt(e -> e).sum();
    }
}
