package stream;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    
    public static boolean myFunction1(List<String> list, String text) {
        return list.stream().anyMatch(e -> e.equals(text));
    }

    public static void myFunction2(List<String> list) {
        list.stream().sorted().findFirst().ifPresent(System.out::print);
    }

    public static int[] myFunction3(int[] numbers) {
        return Arrays.stream(numbers).map(x -> x * x).toArray();
    }

    public static void myFunction4(int[] numbers) {
        Arrays.stream(numbers).average().ifPresent(System.out::print);
    }
}
